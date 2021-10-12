package za.ac.nwu.domain.dto;

import za.ac.nwu.domain.persistence.Discovery_Account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.*;

@ApiModel(value = "Discovery_Account", description = "A DTO that represents the Discovery_Account")

public class Discovery_Account_Dto implements Serializable {

    private String mnemonic;
    private String discovery_AccountName;
    private LocalDate creationDate;

    public void Discovery_Account() {

    }

    public Discovery_Account_Dto(String mnemonic, String discovery_AccountName, LocalDate creationDate) {
        this.mnemonic = mnemonic;
        this.discovery_AccountName = discovery_AccountName;
        this.creationDate = creationDate;
    }

    public Discovery_Account_Dto(Discovery_Account discovery_Account) {
        //this.setDiscovery_AccountName(discovery_AccountName.getDiscovery_AccountName());
        this.setCreationDate(discovery_Account.getCreationDate());
        this.setMnemonic(discovery_Account.getMnemonic());
    }

    @ApiModelProperty(position = 1,
            value = "AccountType Mnemonic",
            name = "Mnemonic",
            notes = "Uniquely identifies the account type",
            dataType = "java.lang.String",
            example = "MILES",
            required = true)
    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    @ApiModelProperty(position = 2,
            value = "AccountType Name",
            name = "Name",
            notes = "The name of the account type",
            dataType = "java.lang.String",
            example = "Miles",
            allowEmptyValue = false,
            required = true)
    public String getDiscovery_AccountName() {
        return discovery_AccountName;
    }

    public void setDiscovery_AccountName(String discovery_AccountName) {
        this.discovery_AccountName = discovery_AccountName;
    }

    @ApiModelProperty(position = 3,
            value = "Discovery_Account Creation Date",
            name = "CreationDate",
            notes = "The date on which the Discovery Account was created",
            dataType = "java.lang.String",
            example = "2021-02-01",
            allowEmptyValue = true,
            required = true)
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discovery_Account_Dto that = (Discovery_Account_Dto) o;
        return Objects.equals(mnemonic, that.mnemonic) && Objects.equals(discovery_AccountName, that.discovery_AccountName) && Objects.equals(creationDate, that.creationDate);
    }

    @JsonIgnore
    public Discovery_Account getDiscovery_Account(){
        return new Discovery_Account(getMnemonic(), getDiscovery_AccountName(), getCreationDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(mnemonic, discovery_AccountName, creationDate);
    }

    @Override
    public String toString() {
        return "Discovery_AccountDto{" +
                "mnemonic='" + mnemonic + '\'' +
                ", discovery_AccountName='" + discovery_AccountName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}