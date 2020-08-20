<%--
  Created by IntelliJ IDEA.
  User: YUAN
  Date: 2020/8/18
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登 录</title>
    <style type="text/css">
        #log{
            border: 1px solid #646464;
            background-color:   #E8E8E8;
            margin-top: 200px;
            margin-left: 800px;
            width: 360px;
            height: 500px;
            text-align: center;
        }
        #logDiv{
            height: 150px;
            text-align: center;
            margin: 0 auto;
            font-size: 50px;
        }
        #user{
            height: 34px;
            margin-top: 40px;
            margin-left: auto;
        }

        #check{
            margin-top: 70px;
        }

        #logbutton{
            width: 270px;
            height: 40px;
            color: burlywood;
            border:0px solid;
            border-radius:6px;
            font: normal 20px/44px "Microsoft Yahei";

        }
        #register{
            text-decoration: none;
            width: 270px;
            height: 90px;
            margin-top: 6px;
            color: burlywood;
            border:0px solid;
            border-radius:6px;
            font: normal 20px/44px "Microsoft Yahei";

        }
        #a{
            margin-top: 70px;
            margin-left: 250px;
        }
    </style>
</head>
<body>
<div id="log">
    <form action="/LoginServlet" method="post" >
        <div id="logDiv">
            <p style="left: 0.625rem;">请登录</p>
        </div>
        <div id="user">
            账号：<input type="text" id="username" name="username" placeholder="手机号\邮箱\昵称" style="height: 1.875rem;" /><br />
            密码：<input type="password" id="password" name="password" placeholder="请输入密码" style="height: 1.875rem;" class="JianJu"/>
        </div>
        <div id="check">
            <input type="submit"  value="登录" /><br />
        </div>
        <div id="a">
            <a href="register.html" id="register">注册</a>
        </div>
    </form>
</div>

</body>
</html>
