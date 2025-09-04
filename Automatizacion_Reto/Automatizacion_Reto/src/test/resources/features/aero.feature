Feature: Validar plan de acción en Aerocivil

  Scenario: El usuario accede al PDF de presentación a la ciudadanía
    Given que el usuario abre la página de Aerocivil
    When navega al menú de Transparencia
    And selecciona la opción Presupuesto
    And selecciona la opción Plan de acción
    And abre el documento PRESENTACIÓN A LA CIUDADANIA en modo lectura
    Then el PDF generado debe ser el correcto
