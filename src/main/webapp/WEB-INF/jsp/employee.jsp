<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>员工信息</title>
    <!--    员工信息    -->
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
                        <!--通过职工号查询-->
                        <h4>通过职工号查询</h4>
                        <form action="/employee/eno" method="get">
                            <span>工号: </span><input class="textBox" type="text" name="eno"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--插入一个职工-->
                        <h4>插入一个职工</h4>
                        <form action="/employee/insert" method="get">
                            <span>工号: </span><input class="textBox" type="text" name="eno"/><br/>
                            <span>园区名: </span><input class="textBox" type="text" name="zno"/><br/>
                            <span>姓名: </span><input class="textBox" type="text" name="ename"/><br/>
                            <span>年龄: </span><input class="textBox" type="text" name="eage"/><br/>
                            <span>性别: </span><input class="textBox" type="text" name="esex"/><br/>
                            <span>职位: </span><input class="textBox" type="text" name="position"/><br/>
                            <span>联系方式: </span><input class="textBox" type="text" name="econtact"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                </ul>
            </div>

            <%--表格--%>
            <div class="lowerHalf">
                <!--展示职工列表-->
                <h4>职工列表</h4>
                <table>
                    <tr>
                        <th>工号</th>
                        <th>园区名</th>
                        <th>姓名</th>
                        <th>年龄</th>
                        <th>性别</th>
                        <th>职位</th>
                        <th>联系方式</th>
                    </tr>
                    <c:forEach items="${employees}" var="employee">
                        <tr>
                            <td>${employee.eno}</td>
                            <td>${employee.zno}</td>
                            <td>${employee.ename}</td>
                            <td>${employee.eage}</td>
                            <td>${employee.esex}</td>
                            <td>${employee.position}</td>
                            <td>${employee.econtact}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>