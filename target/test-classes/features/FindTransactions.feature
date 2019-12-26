@find_transaction
  Feature: Find Transactions in Account Activity

    Scenario: Search date range
      Given the user accesses the Find Transactions tab
      When the user enters date range from "2012-09-01" to "2012-09-06"
      And click search
      Then results table should only show transactions date between "2012-09-01" to "2012-09-06"
      And the result should be sorted by most recent date
      When the user enters date range from "2012-09-02" to "2012-09-06"
      And click search
      Then results table should only show transactions date between "2012-09-02" to "2012-09-06"
      And the result table should only not contain transaction dated "2012-09-01"

      Scenario: Search description
        Given the user accesses the Find Transactions tab
        When the user enters description "ONLINE"
        And click search
        Then results table should only show descriptions containing "ONLINE"
        When the user enters description "OFFICE"
        And click search
        Then results table should only show description containing "OFFICE"
        But results table should not show descriptions containing "OFFICE"

        Scenario: Search description case insensitive
          Given the user accesses the Find Transactions tab
          When the user enters description "ONLINE"
          And click search
          Then results table should only show description containing "ONLINE"
          When the user enters description "online"
          And click search
          Then results table should only show description containing "ONLINE"

          Scenario: Type
            Given the user accesses the Find Transactions tab
            And click search
            Then results table should show at least one result under Deposit
            Then results table should show at least one result under Withdrawal
            When user selects type "Deposit"
            Then results table should show at least one result under Deposit
            But results table should show no result under Withdrawal
            When user selects type "Withdrawal"
            Then results should show at least one result under Withdrawal
            But results table should show no result under Deposit
