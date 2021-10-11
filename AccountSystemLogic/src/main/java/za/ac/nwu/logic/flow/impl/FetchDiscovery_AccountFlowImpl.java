package za.ac.nwu.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.domain.dto.Discovery_Account_Dto;
import za.ac.nwu.domain.persistence.Discovery_Account;
import za.ac.nwu.logic.flow.FetchDiscovery_AccountFlow;
import za.ac.nwu.translator.Discovery_AccountTranslator;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class FetchDiscovery_AccountFlowImpl implements FetchDiscovery_AccountFlow {

    private final Discovery_AccountTranslator discovery_accountTranslator;

    @Autowired
    public FetchDiscovery_AccountFlowImpl(Discovery_AccountTranslator discovery_AccountTranslator) {
        this.discovery_accountTranslator = discovery_AccountTranslator;
    }
    @Override
    public List<Discovery_Account_Dto> getAllDiscovery_Account() {
        List<Discovery_Account_Dto>Discovery_AccountDtos = new ArrayList<>();
        Discovery_Account.add(new Discovery_Account_Dto("Miles", "Miles", LocalDate.now()));
        return Discovery_AccountDtos;
    }


}
