<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>户外运动俱乐部管理系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="Shortcut icon" href="http://www.jq22.com/favicon.ico" />
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet" media="screen">
<!--[if lt IE 9]>
 	<script src="js/respond.min.js"></script> 
	<script src="js/html5shiv.min.js"></script>    
<![endif]-->
<link href="<%=basePath%>css/my.css" rel="stylesheet" media="screen">
<style>   
.m,.mn{margin-top:455px}.banner{height:404px}.nav-bg,.nav-bgn{top:455px}.banseo{top:126px}.ifbk{height:172px;overflow:hidden;}.ifbk iframe{width:200%;height:200%;background:white;border:0;overflow:hidden;-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box;-webkit-transform:scale(0.5);-webkit-transform-origin:top left;-moz-transform:scale(0.5);-moz-transform-origin:top left;-ms-transform:scale(0.5);-ms-transform-origin:top left;-o-transform:scale(0.5);-o-transform-origin:top left;transform:scale(0.5);transform-origin:top left;}.posts-nav .next a{background:#ffffff url(images/ico-pagination-arrow-next.png) no-repeat center;width:144px;height:53px;line-height:53px;}.navbar-inverse{background-color:#000;border-bottom:1px solid #212121;}.zhe{color:#262626;font-family:Vrinda}.wh{height:10px}
.banseo2{width:728px;height:15px;left:0;right:0;margin:auto;position:absolute;top:190px;border-radius:15px;z-index: 99;}.banseo{width:728px;}.bantxt{width:100%;height:60px;opacity:1;background-color:#eceff1;border-radius:5px;border:0px;padding-left:50px;color:#000}.banbutt{height:60px;width:173px;background-color:#ec4d1c;border:0px;color:#fff;border-top-left-radius:0px;border-bottom-left-radius:0px;transition:all .7s ease 0s;font-size:15px;background:-webkit-linear-gradient(top,#f4511e 0,#d84315 100%);background:linear-gradient(to bottom,#f4511e 0,#d84315 100%);}.banbutt:hover{background-color:#ed3800;background:-webkit-linear-gradient(top,#f03900 0,#bb2c00 100%);background:linear-gradient(to bottom,#f03900 0,#bb2c00 100%);}.seoicn{position:absolute;left:20px;bottom:-96px;color:#b0bec5;font-size:18px}.banjz{padding-bottom:20px;}input::-webkit-input-placeholder{color:#b0bec5;opacity:1;}@media screen and (max-width:770px){.banseo{width:85%;}.banbutt{width:123px}}
.bjtx {position:absolute;right:10px;bottom:10px;background-color: rgba(255,255,255,0.13);padding:3px;font-size: 12px;color:#656565;border-radius: 5px;cursor:pointer}
.banjz { padding-bottom: 40px; }.banseo { top: 126px; }.banseo2 { text-align: right }.banseo2 a { color: #fff ;opacity:.7}

.tcck{
  padding-top:0px;
}
</style>
<script>var n = 0;</script>
</head>

<body data-spy="scroll" data-target=".navbar-example">
<!--nav-->
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
       <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-logo" href="#"><img src="<%=basePath%>picture/logo.jpg" height="100%" alt="户外，你灵魂的家园"></a> </div>
    <div id="navbar" class="navbar-collapse collapse">
      
      <ul class="nav navbar-nav navbar-right">
      <!-- 登陆测试 -->
        
        <li ><a href="#zt"><i class="fa fa-code"></i> &nbsp;近期活动</a></li>
        <li ><a href="<%=basePath%>font_baoming.jsp"><i class="fa fa-balance-scale" aria-hidden="true"></i> &nbsp;活动报名及查看</a></li>
      	<li ><a href="#" data-toggle="modal" data-target="#mylinetypeModal"><i class="fa fa-download"></i> &nbsp;路线类型</a></li>
        <li><a href="#" data-toggle="modal" data-target="#mysafeModal"><i class="fa fa-ship" aria-hidden="true"></i> &nbsp;安全等级</a></li>
        <li><a href="#" data-toggle="modal" data-target="#myhetongModal"><i class="fa fa-book"></i> &nbsp;合同</a></li>
        <li class="dropdown"><a rel="nofollow" href="#" data-toggle="modal" data-target="#mystrongModal"><i class="fa fa-weibo"></i> &nbsp;强度等级</a></li>

        <c:if test="${empty sessionScope.user.hname}"> 
       
        <li id="deggf">
          <a  href="<%=basePath%>login.jsp">
            <i class="fa fa-code"></i> &nbsp;注册/登录<span class="sr-only">(current)</span></a>
    		
        </li>
        </c:if>
        <c:if test="${not empty sessionScope.user.hname}">
        <li ><a href="#"><i class="fa fa-user"></i> &nbsp;${sessionScope.user.hname}</a></li>
        <li id="deggf">
          <a  href="<%=basePath%>/login/loginout.action">
            <i class="fa fa-code"></i> &nbsp;注销登陆<span class="sr-only">(current)</span></a>
    		
        </li>
        </c:if>
      </ul>
      
    </div>
    <!--/.nav-collapse --> 
  </div>
</nav>
<!--end nav-->
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content2 tcc" >
         <div class="modal-header2 top20">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
               
            </h4>
         </div>
         <div class="modal-body tcck" style="padding-top:148px">     
            <div class="input-group input-group-lg parentCls">
              <span class="input-group-addon" id="email"><i class="fa fa-envelope-o"></i></span>                
              <input type="text" class="form-control inputElem" placeholder="请输入登录邮箱" aria-describedby="email" id="ema" style="width: 466px;">             
            </div>
            <div class="input-group input-group-lg top20">
              <span class="input-group-addon" id="pwd"><i class="fa fa-unlock-alt" style="width:18px"></i></span>
              <input type="password" class="form-control" placeholder="请输入登录密码" aria-describedby="pwd" id="pw">
              <span class="input-group-btn tccBut">
                <button class="btn btn-success" type="button" onclick="emdl()">登 录</button>
              </span>
            </div>          
         </div>
               
        <div class="modal-footer2">
            <div class="f">
            <a href="pwd.aspx">忘记密码?</a></div>
            <div class="r"><a href="register.aspx">注册新用户</a></div>
            <div class="dr"></div>
         </div>
         
         <div class="d3f modal-body tcck2">          
             <a href="#" onClick="tz()" class="qq"></a>
             <a href="https://api.weibo.com:443/oauth2/authorize?client_id=3364913104&redirect_uri=http%3A%2F%2Fwww.jq22.com%2FWeiboReturn.aspx&response_type=code&display=default" class="sina"></a>
             <a href="http://www.jq22.com/zfbReturn.aspx" class="zfb"></a>
             <a href="#" onClick="gt()" class="git"></a>
         </div>
        
         
      </div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>


<!-- 个人信息模块 -->
<div class="modal fade" id="mymessageModal" tabindex="-1" role="dialog" aria-labelledby="mymessageModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content2 tcc">
         <div class="modal-header2 top20">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="mymessageModalLabel">
               个<br>人<br>信<br>息
            </h4>
         </div>
        <div class="modal-body tcck" style="background-color:white;padding-top:20px"> 
             <form action="<%=basePath%>/login/membermessage.action" method="post">
            <div class="input-group input-group-lg parentCls" style="display:none">
              <span class="input-group-addon" id="email"><i class="fa fa-envelope-o"></i></span>                
              <input type="text" class="form-control inputElem" placeholder="id" name="hid" value="${sessionScope.user.hid}" aria-describedby="text" id="emhid" style="width: 466px;">             
            </div>
            
            <div class="input-group input-group-lg parentCls"  style="display:none">
              <span class="input-group-addon" id="email"><i class="fa fa-envelope-o"></i></span>                
              <input type="text" class="form-control inputElem" placeholder="等级" name="hlv" value="${sessionScope.user.hlv}" aria-describedby="text" id="emhlv" style="width: 466px;">             
            </div>
            
             <div class="input-group input-group-lg top20">
              <span class="input-group-addon" id="email"><i class="fa fa-envelope-o"></i></span>                
              <input type="text" class="form-control inputElem" placeholder="用户名" name="hname" value="${sessionScope.user.hname}" aria-describedby="text" id="emhname" style="width: 466px;">             
            </div>
             <div class="input-group input-group-lg top20">
              <span class="input-group-addon" id="pwd"><i class="fa fa-unlock-alt"></i></span>                
              <input type="password" class="form-control inputElem" placeholder="密码" name="hpwd" value="${sessionScope.user.hpwd}" aria-describedby="pwd" id="emhpwd" style="width: 466px;">             
            </div>
             <div class="input-group input-group-lg top20">
              <span class="input-group-addon" id="email"><i class="fa fa-envelope-o"></i></span>                
              <input type="text" class="form-control inputElem" placeholder="联系方式" name="hphonenumber" value="${sessionScope.user.hphonenumber}" aria-describedby="emhphonenumber" id="ema" style="width: 466px;">             
            </div>  
             <div class="input-group input-group-lg top20">
              <span class="input-group-addon" id="email"><i class="fa fa-envelope-o"></i></span>                
              <input type="text" class="form-control inputElem" placeholder="身份证号" name="hidcard" value="${sessionScope.user.hidcard}" aria-describedby="text" id="emhidcard" style="width: 466px;">             
            </div>  
            <div class="input-group input-group-lg  top20">
              <span class="input-group-addon" id="email"><i class="fa fa-envelope-o"></i></span>                
              <input type="text" class="form-control inputElem" placeholder="邮箱" name="hemail" value="${sessionScope.user.hemail}" aria-describedby="email" id="emhemail" style="width: 466px;">             
            </div>
            <div class="input-group input-group-lg top20">
              <span class="input-group-addon" id="pwd"><i class="fa fa-unlock-alt" style="width:18px"></i></span>
              <input type="password" class="form-control" placeholder="确认密码" value="${sessionScope.user.hpwd}" aria-describedby="pwd" id="emrpwd">

            </div> 
            <div class="input-group input-group-lg top20">
             
              <input type="submit" class="form-control"  value="提交修改信息" aria-describedby="pwd" id="emrpwd">

            </div>  
            </form>        
         </div>

      </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>

<!-- 个人信息模块模块 -->



<!-- 安全等级模块 -->
<div class="modal fade" id="mysafeModal" tabindex="-1" role="dialog" aria-labelledby="mysafeModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content2 tcc">
         <div class="modal-header2 top20">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="mysafeModalLabel">
               安<br>全<br>等<br>级
            </h4>
         </div>
        <div class="modal-body tcck " style="background-color:white"> 
          <div class="row">    
             <div class=" col-md-12 col-sm-3">
                   
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>高危险度</h4></a>
                        <small>非常规山地的活动，需要特殊户外技能的活动环境。不可预测和控制的因素多，经常有意外情况发生，行程长，强度大，自然条件艰苦，多次野营。需要参与者良好的心理素质、丰富的户外经验和较全面的户外技能和优良的团队精神。</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        A
                    </div>
                         
                </div> 
                 <div class=" col-md-12 col-sm-3">
                   
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>中危险度</h4></a>
                        <small>难度较大的常规山地活动，非常规山地的活动，强度较大的骑马、滑雪活动，未知领域的大强度探索穿越活动，需要特殊户外技能的活动环境。可能有意外情况发生，行程长，强度大，一般有多次野营。需要参与者有好的心理素质和团队意识，具有一定的户外活动经验和户外技能（如攀岩，急救等）</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        B
                    </div>
                          
                </div>
                 <div class=" col-md-12 col-sm-3">
                   
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>低危险度</h4></a>
                        <small>多数常规活动，如常规登山、攀岩、滑雪、骑马、游泳等。可能会有意外情况发生，行程中等，强度低，一般有1-3次野营。需要参与者有一般的生活常识和较好的心理素质 </small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        C
                    </div>
                          
                </div>
                 <div class=" col-md-12 col-sm-3">
                    
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>无危险度</h4></a>
                        <small>一般的休闲游，如旅游景点游玩，安全有充分保障的短期野外旅行，线路明了的短期常规山地攀登。无意外情况发生，行程短，强度低。对参与者没有什么特殊要求</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        D 
                    </div>
                        
                </div>  
                </div>   
         </div>

      </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>

<!-- 安全等级模块 -->

<!-- 强度等级模块 -->
<div class="modal fade" id="mystrongModal" tabindex="-1" role="dialog" aria-labelledby="mystrongModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content2 tcc">
         <div class="modal-header2 top20">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
             <h3 class="modal-title" id="mystrongModalLabel">
               强<br>度<br>等<br>级
            </h3>
         </div>
        <div class="modal-body tcck " style="background-color:white"> 
          <div class="row">    
             <div class=" col-md-12 col-sm-3">
                   
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>休闲强度</h4></a>
                        <small>一般的休闲游，如郊游聚餐等。行程短，一般不野营。不对参与者体能提出要求，一般穿旅游鞋（或运动鞋），背小双肩包，带水和食物即可</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        0
                    </div>
                         
                </div> 

                 <div class=" col-md-12 col-sm-3">
                   
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>中等强度</h4></a>
                        <small>数日的常规山地活动，日行程短（一般少于15公里山路），1-2次宿营。如：登云蒙山，爬司马台长城，攀岩，游泳，骑马，滑雪等。对参与者要求其身体健康，装备要求一般，背负重量15公斤以下（男性）</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        1
                    </div>
                         
                </div> 

                 <div class=" col-md-12 col-sm-3">
                   
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>高等强度</h4></a>
                        <small>多日的常规山地活动，多数非常规山地活动，日行程山路20公里以上，攀升高度大，以及竞技性活动，如自行车、登山比赛等。三夫俱乐部曾经举行的3天小五台连穿是典型的高强度活动。对参与者有较高的体能和装备要求，背负重量15公斤以上（男性）</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        2
                    </div>
                          
                </div>
                 <div class=" col-md-12 col-sm-3">
                    
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>极高强度</h4></a>
                        <small>极限环境下的连续活动，非常规山地活动，环境条件恶劣，疲劳度高，恢复期段，多日日平均行程20公里以上，背负重量高于15公斤（男性），如雪山攀登活动，连续多日的冰雪环境下的探险穿越活动等。</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        3 
                    </div>
                        
                </div>  
                </div>   
         </div>
         
      </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>

<!-- 强度等级模块 -->

<!-- 路线类型模块 -->
<div class="modal fade" id="mylinetypeModal" tabindex="-1" role="dialog" aria-labelledby="mylinetypeModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content2 tcc">
         <div class="modal-header2 top20" >
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h3  class="modal-title" id="mylinetypeModalLabel">
               路<br>线<br>类<br>型
            </h3>
         </div>
         <div class="modal-body tcck " style="background-color:white"> 
          <div class="row">    
             <div class=" col-md-12 col-sm-4">
                   
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>短途路线</h4></a>
                        <small>俱乐部的短途路线为1-2天，基本是业余领队常走的路线，这样的路线游走在较近的周边，基本为领略城市沿途风光，不会出行较远的地方，危险等级和强度等级较低，是周末出行的首选</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        short
                    </div>
                         
                </div> 
                 <div class=" col-md-12 col-sm-4">
                   
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>中途路线</h4></a>
                        <small>俱乐部的中途路线基本为5-10天左右，目的地基本出行为其他城市，从事的活动基本属于特殊爱好，如潜水，跳伞危险等级和强度等级不定，根据具体活动而定</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        middium
                    </div>
                          
                </div>
                 <div class=" col-md-12 col-sm-4">
                    
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>长途路线</h4></a>
                        <small>俱乐部的长途路线基本为10天以上，从事人基本为专业人员与科学考察人员，从事的活动基本为一些探险活动，如雪山登峰，洞穴探索等危险等级为高度，强度等级全部为3</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        long 
                    </div>
                        
                </div>  
                </div>   
         </div>
               
        <div class="modal-footer2">
            <div class="f">
            <a href="pwd.aspx">忘记密码?</a></div>
            <div class="r"><a href="register.aspx">注册新用户</a></div>
            <div class="dr"></div>
         </div>
      </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>

<!-- 路线类型模块 end-->

<!-- 合同模块 -->
<div class="modal fade" id="myhetongModal" tabindex="-1" role="dialog" aria-labelledby="myhetongModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content2 tcc">
         <div class="modal-header2 top20">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>

            <h4 class="modal-title" id="myhetongModalLabel">
               合<br>同<br>查<br>看
            </h4>
         </div>
       <div class="modal-body tcck " style="background-color:white"> 
          <div class="row">    
             <div class="col-md-12 col-sm-12">

                    <a href="#" target="_blank"><img src="<%=basePath%>picture/hetong1.png"></a>
                    <a href="#" target="_blank"><img src="<%=basePath%>picture/hetong2.png"></a>
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>合同模板</h4></a>
                        <small>以上仅供用户提前查看使用</small>                       
                    </div>       
                </div>
                
                </div>   
         </div>  
      </div><!-- /.modal-content -->
  </div><!-- /.modal -->
</div>

<!-- 合同模块 end-->
<div class="container-fluid banner banbk">
  <iframe src="<%=basePath%>jq224909.jsp" width="100%" height="100%"></iframe>
    <div class="banseo2">
         <a href="#" target="_blank" onclick="adtonji3()"> 户外直播 : 在线直播教学+课后录播视频</a>
        <script>function adtonji3() { $.post("adtongji.aspx", { name: "a3" }) }</script>
    </div>
	<div class="banseo">
        <div class="banjz">
          <span style="font-size:25px;color:white">户外，让生命回归自然</span><br>
          <span style="font-size:15px;color:white">极限，纯真，自然，生命，热情</span>
        </div>

    	<input type="text" class="bantxt" id="searchtxt" placeholder="输入想查询的内容.." onkeyup="autoComplete.start(event)"><button class="btn banbutt" type="button" id="seobut" ><i class="fa fa-chevron-circle-right"></i> 找寻你足迹</button><span class="seoicn"><i class="fa fa-search"></i></span>
    </div>
    
	<iframe class="baniframe"  sandbox="allow-scripts allow-same-origin" id="mh"></iframe>
   
</div>

<!--nav-->
<div class="yn jz container-fluid nav-bg m0" id="menu_wrap" >	
<div class="container m0" style="position:relative;"><a class="nzz" href="#zt" id="z1"><span class="sort"><i class="fa fa-paint-brush"></i>&nbsp;近期活动 <i class="fa fa-angle-down"></i></span></a>|<a class="nzz" href="#" id="z2"><span class="sort"><i class="fa fa-keyboard-o"></i>&nbsp;项目类型 <i class="fa fa-angle-down"></i></span></a>|<a class="nzz" href="#" id="z3" data-toggle="modal" data-target="#mylinetypeModal"><span class="sort"><i class="fa fa-film"></i>&nbsp;路线类型 <i class="fa fa-angle-down"></i></span></a>|<a class="nzz" href="#" data-toggle="modal" data-target="#mysafeModal" id="z4"><span class="sort "><i class="fa fa-paper-plane-o"></i>&nbsp;安全等级 <i class="fa fa-angle-down"></i></span></a><span class="navxs">|<a class="nzz" href="#" id="z5" data-toggle="modal" data-target="#mystrongModal"><span class="sort"><i class="fa fa-dropbox"></i>&nbsp;强度等级 <i class="fa fa-angle-down"></i></span></a></span><span class="navxs">|<a href="<%=basePath%>font_historyrecord.jsp"><span class="sort"><i class="fa fa-th-large"></i>&nbsp;活动记录</span></a>|<a href="#" data-toggle="modal" data-target="#mymessageModal"><span class="sort"><i class="fa fa-file-code-o"></i>&nbsp;个人信息</span></a></span></div>
<script>
    function adtonji2() { $.post("adtongji.aspx", { name: "a2" }) }
</script>
<div class="container-fluid"><div id="n1" class="nav-zi ty" style="display: none;"><ul id="nz1" class="nn list-inline container m0" style="display: none;"><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-delicious ls"></i>双城骑游</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-bell-o ls"></i>自驾西藏</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-sort-numeric-desc ls"></i>峻险莲花山</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-comments-o ls"></i>京西古道</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-stack-overflow ls"></i>探寻娲皇宫</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-hand-o-up ls"></i>七步沟滑雪</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-th-large ls"></i>坝上冬摄</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-bar-chart ls"></i>海南深潜</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-spinner ls"></i>海南伞降</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-circle-o ls"></i>深度江南</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-long-arrow-down ls"></i>漓江绕林峰</a></li></ul><ul id="nz2" class="nn list-inline container m0" style="display: none;"><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-eyedropper ls"></i>跳伞</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-paint-brush ls"></i>登山</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-clock-o ls"></i>徒步</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-arrows ls"></i>骑行</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-keyboard-o ls"></i>探穴</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-calculator ls"></i>漂流</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-lock ls"></i>滑雪</a></li><li><a class="c-btn c-btn--border-line" href="http://www.jq22.com/jquery-plugins投票率-1-jq"><i class="fa fa-thumbs-up ls"></i>冲浪</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-search ls"></i>采集花草</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-caret-square-o-down ls"></i>选择框</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-adn ls"></i>热气球</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-hand-o-down ls"></i>岩降</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-h-square ls"></i>水上摩托</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-upload ls"></i>荒岛生存</a></li><li><a class="c-btn c-btn--border-line" href="#"><i class="fa fa-key ls"></i>风帆</a></li></ul><ul id="nz3" class="nn list-inline container m0" style="display: none;"><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mylinetypeModal"><i class="fa fa-play-circle-o ls"></i>short</a></li><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mylinetypeModal"><i class="fa fa-exchange ls"></i>long</a></li><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mylinetypeModal"><i class="fa fa-eye ls"></i>middium</a></li></ul><ul id="nz4" class="nn list-inline container m0" style="display: none;"><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mysafeModal"><i class="fa fa-long-arrow-right ls"></i>A</a></li><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mysafeModal"><i class="fa fa-long-arrow-down ls"></i>B</a></li><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mysafeModal"><i class="fa fa-sitemap ls"></i>C</a></li><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mysafeModal"><i class="fa fa-chevron-right ls"></i>D</a></li></ul><ul id="nz5" class="nn list-inline container m0" style="display: none;"><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mystrongModal"><i class="fa fa-rocket ls"></i>0</a></li><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mystrongModal"><i class="fa fa-expand ls"></i>1</a></li><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mystrongModal"><i class="fa fa-arrows-v ls"></i>2</a></li><li><a class="c-btn c-btn--border-line" href="#" data-toggle="modal" data-target="#mystrongModal"><i class="fa fa-cogs ls"></i>3</a></li></ul></div></div>
 		   
</div>
<!--end nav-->
<!--主体-->
<div class="container-fluid m" id="zt">  
        <div class="container m0 bod">      
                <ol class="breadcrumb jjk20 z16 top10">
                  <li><b><i class="fa fa-code"></i> 近期活动</b> <span class="zhe">seletc you like!!!</span></li>
                </ol>

                <div class="col-lg-4 col-md-3 col-sm-4" > 
                   
                     <a href="#" target="_blank" onclick="adtonji6()">
                        <img src="<%=basePath%>picture/shuangcheng.jpg">
                        <div class="cover-info" style="background-color:#bcff72">
                            <h4>双城骑游</h4>
                            <small>从邯郸到邢台，从美女之都到七夕之乡，用清风，用单车领略沿途风光...</small>
                        </div>
                    </a>
                  <div class="cover-fields"><i class="fa fa-list-ul"></i> &nbsp;short D 2</div>
                  <div class="cover-stat">
                        <i class="fa fa-eye"></i><span class="f10"> &nbsp;15</span>
                        <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;0</span>
                        <div class="cover-yh">
                            <a href="mem613922" data-container="body" data-toggle="popover" data-placement="top" data-content="归零 ">
                                <i class="fa fa-user-secret"></i>
                            </a>
                        </div>
                    </div> 
                    <script>
                        function adtonji6() { $.post("adtongji.aspx", { name: "a6" }) }
                    </script>

                </div>

                
                <div class="col-lg-4 col-md-3 col-sm-4">
                    <a href="#" target="_blank"><img src="<%=basePath%>picture/zijia.jpg"></a>
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>自驾西藏（限邯郸）</h4></a>
                        <small>带上你的爱车，最好的朋友，抛弃你的老板，去放飞自己吧...</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        long B 3
                    </div>
                    <div class="cover-stat">
                        <i class="fa fa-eye"></i><span class="f10"> &nbsp;15</span>
                        <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;0</span>
                        <div class="cover-yh">
                            <a href="mem613922" data-container="body" data-toggle="popover" data-placement="top" data-content="报名参加">
                                <i class="fa fa-user-secret"></i>
                            </a>
                        </div>
                    </div>        
                </div>
                
                <div class="col-lg-4 col-md-3 col-sm-4">
                    <a href="#" target="_blank"><img src="<%=basePath%>picture/lianhua.jpg"></a>
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>峻险莲花山</h4></a>
                        <small>别说你爬过的山只有早高峰，不不不，晚高峰啊，午高峰啊，你该来这里在增加一座了...</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        long C 2
                    </div>
                    <div class="cover-stat">
                        <i class="fa fa-eye"></i><span class="f10"> &nbsp;147</span>
                        <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;4</span>
                        <div class="cover-yh">
                            <a href="mem149948" data-container="body" data-toggle="popover" data-placement="top" data-content="盛气凌人 ">
                                <i class="fa fa-user-secret"></i>
                            </a>
                        </div>
                    </div>        
                </div>
                
                <div class="col-lg-4 col-md-3 col-sm-4">
                    <a href="#" target="_blank"><img src="<%=basePath%>picture/shenqian.jpg"></a>
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>海南深潜</h4></a>
                        <small>远离陆地，贴近海洋，牵手鱼儿我们在这里等着你...</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        short A 3
                    </div>
                    <div class="cover-stat">
                        <i class="fa fa-eye"></i><span class="f10"> &nbsp;262</span>
                        <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;4</span>
                        <div class="cover-yh">
                            <a href="mem95348" data-container="body" data-toggle="popover" data-placement="top" data-content="拿破仑007 ">
                                <i class="fa fa-user-secret"></i>
                            </a>
                        </div>
                    </div>        
                </div>
                
                <div class="col-lg-4 col-md-3 col-sm-4">
                    <a href="#" target="_blank"><img src="<%=basePath%>picture/tiaosan.jpg"></a>
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>海南伞降</h4></a>
                        <small>不在是陆地，不在是海洋，是天空，是疾风划过脸盘的感觉...</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        short A 3   
                    </div>
                    <div class="cover-stat">
                        <i class="fa fa-eye"></i><span class="f10"> &nbsp;258</span>
                        <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;11</span>
                        <div class="cover-yh">
                            <a href="mem713504" data-container="body" data-toggle="popover" data-placement="top" data-content="dailc ">
                                <i class="fa fa-user-secret"></i>
                            </a>
                        </div>
                    </div>        
                </div>
                
                <div class="col-lg-4 col-md-3 col-sm-4">
                    <a href="#" target="_blank"><img src="<%=basePath%>picture/jiangnan.jpg"></a>
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>深度江南</h4></a>
                        <small>还以为殉情只是古老的传言，你走得有多痛痛有多浓，当梦被埋在江南烟雨中...</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        long D 0
                    </div>
                    <div class="cover-stat">
                        <i class="fa fa-eye"></i><span class="f10"> &nbsp;313</span>
                        <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;1</span>
                        <div class="cover-yh">
                            <a href="mem243947" data-container="body" data-toggle="popover" data-placement="top" data-content="豆豆天尊 ">
                                <i class="fa fa-user-secret"></i>
                            </a>
                        </div>
                    </div>        
                </div>
                
                <div class="col-lg-4 col-md-3 col-sm-4">
                    <a href="#" target="_blank"><img src="<%=basePath%>picture/dongshe.jpg"></a>
                    <div class="cover-info">
                        <a href="#" target="_blank"><h4>坝上冬摄</h4></a>
                        <small>以万物为伴,孤独的人不孤单!用相机记录身边的事物...</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        long B 3
                    </div>
                    <div class="cover-stat">
                        <i class="fa fa-eye"></i><span class="f10"> &nbsp;419</span>
                        <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;1</span>
                        <div class="cover-yh">
                            <a href="mem486803" data-container="body" data-toggle="popover" data-placement="top" data-content="宇泽天下，恋尽天涯！ ">
                                <i class="fa fa-user-secret"></i>
                            </a>
                        </div>
                    </div>        
                </div>
                
                <div class="col-lg-4 col-md-3 col-sm-4">
                    <a href="#" target="_blank"><img src="<%=basePath%>picture/lijiang.png"></a>
                    <div class="cover-info">
                        <a href="http://www.jq22.com/jquery-info17223" target="_blank"><h4>漓江绕林峰</h4></a>
                        <small>仁者乐山,智者乐水。仁者静,智者动...</small>                       
                    </div>  
                    <div class="cover-fields">
                        <i class="fa fa-list-ul"></i> &nbsp;
                        middium C 3
                    </div>
                    <div class="cover-stat">
                        <i class="fa fa-eye"></i><span class="f10"> &nbsp;660</span>
                        <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;6</span>
                        <div class="cover-yh">
                            <a href="mem331264" data-container="body" data-toggle="popover" data-placement="top" data-content="辉 ">
                                <i class="fa fa-user-secret"></i>
                            </a>
                        </div>
                    </div>        
                </div>
                         
                <div class="posts-nav-wrap" style="margin-bottom:30px">
        	        <ul class="posts-nav">          	                      
                        <li class="next"><a href="jq1-jq" class="next">←</a></li>
                    </ul>
                </div>    
            <ol class="breadcrumb jjk20 z16">
              <li><b><i class="fa fa-code"></i> 本地近期活动</b> <span class="zhe">Select like you</span></li>
            </ol>

              <div class="col-lg-4 col-md-3 col-sm-4">
    <div class="ifbk" style="height:218px;position:relative; ">
        <a style="display:block" onclick="adtonji5()">
            <div style=" position:absolute; top:0px; left:0px; height:100%; width:100%;z-index:88;"> </div>
        </a>
        <iframe scrolling="no" sandbox="allow-scripts allow-same-origin" src="<%=basePath%>picture/handan.jpg"></iframe>
    </div>
    <div class="cover-info" style="height:10px"> <small><i class="fa fa-list-ul"></i> &nbsp;all all all</small> </div>
    <div class="cover-stat" style="text-align: center; font-weight: bold;  "> 情系邯郸 </div>
</div>
<script>
	function adtonji5() { $.post("adtongji.aspx", { name: "a5" }) }
</script>
	                <div class="col-lg-4 col-md-3 col-sm-4">
                                <div class="ifbk"> 
                                    <iframe scrolling="no" sandbox="allow-scripts allow-same-origin" src="<%=basePath%>picture/qibugou.jpg"></iframe>          
                                </div>
                                <div class="cover-info">
                                    <a href="code1396" target="_blank"><h4>七步沟滑雪</h4></a>
                                    <small>领略北国风雪之景色，踏皑皑白色浪花...</small>                       
                                </div>  
                        
                                <div class="cover-stat">
                                    <i class="fa fa-eye"></i><span class="f10"> &nbsp;187</span>     
                                    <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;6</span>                    
                                </div>        
                        </div>
                    
	                <div class="col-lg-4 col-md-3 col-sm-4">
                                <div class="ifbk"> 
                                    <iframe scrolling="no" sandbox="allow-scripts allow-same-origin" src="<%=basePath%>picture/wahuanggong.jpg"></iframe>          
                                </div>
                                <div class="cover-info">
                                    <a href="code1395" target="_blank"><h4>探寻娲皇宫</h4></a>
                                    <small>追寻华夏文明，探寻人类始祖...</small>                       
                                </div>  
                        
                                <div class="cover-stat">
                                    <i class="fa fa-eye"></i><span class="f10"> &nbsp;166</span>     
                                    <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;0</span>                    
                                </div>        
                        </div>
                    
	                <div class="col-lg-4 col-md-3 col-sm-4">
                                <div class="ifbk"> 
                                    <iframe scrolling="no" sandbox="allow-scripts allow-same-origin" src="<%=basePath%>picture/guangfu.jpg"></iframe>          
                                </div>
                                <div class="cover-info">
                                    <a href="code1394" target="_blank"><h4>广府骑行</h4></a>
                                    <small>走，骑行，去广府...</small>                       
                                </div>  
                        
                                <div class="cover-stat">
                                    <i class="fa fa-eye"></i><span class="f10"> &nbsp;148</span>     
                                    <i class="fa fa-heart"></i></i><span class="f10"> &nbsp;1</span>                    
                                </div>        
                        </div>
    </div>    
</div>
<!--end主体-->
<div class="auto_hidden" id="tauto"></div>
<script src="<%=basePath%>js/jquery.min.js"></script>
<script src="<%=basePath%>js/bootstrap.min.js"></script>
<script type="text/javascript">
$("#seobut").click(function () { var seo = $("#searchtxt").val(); if (seo.length > 1) { window.location.href = "search?seo=" + seo } }); $('#searchtxt').bind('keypress', function (event) { if (event.keyCode == "13") { var seo = $("#searchtxt").val(); if (seo.length > 1) { window.location.href = "search?seo=" + seo } } });
if (window.location.href == "#") { window.location.href = "#"; }
</script>
<script type="text/javascript" src="<%=basePath%>js/m.js" charset="gbk"></script>
 <script src="<%=basePath%>js/bbau.js"></script>
<script type="text/javascript" src="<%=basePath%>js/audate.js"></script>
<nav class="foot navbar-inverse navbar-fixed-bottom">
	<ul class="list-inline">
      <li class="footer-ss"><a href="#">版权声明</a></li>
      <li class="footer-ss"><a href="#">在线反馈</a></li>
      <li class="footer-ss"><a href="#">广告合作</a></li>
      <li class="footer-ss"><a href="#">帮助中心</a></li>

    
      
    </ul>
    <ul class="list-inline text-right">
   	 	<li >               
    	</li>
    </ul>
</nav>

<script>
    var _hmt = _hmt || [];
    (function () {
        var hm = document.createElement("script");
        hm.src = "//hm.baidu.com/hm.js?b3a3fc356d0af38b811a0ef8d50716b8";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
<!-- <script>
      $(function(){
    	  
    	  alert($.session.user!=null);
    	  if(true){
    		  
    		  $("#deggf").css('display','none');
    	  }
    	  
      })
      
      </script> -->
 	

</body>
</html>