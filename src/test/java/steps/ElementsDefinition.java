package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.sl.In;
import pom.CheckBoxPage;

public class ElementsDefinition extends TestBase {

    @Given("ingreso a la pagina principal de DemoQA")
    public void demoQaPage() throws Throwable {
        homePage.ingresarDemoQa();
    }

    @When("el usuario selecciona la categoria Elements")
    public void enterElementsSection() throws Throwable {
        homePage.ingresarElementsSection();
    }

    @And("el usuario valida que se encuentra a la vista el titulo {string}")
    public void validaTextoALaVista(String arg0) throws Exception {
        homePage.visualizarTituloElements(arg0);
    }

    @Then("el usuario presiona opcion del Menu {string}")
    public void elUsuarioPresionaOpcionDelMenu(String arg0) throws InterruptedException {
        homePage.seleccionarOpcionMenuElements(arg0);
    }

    @And("el usuario ingresa {string} en text box full name")
    public void elUsuarioIngresaEnTextBoxFullName(String arg0) throws InterruptedException {
        homePage.ingresarFullNameTextBox(arg0);
    }

    @And("el usuario ingresa {string} en el text box Email")
    public void elUsuarioIngresaEmailTextBox(String arg0) throws InterruptedException {
        homePage.ingresarEmailTextBox(arg0);
    }

    @And("el usuario ingresa {string} en el text box Current Address")
    public void elUsuarioIngresaCurrentAddressTextBox(String arg0) throws InterruptedException {
        homePage.ingresarCurrentAddressTextBox(arg0);
    }

    @And("el usuario ingresa {string} en el text box Permanent Address")
    public void elUsuarioIngresaPermanentAddressTextBox(String arg0) throws InterruptedException {
        homePage.ingresarPermanentAddressTextBox(arg0);
    }

    @When("el usuario presiona el botón submit")
    public void elUsuarioPresionaBotonSubmit() throws InterruptedException {
        homePage.presionarBotonSubmit();
    }

    @Then("valida que el nombre {string} sea correctamente ingresado")
    public void validaQueElNombreEsteCorrectamenteIngresado(String arg0) {
        homePage.validarNombreIngresado(arg0);
    }

    @And("valida que el Email {string} sea correctamente ingresado")
    public void validaQueElCorreoEsteIngresadoCorrectamente(String arg0) {
        homePage.validarEmailIngresado(arg0);
    }

    @And("valida que el current address {string} sea correctamente ingresado")
    public void validaQueElCurrentAddressEsteIngresadoCorrectamente(String arg0) {
        homePage.validarCurrentAddressIngresado(arg0);
    }

    @And("valida que el permanent address {string} sea correctamente ingresado")
    public void validaQueElPermanentAddressEsteIngresadoCorrectamente(String arg0) {
        homePage.validarPermanentAddressIngresado(arg0);
    }


    //Checkbox Menu

    @And("el usuario hace click en checkbox Home")
    public void clickEnCheckBoxHome() throws InterruptedException {
        checkBoxPage.selectCheckBoxHome();
    }

    @And("valida que el {string} haya sido seleccionado")
    public void validaSelectAll(String arg0) {
        checkBoxPage.validaResultadoHomeEsValido(arg0);
    }

    @And("el usuario desmarca el checkbox Home")
    public void desmarcaCheckBoxHome() throws InterruptedException {
        checkBoxPage.desmarcaHomeCheckbox();
    }

    @Then("expande la lista de Checkbox")
    public void expandeListaCheckbox() throws InterruptedException {
        checkBoxPage.xpandListCheckbox();
    }

    @And("selecciona la opcion desktop")
    public void selectCheckboxDesktop() throws InterruptedException {
        checkBoxPage.selectCheckBoxDesktop();
    }

    @And("valida que el {string} haya sido seleccionado en desktop")
    public void validaSelectDesktop(String arg0) {
        checkBoxPage.validaResultadoDesktop(arg0);
    }

    @And("el usuario desmarca el checkbox Desktop")
    public void desmarcaCheckboxDesktop() throws InterruptedException {
        checkBoxPage.desmarcarCheckboxDesktop();
    }

    @Then("expande lista Checkbox Documents")
    public void xpandListDocuments() throws InterruptedException {
        checkBoxPage.xpanListCheckboxDocuments();
    }

    @And("selecciona React desde WorkSpace")
    public void seleccionarReact() throws InterruptedException {
        checkBoxPage.seleccionarReact();
    }

    @And("valida que el {string} haya sido seleccionado en documents")
    public void validaSelectDocuments(String arg0) throws InterruptedException {
        checkBoxPage.validaResultadoDocuments(arg0);
    }

    //RadioButton Menu

    @And("el usuario valida que se encuentra el titulo {string}")
    public void validaTituloRadioButton(String arg0) throws InterruptedException {
        radioButtonPage.visualizarTituloRadioButton(arg0);
    }

    @Then("el usuario marca el radioButton Yes")
    public void clickRadioButtonYes() throws InterruptedException {
        radioButtonPage.clickOnYesRadioButton();
    }

    @And("valida que el {string} haya sido marcado en RadioButton Menu")
    public void validaRadioButtonYes(String arg0) throws InterruptedException {
        radioButtonPage.validaResultYesRadioButton(arg0);
    }

    @Then("el usuario marca el radioButton Impressive")
    public void clickRadioButtonImpressive() throws InterruptedException {
        radioButtonPage.clickOnImpresiveRadioButton();
    }

    @And("valida que el radio {string} haya sido marcado en RadioButton Menu")
    public void validaRadioButtonImpresive(String arg0) throws InterruptedException {
        radioButtonPage.validaResultImpresiveRadioButton(arg0);
    }

    //Web Tables Button

    @And("el usuario presiona el boton Add para agregar un nuevo regjstro")
    public void presionaBotonAdd() throws InterruptedException{
        webTablesPage.addNewRecordButton();
    }

    @Then("el usuario agrega el Nombre {string} en el formulario")
    public void agregarFirstName(String arg0) throws InterruptedException{
        webTablesPage.ingresarFirstName(arg0);
    }

    @And("el usuario agrega el Apellido {string} en el formulario")
    public void agregarLastName(String arg0) throws InterruptedException{
        webTablesPage.ingresarLastName(arg0);
    }

    @And("el usuario agrega el Email {string} en el formulario")
    public void agregarEmail(String arg0) throws InterruptedException{
        webTablesPage.ingresarEmail(arg0);
    }

    @And("el usuario agrega la Edad {string} en el formulario")
    public void agregarAge(String arg0) throws InterruptedException{
        webTablesPage.ingresarAge(arg0);
    }

    @And("el usuario agrega el Salario {string} en el formulario")
    public void agregarSalary(String arg0) throws InterruptedException{
        webTablesPage.ingresarSalary(arg0);
    }

    @And("el usuario agrega el Departamento {string} en el formulario")
    public void agregarDepartment(String arg0) throws InterruptedException{
        webTablesPage.ingresarDepartment(arg0);
    }

    @And("el usuario da clic en el botón submit para enviar el formulario")
    public void clicButtonSubmit() throws InterruptedException{
        webTablesPage.clickSubmitButton();
    }

    @Then("el usuario busca el nuevo registro {string} en el buscador")
    public void searchBox(String arg0) throws InterruptedException{
        webTablesPage.searchBox(arg0);
    }

    @And("valida que el nombre {string} coincida con la busqueda")
    public void validaSearch(String arg0) throws InterruptedException{
        webTablesPage.validaBusquedaCoincide(arg0);
    }

    @And("da clic en boton editar")
    public void botonEdiciónRegistro() throws InterruptedException{
        webTablesPage.editarBusquedaButton();
    }

    @And("edita la {string} del registro")
    public void edicionRegistro(String arg0) throws InterruptedException{
        webTablesPage.editarRegistro(arg0);
    }

    //Button Menu

    @And("se hace doble clic en boton Double Click Me")
    public void clicDobleClic() throws InterruptedException{
        buttonPage.doubleClickButton();
    }

    @And("valida que el mensaje {string} sea valido")
    public void validaMensajeDobleClick(String arg0) throws InterruptedException{
        buttonPage.validaSiMensajeDobleClickEsValido(arg0);
    }

    @And("el usuario hace click derecho en el boton Right Click Me")
    public void clicDerechoBoton() throws InterruptedException{
        buttonPage.rightClickButton();
    }

    @And("valida que el mensaje de {string} sea valido")
    public void validaMensajeClickDerecho(String arg0) throws InterruptedException{
        buttonPage.validaSiMensajeRightClickEsValido(arg0);
    }

    @And("el usuario hace click en el boton Click Me")
    public void clickBoton() throws InterruptedException{
        buttonPage.clickMeButton();
    }

    @And("valida que el mensaje dinamico de {string} sea valido")
    public void validaDinamicoMensaje(String arg0) throws InterruptedException{
        buttonPage.validaSiMensajeDynamicClickEsValido(arg0);
    }

    //Links Menu

    @And("el usuario da click en boton Home para abrir nueva pestaña")
    public void clickLinkHome() throws InterruptedException{
        linksPage.newTabLink();
    }

    @And("se cierra la pestaña y se pulsa el link dinamico")
    public void clickLinkDinamico() throws InterruptedException{
        linksPage.newTabDynamicLink();
    }

    @Then("el usuario da click en link created")
    public void clickCreatedLinkApi() throws InterruptedException{
        linksPage.clickCreatedLink();
    }

    @And("se valida que el mensaje del link created sea {string}")
    public void validarMensajeLinkCreated(String arg0) throws  InterruptedException{
        linksPage.validaSiCreatedLinkSePulso(arg0);
    }

    //Upload Download page

    @And("el usuario busca el archivo a subir")
    public void subirArchivoChooseFile() throws InterruptedException{
        uploadDownloadPage.uploadFileFunction();
    }

    @And("luego pulsa el botón download para descargar el archivo")
    public void descargarArchivo() throws InterruptedException{
        uploadDownloadPage.downloadButton();
    }

    //Form Section
    @When("el usuario selecciona la categoria Forms")
    public void enterFormsSection() throws Throwable{
        homePage.ingresarFormsSection();
    }

    @Then("el usuario ingresa al menu Practice Form")
    public void ingresarMenuPracticeForm() throws  Throwable{
        homePage.seleccionarOpcionMenu();
    }

    @And("ingresa el First Name {string}")
    public void ingresaFirstNameForm(String arg0) throws InterruptedException{
        practiceFormPage.ingresarFirstName(arg0);
    }

    @And("ingresa el Last Name {string}")
    public void ingresaLastNameForm(String arg0) throws InterruptedException{
        practiceFormPage.ingresarLastName(arg0);
    }

    @And("ingresa el Email {string}")
    public void ingresaEmailForm(String arg0) throws InterruptedException{
        practiceFormPage.ingresarEmail(arg0);
    }

    @And("selecciona el genero")
    public void seleccionarGeneroForm() throws InterruptedException{
        practiceFormPage.checkRadioButtonGenero();
    }

    @And("ingresa el numero movil {string}")
    public void ingresarNumeroMovilForm(String arg0) throws InterruptedException{
        practiceFormPage.ingresarNumeroMovil(arg0);
    }

    @And("ingresa fecha {string}")
    public void ingresarFecha(String arg0) {
        practiceFormPage.addDateBirth(arg0);
    }

    @And("ingresa el Subjects {string}")
    public void ingresarSubjectsForm(String arg0) throws InterruptedException{
        practiceFormPage.ingresarSubjects(arg0);
    }

    @And("click en el Hobbies")
    public void clickHobbiesForm() throws InterruptedException{
        practiceFormPage.clickCheckHobbies();
    }

    @And("sube la imagen requerida")
    public void subirImagenForm() throws  InterruptedException{
        practiceFormPage.subirImagen();
    }

    @And("ingresa el current {string}")
    public void ingresarAddressForm(String arg0) throws InterruptedException{
        practiceFormPage.ingresarCurrentAddress(arg0);
    }

    @And("selecciona el State")
    public void seleccionarStateForm() throws InterruptedException{
        practiceFormPage.selectState();
    }

    @And("selecciona la city")
    public void seleccionaCityForm() throws InterruptedException{
        practiceFormPage.selectCity();
    }

    @And("click en boton Submit")
    public void clickSubmitButton() throws InterruptedException{
        practiceFormPage.clickOnSubmitButton();
    }

    @And("valida que {string} sea valido")
    public void validaResultado(String arg0) throws  InterruptedException{
        practiceFormPage.validaStudentName(arg0);
    }

    //Alerts, Frame & Windows
    @When("el usuario selecciona la categoria Alerts, Frame & Windows")
    public void ingresaSeccionAlertsFrameWindows() throws InterruptedException{
        homePage.ingresarAlertsFrameWindowsSection();
    }






}
