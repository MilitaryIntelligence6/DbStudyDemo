<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>主页</title>
    <link href="../static/css/base.css" type="text/css" rel="stylesheet" />
    <style>
        body{
            margin: 0;
            padding: 0;
            background-image: url("../static/images/main.jpg");
            background-repeat: no-repeat;
            background-position: center top;
            background-size: 100%;
        }
    </style>
</head>
<body>
<!--  头部  -->
<header>
    <!--    顶部      -->
    <div class="top">
        <a href="#"><img src="#" alt=""/></a>
    </div>
    <!--    顶部导航栏   -->
    <div class="navitems container">
        <ul>
            <li>
                <a href="/">主页</a>
            </li>
            <li class="space"></li>
            <li>
                <a href="/zone/all">宿舍信息</a>
            </li>
            <li class="space"></li>
            <li>
                <a href="/student/all">用户管理</a>
            </li>
            <li class="space"></li>
            <li>
                <a href="/changeDorm/all">学生转宿</a>
            </li>
            <li class="space"></li>
            <li>
                <a href="/studentPay/all">学生缴费</a>
            </li>
            <li class="space"></li>
            <li>
                <a href="/rent/all">宿舍出租</a>
            </li>
            <li class="space"></li>
            <li>
                <a href="/visitor/all">辅助管理</a>
            </li>
            <li class="space"></li>
            <li>
                <a href="/login">登录</a>
            </li>
        </ul>
    </div>
</header>
<!--  主体部分  -->
<div class="main">
    <ul>
        <li class="slidebar">
            <div>
                <ul>
                    <li>
                        <a href="/accommodation/all">学生住宿<span> > </span></a>
                    </li>
                </ul>
            </div>
        </li>
        <!--    图表操作部分    -->
        <li class="right">
            <!--    增删查部分   -->
            <div class="upperHalf">
                <ul>
                    <li class="box">
                        <!--查询转宿信息-->
                        <h4>查询学生住宿信息</h4>
                        <form action="/accommodation/one" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="sno"><br/>
                            <input class="buttons" type="submit" value="查询"/>
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--删除转宿信息-->
                        <h4>删除学生住宿信息</h4>
                        <form action="/accommodation/delete" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="sno"><br/>
                            <input class="buttons" type="submit" value="删除">
                        </form>
                    </li>
                </ul>
            </div>
            <!--    图表展示部分  -->
            <div class="lowerHalf">
                <!--转宿信息表-->
                <h4>学生住宿信息表</h4>
                <table>
                    <tr>
                        <th>园区号</th>
                        <th>寝室号</th>
                        <th>床位</th>
                        <th>入学时间</th>
                        <th>学号</th>
                        <th>离校时间</th>
                        <th>热水额</th>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                    </tr>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>