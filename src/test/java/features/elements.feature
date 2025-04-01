Feature: Ingresar a web DemoQA

  @TextBox
  Scenario Outline: TextBox
    Given ingreso a la pagina principal de DemoQA
    When el usuario selecciona la categoria Elements
    And el usuario valida que se encuentra a la vista el titulo "Please select an item from left to start practice."
    Then el usuario presiona opcion del Menu "<opcionMenu>"
    And el usuario ingresa "<fullName>" en text box full name
    And el usuario ingresa "<email>" en el text box Email
    And el usuario ingresa "<currentAddress>" en el text box Current Address
    And el usuario ingresa "<permanentAddress>" en el text box Permanent Address
    When el usuario presiona el botón submit
    Then valida que el nombre "<fullName>" sea correctamente ingresado
    And valida que el Email "<email>" sea correctamente ingresado
    And valida que el current address "<currentAddress>" sea correctamente ingresado
    And valida que el permanent address "<permanentAddress>" sea correctamente ingresado



    Examples:
  | opcionMenu | fullName | email | currentAddress | permanentAddress |
  | Text Box   | Prueba Selenium | test@mailinator.com | Kilimanjaro 809 | Kilimanjaro 809 |

  @Checkbox
  Scenario Outline: Checkbox
    Given ingreso a la pagina principal de DemoQA
    When el usuario selecciona la categoria Elements
    And el usuario valida que se encuentra a la vista el titulo "Please select an item from left to start practice."
    Then el usuario presiona opcion del Menu "<opcionMenu>"
    And el usuario hace click en checkbox Home
    And valida que el "<selectHomeAll>" haya sido seleccionado
    And el usuario desmarca el checkbox Home
    Then expande la lista de Checkbox
    And selecciona la opcion desktop
    And valida que el "<selectDesktop>" haya sido seleccionado en desktop
    And el usuario desmarca el checkbox Desktop
    Then expande lista Checkbox Documents
    And selecciona React desde WorkSpace
    And valida que el "<selectDocuments>" haya sido seleccionado en documents

    Examples:
      | opcionMenu | selectHomeAll | selectDesktop | selectDocuments |
      | Check Box  | You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile | You have selected : desktop notes commands | You have selected : react |

  @RadioButton
    Scenario Outline: Radio Button
    Given ingreso a la pagina principal de DemoQA
    When el usuario selecciona la categoria Elements
    And el usuario valida que se encuentra a la vista el titulo "Please select an item from left to start practice."
    Then el usuario presiona opcion del Menu "<opcionMenu>"
    And el usuario valida que se encuentra el titulo "Do you like the site?"
    Then el usuario marca el radioButton Yes
    And valida que el "<radioButtonYes>" haya sido marcado en RadioButton Menu
    Then el usuario marca el radioButton Impressive
    And valida que el radio "<radioButtonImpresive>" haya sido marcado en RadioButton Menu

    Examples:
      | opcionMenu | radioButtonYes | radioButtonImpresive |
      | Radio Button | You have selected Yes | You have selected Impressive |

    @WebTables
    Scenario Outline: Web Tables
      Given ingreso a la pagina principal de DemoQA
      When el usuario selecciona la categoria Elements
      And el usuario valida que se encuentra a la vista el titulo "Please select an item from left to start practice."
      Then el usuario presiona opcion del Menu "<opcionMenu>"
      And el usuario presiona el boton Add para agregar un nuevo regjstro
      Then el usuario agrega el Nombre "<firstName>" en el formulario
      And el usuario agrega el Apellido "<lastName>" en el formulario
      And el usuario agrega el Email "<email>" en el formulario
      And el usuario agrega la Edad "<age>" en el formulario
      And el usuario agrega el Salario "<salary>" en el formulario
      And el usuario agrega el Departamento "<department>" en el formulario
      And el usuario da clic en el botón submit para enviar el formulario
      Then el usuario busca el nuevo registro "<search>" en el buscador
      And valida que el nombre "<nombreSearch>" coincida con la busqueda
      And da clic en boton editar
      And edita la "<edad>" del registro



      Examples:
        | opcionMenu | firstName | lastName | email | age | salary | department | search | nombreSearch | edad |
        | Web Tables | Diego     | Galaz    | diego@mailinator.com | 28 | 5400 | Informatica | Die | Diego | 32 |

      @Buttons
      Scenario Outline: Buttons
        Given ingreso a la pagina principal de DemoQA
        When el usuario selecciona la categoria Elements
        And el usuario valida que se encuentra a la vista el titulo "Please select an item from left to start practice."
        Then el usuario presiona opcion del Menu "<opcionMenu>"
        And se hace doble clic en boton Double Click Me
        And valida que el mensaje "<mDobleClick>" sea valido
        And el usuario hace click derecho en el boton Right Click Me
        And valida que el mensaje de "<mRightClick>" sea valido
        And el usuario hace click en el boton Click Me
        And valida que el mensaje dinamico de "<mDynamicClick>" sea valido

        Examples:
        | opcionMenu | mDobleClick | mRightClick | mDynamicClick |
        | Buttons | You have done a double click | You have done a right click | You have done a dynamic click |

        @Links
        Scenario Outline: Links
          Given ingreso a la pagina principal de DemoQA
          When el usuario selecciona la categoria Elements
          And el usuario valida que se encuentra a la vista el titulo "Please select an item from left to start practice."
          Then el usuario presiona opcion del Menu "<opcionMenu>"
          And el usuario da click en boton Home para abrir nueva pestaña
          And se cierra la pestaña y se pulsa el link dinamico
          Then el usuario da click en link created
          And se valida que el mensaje del link created sea "<mLinkCreated>"

          Examples:
          | opcionMenu | mLinkCreated |
          | Links      | Link has responded with staus 201 and status text Created |

          @UploadAndDownload
          Scenario Outline: UploadAndDownload
            Given ingreso a la pagina principal de DemoQA
            When el usuario selecciona la categoria Elements
            And el usuario valida que se encuentra a la vista el titulo "Please select an item from left to start practice."
            Then el usuario presiona opcion del Menu "<opcionMenu>"
            And el usuario busca el archivo a subir
            And luego pulsa el botón download para descargar el archivo

            Examples:
            | opcionMenu |
            | UploadAndDownload |

            @Forms
            Scenario Outline: Forms
              Given ingreso a la pagina principal de DemoQA
              When el usuario selecciona la categoria Forms
              And el usuario valida que se encuentra a la vista el titulo "Please select an item from left to start practice."
              Then el usuario ingresa al menu Practice Form
              And ingresa el First Name "<FirstName>"
              And ingresa el Last Name "<LastName>"
              And ingresa el Email "<Email>"
              And selecciona el genero
              And ingresa el numero movil "<NumeroMovil>"
              And ingresa fecha "<fecha>"
              And ingresa el Subjects "<Subjects>"
              And click en el Hobbies
              And sube la imagen requerida
              And ingresa el current "<Address>"
              And selecciona el State
              And selecciona la city
              And click en boton Submit
              And valida que "<StudentName>" sea valido
              Examples:
                | FirstName | LastName | Email | NumeroMovil | fecha |  Subjects | Address | StudentName |
                | Diego     | Galaz    | diego@yopmail.com | 1234567890 | 15 Apr 2025 |   English |  Rigoberto Jara 233 | Diego Galaz |

              @AlertsFrameWindows
              Scenario: Alerts, Frame & Windows
                Given ingreso a la pagina principal de DemoQA
                When el usuario selecciona la categoria Alerts, Frame & Windows
                And el usuario valida que se encuentra a la vista el titulo "Please select an item from left to start practice."