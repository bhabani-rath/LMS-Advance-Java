<%-- 
    Document   : navadmin
    Created on : Nov 16, 2023, 7:29:44 PM
    Author     : CODEHUB_PC
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <style type="text/css">
            *{
                margin:0;
                padding:0;
            }
            body{
                background-image: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(lib2.jpg );
                height: 100vh;
                background-size: cover;
                background-position: center;
            }
            ul{
                float: right;
                list-style-type: none;
                margin-top:25px;
                margin-right:50px;
            }
            ul li{
                display: inline-block;
            }
            ul li a{
                text-decoration: none;
                color: #fff;
                padding: 5px 20px;
                border:1px solid transparent;
                transition: 0.6s ease;
            }
            ul li a:hover{
                background-color: #fff;
                color: black;
            }
            ul li.active a{
                background-color: #fff;
                color: black;
            }
            .title{
                float: left;
                list-style-type: none;
                margin-top:25px;
                margin-left:100px;

            }
            .title a{
                text-decoration: none;
                color: #fff;
                padding: 5px 20px;
                border:1px solid transparent;
                transition: 0.6s ease;
                font-size:30px;
                font-family : Bold;
            }
        </style>
    </head>
    <body>
        <div class="nav">
            <div class="title">
                <a href="index.html">eLibrary</a>
            </div>
            <ul>
                <li class="active"><a href="index.html">Home</a></li>
                <li><a href="AddLibrarianForm">Add Librarian</a></li>
                <li><a href="ViewLibrarian">View Librarian</a></li>
                <li><a href="LogoutAdmin">Logout</a></li>
            </ul>
        </div>
    </body>
</html>