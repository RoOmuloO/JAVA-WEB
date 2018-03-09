<%-- 
    Document   : index
    Created on : 05/03/2018, 20:05:04
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="JS/JQuery/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="JS/meuScriptJQ.js" type="text/javascript"></script>
        <link href="novocss.css" rel="stylesheet" type="text/css"/>
        
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1 class="primeiro">Sistema</H1>
        
        <fieldset class="primeiro" id="fd">
            <div>
        <form id="form1"  action="validaLogin" method="GET">
        <label >Usuario:</label> <input type="text" id="usuario" name="usuario" value=""/> <br/>
        <div id="dvMsg"></div>
        <label >Senha:</label> <input type="password" id="senha" name="senha" value=""/><br/>
        <input type="submit" name="enviar" value="Valida"/>
            </div>
        </form>
        
        
        </fieldset>
    </body>
</html>
