package com.pk.presentation;

import com.pk.delegate.DBConnection;
import com.pk.business.User;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InfoUser {

    private static Logger logger = LogManager.getLogger(InfoUser.class);
    public static void main(String[] args){

    	//String str = AppConstant.URL;
        User user = new User("Pankaj", "Kumar", "Software Developer", 32);
        logger.info(user.toString());
        try {
            DBConnection.instance().insertWithStatement(user);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

    }
}