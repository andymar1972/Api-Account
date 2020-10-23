package com.everis.service;

import com.everis.response.AccountResponse;

public interface AccountService {
  
  public AccountResponse findByCardNumber(String cardNumber);

}
