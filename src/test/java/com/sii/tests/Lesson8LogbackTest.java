package com.sii.tests;

import TestBase.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;



public class Lesson8LogbackTest extends TestBase {
    private Logger logger = LoggerFactory.getLogger("Lesson8LogbackTest.class");



    @Test
    @DisplayName("Title ")
    @Tag("Title")
    public void Sii_page_title() {
        logger.info(">>>> Start test >>>>>");
        String actualTitle = driver.getTitle();

        logger.info("Actual title: {}", actualTitle);
        logger.info("Expected title: {}", System.getProperty("eTitle"));
        assertThat(actualTitle, equalTo(System.getProperty("eTitle")));

        }
    }



