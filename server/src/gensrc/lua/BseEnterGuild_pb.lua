-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseEnterGuild_pb', package.seeall)


local BSEENTERGUILD = protobuf.Descriptor();
local BSEENTERGUILD_GUILDID_FIELD = protobuf.FieldDescriptor();
local BSEENTERGUILD_GUILDINFO_FIELD = protobuf.FieldDescriptor();
local BSEENTERGUILD_APPLYNUM_FIELD = protobuf.FieldDescriptor();

BSEENTERGUILD_GUILDID_FIELD.name = "guildID"
BSEENTERGUILD_GUILDID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseEnterGuild.guildID"
BSEENTERGUILD_GUILDID_FIELD.number = 1
BSEENTERGUILD_GUILDID_FIELD.index = 0
BSEENTERGUILD_GUILDID_FIELD.label = 1
BSEENTERGUILD_GUILDID_FIELD.has_default_value = false
BSEENTERGUILD_GUILDID_FIELD.default_value = ""
BSEENTERGUILD_GUILDID_FIELD.type = 9
BSEENTERGUILD_GUILDID_FIELD.cpp_type = 9

BSEENTERGUILD_GUILDINFO_FIELD.name = "guildInfo"
BSEENTERGUILD_GUILDINFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseEnterGuild.guildInfo"
BSEENTERGUILD_GUILDINFO_FIELD.number = 2
BSEENTERGUILD_GUILDINFO_FIELD.index = 1
BSEENTERGUILD_GUILDINFO_FIELD.label = 1
BSEENTERGUILD_GUILDINFO_FIELD.has_default_value = false
BSEENTERGUILD_GUILDINFO_FIELD.default_value = nil
BSEENTERGUILD_GUILDINFO_FIELD.message_type = GUILDINFO_PB_GUILDINFO
BSEENTERGUILD_GUILDINFO_FIELD.type = 11
BSEENTERGUILD_GUILDINFO_FIELD.cpp_type = 10

BSEENTERGUILD_APPLYNUM_FIELD.name = "applynum"
BSEENTERGUILD_APPLYNUM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseEnterGuild.applynum"
BSEENTERGUILD_APPLYNUM_FIELD.number = 3
BSEENTERGUILD_APPLYNUM_FIELD.index = 2
BSEENTERGUILD_APPLYNUM_FIELD.label = 1
BSEENTERGUILD_APPLYNUM_FIELD.has_default_value = false
BSEENTERGUILD_APPLYNUM_FIELD.default_value = 0
BSEENTERGUILD_APPLYNUM_FIELD.type = 5
BSEENTERGUILD_APPLYNUM_FIELD.cpp_type = 1

BSEENTERGUILD.name = "BseEnterGuild"
BSEENTERGUILD.full_name = ".com.xinqihd.sns.gameserver.proto.BseEnterGuild"
BSEENTERGUILD.nested_types = {}
BSEENTERGUILD.enum_types = {}
BSEENTERGUILD.fields = {BSEENTERGUILD_GUILDID_FIELD, BSEENTERGUILD_GUILDINFO_FIELD, BSEENTERGUILD_APPLYNUM_FIELD}
BSEENTERGUILD.is_extendable = false
BSEENTERGUILD.extensions = {}

BseEnterGuild = protobuf.Message(BSEENTERGUILD)
_G.BSEENTERGUILD_PB_BSEENTERGUILD = BSEENTERGUILD
