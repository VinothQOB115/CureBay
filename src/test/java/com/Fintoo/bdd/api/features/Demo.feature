@riskcovry @GET_pendingTransactions
Feature: validation of  pending Transactions functionality

  @GET_pendingTransactions_postive
  Scenario: TC001 Verify the GET Request for pending transactions with defaultly selected Query parameters
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |
    And the fields in response should match with expected values
      | JPath            | Value |
      | $.proposal       |    20 |
      | $.total_elements |   113 |
      | $.total_pages    |     8 |
      | $.current_page   | "1"   |
      | $.per_page       | "15"  |

  @GET_pendingTransactions_postive
  Scenario: TC002 Verify the GET Request for pending transactions with all given Query parameters
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | status         | Quote-Input     |
      | category       | RETAIL_HEALTH   |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |
    And the fields in response should match with expected values
      | JPath            | Value |
      | $.proposal       |     0 |
      | $.total_elements |     0 |
      | $.total_pages    |     0 |
      | $.current_page   | "1"   |
      | $.per_page       | "15"  |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidqueryParams
  Scenario Outline: TC003 Verify the GET Request for pending transactions with defaultly selected Query parameters having invalid 'per_page' query parameter value
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       | <invalidValue>  |
      | page           |               1 |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

    Examples: 
      | invalidValue    |
      | kahifjgbfskfosg |
      | 46kkjlhsLKN@9   |
      |             1.7 |
      |              -1 |
      |                 |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidqueryParams
  Scenario Outline: TC004 Verify the GET Request for pending transactions and with having invalid 'per_page' query parameter value among all Query parameters
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       | <invalidValue>  |
      | page           |               1 |
      | status         | Quote-Input     |
      | category       | RETAIL_HEALTH   |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

    Examples: 
      | invalidValue    |
      | kahifjgbfskfosg |
      | 46kkjlhsLKN@9   |
      |             1.7 |
      |              -1 |
      |                 |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidqueryParams
  Scenario Outline: TC005 Verify the GET Request for pending transactions with defaultly selected Query parameters having invalid 'page' query parameter value
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           | <invalidValue>  |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

    Examples: 
      | invalidValue    |
      | kahifjgbfskfosg |
      | 46kkjlhsLKN@9   |
      |             1.7 |
      |              -1 |
      |                 |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidqueryParams
  Scenario Outline: TC006 Verify the GET Request for pending transactions and with having invalid 'page' query parameter value among all Query parameters
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |               1 |
      | page           | <invalidValue>  |
      | status         | Quote-Input     |
      | category       | RETAIL_HEALTH   |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

    Examples: 
      | invalidValue    |
      | kahifjgbfskfosg |
      | 46kkjlhsLKN@9   |
      |             1.7 |
      |              -1 |
      |                 |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidqueryParams
  Scenario Outline: TC007 Verify the GET Request for pending transactions with defaultly selected Query parameters having invalid 'source' query parameter value
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | source         | <invalidValue>  |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

    Examples: 
      | invalidValue    |
      | kahifjgbfskfosg |
      | 46kkjlhsLKN@9   |
      |             1.7 |
      |              -1 |
      |                 |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidqueryParams
  Scenario Outline: TC008 Verify the GET Request for pending transactions with having invalid 'source' query parameter value among all Query parameters
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |               1 |
      | page           |              15 |
      | status         | Quote-Input     |
      | category       | RETAIL_HEALTH   |
      | source         | <invalidValue>  |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

    Examples: 
      | invalidValue    |
      | kahifjgbfskfosg |
      | 46kkjlhsLKN@9   |
      |             1.7 |
      |              -1 |
      |                 |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidqueryParams
  Scenario Outline: TC009 Verify the GET Request for pending transactions with having invalid 'status' query parameter value among all Query parameters
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |               1 |
      | page           |              15 |
      | status         | <invalidValue>  |
      | category       | RETAIL_HEALTH   |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidqueryParams
  Scenario Outline: TC010 Verify the GET Request for pending transactions with having invalid 'category' query parameter value among all Query parameters
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |               1 |
      | page           |              15 |
      | status         | Quote-Input     |
      | category       | <invalidValue>  |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

    Examples: 
      | invalidValue    |
      | kahifjgbfskfosg |
      | 46kkjlhsLKN@9   |
      |             1.7 |
      |              -1 |
      |                 |

  @GET_pendingTransactions_negative @GET_pendingTransactions_withoutheaders
  Scenario: TC011 Verify the GET Request for pending transactions without headers
    Given I set up request specification
      | HeaderName | HeaderValue |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | status         | Quote-Input     |
      | category       | RETAIL_HEALTH   |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                     |
      | Server                       | nginx/1.18.0 (Ubuntu)           |
      | Content-Type                 | application/json; charset=utf-8 |
      | Transfer-Encoding            | chunked                         |
      | Connection                   | keep-alive                      |
      | Access-Control-Allow-Origin  |                                 |
      | Access-Control-Allow-Methods |                                 |
      | Access-Control-Max-Age       |                                 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidHeaderValues
  Scenario: TC012 Verify the GET Request for pending transactions with Invalid Header values
    Given I set up request specification
      | HeaderName     | HeaderValue          |
      | staff-phone-no | 58dedf930987         |
      | staff-token    | invalidStaff-token25 |
      | origin         | not a product        |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | status         | Quote-Input     |
      | category       | RETAIL_HEALTH   |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

  @GET_pendingTransactions_negative @GET_pendingTransactions_withoutAuthentication
  Scenario: TC013 Verify the GET Request for pending transactions without Authentication
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | source         | online          |
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And the fields in response should match with expected values
      | JPath   | Value            |
      | $.error | "Not Authorized" |

  @GET_pendingTransactions_negative @GET_pendingTransactions_withInvalidAuthentication
  Scenario: TC014 Verify the GET Request for pending transactions with Invalid Authentication
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue             |
      | _riskcovry_backend_session | InvalidAuthenticationCS |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | source         | online          |
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And the fields in response should match with expected values
      | JPath   | Value            |
      | $.error | "Not Authorized" |

  @GET_pendingTransactions_negative @GET_pendingTransactions_withpassingonebyoneheader
  Scenario Outline: TC015 Verify the GET Request for pending transactions with passing onebyone header
    Given I set up request specification
      | HeaderName   | HeaderValue   |
      | <headerName> | <headerValue> |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | status         | Quote-Input     |
      | category       | RETAIL_HEALTH   |
      | source         | online          |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName        | HeaderValue                     |
      | Server            | nginx/1.18.0 (Ubuntu)           |
      | Content-Type      | application/json; charset=utf-8 |
      | Transfer-Encoding | chunked                         |
      | Connection        | keep-alive                      |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

    Examples: 
      | headerName     | headerValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |

  @GET_pendingTransactions_negative @GET_pendingTransactions_withpassingonebyonequeryParam
  Scenario Outline: TC016 Verify the GET Request for pending transactions with passing onebyone query parameter
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions" endpoint with query parameters
      | QueryParamName   | QueryParamValue   |
      | <queryParamName> | <queryParamValue> |
    Then I should see the response code as "200"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And verifies the field is present in the response
      | JPath              |
      | $.leads            |
      | $.paid             |
      | $.proposal         |
      | $.payment_failed   |
      | $.total_elements   |
      | $.total_pages      |
      | $.current_page     |
      | $.per_page         |
      | $.payment_statuses |

    Examples: 
      | queryParamName | queryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | status         | Quote-Input     |
      | category       | RETAIL_HEALTH   |
      | source         | online          |

  @GET_pendingTransactions_negative @GET_pendingTransactions_withoutResoureURI
  Scenario: TC017 Verify the GET Request for pending transactions without resoure uri
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions without resoure uri" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | source         | online          |
    Then I should see the response code as "401"
    And verify response time is less than "3000" milliseconds
    And contentType as "application/json; charset=utf-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | application/json; charset=utf-8        |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
    And the fields in response should match with expected values
      | JPath     | Value                        |
      | $.message | "Quotation search not found" |

  @GET_pendingTransactions_negative @GET_pendingTransactions_invalidResoureURI
  Scenario: TC018 Verify the GET Request for pending transactions with invalid resoure uri
    Given I set up request specification
      | HeaderName     | HeaderValue                                                                                                                                                      |
      | staff-phone-no |                                                                                                                                                       1234567890 |
      | staff-token    | eyJhbGciOiJIUzI1NiJ9.eyJpZCI6NTkwLCJrZXkiOiIxMjM0NTY3ODkwIiwiZXhwaXJ5X3RpbWUiOiIyMDIyLTEyLTEyIDE0OjQ0OjMyICswNTMwIn0.upBWOOuBu97l-_U0mw7L60_VBJ6l3CaG3EW7dCPGLNg |
      | origin         | product                                                                                                                                                          |
    And I set cookies
      | cookieName                 | cookieValue                                                                                                                                                                                                                                                                                                        |
      | _riskcovry_backend_session | RWVJTkhmY0trTjk5KzR0dU0zdVRkL3FPSVh3RWxwN1dhcENSSEZlOTRRb0lLeTVKclQ1S0QzbEEreGFXTVpwY1ZCQ0VEUGRsQUJMMTlzWDFLWVF0WjluZTJlWEUrMWtjZTMzMjlGR25NcXVhRWxEa1JlbWd2Q3NsMm82S01KMDRaZzFlWGcvNEhkdVpBc1ZmLzY4Z0xMMjlMSTF5MjFTWldFYmtDV29aVWhNPS0tcjZYbXBuL3JGbWZHRFFxSUFZQUlpZz09--2076772548292df1fb5a1d7d99e534f4e2b81265 |
    When I send the GET request to "pending transactions with invalid resoure uri" endpoint with query parameters
      | QueryParamName | QueryParamValue |
      | per_page       |              15 |
      | page           |               1 |
      | source         | online          |
    Then I should see the response code as "404"
    And verify response time is less than "3000" milliseconds
    And contentType as "text/html; charset=UTF-8"
    And verify response headers
      | HeaderName                   | HeaderValue                            |
      | Server                       | nginx/1.18.0 (Ubuntu)                  |
      | Content-Type                 | text/html; charset=UTF-8               |
      | Transfer-Encoding            | chunked                                |
      | Connection                   | keep-alive                             |
      | Access-Control-Allow-Origin  | *                                      |
      | Access-Control-Allow-Methods | GET, PATCH, POST, PUT, OPTIONS, DELETE |
      | Access-Control-Max-Age       |                                1728000 |
