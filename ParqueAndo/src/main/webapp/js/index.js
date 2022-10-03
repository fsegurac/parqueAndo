$(document).ready(function () {

    $("#form").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });
    
    $("#form-parq").submit(function (event) {

        event.preventDefault();
        autenticarParqueadero();
    });
    
    $("#form-register-parq").submit(function (event) {

        event.preventDefault();
        registrarParqueadero();
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
                document.location.href = "pagina_usuario.html?username=" + email_usr;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
function registrarUsuario() {
    
    let id= $("#id").val();
    let nombre = $("#nombre").val();
    let apellido = $("#apellido").val();
    let email_usr = $("#email").val();
    let cel_usr = $("#cel_usr").val();
    let contrasena_usr = $("#contrasena").val();
    let contrasenaConfirmacion = $("#input-contrasena-repeat").val();
    

   
    

    if (contrasena_usr == contrasenaConfirmacion) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegister",
            data: $.param({
                id: id,
                nombre: nombre,
                apellido: apellido,
                email_usr: email_usr,
                cel_usr: cel_usr,
                contrasena_usr: contrasena_usr              
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult !== false) {
                    $("#register-error").addClass("d-none");
                    let email_usr = parsedResult['email_usr'];
                    document.location.href = "pagina_usuario.html?username=" + email_usr;
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
function autenticarParqueadero() {

    let email_Parq = $("#email").val();
    let contrasena_Parq = $("#contrasena").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletParqueaderoLogin",
        data: $.param({
            email_Parq: email_Parq,
            contrasena_Parq: contrasena_Parq
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult !== false) {
                $("#login-error").addClass("d-none");
                let email_Parq= parsedResult['email_parq'];
                document.location.href = "home.html?username=" + email_Parq;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
function registrarParqueadero() {
    
    let id_NIT= $("#id_NIT").val();
    let razon_Social = $("#razon_social").val();
    let direccion_Parq= $("#direccion").val();
    let cel_Parq = $("#cel").val();
    let email_Parq = $("#email").val();
    let contrasena_Parq = $("#contrasena").val();
    let contrasenaConfirmacion = $("#input-contrasena-repeat").val(); 

    if (contrasena_Parq == contrasenaConfirmacion) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletParqueaderoRegister",
            data: $.param({
                id_NIT: id_NIT,
                razon_Social: razon_Social,
                direccion_Parq: direccion_Parq,
                email_Parq: email_Parq,
                cel_Parq: cel_Parq,
                contrasena_Parq: contrasena_Parq              
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult !== false) {
                    $("#register-error").addClass("d-none");
                   let email_Parq = parsedResult['email_parq'];
                    document.location.href = "home.html?username=" + email_Parq;
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

