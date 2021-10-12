package za.ac.nwu.translator.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.domain.dto.Discovery_Account_Dto;
import za.ac.nwu.domain.dto.Discovery_Account_Dto;
import za.ac.nwu.domain.persistence.Discovery_Account;
import za.ac.nwu.repo.persistence.Discovery_Account_Repository;
import za.ac.nwu.translator.Discovery_AccountTranslator;

import java.util.ArrayList;
import java.util.List;

@Component
public class Discovery_AccountTranslatorImpl implements Discovery_AccountTranslator {

    private Discovery_Account_Repository discovery_account_repository;

    @Autowired
    public Discovery_AccountTranslatorImpl(Discovery_Account_Repository discovery_Account_Repository) {
        this.discovery_account_repository = discovery_Account_Repository;
    }

    @Override
    public List<Discovery_Account_Dto> getAllDiscovery_Accounts() {

        List<Discovery_Account_Dto> discovery_AccountDtos = new ArrayList<>();
        try {
            for (Discovery_Account discovery_Account : discovery_account_repository.findAll()) {
                discovery_AccountDtos.add(new Discovery_Account_Dto(discovery_Account));
            }
        } catch(Exception e){
            // TODO: Log
            throw new RuntimeException("Unable to read from the DB", e);
        }
        return discovery_AccountDtos;
    }
}
