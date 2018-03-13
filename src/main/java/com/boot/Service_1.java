package com.boot;

import java.io.IOException;

public class Service_1 {

    public void get_Service_1(){
        System.out.println("In service one");
    }


    public void throwException_Service_1() throws IOException {
        throw new IOException("In io exception");
    }
}
