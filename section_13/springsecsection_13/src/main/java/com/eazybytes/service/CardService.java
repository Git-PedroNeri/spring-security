package com.eazybytes.service;


import com.eazybytes.client.feign.KcServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    private KcServiceClient serviceClient;


}
