package com.qaschool.validators;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PostValidatorTest {

    private PostValidator validator;

    @BeforeClass
    public void setUp() {
        validator = new PostValidator();
    }

    @DataProvider(name = "postDataProvider")
    public Object[][] postDataProvider() {
        String longPost = "a".repeat(300); // post de peste 250 caractere

        return new Object[][]{
                {null, "ERROR_EMPTY"},
                {"", "ERROR_EMPTY"},
                {"Acesta este un post valid", "POST_VALID"},
                {"Acest post vorbește despre politică.", "ERROR_FORBIDDEN"},
                {longPost, "ERROR_TOO_LONG"}
        };
    }

    @Test(dataProvider = "postDataProvider")
    public void testPostValidationScenarios(String postBody, String expectedStatus) {
        String actualStatus = validator.getPostStatus(postBody);
        Assert.assertEquals(actualStatus, expectedStatus);
    }
}
