<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <title>访客信息</title>
    <!--    访客信息    -->
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
                        <!--查询访客-->
                        <h4>查询访客</h4>
                        <form action="/visitor/one" method="get">
                            <span>访客身份证: </span><input class="textBox" type="text" name="vid"><br/>
                            <span>访问时间: </span><input class="textBox" type="text" name="vtime"><br/>
                            <input class="buttons" type="submit" value="查询">
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--插入一个visitor-->
                        <h4>插入一个访客信息</h4>
                        <form action="/visitor/insert" method="get">
                            <span>学生学号: </span><input class="textBox" type="text" name="sno"/><br/>
                            <span> 访客身份证: </span><input class="textBox" type="text" name="vid"/><br/>
                            <span>访客姓名:  </span><input class="textBox" type="text" name="vname"/><br/>
                            <span>与被访问者关系: </span><input class="textBox" type="text" name="relationship"/><br/>
                            <span> 访问时间: </span><input class="textBox" type="text" name="vtime"/><br/>
                            <span>访客联系方式: </span><input class="textBox" type="text" name="contact"/><br/>
                            <input class="buttons" type="submit" value="添加"/>
                        </form>
                    </li>
                    <li class="line"></li>
                    <li class="box">
                        <!--删除访客-->
                        <h4>删除访客</h4>
                        <form action="/visitor/delete" method="get">
                            <span>访客身份证: </span> <input class="textBox" type="text" name="vid"><br/>
                            <span>访问时间:</span><input class="textBox" type="text" name="vtime"><br/>
                            <input class="buttons" type="submit" value="删除">
                        </form>
                    </li>
                </ul>
            </div>

            <%--表格--%>
            <div class="lowerHalf">
                <!--展示访客列表列表-->
                <h4>访客列表</h4>
                <table>
                    <tr>
                        <th>学生学号</th>
                        <th>访客身份证</th>
                        <th>访客姓名</th>
                        <th>与被访者关系</th>
                        <th>访问时间</th>
                        <th>访客联系方式</th>
                    </tr>
                    <c:forEach items="${visitors}" var="visitor">
                        <tr>
                            <td>${visitor.sno}</td>
                            <td>${visitor.vid}</td>
                            <td>${visitor.vname}</td>
                            <td>${visitor.relationship}</td>
                            <td>${visitor.vtime}</td>
                            <td>${visitor.contact}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </li>
    </ul>
</div>
</body>
</html>