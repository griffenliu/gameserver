-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceFindRoom_pb', package.seeall)


local BCEFINDROOM = protobuf.Descriptor();
local BCEFINDROOM_ROOMID_FIELD = protobuf.FieldDescriptor();
local BCEFINDROOM_USERID_FIELD = protobuf.FieldDescriptor();

BCEFINDROOM_ROOMID_FIELD.name = "roomID"
BCEFINDROOM_ROOMID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceFindRoom.roomID"
BCEFINDROOM_ROOMID_FIELD.number = 1
BCEFINDROOM_ROOMID_FIELD.index = 0
BCEFINDROOM_ROOMID_FIELD.label = 2
BCEFINDROOM_ROOMID_FIELD.has_default_value = true
BCEFINDROOM_ROOMID_FIELD.default_value = 0
BCEFINDROOM_ROOMID_FIELD.type = 5
BCEFINDROOM_ROOMID_FIELD.cpp_type = 1

BCEFINDROOM_USERID_FIELD.name = "userID"
BCEFINDROOM_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceFindRoom.userID"
BCEFINDROOM_USERID_FIELD.number = 2
BCEFINDROOM_USERID_FIELD.index = 1
BCEFINDROOM_USERID_FIELD.label = 1
BCEFINDROOM_USERID_FIELD.has_default_value = false
BCEFINDROOM_USERID_FIELD.default_value = ""
BCEFINDROOM_USERID_FIELD.type = 9
BCEFINDROOM_USERID_FIELD.cpp_type = 9

BCEFINDROOM.name = "BceFindRoom"
BCEFINDROOM.full_name = ".com.xinqihd.sns.gameserver.proto.BceFindRoom"
BCEFINDROOM.nested_types = {}
BCEFINDROOM.enum_types = {}
BCEFINDROOM.fields = {BCEFINDROOM_ROOMID_FIELD, BCEFINDROOM_USERID_FIELD}
BCEFINDROOM.is_extendable = false
BCEFINDROOM.extensions = {}

BceFindRoom = protobuf.Message(BCEFINDROOM)
_G.BCEFINDROOM_PB_BCEFINDROOM = BCEFINDROOM

