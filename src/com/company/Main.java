package com.company;
import java.io.*;

        public class Main
        {
            public static void main(String[] args) throws IOException{
                int times_appear,nr,mod,c=0;
                times_appear=(int)System.in.read();
                nr=(int)System.in.read();
                do
                {
                    mod=nr%10;
                    if(mod==times_appear)
                        c++;
                    nr=nr/10;
                }while(nr!=0);

                if(c==times_appear)
                    System.out.println("da");
                else
                    System.out.println("nu");
            }
        }

