package com.jd.blockchain.ledger;

import com.jd.binaryproto.DataContract;
import com.jd.blockchain.consts.DataCodes;

@DataContract(code= DataCodes.TX_OP_CONSENSUS_RECONFIG)
public interface ConsensusReconfigOperation extends Operation {

}
