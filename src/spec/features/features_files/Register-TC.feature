Feature: Je rempli le formilaire
  En tant que utilisateur je souhaite remlir le formulaire afin de m enregistrer

  @module_register
  Scenario Outline: Remplire le formulaire register
    Given Je me connecte sur l application Mercury
    When Je clique sur le bouton REGISTER
    When Je saisie un data dans le champs firstname "<firstname>"
    When Je saisie un data dans le champs lastname "<lastname>"

    Examples: 
      | firstname | lastname  |
      | Olfa      | Hadhbeoui |
      | Amine     | Ferjani   |
