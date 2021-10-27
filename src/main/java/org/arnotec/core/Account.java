package org.arnotec.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {
    private Long code;
    private double solde;
    @XmlTransient
    private Date dateCreation;
}
