<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paymentsAPP</title>
</head>
<style>
@charset "UTF-8";
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
.full-page {
    height: 100%;
    width: 100%;
    background-color:black;
    background-position: center;
    background-size: cover;
    position: absolute;
}
.navbar {
    display: flex;
    align-items: center;
    padding: 20px 50px 50px 30px;
}
nav {
    flex: 1;
    text-align: right;
}
nav ul {
    display: inline-block;
    list-style: none;
}
nav ul li {
    display: inline-block;
    margin-right: 70px;
}
nav ul li a {
    text-decoration: none;
    font-size: 20px;
    color: white;
    font-family: sans-serif;
}
nav ul li button {
    font-size: 20px;
    color: white;
    outline: none;
    border: none;
    background: transparent;
    cursor: pointer;
    font-family: sans-serif;
}
nav ul li button:hover,
nav ul li a:hover {
    color: aqua;
}
a {
    text-decoration: none;
    color: palevioletred;
    font-size: 28px;
}
#login-form {
    display: none;
}
.form-box {
    width: 380px;
    height: 580px;
    position: relative;
    margin: 2% auto;
    background: rgba(0, 0, 0, 0.3);
    padding: 10px;
    overflow: hidden;
}
.button-box {
    width: 220px;
    margin: 35px auto;
    position: relative;
    box-shadow: 0 0 20px 9px #ff61241f;
    border-radius: 30px;
}
.toggle-btn {
    padding: 10px 30px;
    cursor: pointer;
    background: transparent;
    border: 0;
    outline: none;
    position: relative;
}
#btn {
    top: 0;
    left: 0;
    position: absolute;
    width: 110px;
    height: 100%;
    background: rgb(0, 255, 255);    
    border-radius: 30px;
    transition: .5s;
}
.input-group-login,
.input-group-register {
    top: 150px;
    position: absolute;
    width: 280px;
    transition: .5s;
}
.input-field {
    width: 100%;
    padding: 10px 0;
    margin: 5px 0;
    border-left: 0;
    border-top: 0;
    border-right: 0;
    border-bottom: 1px solid #999;
    outline: none;
    background: transparent;
}
.submit-btn {
    width: 85%;
    padding: 10px 30px;
    cursor: pointer;
    display: block;
    margin: auto;
    background: rgb(0, 255, 255);
    border: 0;
    outline: none;
    border-radius: 30px;
}
.check-box {
    margin: 30px 10px 34px 0;
}
span {
    color: #777;
    font-size: 12px;
    bottom: 68px;
    position: absolute;
}
#login {
    left: 50px;
}
#login input {
    color: white;
    font-size: 15px;
}
#register {
    left: 450px;
}
#register input {
    color: white;
    font-size: 15px;
}
</style>
<body>
<div class="full-page">
    <div class="navbar">
        <nav>
            <ul id='MenuItems'>
                <li><a href='#'>Home</a></li>
                <li><a href='#'>About Us</a></li>
                <li><a href='#'>Services</a></li>
                <li><a href='#'>Contact</a></li>
                <li><button class='loginbtn' onclick="document.getElementById('login-form').style.display='block'" style="width:auto;">Login</button></li>
            </ul>
        </nav>
    </div>
    <div id='login-form' class='login-page'>
        <div class="form-box">
            <div class='button-box'>
                <div id='btn'></div>
                <button type='button' onclick='login()' class='toggle-btn'>Log In</button>
                <button type='button' onclick='register()' class='toggle-btn'>Register</button>
            </div>
            
            <form action="LoginServlets" method="post" id='login' class='input-group-login'>
                <input type='text' class='input-field' placeholder='Number' name="Phno" required>
                <input type='password' class='input-field' placeholder='Enter Password' name="Password" required>
                <input type='checkbox' class='check-box'><span>Remember Password</span>
                <button type='submit' class='submit-btn'>Log in</button>
            </form>
            
            <form action="http://localhost:8080/WebApplication/Register" method="post" id='register' class='input-group-register'>
                <input type='text' class='input-field' placeholder='First Name' name="fname" required>
                <input type='text' class='input-field' placeholder='Last Name' name="lname" required>
                <input type='text' class='input-field' placeholder='Phone No' name="phno" required>
                <input type='email' class='input-field' placeholder='Email Id' name="email" required>
                <input type='date' class='input-field' placeholder='Date of Birth' name="dob" required>
                <input type='text' class='input-field' placeholder='Address' name="address" required>
                <input type='password' class='input-field' placeholder='Enter Password' name="password" required>
           
                <button type='submit' class='submit-btn'>Register</button>
            </form>
        </div>
    </div>
</div>
<script>
    var x = document.getElementById('login');
    var y = document.getElementById('register');
    var z = document.getElementById('btn');
    function register() {
        x.style.left = '-400px';
        y.style.left = '50px';
        z.style.left = '110px';
    }
    function login() {
        x.style.left = '50px';
        y.style.left = '450px';
        z.style.left = '0px';
    }
</script>
<script>
    var modal = document.getElementById('login-form');
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
</script>
</body>
</html>
