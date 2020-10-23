package com.everis.response;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountResponse implements Serializable {

  private static final long serialVersionUID = -489414275266891965L;
  
  private String accountNumber;
  private double amount;
  
}
