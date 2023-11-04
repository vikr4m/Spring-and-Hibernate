<%-- 
    Document   : signup
    Created on : 10-Aug-2023, 11:24:44 am
    Author     : vikram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup</title>
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <!-- Compiled and minified JavaScript -->
        <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    </head>
    <body style="background: url(img/minimal.jpg); background-size: cover; background-attachment: fixed;">
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content">
                            <h3 style="margin-top: 10px" class="center-align">Register Here</h3>
                            <div class="form center-align">
                                <!--//creating form-->
                                <form action="Register" method="POST">
                                    <input type="text" name="username" placeholder="Enter your name"><br>
                                    <input type="email" name="useremail" placeholder="Enter your email"><br>
                                    <input type="password" name="userpassword" placeholder="Enter your password"><br>

                                    <div class="file-field input-field">
                                        <div class="btn indigo darken-3">
                                            <span>File</span>
                                            <input name="image" type="file">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                        </div>
                                    </div>
                                    <button type="submit" class="btn indigo darken-3">Submit</button>
                                    <button type="Reset" class="btn indigo darken-3">Reset</button>
                                </form>
                                <h5 id="msg"></h5>
                            </div>

                            <div class="loader center-align" style="margin-top: 10px;display: none;">
                                <div class="preloader-wrapper small active">
                                    <div class="spinner-layer spinner-blue">
                                        <div class="circle-clipper left">
                                            <div class="circle"></div>
                                        </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                    </div>

                                    <div class="spinner-layer spinner-red">
                                        <div class="circle-clipper left">
                                            <div class="circle"></div>
                                        </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                    </div>

                                    <div class="spinner-layer spinner-yellow">
                                        <div class="circle-clipper left">
                                            <div class="circle"></div>
                                        </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                    </div>

                                    <div class="spinner-layer spinner-green">
                                        <div class="circle-clipper left">
                                            <div class="circle"></div>
                                        </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                    </div>
                                </div>

                                <h5>Please wait...</h5>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script
            src="https://code.jquery.com/jquery-3.7.0.min.js"
            integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
        crossorigin="anonymous"></script>

        <script>
            $(document).ready(function () {
                console.log("Page is ready");

                $("form").on('submit', function (event) {
                    event.preventDefault();

                    //var f = $(this).serialize();
                    let f = new FormData(this);

                    console.log(f);

                    $(".loader").show();
                    $("form").hide();

                    $.ajax({
                        url: "Register",
                        data: f,
                        type: 'POST',
                        success: function (data, textStatus, jqXHR) {
                            console.log(data);
                            console.log("Success...");
                            $(".loader").hide();
                            $("form").show();

                            if (data.trim() === 'Okay') {
                                $('#msg').html("Successfully Registered")
                                $('#msg').addClass('green-text')
                            } else {
                                $('#msg').html("Something went wrong on server !! ")
                                $('#msg').addClass('red-text')
                            }
                        },
                        error: function (jqXHP, textStatus, errorThrown) {
                            console.log(data);
                            console.log("Error...");
                            $(".loader").hide();
                            $("form").show();
                            $('#msg').html("Something went wrong on server !! ")
                            $('#msg').addClass('red-text')

                        },
                        processData: false,
                        contentType: false
                    });
                });
            });
        </script>
    </body>
</html>
