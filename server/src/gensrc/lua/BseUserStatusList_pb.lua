-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseUserStatusList_pb', package.seeall)


local BSEUSERSTATUSLIST = protobuf.Descriptor();
local BSEUSERSTATUSLIST_STATUSLIST_FIELD = protobuf.FieldDescriptor();

BSEUSERSTATUSLIST_STATUSLIST_FIELD.name = "statuslist"
BSEUSERSTATUSLIST_STATUSLIST_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserStatusList.statuslist"
BSEUSERSTATUSLIST_STATUSLIST_FIELD.number = 1
BSEUSERSTATUSLIST_STATUSLIST_FIELD.index = 0
BSEUSERSTATUSLIST_STATUSLIST_FIELD.label = 3
BSEUSERSTATUSLIST_STATUSLIST_FIELD.has_default_value = false
BSEUSERSTATUSLIST_STATUSLIST_FIELD.default_value = {}
BSEUSERSTATUSLIST_STATUSLIST_FIELD.type = 9
BSEUSERSTATUSLIST_STATUSLIST_FIELD.cpp_type = 9

BSEUSERSTATUSLIST.name = "BseUserStatusList"
BSEUSERSTATUSLIST.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserStatusList"
BSEUSERSTATUSLIST.nested_types = {}
BSEUSERSTATUSLIST.enum_types = {}
BSEUSERSTATUSLIST.fields = {BSEUSERSTATUSLIST_STATUSLIST_FIELD}
BSEUSERSTATUSLIST.is_extendable = false
BSEUSERSTATUSLIST.extensions = {}

BseUserStatusList = protobuf.Message(BSEUSERSTATUSLIST)
_G.BSEUSERSTATUSLIST_PB_BSEUSERSTATUSLIST = BSEUSERSTATUSLIST
