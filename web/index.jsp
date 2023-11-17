<%-- 
    Document   : index
    Created on : Nov 16, 2023, 7:22:46 PM
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
            .leftbody{
                float:left;
                margin-top:250px;
                margin-left:10px;
            }
            .rightbody{
                float:right;
                margin-top:250px;
                margin-right:10px;
            }
            h2{
                margin:0;
                padding:0;
                font-weight:bold;
                font-size:22px;
                color:white;
                text-align: center;
                margin-bottom: 8%;
                font-family:Courgette;
            }
            .leftbody{
                width:400px;
                height:300px;
                color:white;
                top: 10%;
                left:30%;
                padding:60px 30px;
                position: absolute;
                transform:translate(-50%,-50%) ;
                box-sizing:border-box;
                box-shadow: 12px 12px 70px #000;
            }
            .rightbody{
                width:400px;
                height:300px;
                color:white;
                top: 10%;
                left:70%;
                padding:60px 30px;
                position: absolute;
                transform:translate(-50%,-50%) ;
                box-sizing:border-box;
                box-shadow: 12px 12px 70px #000;
            }
            .leftbody input,.rightbody input{
                width:100%;
                margin-bottom:8px;
            }
            .left{
                margin-left:5px;
            }
            .body1 input[type=text],.body1 input[type=password],.body1 input[type=email],.body1 input[type=number]{
                border :none;
                border-bottom :1px solid #fff;
                background :transparent;
                outline :30px;
                font-size :16px;
                opacity :1;
                color :white;

            }
            .body1 button[type=submit]{
                border:none;
                outline:none;
                height:30px;
                width:60px;
                background:#f6648b;
                font-size:14px;
                font-weight:bold;

            }
            .body1 button[type=submit]:hover{
                cursor: pointer;
                color :white;
            }
            .td1{
                font-size :18px;
                font-weight:bold;
            }
            @media only screen and (max-width: 768px) {
                body {
                    background-position: top; /* Adjust background position for smaller screens */
                }

                .nav {
                    text-align: center;
                }

                ul {
                    float: none;
                    margin-top: 0;
                }

                ul li {
                    display: block;
                    text-align: center;
                    margin: 10px 0;
                }

                .title {
                    float: none;
                    margin-left: 0;
                    text-align: center;
                }

                .leftbody,
                .rightbody {
                    width: 80%; /* Adjust width for smaller screens */
                    left: 50%;
                    transform: translateX(-50%);
                }
            }
        </style>
    </head>
    <body>
        <header>
            <div class="nav">
                <div class="title">
                    <a href="index.jsp">eLibrary</a>
                </div>
                <ul>
                    <li class="active"><a href="index.jsp">Home</a></li>
                    <li><a href="adminloginform.jsp">Admin</a></li>
                    <li><a href="librarianloginform.jsp">Librarian</a></li>
                </ul>
            </div>
        </header>
        <div class="body1">
            <div class="leftbody">
                <h2>Admin Login</h2>
                <form action="AdminLogin" class="left" method="post">
                    <table style="border:none;">


                        <tr><td class="td1">Email address :
                            <td><input type="email" name="email" placeholder="Email"></td>

                        <tr><td class="td1">Password :
                            <td><input type="password"  name="password" placeholder="Password"></td>

                    </table>
                    <button type="submit"  style="margin-left:100px;margin-top:20px;background:#f6648b">Login</button>
                </form>
            </div>

            <div class="rightbody">
                <h2>Librarian Login</h2>
                <form action="LibrarianLogin" class="left" method="post">
                    <table style="border: none;">

                        <tr><td class="td1">Email address :
                            <td><input type="email" name="email" placeholder="Email"></td>


                        <tr><td class="td1">Password :
                            <td><input type="password" name="password" placeholder="Password"></td>

                    </table>
                    <button type="submit" style="margin-left:100px;margin-top:20px;background:#f6648b">Login</button>
                </form>
            </div>
        </div>
    </body>
</html>

