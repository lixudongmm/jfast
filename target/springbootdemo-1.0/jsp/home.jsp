<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="head.jsp"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="${ctx}/static/assets/css/layui.css">
    <link rel="stylesheet" href="${ctx}/static/assets/css/view.css" />
    <link rel="stylesheet" href="${ctx}/static/assets/css/global.css">
    <title></title>
</head>

<body class="userHome layui-view-body">
    <div class="layui-content">
        <div class="layui-row layui-col-space20">
            <div class="layui-col-sm12 layui-col-md12 bg-fff">
                <!-- 已认证 -->
                <div class="layui-content certified">
                    <div class="layui-row layui-col-space20">
                        <div class="layui-col-sm12 layui-col-md12">
                            <div class="layui-col-sm12 layui-col-md12">
                                <img class="layui-col-sm4 layui-col-md4 userHead"
                                    src="${ctx}/static/assets/images/user/user.jpg" alt="">
                                <div class="layui-col-sm4 layui-col-md8 cr-333 userInfo">
                                    <p>
                                        <span>用户名：</span>
                                        <span>${uphnoe}</span>
                                    </p>
                                
                                </div>
                            </div>

                        </div>
                        <div class="layui-col-sm12 layui-col-md12">
                            <div class="layui-col-sm12 layui-col-md6">
                                <div class="layui-col-sm12 layui-col-md12 mar-t-20" >
                                    <%-- <div class="layui-col-sm8 layui-col-md8 cr-666 tipsSt waringTips">
                                        <img class="pointer tipsIcon" src="${ctx}/static/assets/images/user/warning.png" alt=""
                                            style="padding:3px 0 0 0">
                                        <span class="tipsText">代办</span>
                                        <div class="tipsClick">
                                            <span><a href="javascript:parent.tabChange('${ctx}/role/info.html')">注册</a></span>
                                        </div>
                                    </div> --%>

                                </div>                              
                            </div>
                            <ul class="layui-col-sm12 layui-col-md6">
                                <li class="layui-col-xs12 layui-col-sm6 layui-col-md6 moduleLi">
                                    <div>
                                        <p>昨日请求量</p>
                                        <p id="lastdayreqnum">0</p>
                                    </div>
                                </li>
                                <li class="layui-col-xs12 layui-col-sm6 layui-col-md6 moduleLi">
                                    <div>
                                        <p>本月请求量</p>
                                        <p id="dayreqnum">0</p>
                                    </div>
                                </li>
                            </ul>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<%@ include file="footer.jsp"%>
<style>
        .userHome a:hover {
            color: #5973ff;
        }

        .certified .userHead {
            width: 120px;
        }

        .certified .userInfo {
            padding-left: 20px
        }

        .tipsIcon {
            width: 18px;
            position: absolute;
            padding: 2px 0 0 10px;
        }

        .certified .userInfo p {
            font-size: 16px;
            margin-top: 14px
        }


        /* 模块li start */
        .userHome .certified li div {
            height: 100px;
            color: #ffffff;
            text-align: center;
        }

        .userHome .certified li:first-child div {
            background: #58a3f7;
            margin: 0;
        }

        .userHome .certified li:nth-child(2) div {
            background: #fec03d;
        }

        .userHome .certified li:nth-child(3) div {
            background: #fb6160;
        }

        .userHome .certified li:last-child div {
            background: #52c1f5;
        }

        .userHome .certified li p:first-child {
            font-size: 16px;
            padding: 22px 0 5px 0;
        }

        .userHome .certified li p:last-child {
            font-size: 30px;
        }

        .moduleLi.layui-col-xs12 {
            margin-top: 20px;
        }

        @media screen and (min-width: 768px) {
            .certified li:first-child {
                padding-right: 7.5px;
                margin-top: 20px !important;
            }

            .certified li:nth-child(2) {
                padding-left: 7.5px;
                margin-top: 20px !important;
            }

            .certified li:nth-child(3) {
                padding: 15px 7.5px 0 0;
                margin-top: 0 !important;
            }

            .certified li:last-child {
                padding: 15px 0 0 7.5px;
                margin-top: 0 !important;
            }
        }


        @media screen and (min-width: 992px) {
            .certified li:first-child {
                padding-right: 7.5px;
                margin-top: 15px !important;
            }

            .certified li:nth-child(2) {
                padding-left: 7.5px;
                margin-top: 15px !important;
            }

            .certified li:nth-child(3) {
                padding: 15px 7.5px 0 0;
                margin-top: 0px !important;
            }

            .certified li:last-child {
                padding: 15px 0 0 7.5px;
                margin-top: 0px !important;
            }
        }

        /* 模块li end */

        /* 提示 */
        .tipsSt {
            padding: 20px 20px 20px 55px;
            text-align: left;
            padding: 10px;
            line-height: 24px;
            font-size: 14px;
            border-radius: 5px;
        }

        .tipsSt .tipsClick {
            position: absolute;
            top: 10px;
            right: 20px;
            width: 125px;

        }

        .tipsSt .tipsClick span {
            cursor: pointer;

        }

        .tipsSt .tipsClick span a {
            color: #5973ff;
        }

        .tipsSt .tipsText {
            padding-left: 25px
        }

        .waringTips {
            background: #fff5e6;
            border: 1px solid #ffebcc;
        }

        .buleTips {
            background: #ebf5fe;
            border: 1px solid #d8edff;
        }
    </style>
</html>