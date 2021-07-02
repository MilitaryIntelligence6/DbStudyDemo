<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>租客信息</title>
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
                        <!--查询one discipline-->
                        <h4>查询租客信息</h4>
                        <form action="/tenant/one" method="get">
                            <span>身份证号: </span><input class="textBox" type="text" name="tid"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--插入一个discipline-->
                        <h4>插入租客信息</h4>
                        <form action="/tenant/insert" method="get">
                            <span>身份证号: </span><input class="textBox" type="text" name="tid"/><br/>
                            <span>入住人姓名: </span><input class="textBox" type="text" name="tname"/><br/>
                            <span>联系方式: </span><input class="textBox" type="text" name="contact"/><br/>
                            <span>性别: </span><input class="textBox" type="text" name="sex"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--删除访客-->
                        <h4>删除租客信息</h4>
                        <form action="/tenant/delete" method="get">
                            <span>身份证号: </span><input class="textBox" type="text" name="tid"><br/>
                            <input class="buttons" type="submit" value="删除">
                        </form>
                    </li>
                </ul>
            </div>

            <%--表格--%>
            <div class="lowerHalf">
                <!--展示租客列表-->
                <h4>租客列表</h4>
                <table>
                    <tr>
                        <th>身份证号</th>
                        <th>入住人姓名</th>
                        <th>联系方式</th>
                        <th>性别</th>
                    </tr>
                    <c:forEach items="${tenants}" var="tenant">
                        <tr>
                            <td>${tenant.tid}</td>
                            <td>${tenant.tname}</td>
                            <td>${tenant.contact}</td>
                            <td>${tenant.sex}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>