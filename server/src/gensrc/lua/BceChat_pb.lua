-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceChat_pb', package.seeall)


local BCECHAT = protobuf.Descriptor();
local BCECHAT_MSGTYPE_FIELD = protobuf.FieldDescriptor();
local BCECHAT_MSGCONTENT_FIELD = protobuf.FieldDescriptor();
local BCECHAT_USRID_FIELD = protobuf.FieldDescriptor();

BCECHAT_MSGTYPE_FIELD.name = "msgType"
BCECHAT_MSGTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChat.msgType"
BCECHAT_MSGTYPE_FIELD.number = 1
BCECHAT_MSGTYPE_FIELD.index = 0
BCECHAT_MSGTYPE_FIELD.label = 2
BCECHAT_MSGTYPE_FIELD.has_default_value = false
BCECHAT_MSGTYPE_FIELD.default_value = 0
BCECHAT_MSGTYPE_FIELD.type = 5
BCECHAT_MSGTYPE_FIELD.cpp_type = 1

BCECHAT_MSGCONTENT_FIELD.name = "msgContent"
BCECHAT_MSGCONTENT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChat.msgContent"
BCECHAT_MSGCONTENT_FIELD.number = 2
BCECHAT_MSGCONTENT_FIELD.index = 1
BCECHAT_MSGCONTENT_FIELD.label = 2
BCECHAT_MSGCONTENT_FIELD.has_default_value = false
BCECHAT_MSGCONTENT_FIELD.default_value = ""
BCECHAT_MSGCONTENT_FIELD.type = 9
BCECHAT_MSGCONTENT_FIELD.cpp_type = 9

BCECHAT_USRID_FIELD.name = "usrId"
BCECHAT_USRID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChat.usrId"
BCECHAT_USRID_FIELD.number = 3
BCECHAT_USRID_FIELD.index = 2
BCECHAT_USRID_FIELD.label = 1
BCECHAT_USRID_FIELD.has_default_value = false
BCECHAT_USRID_FIELD.default_value = ""
BCECHAT_USRID_FIELD.type = 9
BCECHAT_USRID_FIELD.cpp_type = 9

BCECHAT.name = "BceChat"
BCECHAT.full_name = ".com.xinqihd.sns.gameserver.proto.BceChat"
BCECHAT.nested_types = {}
BCECHAT.enum_types = {}
BCECHAT.fields = {BCECHAT_MSGTYPE_FIELD, BCECHAT_MSGCONTENT_FIELD, BCECHAT_USRID_FIELD}
BCECHAT.is_extendable = false
BCECHAT.extensions = {}

BceChat = protobuf.Message(BCECHAT)
_G.BCECHAT_PB_BCECHAT = BCECHAT

