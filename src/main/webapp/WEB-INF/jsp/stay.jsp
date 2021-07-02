<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>学生转宿</title>
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
                        <a href="/rent/all">出租信息 <span> > </span></a>
                    </li>
                    <li>
                        <a href="/tenant/all">租客信息<span> > </span></a>
                    </li>
                    <li>
                        <a href="/payrent/all">租客缴费<span> > </span></a>
                    </li>
                    <li>
                        <a href="/stay/all">留宿管理<span> > </span></a>
                    </li>
                </ul>
            </div>
        </li>
        <!--    图表操作部分    -->
        <li class="right">

            <div class="upperHalf">
                <ul>
                    <li class="box">
                        <!--查询留宿记录-->
                        <h4>查询留宿记录</h4>
                        <form action="/stay/one" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="sno"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--插入一条留宿记录-->
                        <h4>插入留宿记录</h4>
                        <form action="/stay/insert" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="sno"/><br/>
                            <span>留宿时间: </span><input class="textBox" type="text" name="ftime"/><br/>
                            <span>离开时间: </span><input class="textBox" type="text" name="ttime"/><br/>
                            <span>是否同意出租: </span><input class="textBox" type="text" name="aggrement"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                    <li class="box">
                        <!--删除留宿记录-->
                        <h4>删除留宿记录</h4>
                        <form action="/stay/delete" method="get">
                            <span>学号: </span><input class="textBox" type="text" name="sno"/><br/>
                            <input class="buttons" type="submit" value="删除"/>
                        </form>
                    </li>
                </ul>
            </div>
            <%--表格--%>
            <div class="lowerHalf">
                <!--展示留宿列表-->
                <h4>学生留宿表</h4>
                <table>
                    <tr>
                        <th>学号</th>
                        <th>留宿时间</th>
                        <th>离开时间</th>
                        <th>是否同意出租</th>
                    </tr>
                    <c:forEach items="${stays}" var="stay">
                        <tr>
                            <td>${stay.sno}</td>
                            <td>${stay.ftime}</td>
                            <td>${stay.ttime}</td>
                            <td>${stay.aggrement}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>