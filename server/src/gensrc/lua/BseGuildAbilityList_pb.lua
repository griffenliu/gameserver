-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildAbilityList_pb', package.seeall)


local GUILDABILITY = protobuf.Descriptor();
local GUILDABILITY_TYPE_FIELD = protobuf.FieldDescriptor();
local GUILDABILITY_NAME_FIELD = protobuf.FieldDescriptor();
local GUILDABILITY_LEVEL_FIELD = protobuf.FieldDescriptor();
local GUILDABILITY_COOLDOWN_FIELD = protobuf.FieldDescriptor();
local GUILDABILITY_YUANBAO_FIELD = protobuf.FieldDescriptor();
local BSEGUILDABILITYLIST = protobuf.Descriptor();
local BSEGUILDABILITYLIST_ABILITY_FIELD = protobuf.FieldDescriptor();

GUILDABILITY_TYPE_FIELD.name = "type"
GUILDABILITY_TYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildAbility.type"
GUILDABILITY_TYPE_FIELD.number = 1
GUILDABILITY_TYPE_FIELD.index = 0
GUILDABILITY_TYPE_FIELD.label = 1
GUILDABILITY_TYPE_FIELD.has_default_value = false
GUILDABILITY_TYPE_FIELD.default_value = 0
GUILDABILITY_TYPE_FIELD.type = 5
GUILDABILITY_TYPE_FIELD.cpp_type = 1

GUILDABILITY_NAME_FIELD.name = "name"
GUILDABILITY_NAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildAbility.name"
GUILDABILITY_NAME_FIELD.number = 2
GUILDABILITY_NAME_FIELD.index = 1
GUILDABILITY_NAME_FIELD.label = 1
GUILDABILITY_NAME_FIELD.has_default_value = false
GUILDABILITY_NAME_FIELD.default_value = 0
GUILDABILITY_NAME_FIELD.type = 5
GUILDABILITY_NAME_FIELD.cpp_type = 1

GUILDABILITY_LEVEL_FIELD.name = "level"
GUILDABILITY_LEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildAbility.level"
GUILDABILITY_LEVEL_FIELD.number = 3
GUILDABILITY_LEVEL_FIELD.index = 2
GUILDABILITY_LEVEL_FIELD.label = 1
GUILDABILITY_LEVEL_FIELD.has_default_value = false
GUILDABILITY_LEVEL_FIELD.default_value = 0
GUILDABILITY_LEVEL_FIELD.type = 5
GUILDABILITY_LEVEL_FIELD.cpp_type = 1

GUILDABILITY_COOLDOWN_FIELD.name = "cooldown"
GUILDABILITY_COOLDOWN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildAbility.cooldown"
GUILDABILITY_COOLDOWN_FIELD.number = 10
GUILDABILITY_COOLDOWN_FIELD.index = 3
GUILDABILITY_COOLDOWN_FIELD.label = 1
GUILDABILITY_COOLDOWN_FIELD.has_default_value = false
GUILDABILITY_COOLDOWN_FIELD.default_value = 0
GUILDABILITY_COOLDOWN_FIELD.type = 5
GUILDABILITY_COOLDOWN_FIELD.cpp_type = 1

GUILDABILITY_YUANBAO_FIELD.name = "yuanbao"
GUILDABILITY_YUANBAO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildAbility.yuanbao"
GUILDABILITY_YUANBAO_FIELD.number = 11
GUILDABILITY_YUANBAO_FIELD.index = 4
GUILDABILITY_YUANBAO_FIELD.label = 1
GUILDABILITY_YUANBAO_FIELD.has_default_value = false
GUILDABILITY_YUANBAO_FIELD.default_value = 0
GUILDABILITY_YUANBAO_FIELD.type = 5
GUILDABILITY_YUANBAO_FIELD.cpp_type = 1

GUILDABILITY.name = "GuildAbility"
GUILDABILITY.full_name = ".com.xinqihd.sns.gameserver.proto.GuildAbility"
GUILDABILITY.nested_types = {}
GUILDABILITY.enum_types = {}
GUILDABILITY.fields = {GUILDABILITY_TYPE_FIELD, GUILDABILITY_NAME_FIELD, GUILDABILITY_LEVEL_FIELD, GUILDABILITY_COOLDOWN_FIELD, GUILDABILITY_YUANBAO_FIELD}
GUILDABILITY.is_extendable = false
GUILDABILITY.extensions = {}
BSEGUILDABILITYLIST_ABILITY_FIELD.name = "ability"
BSEGUILDABILITYLIST_ABILITY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildAbilityList.ability"
BSEGUILDABILITYLIST_ABILITY_FIELD.number = 1
BSEGUILDABILITYLIST_ABILITY_FIELD.index = 0
BSEGUILDABILITYLIST_ABILITY_FIELD.label = 3
BSEGUILDABILITYLIST_ABILITY_FIELD.has_default_value = false
BSEGUILDABILITYLIST_ABILITY_FIELD.default_value = {}
BSEGUILDABILITYLIST_ABILITY_FIELD.message_type = GUILDABILITY
BSEGUILDABILITYLIST_ABILITY_FIELD.type = 11
BSEGUILDABILITYLIST_ABILITY_FIELD.cpp_type = 10

BSEGUILDABILITYLIST.name = "BseGuildAbilityList"
BSEGUILDABILITYLIST.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildAbilityList"
BSEGUILDABILITYLIST.nested_types = {}
BSEGUILDABILITYLIST.enum_types = {}
BSEGUILDABILITYLIST.fields = {BSEGUILDABILITYLIST_ABILITY_FIELD}
BSEGUILDABILITYLIST.is_extendable = false
BSEGUILDABILITYLIST.extensions = {}

BseGuildAbilityList = protobuf.Message(BSEGUILDABILITYLIST)
GuildAbility = protobuf.Message(GUILDABILITY)
_G.BSEGUILDABILITYLIST_PB_BSEGUILDABILITYLIST = BSEGUILDABILITYLIST
_G.GUILDABILITY_PB_GUILDABILITY = GUILDABILITY

