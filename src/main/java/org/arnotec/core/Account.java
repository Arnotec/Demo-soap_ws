package org.arnotec.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    private Long code;
    private double solde;
    private Date dateCreation;
}
