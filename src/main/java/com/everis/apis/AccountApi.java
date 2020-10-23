package com.everis.apis;

import com.everis.response.AccountResponse;
import com.everis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountApi {

  @Autowired
  AccountService accountService;

  @GetMapping("/core/accounts/cardNumber/{cardNumber}")
  public AccountResponse findByCardNumber(@PathVariable String cardNumber) {
    return accountService.findByCardNumber(cardNumber);
  }

}
