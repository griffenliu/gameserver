-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceUserRoleList_pb', package.seeall)


local BCEUSERROLELIST = protobuf.Descriptor();
local BCEUSERROLELIST_SERVERID_FIELD = protobuf.FieldDescriptor();

BCEUSERROLELIST_SERVERID_FIELD.name = "serverid"
BCEUSERROLELIST_SERVERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceUserRoleList.serverid"
BCEUSERROLELIST_SERVERID_FIELD.number = 1
BCEUSERROLELIST_SERVERID_FIELD.index = 0
BCEUSERROLELIST_SERVERID_FIELD.label = 1
BCEUSERROLELIST_SERVERID_FIELD.has_default_value = false
BCEUSERROLELIST_SERVERID_FIELD.default_value = ""
BCEUSERROLELIST_SERVERID_FIELD.type = 9
BCEUSERROLELIST_SERVERID_FIELD.cpp_type = 9

BCEUSERROLELIST.name = "BceUserRoleList"
BCEUSERROLELIST.full_name = ".com.xinqihd.sns.gameserver.proto.BceUserRoleList"
BCEUSERROLELIST.nested_types = {}
BCEUSERROLELIST.enum_types = {}
BCEUSERROLELIST.fields = {BCEUSERROLELIST_SERVERID_FIELD}
BCEUSERROLELIST.is_extendable = false
BCEUSERROLELIST.extensions = {}

BceUserRoleList = protobuf.Message(BCEUSERROLELIST)
_G.BCEUSERROLELIST_PB_BCEUSERROLELIST = BCEUSERROLELIST

