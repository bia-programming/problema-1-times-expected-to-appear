package com.company;
import java.io.*;

        public class Main
        {
            public static void main(String[] args) throws IOException{
                int times_appear,nr,mod,max=0,c=0;
                times_appear=2;
                nr=(int)System.in.read();
                do
                {
                    mod=nr%10;
                    if(mod>max)
                        max=mod;
                        c++;
                    nr=nr/10;
                }while(nr!=0);
                if(c==times_appear)
                    System.out.println("da");
                else
                    System.out.println("nu");
            }
        }

