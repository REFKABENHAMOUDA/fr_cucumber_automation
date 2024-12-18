Feature: Je verifie l enregistrement d un nouvel utilisateur
  En tant qu utilisateur je souhaite creer un compte dans l application Mercury

  @register
  Scenario: Je verifie l enregistrement d un nouvel utilisateur
    Given Je me connecte à l application Mercury
    When Je clique sur le bouton REGISTER 
    Then Je me redirige vers le fomulaire d enregistrement " https://demo.guru99.com/test/newtours/images/mast_register.gif "
    And Je saisis le First Name "mondher"
    And Je saisis le Last Name "jlassi"
    And Je saisis le Phone "98458623"
    And Je saisis l email "mondherJlassi@gmail;com"
    And Je saisis l adresse "La goulette"
    And Je saisis City "tunis"
    And Je saisis State/Province "Tunis"
    And Je saisis Postal Code "1001"
    And Je selectionne Country "TUNISIA"
    And Je saisis User Name "jalabert"
    And Je saisis Password "jalabert123"
    And Je confirme Password "jalabert123"
    And Je clique sur le bouton Envoyer
    Then Je me redirige vers la page de confirmation "Note: Your user name is"