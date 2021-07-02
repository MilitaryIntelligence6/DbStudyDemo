<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>维修记录</title>
    <!--    电器信息    -->
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
                        <!--查询one 电器-->
                        <h4>查询园区维修记录</h4>
                        <form action="/repair/one" method="get">
                            <span>园区号: </span><input class="textBox" type="text" name="zno"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--插入一个电器-->
                        <h4>添加一条维修记录</h4>
                        <form action="/repair/insert" method="get">
                            <span>园区号: </span><input class="textBox" type="text" name="zno"/><br/>
                            <span>寝室号: </span><input class="textBox" type="text" name="dno"/><br/>
                            <span>维修时间: </span><input class="textBox" type="text" name="gdate"/><br/>
                            <span>联系方式: </span><input class="textBox" type="text" name="contact"/><br/>
                            <span>编辑备注: </span><input class="textBox" type="text" name="note"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                </ul>
            </div>

            <%--表格--%>
            <div class="lowerHalf">
                <!--展示维修列表-->
                <h4>维修列表</h4>
                <table>
                    <tr>
                        <th>园区号</th>
                        <th>寝室号</th>
                        <th>维修时间</th>
                        <th>联系方式</th>
                        <th>备注</th>
                    </tr>
                    <c:forEach items="${repairs}" var="repair">
                        <tr>
                            <td>${repair.zno}</td>
                            <td>${repair.dno}</td>
                            <td>${repair.gdate}</td>
                            <td>${repair.contact}</td>
                            <td>${repair.note}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>