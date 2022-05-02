package com.achu.reddit_clone.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringitProperties {

    /***
     * this is out welcome message
     */
    private String welcomeMsgs = "Hello, World!";

    public String getWelcomeMsgs() {
        return welcomeMsgs;
    }

    public void setWelcomeMsgs(String welcomeMsg) {
        this.welcomeMsgs = welcomeMsg;
    }




}
