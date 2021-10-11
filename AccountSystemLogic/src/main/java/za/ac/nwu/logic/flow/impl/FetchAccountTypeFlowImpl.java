package za.ac.nwu.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.logic.flow.FetchAccountTypeFlow;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        List<AccountTypeDto>accountTypeDtos = new ArrayList<>();
        accountTypeDtos.add(new AccountTypeDto("Miles", "Miles", LocalDate.now()));
        return accountTypeDtos;
    }
}
