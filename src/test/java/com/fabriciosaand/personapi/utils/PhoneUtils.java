package com.fabriciosaand.personapi.utils;

import com.fabriciosaand.personapi.dto.request.PhoneDTO;
import com.fabriciosaand.personapi.entity.Phone;
import com.fabriciosaand.personapi.enums.PhoneType;

public class PhoneUtils {
    private static final String PHONE_NUMBER = "7199999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}