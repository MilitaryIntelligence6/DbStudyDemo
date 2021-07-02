<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>学生信息</title>
    <!--    学生信息    -->
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
                        <a href="/student/all">学生信息<span> > </span></a>
                    </li>
                    <li>
                        <a href="/employee/all">职工信息<span> > </span></a>
                    </li>
                </ul>
            </div>
        </li>
        <!--    图表操作部分    -->
        <li class="right">
            <div class="upperHalf">
                <ul>
                    <li class="box">
                        <!--通过学号查询-->
                        <h4>通过学号查询</h4>
                        <form action="/student/one" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="zno"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--插入一个学生-->
                        <h4>插入一个学生</h4>
                        <form action="/student/insert" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="sno"/><br/>
                            <span>姓名: </span><input class="textBox" type="text" name="sname"/><br/>
                            <span>学院: </span><input class="textBox" type="text" name="college"/><br/>
                            <span>专业: </span><input class="textBox" type="text" name="dept"/><br/>
                            <span>班级: </span><input class="textBox" type="text" name="classNo"/><br/>
                            <span>性别: </span><input class="textBox" type="text" name="sex"/><br/>
                            <span>联系方式: </span><input class="textBox" type="text" name="scontact"/><br/>
                            <span>违纪次数: </span><input class="textBox" type="text" name="discipline"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                </ul>
            </div>

            <%--表格--%>
            <div class="lowerHalf">
                <!--展示学生列表-->
                <h4>学生列表</h4>
                <table>
                    <tr>
                        <th>学号</th>
                        <th>姓名</th>
                        <th>学院</th>
                        <th>专业</th>
                        <th>班级</th>
                        <th>性别</th>
                        <th>联系方式</th>
                        <th>违纪次数</th>
                    </tr>
                    <c:forEach items="${students}" var="student">
                        <tr>
                            <td>${student.sno}</td>
                            <td>${student.sname}</td>
                            <td>${student.college}</td>
                            <td>${student.dept}</td>
                            <td>${student.classNo}</td>
                            <td>${student.sex}</td>
                            <td>${student.scontact}</td>
                            <td>${student.discipline}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>