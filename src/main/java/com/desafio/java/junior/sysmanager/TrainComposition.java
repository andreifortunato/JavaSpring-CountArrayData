package com.desafio.java.junior.sysmanager;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.security.DrbgParameters;

@Getter @Setter @NoArgsConstructor
public class TrainComposition extends DesafioJavaApplication{

    public static void main(String args[]){
        Integer[] trem = {1, 13, 2, 7, 3};
        Integer vagao = 0;


        System.out.println(" Trem 172 : ");
        for(vagao = 0; vagao<5; vagao++){
            if (trem[vagao] == 7 )
                trem[4] = trem[vagao];

            if (trem[vagao] == 13)
                 trem[2] = trem[vagao];

            System.out.println(" "+trem[vagao]);
        }
        System.out.println(" ");


        }
    }

