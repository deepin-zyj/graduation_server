package com.drivinggrpc.driving.dao;

import com.drivinggrpc.driving.po.UserStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserStatisticsDao {
    @Select("select date from user_statistics where user_id = #{user_id}")
    String selectUserApplyDateByUserId(int user_id);

    @Select("select user_id,date,minute from user_statistics where user_id = #{user_id}")
    UserStatistics selectUserStatisticsByUserId(int user_id);

    @Update("update user_statistics set date=#{date} where user_id=#{user_id}")
    int updateToDateByUserId(UserStatistics statistics);

    @Select("select * from user_statistics where user_id = #{user_id}")
    UserStatistics selectUserStatisticsAllByUserId(int user_id);
}
