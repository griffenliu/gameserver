-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseFriendsInfo_pb', package.seeall)


local BSEFRIENDSINFO = protobuf.Descriptor();
local BSEFRIENDSINFO_FRIBLOOD_FIELD = protobuf.FieldDescriptor();
local BSEFRIENDSINFO_FRITHEW_FIELD = protobuf.FieldDescriptor();
local BSEFRIENDSINFO_FRIDAMAGE_FIELD = protobuf.FieldDescriptor();
local BSEFRIENDSINFO_FRISKIN_FIELD = protobuf.FieldDescriptor();
local BSEFRIENDSINFO_FRINAME_FIELD = protobuf.FieldDescriptor();

BSEFRIENDSINFO_FRIBLOOD_FIELD.name = "friBlood"
BSEFRIENDSINFO_FRIBLOOD_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendsInfo.friBlood"
BSEFRIENDSINFO_FRIBLOOD_FIELD.number = 1
BSEFRIENDSINFO_FRIBLOOD_FIELD.index = 0
BSEFRIENDSINFO_FRIBLOOD_FIELD.label = 2
BSEFRIENDSINFO_FRIBLOOD_FIELD.has_default_value = false
BSEFRIENDSINFO_FRIBLOOD_FIELD.default_value = 0
BSEFRIENDSINFO_FRIBLOOD_FIELD.type = 5
BSEFRIENDSINFO_FRIBLOOD_FIELD.cpp_type = 1

BSEFRIENDSINFO_FRITHEW_FIELD.name = "friThew"
BSEFRIENDSINFO_FRITHEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendsInfo.friThew"
BSEFRIENDSINFO_FRITHEW_FIELD.number = 2
BSEFRIENDSINFO_FRITHEW_FIELD.index = 1
BSEFRIENDSINFO_FRITHEW_FIELD.label = 2
BSEFRIENDSINFO_FRITHEW_FIELD.has_default_value = false
BSEFRIENDSINFO_FRITHEW_FIELD.default_value = 0
BSEFRIENDSINFO_FRITHEW_FIELD.type = 5
BSEFRIENDSINFO_FRITHEW_FIELD.cpp_type = 1

BSEFRIENDSINFO_FRIDAMAGE_FIELD.name = "friDamage"
BSEFRIENDSINFO_FRIDAMAGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendsInfo.friDamage"
BSEFRIENDSINFO_FRIDAMAGE_FIELD.number = 3
BSEFRIENDSINFO_FRIDAMAGE_FIELD.index = 2
BSEFRIENDSINFO_FRIDAMAGE_FIELD.label = 2
BSEFRIENDSINFO_FRIDAMAGE_FIELD.has_default_value = false
BSEFRIENDSINFO_FRIDAMAGE_FIELD.default_value = 0
BSEFRIENDSINFO_FRIDAMAGE_FIELD.type = 5
BSEFRIENDSINFO_FRIDAMAGE_FIELD.cpp_type = 1

BSEFRIENDSINFO_FRISKIN_FIELD.name = "friSkin"
BSEFRIENDSINFO_FRISKIN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendsInfo.friSkin"
BSEFRIENDSINFO_FRISKIN_FIELD.number = 4
BSEFRIENDSINFO_FRISKIN_FIELD.index = 3
BSEFRIENDSINFO_FRISKIN_FIELD.label = 2
BSEFRIENDSINFO_FRISKIN_FIELD.has_default_value = false
BSEFRIENDSINFO_FRISKIN_FIELD.default_value = 0
BSEFRIENDSINFO_FRISKIN_FIELD.type = 5
BSEFRIENDSINFO_FRISKIN_FIELD.cpp_type = 1

BSEFRIENDSINFO_FRINAME_FIELD.name = "friName"
BSEFRIENDSINFO_FRINAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendsInfo.friName"
BSEFRIENDSINFO_FRINAME_FIELD.number = 5
BSEFRIENDSINFO_FRINAME_FIELD.index = 4
BSEFRIENDSINFO_FRINAME_FIELD.label = 2
BSEFRIENDSINFO_FRINAME_FIELD.has_default_value = false
BSEFRIENDSINFO_FRINAME_FIELD.default_value = ""
BSEFRIENDSINFO_FRINAME_FIELD.type = 9
BSEFRIENDSINFO_FRINAME_FIELD.cpp_type = 9

BSEFRIENDSINFO.name = "BseFriendsInfo"
BSEFRIENDSINFO.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendsInfo"
BSEFRIENDSINFO.nested_types = {}
BSEFRIENDSINFO.enum_types = {}
BSEFRIENDSINFO.fields = {BSEFRIENDSINFO_FRIBLOOD_FIELD, BSEFRIENDSINFO_FRITHEW_FIELD, BSEFRIENDSINFO_FRIDAMAGE_FIELD, BSEFRIENDSINFO_FRISKIN_FIELD, BSEFRIENDSINFO_FRINAME_FIELD}
BSEFRIENDSINFO.is_extendable = false
BSEFRIENDSINFO.extensions = {}

BseFriendsInfo = protobuf.Message(BSEFRIENDSINFO)
_G.BSEFRIENDSINFO_PB_BSEFRIENDSINFO = BSEFRIENDSINFO

