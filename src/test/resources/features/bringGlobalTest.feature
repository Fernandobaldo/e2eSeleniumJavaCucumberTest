# Created by fernandobaldo at 27/03/21
Feature: Select the fly ticket

  Scenario: Select the origin and destination country
    Given The user is on board page
    And Select the departure and destination city
      | departureCity | destinationCity |
      | Lisbon        | Paris Beauvais  |

    And Select the depart and return date
      | monthYear | day |
      | June 2021 | 10  |
      | July 2021 | 20  |

    And Select the passengers
      | adult    | 2 |
      | children | 1 |

    When I search the fly

    And I define 01Jul new depart and 25Jul return date

    Then I fill the passengers detail

      | title | name  | lasName     |
      | Ms    | Sónia | Pereira     |
      | Mr    | Diogo | Bettencourt |
      |       | Inês  | Marcal      |

    And Select the same seats depart and return

    And Select the bags
      | bagType   |
      | small bag |

    And I go to payment



