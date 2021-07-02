<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>宿舍信息</title>
    <!--    宿舍信息    -->
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
                        <a href="/zone/all">园区信息<span> > </span></a>
                    </li>
                    <li>
                        <a href="/dorm/all">寝室信息<span> > </span></a>
                    </li>
                </ul>
            </div>
        </li>
        <!--    图表操作部分    -->
        <li class="right">
            <div class="upperHalf">
                <ul>
                    <li class="box">
                        <!--通过园区号查询寝室列表-->
                        <h4>通过园区号查询</h4>
                        <form action="/dorm/list" method="get">
                            <span>园区号: </span><input class="textBox" type="text" name="zno"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--通过园区号和寝室号查询-->
                        <h4>通过园区号和寝室号查询</h4>
                        <form action="/dorm/one" method="get">
                            <span>园区号: </span><input class="textBox" type="text" name="zno"><br/>
                            <span>寝室号: </span><input class="textBox" type="text" name="dno"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--插入一个寝室-->
                        <h4>插入一个寝室</h4>
                        <form action="/dorm/insert" method="get">
                            <span>园区号: </span><input class="textBox" type="text" name="zno"/><br/>
                            <span>寝室号: </span><input class="textBox" type="text" name="dno"/><br/>
                            <span>是否住人: </span><input class="textBox" type="text" name="contain"/><br/>
                            <span>寝室电费: </span><input class="textBox" type="text" name="electricity"/><br/>
                            <span>寝室水费: </span><input class="textBox" type="text" name="water"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                </ul>
            </div>

            <%--表格--%>
            <div class="lowerHalf">
                <!--展示寝室列表-->
                <h4>寝室列表</h4>
                <table>
                    <tr>
                        <th>园区号</th>
                        <th>寝室号</th>
                        <th>是否住人</th>
                        <th>寝室电费</th>
                        <th>寝室水费</th>
                    </tr>
                    <c:forEach items="${dorms}" var="dorm">
                        <tr>
                            <td>${dorm.zno}</td>
                            <td>${dorm.dno}</td>
                            <td>${dorm.contain}</td>
                            <td>${dorm.electricity}</td>
                            <td>${dorm.water}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>