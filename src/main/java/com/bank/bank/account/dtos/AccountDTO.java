package com.bank.bank.account.dtos;


import com.bank.bank.auth_users.dtos.UserDTO;
import com.bank.bank.enums.AccountStatus;
import com.bank.bank.enums.AccountType;
import com.bank.bank.enums.Currency;
import com.bank.bank.transaction.dtos.TransactionDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private Long id;

    private String accountNumber;

    private BigDecimal balance;

    private AccountType accountType;

    @JsonBackReference// this will not be added to the account dto. It will be ignored because it is a back refrence
    private UserDTO user;

    private Currency currency;

    private AccountStatus status;

    @JsonManagedReference// if helps avoid recursion loop by ignoring the AccountDTO withing the TransactionDTO
     private List<TransactionDTO> transactions;

    private LocalDateTime closedAt;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
