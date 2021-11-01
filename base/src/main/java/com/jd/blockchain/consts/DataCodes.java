package com.jd.blockchain.consts;

/**
 * A const registeration of codes of all data contracts in ledger model;
 *
 * @author huanghaiquan
 */
public interface DataCodes {

    int MERKLE_SNAPSHOT = 0x070;

    int MERKLE_TRIE_DATA = 0x071;

    int MERKLE_TRIE_LEAF = 0x072;

    int MERKLE_TRIE_PATH = 0x073;

    int MERKLE_TRIE_KEY = 0x074;

    int MERKLE_SORTED_TREE_INDEX = 0x076;

    int MERKLE_HASH_SORTED_TREE_KEY_INDEX = 0x078;

    int MERKLE_HASH_SORTED_TREE_KEY_HASH_BUCKET = 0x079;

    int BYTES_VALUE = 0x080;

    int BYTES_VALUE_LIST = 0x081;

    int BLOCK_CHAIN_IDENTITY = 0x090;

    int BLOCK = 0x100;

    int BLOCK_BODY = 0x110;

    int BLOCK_GENESIS = 0x120;

    int DATA_SNAPSHOT = 0x130;

    int LEDGER_ADMIN_INFO = 0x131;

    int TX_CONTENT = 0x200;

    int TX_REQUEST = 0x202;

    int TX_RESULT = 0x203;

    int TX_RECORD = 0x206;

    int TX_RECORDS = 0x207;

    int TX_RETURN_MESSAGE = 0x230;

    int TX_OP = 0x300;

    int TX_OP_LEDGER_INIT = 0x301;

    int TX_OP_USER_REG = 0x310;
    int TX_OP_USER_INFO_SET = 0x311;
    int TX_OP_USER_INFO_SET_KV = 0x312;
    int TX_OP_USER_STATE = 0x313;
    int ENUM_ACCOUNT_STATE = 0x314;
    int TX_OP_USER_CA_UPDATE = 0x315;
    int TX_OP_CONTRACT_STATE = 0x316;

    int TX_OP_DATA_ACC_REG = 0x320;
    int TX_OP_DATA_ACC_SET = 0x321;
    int TX_OP_DATA_ACC_SET_KV = 0x322;

    int TX_OP_CONTRACT_DEPLOY = 0x330;
    int TX_OP_CONTRACT_UPDATE = 0x331;

    int TX_OP_CONTRACT_EVENT_SEND = 0x340;
    int TX_OP_CONTRACT_CROSS_EVENT_SEND = 0x341;

    int TX_OP_PARTICIPANT_REG = 0x350;
    int TX_OP_PARTICIPANT_STATE_UPDATE = 0x351;

    int TX_RESPONSE = 0x360;

    int TX_OP_RESULT = 0x370;

    int TX_OP_ROLE_CONFIGURE = 0x371;

    int TX_OP_ROLE_CONFIGURE_ENTRY = 0x372;

    int TX_OP_USER_ROLES_AUTHORIZE = 0x373;

    int TX_OP_USER_ROLE_AUTHORIZE_ENTRY = 0x374;

    int TX_OP_EVENT_ACC_REG = 0x380;
    int TX_OP_EVENT_PUBLISH = 0x381;
    int TX_OP_EVENT_PUBLISH_ENTITY = 0x382;

    int TX_OP_CONSENSUS_SETTINGS_UPDATE = 0x390;
    int TX_OP_META_CA_UPDATE = 0x391;
    int TX_OP_CONSENSUS_RECONFIG = 0x392;

    // enum types of permissions;
    int ENUM_TX_PERMISSION = 0x401;
    int ENUM_LEDGER_PERMISSION = 0x402;
    int ENUM_MULTI_ROLES_POLICY = 0x403;

    int PRIVILEGE_SET = 0x410;

    int ROLE_SET = 0x411;

    int SECURITY_INIT_SETTING = 0x420;

    int SECURITY_ROLE_INIT_SETTING = 0x421;

    int SECURITY_USER_AUTH_INIT_SETTING = 0x422;

    // event types;
    int EVENT_MESSAGE = 0x501;


    // contract types of metadata;
    int METADATA = 0x600;
    int METADATA_V2 = 0x601;

    int METADATA_INIT_SETTING = 0x610;

    int METADATA_INIT_PROPOSAL = 0x611;

    int METADATA_INIT_DECISION = 0x612;

    int METADATA_LEDGER_SETTING = 0x620;

    int METADATA_CONSENSUS_PARTICIPANT = 0x621;

    int METADATA_CONSENSUS_SETTING = 0x631;

    int METADATA_PARTICIPANT_INFO = 0x640;

    int METADATA_PARTICIPANT_STATE_INFO = 0x641;

    int METADATA_CRYPTO_SETTING = 0x642;

    int METADATA_CRYPTO_SETTING_PROVIDER = 0x643;

    int METADATA_IDENTITY_MODE = 0x644;

    int METADATA_GENESIS_USER = 0x645;

    int METADATA_LEDGER_DATA_STRUCTURE = 0x646;

    int ACCOUNT_SNAPSHOT = 0x701;

    int DATA_ACCOUNT_INFO = 0x710;

    int EVENT_ACCOUNT_INFO = 0x740;

    int USER_ACCOUNT_HEADER = 0x800;

    int USER_INFO = 0x801;

    int DATA = 0x900;

    // contract related;
    int CONTRACT_ACCOUNT_HEADER = 0xA00;

    int CONTRACT_INFO = 0xA01;

    // ...0xA19
    int HASH = 0xB00;

    int HASH_OBJECT = 0xB10;

    int ENUM_TYPE = 0xB20;

    int CRYPTO_ALGORITHM = 0xB21;

    int TRANSACTION_EXEC_STATE = 0xB22;

    int ENUM_TYPE_BYTES_VALUE_TYPE = 0xB23;

    int ENUM_TYPE_PARTICIPANT_NODE_STATE = 0xB24;

    int DIGITALSIGNATURE = 0xB30;

    int DIGITALSIGNATURE_BODY = 0xB31;

    int CLIENT_CREDENTIAL = 0xC00;

    int CLIENT_SESSION_CREDENTIAL = 0xC01;

    int CLIENT_IDENTIFICATIONS = 0xC10;

    int LEDGER_PEERS_TOPOLOGY = 0xC20;

    // data permission
    int DATA_PERMISSION = 0xD00;
    int DATA_PERMISSION_TYPE = 0xD01;
    int ACCOUNT_TYPE = 0xD02;
    int ACCOUNT_PERMISSION = 0xD03;
    int TX_OP_ACC_PERMISSION_SET = 0xD10;


    // ------------------ 共识相关 ----------------

    int CONSENSUS = 0x1000;

    int CONSENSUS_ACTION_REQUEST = CONSENSUS | 0x01;

    int CONSENSUS_ACTION_RESPONSE = CONSENSUS | 0x02;

    int CONSENSUS_VIEW_SETTINGS = CONSENSUS | 0x03;

    int CONSENSUS_VIEW_NODE_SETTINGS = CONSENSUS | 0x04;

    int CONSENSUS_CLI_INCOMING_SETTINGS = CONSENSUS | 0x05;

    int CONSENSUS_NODE_NETWORK_ADDRESS = CONSENSUS | 0x06;

    int CONSENSUS_NODE_NETWORK_ADDRESSES = CONSENSUS | 0x07;

    // ------------------ 共识相关（BFTSMART） ----------------
    int CONSENSUS_BFTSMART = 0x1100;

    int CONSENSUS_BFTSMART_VIEW_SETTINGS = CONSENSUS_BFTSMART | 0x01;

    int CONSENSUS_BFTSMART_NODE_SETTINGS = CONSENSUS_BFTSMART | 0x02;

    int CONSENSUS_BFTSMART_CLI_INCOMING_SETTINGS = CONSENSUS_BFTSMART | 0x03;

    int CONSENSUS_BFTSMART_CLI_SESSION_CREDENTIAL = CONSENSUS_BFTSMART | 0x04;


    // ------------------ 共识相关（MSGQUEUE） ----------------
    int CONSENSUS_MSGQUEUE = 0x1200;

    int CONSENSUS_MSGQUEUE_SETTINGS = CONSENSUS_MSGQUEUE | 0x01;

    int CONSENSUS_MSGQUEUE_NODE_SETTINGS = CONSENSUS_MSGQUEUE | 0x02;

    int CONSENSUS_MSGQUEUE_CLI_INCOMING_SETTINGS = CONSENSUS_MSGQUEUE | 0x03;

    int CONSENSUS_MSGQUEUE_NETWORK_SETTINGS = CONSENSUS_MSGQUEUE | 0x04;

    int CONSENSUS_MSGQUEUE_BLOCK_SETTINGS = CONSENSUS_MSGQUEUE | 0x05;

    int CONSENSUS_MSGQUEUE_CLIENT_CREDENTIAL_INFO = CONSENSUS_MSGQUEUE | 0x06;

}
