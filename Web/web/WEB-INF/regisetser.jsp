<%--
  Created by IntelliJ IDEA.
  User: YUAN
  Date: 2020/10/28
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>登录|注册</title>
    <!-- 图标库npmjs.com -->
    <link rel="stylesheet" href="https://unpkg.com/font-awesome@4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/in.css">
    <style>
        main {
            background: linear-gradient(to right top, rgba(38,50,105,0.78),
            rgba(255,152,0,0.45)), url(imgs/bg.jpg) center center no-repeat ;
            background-size: cover;
        }
    </style>
</head>
<body>

<!-- 使用到字体图标，从fontAwesome里icon中找 -->
<header>
    <a class="login" href="#"><i class="fa fa-user-circle"></i></a>
</header>

<main>
    <div class="flip-modal login">
        <!-- 展示登录页面 -->
        <div class="modal modal-login">
            <a class="close" href="#"><i class="fa fa-close"></i></a>
            <!-- 登录 -->
            <div class="tabs">
                <a class="login active" href="#">登录</a>
                <a class="register" href="#">注册</a>
            </div>
            <div class="content">
                <div class="errormsg"></div>
                <form action="new_file.html" method="post">
                    <div class="input-field">
                        <i class="fa fa-user-o"></i>
                        <input name="username" type="text" placeholder="用户名">
                    </div>
                    <div class="input-field">
                        <i class="fa fa-lock"></i>
                        <input name="password" type="password" placeholder="密码">
                    </div>
                    <div class="input-field">
                        <input type="submit" value="登录">
                    </div>
                </form>
            </div>
        </div>


        <!-- 展示注册页面 -->
        <div class="modal modal-register">
            <a class="close fa fa-close" href="#"></a>
            <div class="tabs">
                <a class="login" href="#">登录</a>
                <a class="register active" href="#">注册</a>
            </div>
            <div class="content">
                <div class="errormsg"></div>
                <form action="/register" method="post">
                    <div class="input-field">
                        <i class="fa fa-user-o"></i>
                        <input name="username" type="text" placeholder="输入用户名">
                    </div>
                    <div class="input-field">
                        <i class="fa fa-lock"></i>
                        <input name="password" type="password" placeholder="输入密码">
                    </div>
                    <div class="input-field">
                        <i class="fa fa-lock"></i>
                        <input name="password2"  type="password2" placeholder="再次输入密码">
                    </div>
                    <div class="input-field">
                        <input type="submit" value="注册">
                    </div>
                </form>
            </div>
        </div>

    </div>

</main>
<script>
    function $(selector){
        return document.querySelector(selector)
    }
    function $$(selector){
        return document.querySelectorAll(selector)
    }
    $$('.modal .login').forEach(function(node){
        node.onclick = function(){
            $('.flip-modal').classList.remove('register')
            $('.flip-modal').classList.add('login')
        }
    })
    $$('.modal .register').forEach(function(node){
        node.onclick = function(){
            $('.flip-modal').classList.remove('login')
            $('.flip-modal').classList.add('register')
        }
    })
    $(".close").onclick = function(){
        $('.flip-modal').classList.remove('show')
    }
    $(".flip-modal").onclick=function(e){
        e.stopPropagation()
    }

    $('header .login').onclick = function(e){
        e.stopPropagation()
        $('.flip-modal').classList.add('show')
    }


    document.onclick = function(){
        $('.flip-modal').classList.remove('show')
    }
    $('.modal-login form').addEventListener('submit', function(e){
        e.preventDefault()
        if(!/^\w{3,8}$/.test($('.modal-login input[name=username]').value)){
            $('.modal-login .errormsg').innerText = '用户名需输入3-8个字符，包括字母数字下划线'
            return false
        }
        if(!/^\w{6,10}$/.test($('.modal-login input[name=password]').value)){
            $('.modal-login .errormsg').innerText = '密码需输入6-10个字符，包括字母数字下划线'
            return false
        }
        this.submit()
    })
    $('.modal-register form').addEventListener('submit', function(e){
        e.preventDefault()
        if(!/^\w{3,8}$/.test($('.modal-register input[name=username]').value)){
            $('.modal-register .errormsg').innerText = '用户名需输入3-8个字符，包括字母数字下划线'
            return false
        }
        if(/^hunger$|^ruoyu$/.test($('.modal-register input[name=username]').value)){
            $('.modal-register .errormsg').innerText = '用户名已存在'
            return false
        }
        if(!/^\w{6,10}$/.test($('.modal-register input[name=password]').value)){
            $('.modal-register .errormsg').innerText = '密码需输入6-10个字符，包括字母数字下划线'
            return false
        }
        if($('.modal-register input[name=password]').value !== $('.modal-register input[name=password2]').value){
            $('.modal-register .errormsg').innerText = '两次输入的密码不一致'
            return false
        }
        this.submit()
    })
</script>
</body>
</html>
