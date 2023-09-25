Tutorial

-> baixe as duas pastas em sua máquina
-> abra a pasta HelloWorld como projeto no Intelij
-> vá em File > ProjectStruture > Libraries > "+" > Java, clique na pasta javafx-sdk-21\lib e em Ok
-> vá em settings > Appearance&Behavior > Path Variables > "+" , adicione a variável a seguir:
>>
Name:  PATH_TO_FX
Value: --module-path "{caminho-da-pasta->javafx-sdk-21\lib}" --add-modules javafx.controls,javafx.fxml
<< 
exemplo: "C:\Users\Administrator\Downloads\openjfx-21_windows-x64_bin-sdk\javafx-sdk-21\lib"
e clique em ok

-> Vá em Run> Edit Configurations> Clique em Modify options, cliquem em "Add VM Options"
na parte de VM Options, clique na página ao lado de <-->, selecione "PATH_TO_FX" e clique em "insert"

-> tente rodar o app, será mostrado a tela hello world com um botão