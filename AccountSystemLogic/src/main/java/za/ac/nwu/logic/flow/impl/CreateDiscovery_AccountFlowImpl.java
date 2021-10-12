package za.ac.nwu.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.domain.dto.Discovery_Account_Dto;
import za.ac.nwu.logic.flow.CreateDiscovery_AccountFlow;
import za.ac.nwu.translator.Discovery_AccountTranslator;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component("createDiscover_AccountFlowName")
public class CreateDiscovery_AccountFlowImpl implements CreateDiscovery_AccountFlow {

    private final Discovery_AccountTranslator discovery_AccountTranslator;

    public CreateDiscovery_AccountFlowImpl(Discovery_AccountTranslator discovery_accountTranslator){
        this.discovery_AccountTranslator = discovery_accountTranslator;
    }

//    @Override
//    public Discovery_Account_Dto create(Discovery_AccountDto discovery_Account) {
//        if (null == discovery_Account.getCreationDate()) {
//            discovery_Account.setCreationDate(LocalDate.now());
//        }
//        return discovery_Account.create(discovery_Account);
//    }
}
