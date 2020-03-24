// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.drivinggrpc.driving.rpc.proto.user;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_loginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_loginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_registerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_registerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_registerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_registerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022&com.drivinggrpc.driving.rp" +
      "c.proto.user\"\210\002\n\025setUserMessageRequest\022\017" +
      "\n\007user_id\030\001 \001(\005\022\022\n\nhead_image\030\002 \001(\014\022\021\n\tn" +
      "ick_name\030\003 \001(\t\022\021\n\tsignature\030\004 \001(\t\022\014\n\004nam" +
      "e\030\005 \001(\t\022\r\n\005phone\030\006 \001(\t\022\013\n\003sex\030\007 \001(\t\022\013\n\003a" +
      "ge\030\010 \001(\t\022\013\n\003job\030\t \001(\t\022\017\n\007qq_code\030\n \001(\t\022\017" +
      "\n\007we_chat\030\013 \001(\t\022\016\n\006e_mail\030\014 \001(\t\022\026\n\016new_h" +
      "ead_image\030\r \001(\t\022\026\n\016old_head_image\030\016 \001(\t\"" +
      "\'\n\026setUserMessageResponse\022\r\n\005state\030\001 \001(\t" +
      "\"A\n\014loginRequest\022\020\n\010username\030\001 \001(\t\022\020\n\010pa" +
      "ssword\030\002 \001(\t\022\r\n\005power\030\003 \001(\005\"\036\n\rloginResp" +
      "onse\022\r\n\005state\030\001 \001(\t\"D\n\017registerRequest\022\020" +
      "\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\r\n\005po" +
      "wer\030\003 \001(\005\"!\n\020registerResponse\022\r\n\005state\030\001" +
      " \001(\t\"7\n\021upPasswordRequest\022\020\n\010username\030\001 " +
      "\001(\t\022\020\n\010password\030\002 \001(\t\"#\n\022upPasswordRespo" +
      "nse\022\r\n\005state\030\001 \001(\t\"*\n\025getUserMessageRequ" +
      "est\022\021\n\tuser_name\030\001 \001(\t\"\367\001\n\026getUserMessag" +
      "eResponse\022\017\n\007user_id\030\001 \001(\005\022\022\n\nhead_image" +
      "\030\002 \001(\t\022\021\n\tnick_name\030\003 \001(\t\022\021\n\tsignature\030\004" +
      " \001(\t\022\016\n\006minute\030\005 \001(\005\022\014\n\004date\030\006 \001(\t\022\014\n\004na" +
      "me\030\007 \001(\t\022\r\n\005phone\030\010 \001(\t\022\013\n\003sex\030\t \001(\t\022\013\n\003" +
      "age\030\n \001(\t\022\013\n\003job\030\013 \001(\t\022\017\n\007qq_code\030\014 \001(\t\022" +
      "\017\n\007we_chat\030\r \001(\t\022\016\n\006e_mail\030\016 \001(\t2\302\005\n\rUse" +
      "rRpcServer\022v\n\005login\0224.com.drivinggrpc.dr" +
      "iving.rpc.proto.user.loginRequest\0325.com." +
      "drivinggrpc.driving.rpc.proto.user.login" +
      "Response\"\000\022\177\n\010register\0227.com.drivinggrpc" +
      ".driving.rpc.proto.user.registerRequest\032" +
      "8.com.drivinggrpc.driving.rpc.proto.user" +
      ".registerResponse\"\000\022\205\001\n\nupPassword\0229.com" +
      ".drivinggrpc.driving.rpc.proto.user.upPa" +
      "sswordRequest\032:.com.drivinggrpc.driving." +
      "rpc.proto.user.upPasswordResponse\"\000\022\233\001\n\030" +
      "getUserMessageByUserName\022=.com.drivinggr" +
      "pc.driving.rpc.proto.user.getUserMessage" +
      "Request\032>.com.drivinggrpc.driving.rpc.pr" +
      "oto.user.getUserMessageResponse\"\000\022\221\001\n\016se" +
      "tUserMessage\022=.com.drivinggrpc.driving.r" +
      "pc.proto.user.setUserMessageRequest\032>.co" +
      "m.drivinggrpc.driving.rpc.proto.user.set" +
      "UserMessageResponse\"\000B5\n&com.drivinggrpc" +
      ".driving.rpc.proto.userB\tUserProtoP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageRequest_descriptor,
        new java.lang.String[] { "UserId", "HeadImage", "NickName", "Signature", "Name", "Phone", "Sex", "Age", "Job", "QqCode", "WeChat", "EMail", "NewHeadImage", "OldHeadImage", });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_setUserMessageResponse_descriptor,
        new java.lang.String[] { "State", });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_loginRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_loginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_loginRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "Power", });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_descriptor,
        new java.lang.String[] { "State", });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_registerRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_registerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_registerRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "Power", });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_registerResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_registerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_registerResponse_descriptor,
        new java.lang.String[] { "State", });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_upPasswordResponse_descriptor,
        new java.lang.String[] { "State", });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageRequest_descriptor,
        new java.lang.String[] { "UserName", });
    internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_drivinggrpc_driving_rpc_proto_user_getUserMessageResponse_descriptor,
        new java.lang.String[] { "UserId", "HeadImage", "NickName", "Signature", "Minute", "Date", "Name", "Phone", "Sex", "Age", "Job", "QqCode", "WeChat", "EMail", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
