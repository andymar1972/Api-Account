package com.everis.service;

import com.everis.constant.Constant;
import com.everis.response.AccountResponse;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  @Override
  public AccountResponse findByCardNumber(String cardNumber) {

    // Instanciar accountResponse
    AccountResponse accountResponse = new AccountResponse();

    // Monto aleatorio
    double montoAleatorio = Math.random() 
        * (Constant.MAX_AMOUNT - Constant.MIN_AMOUNT) 
        + Constant.MIN_AMOUNT;
    montoAleatorio = Math.round(montoAleatorio * 100) / 100d;

    // Pausa
    try {
      Thread.sleep(Constant.TIME_SLEEP);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Asignar valores a accountResponse
    accountResponse.setAccountNumber(cardNumber + "XXX");
    accountResponse.setAmount(montoAleatorio);

    // Retornar accountResponse
    return accountResponse;
  }

}
