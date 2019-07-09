$(document).ready(function(){
$("#btn1").on("click",function(){
    var user=$("#username").val();
    var pass=$("#password").val();
    if(user=="" || pass=="")
    {
        alert("invalid");
    }

    });
});
