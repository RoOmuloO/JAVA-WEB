$(document).ready(function(){
//    alert("oi");

//$("#nome").on("click",function(){
//     alert("oi");
//});

//$("#btnajax").on("click",function(){
//   //alert("ok"); 
//   $("#dvAjax").load("validaAjax?nome=" + $("#nome").val());
//});





$("#form1").on("submit", function(){
   if( $("#usuario").val() == ""){
       $("#dvMsg").html("Preencher o Campo Usuario");
       return false
   } 
   if($("#senha").val() == "") {
       $("#dvMsg").html("Preencher o Campo Senha");
   }
   return true;
});




});

