package com.esisba.msscolarite.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Virement {
    Long idVirement;
    Date dateVirement;
    Float nCompteCCP;
}
