package com.whizlabs.spring.basics.bean.profile;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@DevAndProdProfile
@Profile("dev & prod")
public class DevAndProdBean {
}
