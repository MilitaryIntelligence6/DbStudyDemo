<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>出租</title>
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
                        <h4>查询出租信息</h4>
                        <form action="/rent/one" method="get">
                            <span>租客身份证号: </span><input class="textBox" type="text" name="tid"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--插入一个discipline-->
                        <h4>插入一条出租记录</h4>
                        <form action="/rent/insert" method="get">
                            <span>租客身份证号:</span> <input class="textBox" type="text" name="tid"/><br/>
                            <span>园区号: </span><input class="textBox" type="text" name="zno"/><br/>
                            <span>寝室号: </span><input class="textBox" type="text" name="dno"/><br/>
                            <span>入住时间: </span><input class="textBox" type="text" name="check_in"/><br/>
                            <span>床位号: </span><input class="textBox" type="text" name="bed"/><br/>
                            <span>退房时间: </span><input class="textBox" type="text" name="pick_out"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--删除访客-->
                        <h4>删除出租信息</h4>
                        <form action="/rent/delete" method="get">
                            <span>租客身份证号: </span><input class="textBox" type="text" name="tid"><br/>
                            <input class="buttons" type="submit" value="删除">
                        </form>
                    </li>
                </ul>
            </div>

            <%--表格--%>
            <div class="lowerHalf">
                <!--展示出租列表-->
                <h4>出租列表</h4>
                <table>
                    <tr>
                        <th>租客身份证号</th>
                        <th>园区号</th>
                        <th>寝室号</th>
                        <th>入住时间</th>
                        <th>床位</th>
                        <th>退房时间</th>
                    </tr>
                    <c:forEach items="${rents}" var="rent">
                        <tr>
                            <td>${rent.tid}</td>
                            <td>${rent.zno}</td>
                            <td>${rent.dno}</td>
                            <td>${rent.check_in}</td>
                            <td>${rent.bed}</td>
                            <td>${rent.pick_out}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>