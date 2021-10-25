package org.arnotec.ws;

import org.arnotec.core.Account;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BankWS {

    @WebMethod(operationName = "conversionEuroToFCFA")
    public double conversion(@WebParam(name = "amount") double mt) {
        return mt * 656;
    }

    @WebMethod
    public Account getAccount (@WebParam(name = "code") Long code) {
        return new Account(code, Math.random()*90000, new Date());
    }

    @WebMethod
    public List<Account> listAccount() {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account(1L, Math.random()*90000, new Date()));
        accountList.add(new Account(2L, Math.random()*90000, new Date()));
        accountList.add(new Account(3L, Math.random()*90000, new Date()));

        return accountList;
    }
}
