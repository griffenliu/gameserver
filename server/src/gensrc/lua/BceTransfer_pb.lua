-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceTransfer_pb', package.seeall)


local BCETRANSFER = protobuf.Descriptor();
local BCETRANSFER_SRCEQUIPPEW_FIELD = protobuf.FieldDescriptor();
local BCETRANSFER_TAREQUIPPEW_FIELD = protobuf.FieldDescriptor();

BCETRANSFER_SRCEQUIPPEW_FIELD.name = "srcEquipPew"
BCETRANSFER_SRCEQUIPPEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceTransfer.srcEquipPew"
BCETRANSFER_SRCEQUIPPEW_FIELD.number = 1
BCETRANSFER_SRCEQUIPPEW_FIELD.index = 0
BCETRANSFER_SRCEQUIPPEW_FIELD.label = 2
BCETRANSFER_SRCEQUIPPEW_FIELD.has_default_value = false
BCETRANSFER_SRCEQUIPPEW_FIELD.default_value = 0
BCETRANSFER_SRCEQUIPPEW_FIELD.type = 5
BCETRANSFER_SRCEQUIPPEW_FIELD.cpp_type = 1

BCETRANSFER_TAREQUIPPEW_FIELD.name = "tarEquipPew"
BCETRANSFER_TAREQUIPPEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceTransfer.tarEquipPew"
BCETRANSFER_TAREQUIPPEW_FIELD.number = 2
BCETRANSFER_TAREQUIPPEW_FIELD.index = 1
BCETRANSFER_TAREQUIPPEW_FIELD.label = 2
BCETRANSFER_TAREQUIPPEW_FIELD.has_default_value = false
BCETRANSFER_TAREQUIPPEW_FIELD.default_value = 0
BCETRANSFER_TAREQUIPPEW_FIELD.type = 5
BCETRANSFER_TAREQUIPPEW_FIELD.cpp_type = 1

BCETRANSFER.name = "BceTransfer"
BCETRANSFER.full_name = ".com.xinqihd.sns.gameserver.proto.BceTransfer"
BCETRANSFER.nested_types = {}
BCETRANSFER.enum_types = {}
BCETRANSFER.fields = {BCETRANSFER_SRCEQUIPPEW_FIELD, BCETRANSFER_TAREQUIPPEW_FIELD}
BCETRANSFER.is_extendable = false
BCETRANSFER.extensions = {}

BceTransfer = protobuf.Message(BCETRANSFER)
_G.BCETRANSFER_PB_BCETRANSFER = BCETRANSFER

