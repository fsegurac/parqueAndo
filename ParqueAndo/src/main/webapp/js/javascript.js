$(document).ready(function () {

    $("#form").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });


});

function autenticarUsuario() {

    let email_usr = $("#email").val();
    let contrasena_usr = $("#contrasena").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            email_usr: email_usr,
            contrasena_usr: contrasena_usr
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult !== false) {
                $("#login-error").addClass("d-none");
                let email_usr= parsedResult['email_usr'];
                document.location.href = "home.html?username=" + email_usr;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
function registrarUsuario() {
    
    
    let nombre = $("#nombre").val();
    let apellido = $("#apellido").val();
    let email_usr = $("#email").val();
    let contrasena_usr = $("#contrasena").val();
    let contrasenaConfirmacion = $("#input-contrasena-repeat").val();
    

   
    

    if (contrasena_usr === contrasenaConfirmacion) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegister",
            data: $.param({
                
                
                nombre: nombre,
                apellido: apellido,
                email_usr: email_usr,
                contrasena_usr: contrasena_usr

                
               
                
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult !== false) {
                    $("#register-error").addClass("d-none");
                    let email_usr = parsedResult['email_usr'];
                    document.location.href = "home.html?username=" + email_usr;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del usuario");
                }
            }
        });
    } else {
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Las contraseñas no coinciden");
    }
}

