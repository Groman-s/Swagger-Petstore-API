/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.7
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.goyanov.yandex.swagger.openapi.testing.api;

import java.time.OffsetDateTime;
import com.goyanov.yandex.swagger.openapi.testing.model.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClientException;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void createUserTest() {
        User body = null;

        api.createUser(body);

        // TODO: test validations
    }
    
    /**
     * Creates list of users with given input array
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void createUsersWithArrayInputTest() {
        List<User> body = null;

        api.createUsersWithArrayInput(body);

        // TODO: test validations
    }
    
    /**
     * Creates list of users with given input array
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void createUsersWithListInputTest() {
        List<User> body = null;

        api.createUsersWithListInput(body);

        // TODO: test validations
    }
    
    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void deleteUserTest() {
        String username = null;

        api.deleteUser(username);

        // TODO: test validations
    }
    
    /**
     * Get user by user name
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void getUserByNameTest() {
        String username = null;

        User response = api.getUserByName(username);

        // TODO: test validations
    }
    
    /**
     * Logs user into the system
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void loginUserTest() {
        String username = null;
        String password = null;

        String response = api.loginUser(username, password);

        // TODO: test validations
    }
    
    /**
     * Logs out current logged in user session
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void logoutUserTest() {

        api.logoutUser();

        // TODO: test validations
    }
    
    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void updateUserTest() {
        String username = null;
        User body = null;

        api.updateUser(username, body);

        // TODO: test validations
    }
    
}