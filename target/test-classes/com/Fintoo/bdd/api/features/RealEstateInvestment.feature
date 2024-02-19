@RealEstateInvestment @Investment
Feature: validation of Real Estate Investment Functionality

  @RealEstateInvestment_Positive
  Scenario: TC_001_Post request for Real Estate Investment positive scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I post the request with "RealEstateInvestment" payload
    And I post the request to endpoint
    Then I should see the response code as "404"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    #And verifies the field is present in the response
      #| JPath        |
      #| $.error_code |
      #| $.message    |
      #| $.data       |

  @withoutGatewayAuthToken_Negative
  Scenario: TC_002_Post request for Real Estate Investment  without Gateway AuthToken Negative
    Given I set up request specification
      | HeaderName   | HeaderValue              |
      | Content-Type | application/json         |
      | gatewayname  | https://stg.minty.co.in/ |
    When I post the request with "RealEstateInvestment" payload
    And I post the request to endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                              |
      | $.error_code  | "102"                              |
      | $.message     | Invalid Token                      |
      | $.current_url | /restapi/report/debtInvestmentApi/ |

  @withoutGatewayName_Negative
  Scenario: TC_003_Post request for Real Estate Investment  without Gateway Name Negative
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
    When I post the request with "RealEstateInvestment" payload
    And I post the request to endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                              |
      | $.error_code  | "102"                              |
      | $.message     | Invalid Token                      |
      | $.current_url | /restapi/report/debtInvestmentApi/ |

  @withoutGatewayNameAndAuthToken_Negative
  Scenario: TC_004_Post request for Real Estate Investment  without Gateway Name and AuthToken Negative
    Given I set up request specification
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    When I post the request with "RealEstateInvestment" payload
    And I post the request to endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                              |
      | $.error_code  | "102"                              |
      | $.message     | Invalid Token                      |
      | $.current_url | /restapi/report/debtInvestmentApi/ |

  @wrongGatewayAuthName_Negative
  Scenario: TC_005_Post request for Real Estate Investment  wrong Gateway name Negative
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayname      | https://stg.minty                                                                                                                                                |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
    When I post the request with "RealEstateInvestment" payload
    And I post the request to endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                              |
      | $.error_code  | "102"                              |
      | $.message     | Invalid Token                      |
      | $.current_url | /restapi/report/debtInvestmentApi/ |

  @wrongGatewayAuthToken_Negative
  Scenario: TC_006_Post request for Real Estate Investment  wrong Gateway AuthToken Negative
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                      |
      | Content-Type     | application/json                                                                                                                 |
      | gatewayname      | https://stg.minty                                                                                                                |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0ImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
    When I post the request with "RealEstateInvestment" payload
    And I post the request to endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                              |
      | $.error_code  | "102"                              |
      | $.message     | Invalid Token                      |
      | $.current_url | /restapi/report/debtInvestmentApi/ |