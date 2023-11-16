<%-- 
    Document   : returnbookform
    Created on : Nov 16, 2023, 7:32:03 PM
    Author     : CODEHUB_PC
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <style type="text/css">
            body{
                margin:0;
                padding:0;
                background-image:  linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url(lib2.jpg);
                background-size:cover ;
                background-position: center;
                height:100vh;
                font-family: Poppins;
            }
            .wrapper{
                width:400px;
                height:300px;
                color:white;
                top: 50%;
                left:50%;
                padding:60px 30px;
                position: absolute;
                transform:translate(-50%,-50%) ;
                box-sizing:border-box;
                box-shadow: 12px 12px 70px #000;
            }
            h1{
                margin:0;
                padding:0;
                font-weight:bold;
                font-size:22px;
                color:white;
                text-align: center;
                margin-bottom: 8%;
                font-family:Courgette;

            }
            .wrapper input{
                width:100%;
                margin-bottom:8px;

            }
            .left{
                margin-left:5px;
            }
            .wrapper input[type=text],.wrapper input[type=password],.wrapper input[type=email],.wrapper input[type=number]{
                border :none;
                border-bottom :1px solid #fff;
                background :transparent;
                outline :30px;
                font-size :16px;
                opacity :1;
                color :white;

            }
            .wrapper button[type=submit]{
                border:none;
                outline:none;
                height:30px;
                background:#f6648b;
                font-size:14px;
                font-weight:bold;

            }
            .wrapper button[type=submit]:hover{
                cursor: pointer;
                color :white;
            }
            .td1{
                font-size :18px;
                font-weight:bold;
            }
        </style>
    </head>
    <body>
        <div class="wrapper">

            <h1>Return Book Form</h1>
            <form action="ReturnBook" class="left" method="post" >
                <table border="0">

                    <tr><td class="td1">Callno :
                        <td><input type="text" name="callno" placeholder="Callno" > </td>


                    <tr><td class="td1">Student Id :
                        <td><input type="text" name="studentid" placeholder="StudentId"></td>

                </table>
                <button type="submit" style="margin-left:80px;margin-top:20px;background:#f6648b">Return Book</button>
            </form>
        </div>
    </body>
</html>
