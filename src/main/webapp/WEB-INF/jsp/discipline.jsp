<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>学生违纪信息</title>
    <!--    学生违纪信息    -->
    <link href="../static/css/base.css" type="text/css" rel="stylesheet" />
    <link href="../static/css/mainBody.css" type="text/css" rel="stylesheet" />
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
<div class="main">
    <ul>
        <li class="slidebar">
            <div>
                <ul>
                    <li>
                        <a href="/visitor/all">访客记录<span> > </span></a>
                    </li>
                    <li>
                        <a href="/discipline/all">学生违纪记录<span> > </span></a>
                    </li>
                    <li>
                        <a href="/baggage/all">大件物品记录<span> > </span></a>
                    </li>
                    <li>
                        <a href="/electric_application/all">学生电器登记表<span> > </span></a>
                    </li>
                    <li>
                        <a href="/repair/all">维修记录<span> > </span></a>
                    </li>
                </ul>
            </div>
        </li>
        <!--    图表操作部分    -->
        <li class="right">

            <div class="upperHalf">
                <ul>
                    <li class="box">
                        <!--查询one discipline-->
                        <h4>查询违纪记录</h4>
                        <form action="/discipline/one" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="sno"><br/>
                            <span>违纪时间: </span><input class="textBox" type="text" name="date"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--插入一个discipline-->
                        <h4>插入一条违纪记录</h4>
                        <form action="/discipline/insert" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="sno"/><br/>
                            <span>违纪时间: </span><input class="textBox" type="text" name="date"/><br/>
                            <span>违纪详情: </span><input class="textBox" type="text" name="information"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--删除访客-->
                        <h4>删除违纪记录</h4>
                        <form action="/discipline/delete" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="sno"><br/>
                            <span>违纪时间: </span><input class="textBox" type="text" name="date"><br/>
                            <input class="buttons" type="submit" value="删除">
                        </form>
                    </li>
                </ul>
            </div>
            <%--表格--%>
            <div class="lowerHalf">
                <!--展示访客列表-->
                <h4>学生违纪表</h4>
                <table>
                    <tr>
                        <th>学号</th>
                        <th>违纪时间</th>
                        <th>违纪详情</th>
                    </tr>
                    <c:forEach items="${disciplines}" var="discipline">
                        <tr>
                            <td>${discipline.sno}</td>
                            <td>${discipline.time}</td>
                            <td>${discipline.information}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>