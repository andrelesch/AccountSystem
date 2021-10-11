package za.ac.nwu.translator.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.domain.dto.Discovery_Account_Dto;
import za.ac.nwu.domain.persistence.Discovery_Account;
import za.ac.nwu.repo.persistence.Discovery_Account_Repository;
import za.ac.nwu.translator.Discovery_AccountTranslator;

import java.util.ArrayList;
import java.util.List;

@Component
public class Discovery_AccountTranslatorImpl implements Discovery_AccountTranslator {

    private final Discovery_Account_Repository discovery_account_repository;

    @Autowired
    public Discovery_AccountTranslatorImpl(Discovery_Account_Repository discovery_Account_Repository) {
        this.discovery_account_repository = discovery_Account_Repository;
    }

    @Override
    public List<Discovery_Account_Dto> accountTypeDtos = new ArrayList<>();
    try {
        for (Discovery_Account accountType : Discovery_Account_Repository.findAll()) {
            accountTypeDtos.add(new Discovery_Account_Dto(Discovery_Account));
        } catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }

        return accountTypeDtos;
    }
}
