package com.drivinggrpc.driving.server.impl;

import com.drivinggrpc.driving.dao.AbsenteeDao;
import com.drivinggrpc.driving.dao.NewsDao;
import com.drivinggrpc.driving.dao.UserApplyDao;
import com.drivinggrpc.driving.dao.UserStatisticsDao;
import com.drivinggrpc.driving.po.Absentee;
import com.drivinggrpc.driving.po.News;
import com.drivinggrpc.driving.po.UserApply;
import com.drivinggrpc.driving.po.UserStatistics;
import com.drivinggrpc.driving.server.ModuleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ModuleServerImpl implements ModuleServer {
    @Autowired
    private UserApplyDao applyDao;
    @Autowired
    private UserStatisticsDao statisticsDao;

    @Override
    public String userApply(UserApply userApply,String date) {
        int userApplyKey = applyDao.insertUserApply(userApply);
        if (userApplyKey==1){
            UserStatistics statistics = new UserStatistics();
            statistics.setUser_id(userApply.getUser_id());
            statistics.setDate(date);
            int userStatisticsKey = statisticsDao.updateToDateByUserId(statistics);
            if (userStatisticsKey == 1){
                applyDao.updateApplyStateByUserId(userApply.getUser_id(),"审批中");
                return "报名成功";
            }else{
                applyDao.deleteUserApplyByUserId(userApply.getUser_id());
                return "报名失败";
            }
        }else{
            return "报名失败";
        }
    }

    @Override
    public String getApplyStateByUserId(int userId) {
        String state = applyDao.selectApplyStateByUserId(userId);
        return state;
    }

    @Override
    public UserStatistics getStatisticsData(int userId) {
        UserStatistics statistics = statisticsDao.selectUserStatisticsAllByUserId(userId);
        return statistics;
    }

}
