<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>园区信息</title>
    <!--    园区信息    -->
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
                        <!--查询宿舍园区信息-->
                        <h4>查询宿舍园区信息</h4>
                        <form action="/zone/one" method="get">
                            <span>园区号: </span><input class="textBox"  type="text" name="zno"/><br/>
                            <input class="buttons" type="submit" value="查询"/>
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--添加宿舍园区信息-->
                        <h4>添加宿舍园区信息</h4>
                        <form action="/zone/insert" method="get">
                            <span>园区号: </span><input class="textBox"  type="text" name="zno"/><br/>
                            <span>园区名: </span><input class="textBox"  type="text" name="zname"/><br/>
                            <span>性别: </span><input class="textBox"  type="text" name="sex"/><br/>
                            <span>宿舍收费标准: </span> <input class="textBox"  type="text" name="fee"/><br/>
                            <span>宿舍容纳量: </span><input class="textBox"  type="text" name="accommodation"/><br/>
                            <span>剩余:</span><input class="textBox"  type="text" name="remain"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                </ul>
            </div>

            <div class="lowerHalf">
                <!--显示宿舍园区表-->
                <h4>宿舍园区表</h4>
                <table>
                    <tr>
                        <th>园区号</th>
                        <th>园区名</th>
                        <th>性别</th>
                        <th>宿舍收费标准</th>
                        <th>宿舍容纳量</th>
                        <th>剩余</th>
                    </tr>
                    <c:forEach items="${zones}" var="zone">
                        <tr>
                            <td>${zone.zno}</td>
                            <td>${zone.zname}</td>
                            <td>${zone.sex}</td>
                            <td>${zone.fee}</td>
                            <td>${zone.accommodation}</td>
                            <td>${zone.remain}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>