<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=utf-8" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <%--<meta name="description" content="此代码内容为超萌的猫头鹰登录界面" />--%>
    <title></title>
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <style type="text/css">
        body {
            background-color: #fff;
            font-family: 'Roboto', sans-serif;
            margin:0px;
        }
        #login {
            background-color: #eee;
        }
        #login .login {
            height: 200px;
            margin-top: 100px;
        }
        #login .loginform {
            margin-top: 0;
            top: 100px;
        }
        #login .loginform, #register .loginform {
            margin-top: 170px;
            position: relative;
            border: 1px solid #ddd;
            background-color: #fff;
            position: relative;
            max-width: 400px;
            padding: 0;
        }
        .container {
            padding-right: 15px;
            padding-left: 15px;
            margin-right: auto;
            margin-left: auto;
        }
        #login #owl-login, #register #owl-login {
            width: 211px;
            height: 108px;
            background-image: url("../../images/owl-login.png");
            position: absolute;
            top: -100px;
            left: 50%;
            margin-left: -111px;
        }
        #login #owl-login .hand{
            width: 34px;
            height: 34px;
            border-radius: 40px;
            background-color: #472d20;
            transition: 0.3s ease-out;
            position: absolute;
            left: 14px;
            bottom: -8px;
        }
        #login #owl-login .password .hand {
            transform: translateX(42px) translateY(-15px) scaleY(0.7);
        }
        #login #owl-login .hand.hand-r {
            left: 170px;
        }
        #login #owl-login .arms {
            top: 58px;
            position: absolute;
            width: 100%;
            height: 41px;
            overflow: hidden;
        }
        #login #owl-login .arms .arm{
            width: 40px;
            height: 65px;
            position: absolute;
            left: 20px;
            top: 40px;
            background-image: url("../../images/owl-login-arm.png");
            transition: 0.3s ease-out;
            transform: rotate(-20deg);
        }
        #login #owl-login .arms .arm.arm-r{
            transform: rotate(20deg) scaleX(-1);
            left: 158px;
        }
        #login .loginform .pad {
            overflow: hidden;
            padding: 30px;
        }
        #login .loginform input {
            padding: 9px 6px 9px 40px;
            height: auto;
        }
        #login .loginform input, #register .loginform input {
            color: #444;
        }
        button, input, select[multiple], textarea {
            background-image: none;
        }
        input, button, select, textarea {
            font-family: inherit;
            font-size: inherit;
            line-height: inherit;
        }
        #login .loginform .controls {
            position: relative;
            margin-bottom: 10px;
            width:290px;
        }
        #login .loginform label {
            position: absolute;
            top: 13px;
            left: 13px;
            font-size: 16px;
            color: rgba(0,0,0,0.3);
        }
        .fa {
            display: inline-block;
            font: normal normal normal 14px/1 FontAwesome;
            font-size: inherit;
            text-rendering: auto;
            -webkit-font-smoothing: antialiased;
            -moz-osx-font-smoothing: grayscale;
        }
        #login .loginform input {
            padding: 9px 6px 9px 40px;
            height: auto;
        }
        .form-control {
            display: block;
            width: 100%;
            height: 34px;
            padding: 6px 12px;
            font-size: 14px;
            line-height: 1.428571429;
            color: #555555;
            vertical-align: middle;
            background-color: #ffffff;
            border: 1px solid #cccccc;
            border-radius: 4px;
            box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
            transition: border-color ease-in-out 0.15s, box-shadow ease-in-out 0.15s;
        }
        #login .loginform .form-actions {
            border-top: 1px solid #e4e4e4;
            background-color: #f7f7f7;
            padding: 15px 30px;
            text-align: right;
        }
        .btn-link {
            font-weight: normal;
            color: #428bca;
            cursor: pointer;
            border-radius: 0;
        }
        .btn {
            display: inline-block;
            padding: 6px 12px;
            margin-bottom: 0;
            font-size: 14px;
            font-weight: normal;
            line-height: 1.428571429;
            text-align: center;
            white-space: nowrap;
            vertical-align: middle;
            cursor: pointer;
            border: 1px solid transparent;
            border-radius: 4px;
            user-select: none;
        }
        .header{
            height:50px;
            background-color: #111111;
            color:#ffffff
        }
        .header ul{
            list-style: none;
            float:left;
        }
        .header h3{
            float:left;
            padding: 0px 40px;
            margin: 0px 0px;
            line-height: 50px;
        }
        .header ul li{
            float: left;
            margin: 0px 20px;
        }

    </style>
</head>
<body>
<div class="header">
    <h3>TEST登录系统</h3>
    <ul>
        <li>模块一</li>
        <li>模块二</li>
        <li>模块三</li>
        <li>模块四</li>
    </ul>
</div>
<!-- begin -->
<div id="login">
    <div class="wrapper">
        <div class="login">
            <form action="/user/login.do" method="post" class="container offset1 loginform">
                <div id="owl-login">
                    <div class="hand"></div>
                    <div class="hand hand-r"></div>
                    <div class="arms">
                        <div class="arm"></div>
                        <div class="arm arm-r"></div>
                    </div>
                </div>
                <div class="pad">
                    <div class="control-group">
                        <div class="controls">
                            <label for="email" class="control-label fa fa-envelope"></label>
                            <input id="email" type="email" name="email" placeholder="Email" tabindex="1" autofocus="autofocus" class="form-control input-medium">
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <label for="password" class="control-label fa fa-asterisk"></label>
                            <input id="password" type="password" name="password" placeholder="Password" tabindex="2" class="form-control input-medium">
                        </div>
                    </div>
                </div>
                <div class="form-actions"><a href="javascript:void(0)" tabindex="5" class="btn pull-left btn-link text-muted">Forgot password?</a><a href="#" tabindex="6" class="btn btn-link text-muted">Sign Up</a>
                    <button type="button" tabindex="4" class="btn btn-primary">Login</button>
                </div>
            </form>
        </div>
    </div>
    <script>
        $(function() {
            $('#login #password').focus(function() {
                $('#owl-login').addClass('password');
            }).blur(function() {
                $('#owl-login').removeClass('password');
            });
        });
    </script>
</div>
<!-- end -->
</body>
</html>