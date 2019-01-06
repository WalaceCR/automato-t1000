$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/pesquisa-no-google.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 2,
  "name": "Pesquisa na tela inicial do Google",
  "description": "",
  "id": "pesquisa-na-tela-inicial-do-google",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 4,
  "name": "Pesquisar Luana no Google",
  "description": "",
  "id": "pesquisa-na-tela-inicial-do-google;pesquisar-luana-no-google",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 5,
  "name": "que acessei o Google",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "que estou na tela de pesquisa",
  "keyword": "E "
});
formatter.step({
  "line": 7,
  "name": "digito Luana na pesquisa",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "clico no botão Pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "são exibidos os resultados da busca",
  "keyword": "Então "
});
formatter.match({
  "location": "stepDefintions.que_acessei_o_Google()"
});
formatter.result({
  "duration": 9723488651,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintions.que_estou_na_tela_de_pesquisa()"
});
formatter.result({
  "duration": 124574320,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintions.digito_Luana_na_pesquisa()"
});
formatter.result({
  "duration": 236330468,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintions.clico_no_botão_Pesquisar()"
});
formatter.result({
  "duration": 189134222,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not interactable\n  (Session info: chrome\u003d70.0.3538.77)\n  (Driver info: chromedriver\u003d72.0.3626.7 (efcef9a3ecda02b2132af215116a03852d08b9cb),platform\u003dLinux 4.15.0-43-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027ulamog-Z450LA\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-43-generic\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 72.0.3626.7 (efcef9a3ecda02..., userDataDir: /tmp/.com.google.Chrome.WI3zDY}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:46859}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 70.0.3538.77, webStorageEnabled: true}\nSession ID: 9ad5c527fcaafe17fc03b34a832d4be3\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat com.wcunha.robo.pageObjects.pageResearchGoogle.clicarEmPesquisar(pageResearchGoogle.java:31)\n\tat com.wcunha.robo.steps.stepDefintions.clico_no_botão_Pesquisar(stepDefintions.java:32)\n\tat ✽.E clico no botão Pesquisar(Features/pesquisa-no-google.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefintions.são_exibidos_os_resultados_da_busca()"
});
formatter.result({
  "status": "skipped"
});
});