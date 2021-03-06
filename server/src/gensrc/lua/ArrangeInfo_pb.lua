-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('ArrangeInfo_pb', package.seeall)


local ARRANGEINFO = protobuf.Descriptor();
local ARRANGEINFO_USERID_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_RANK_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_NAME_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_LEVEL_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_POWER_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_TYPE_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_SCORE_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_VIPLEVEL_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_RESERVED1_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_RESERVED2_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_RESERVED3_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_RESERVED4_FIELD = protobuf.FieldDescriptor();
local ARRANGEINFO_RESERVED5_FIELD = protobuf.FieldDescriptor();

ARRANGEINFO_USERID_FIELD.name = "userid"
ARRANGEINFO_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.userid"
ARRANGEINFO_USERID_FIELD.number = 1
ARRANGEINFO_USERID_FIELD.index = 0
ARRANGEINFO_USERID_FIELD.label = 2
ARRANGEINFO_USERID_FIELD.has_default_value = false
ARRANGEINFO_USERID_FIELD.default_value = ""
ARRANGEINFO_USERID_FIELD.type = 9
ARRANGEINFO_USERID_FIELD.cpp_type = 9

ARRANGEINFO_RANK_FIELD.name = "rank"
ARRANGEINFO_RANK_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.rank"
ARRANGEINFO_RANK_FIELD.number = 2
ARRANGEINFO_RANK_FIELD.index = 1
ARRANGEINFO_RANK_FIELD.label = 2
ARRANGEINFO_RANK_FIELD.has_default_value = false
ARRANGEINFO_RANK_FIELD.default_value = 0
ARRANGEINFO_RANK_FIELD.type = 5
ARRANGEINFO_RANK_FIELD.cpp_type = 1

ARRANGEINFO_NAME_FIELD.name = "name"
ARRANGEINFO_NAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.name"
ARRANGEINFO_NAME_FIELD.number = 3
ARRANGEINFO_NAME_FIELD.index = 2
ARRANGEINFO_NAME_FIELD.label = 2
ARRANGEINFO_NAME_FIELD.has_default_value = false
ARRANGEINFO_NAME_FIELD.default_value = ""
ARRANGEINFO_NAME_FIELD.type = 9
ARRANGEINFO_NAME_FIELD.cpp_type = 9

ARRANGEINFO_LEVEL_FIELD.name = "level"
ARRANGEINFO_LEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.level"
ARRANGEINFO_LEVEL_FIELD.number = 4
ARRANGEINFO_LEVEL_FIELD.index = 3
ARRANGEINFO_LEVEL_FIELD.label = 2
ARRANGEINFO_LEVEL_FIELD.has_default_value = false
ARRANGEINFO_LEVEL_FIELD.default_value = 0
ARRANGEINFO_LEVEL_FIELD.type = 5
ARRANGEINFO_LEVEL_FIELD.cpp_type = 1

ARRANGEINFO_POWER_FIELD.name = "power"
ARRANGEINFO_POWER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.power"
ARRANGEINFO_POWER_FIELD.number = 5
ARRANGEINFO_POWER_FIELD.index = 4
ARRANGEINFO_POWER_FIELD.label = 1
ARRANGEINFO_POWER_FIELD.has_default_value = false
ARRANGEINFO_POWER_FIELD.default_value = 0
ARRANGEINFO_POWER_FIELD.type = 5
ARRANGEINFO_POWER_FIELD.cpp_type = 1

ARRANGEINFO_TYPE_FIELD.name = "type"
ARRANGEINFO_TYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.type"
ARRANGEINFO_TYPE_FIELD.number = 6
ARRANGEINFO_TYPE_FIELD.index = 5
ARRANGEINFO_TYPE_FIELD.label = 2
ARRANGEINFO_TYPE_FIELD.has_default_value = false
ARRANGEINFO_TYPE_FIELD.default_value = 0
ARRANGEINFO_TYPE_FIELD.type = 5
ARRANGEINFO_TYPE_FIELD.cpp_type = 1

ARRANGEINFO_SCORE_FIELD.name = "score"
ARRANGEINFO_SCORE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.score"
ARRANGEINFO_SCORE_FIELD.number = 7
ARRANGEINFO_SCORE_FIELD.index = 6
ARRANGEINFO_SCORE_FIELD.label = 2
ARRANGEINFO_SCORE_FIELD.has_default_value = false
ARRANGEINFO_SCORE_FIELD.default_value = 0
ARRANGEINFO_SCORE_FIELD.type = 5
ARRANGEINFO_SCORE_FIELD.cpp_type = 1

ARRANGEINFO_VIPLEVEL_FIELD.name = "viplevel"
ARRANGEINFO_VIPLEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.viplevel"
ARRANGEINFO_VIPLEVEL_FIELD.number = 8
ARRANGEINFO_VIPLEVEL_FIELD.index = 7
ARRANGEINFO_VIPLEVEL_FIELD.label = 1
ARRANGEINFO_VIPLEVEL_FIELD.has_default_value = false
ARRANGEINFO_VIPLEVEL_FIELD.default_value = 0
ARRANGEINFO_VIPLEVEL_FIELD.type = 5
ARRANGEINFO_VIPLEVEL_FIELD.cpp_type = 1

ARRANGEINFO_RESERVED1_FIELD.name = "reserved1"
ARRANGEINFO_RESERVED1_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.reserved1"
ARRANGEINFO_RESERVED1_FIELD.number = 9
ARRANGEINFO_RESERVED1_FIELD.index = 8
ARRANGEINFO_RESERVED1_FIELD.label = 1
ARRANGEINFO_RESERVED1_FIELD.has_default_value = false
ARRANGEINFO_RESERVED1_FIELD.default_value = 0
ARRANGEINFO_RESERVED1_FIELD.type = 5
ARRANGEINFO_RESERVED1_FIELD.cpp_type = 1

ARRANGEINFO_RESERVED2_FIELD.name = "reserved2"
ARRANGEINFO_RESERVED2_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.reserved2"
ARRANGEINFO_RESERVED2_FIELD.number = 10
ARRANGEINFO_RESERVED2_FIELD.index = 9
ARRANGEINFO_RESERVED2_FIELD.label = 1
ARRANGEINFO_RESERVED2_FIELD.has_default_value = false
ARRANGEINFO_RESERVED2_FIELD.default_value = 0
ARRANGEINFO_RESERVED2_FIELD.type = 5
ARRANGEINFO_RESERVED2_FIELD.cpp_type = 1

ARRANGEINFO_RESERVED3_FIELD.name = "reserved3"
ARRANGEINFO_RESERVED3_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.reserved3"
ARRANGEINFO_RESERVED3_FIELD.number = 11
ARRANGEINFO_RESERVED3_FIELD.index = 10
ARRANGEINFO_RESERVED3_FIELD.label = 1
ARRANGEINFO_RESERVED3_FIELD.has_default_value = false
ARRANGEINFO_RESERVED3_FIELD.default_value = 0
ARRANGEINFO_RESERVED3_FIELD.type = 5
ARRANGEINFO_RESERVED3_FIELD.cpp_type = 1

ARRANGEINFO_RESERVED4_FIELD.name = "reserved4"
ARRANGEINFO_RESERVED4_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.reserved4"
ARRANGEINFO_RESERVED4_FIELD.number = 12
ARRANGEINFO_RESERVED4_FIELD.index = 11
ARRANGEINFO_RESERVED4_FIELD.label = 1
ARRANGEINFO_RESERVED4_FIELD.has_default_value = false
ARRANGEINFO_RESERVED4_FIELD.default_value = 0
ARRANGEINFO_RESERVED4_FIELD.type = 5
ARRANGEINFO_RESERVED4_FIELD.cpp_type = 1

ARRANGEINFO_RESERVED5_FIELD.name = "reserved5"
ARRANGEINFO_RESERVED5_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo.reserved5"
ARRANGEINFO_RESERVED5_FIELD.number = 13
ARRANGEINFO_RESERVED5_FIELD.index = 12
ARRANGEINFO_RESERVED5_FIELD.label = 1
ARRANGEINFO_RESERVED5_FIELD.has_default_value = false
ARRANGEINFO_RESERVED5_FIELD.default_value = 0
ARRANGEINFO_RESERVED5_FIELD.type = 5
ARRANGEINFO_RESERVED5_FIELD.cpp_type = 1

ARRANGEINFO.name = "ArrangeInfo"
ARRANGEINFO.full_name = ".com.xinqihd.sns.gameserver.proto.ArrangeInfo"
ARRANGEINFO.nested_types = {}
ARRANGEINFO.enum_types = {}
ARRANGEINFO.fields = {ARRANGEINFO_USERID_FIELD, ARRANGEINFO_RANK_FIELD, ARRANGEINFO_NAME_FIELD, ARRANGEINFO_LEVEL_FIELD, ARRANGEINFO_POWER_FIELD, ARRANGEINFO_TYPE_FIELD, ARRANGEINFO_SCORE_FIELD, ARRANGEINFO_VIPLEVEL_FIELD, ARRANGEINFO_RESERVED1_FIELD, ARRANGEINFO_RESERVED2_FIELD, ARRANGEINFO_RESERVED3_FIELD, ARRANGEINFO_RESERVED4_FIELD, ARRANGEINFO_RESERVED5_FIELD}
ARRANGEINFO.is_extendable = false
ARRANGEINFO.extensions = {}

ArrangeInfo = protobuf.Message(ARRANGEINFO)
_G.ARRANGEINFO_PB_ARRANGEINFO = ARRANGEINFO

