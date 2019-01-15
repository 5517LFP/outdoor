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
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="Shortcut icon" href="http://www.jq22.com/favicon.ico" />
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet" media="screen">
<link rel="stylesheet" href="<%=basePath%>assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/font-awesome.min.css" />
		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="<%=basePath%>assets/css/jquery-ui.min.css" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/datepicker.css" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/ui.jqgrid.css" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/ace-fonts.css" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/ace.min.css" id="main-ace-style" />
		<!--[if lte IE 9]>
			<link rel="stylesheet" href="<%=basePath%>assets/css/ace-part2.min.css" />
		<![endif]-->
		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="<%=basePath%>assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="<%=basePath%>assets/js/ace-extra.min.js"></script>
		<!--[if lte IE 8]>
		<script src="<%=basePath%>assets/js/html5shiv.min.js"></script>
		<script src="<%=basePath%>assets/js/respond.min.js"></script>
		<![endif]-->
<!--[if lt IE 9]>
 	<script src="js/respond.min.js"></script> 
	<script src="js/html5shiv.min.js"></script>    
<![endif]-->
<link href="<%=basePath%>css/my.css" rel="stylesheet" media="screen">
<style>   
.m,.mn{margin-top:56px}.banner{height:404px}.nav-bg,.nav-bgn{top:455px}.banseo{top:126px}.ifbk{height:172px;overflow:hidden;}.ifbk iframe{width:200%;height:200%;background:white;border:0;overflow:hidden;-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box;-webkit-transform:scale(0.5);-webkit-transform-origin:top left;-moz-transform:scale(0.5);-moz-transform-origin:top left;-ms-transform:scale(0.5);-ms-transform-origin:top left;-o-transform:scale(0.5);-o-transform-origin:top left;transform:scale(0.5);transform-origin:top left;}.posts-nav .next a{background:#ffffff url(images/ico-pagination-arrow-next.png) no-repeat center;width:144px;height:53px;line-height:53px;}.navbar-inverse{background-color:#000;border-bottom:1px solid #212121;}.zhe{color:#262626;font-family:Vrinda}.wh{height:10px}
.banseo2{width:728px;height:15px;left:0;right:0;margin:auto;position:absolute;top:190px;border-radius:15px;z-index: 99;}.banseo{width:728px;}.bantxt{width:100%;height:60px;opacity:1;background-color:#eceff1;border-radius:5px;border:0px;padding-left:50px;color:#000}.banbutt{height:60px;width:173px;background-color:#ec4d1c;border:0px;color:#fff;border-top-left-radius:0px;border-bottom-left-radius:0px;transition:all .7s ease 0s;font-size:15px;background:-webkit-linear-gradient(top,#f4511e 0,#d84315 100%);background:linear-gradient(to bottom,#f4511e 0,#d84315 100%);}.banbutt:hover{background-color:#ed3800;background:-webkit-linear-gradient(top,#f03900 0,#bb2c00 100%);background:linear-gradient(to bottom,#f03900 0,#bb2c00 100%);}.seoicn{position:absolute;left:20px;bottom:-96px;color:#b0bec5;font-size:18px}.banjz{padding-bottom:20px;}input::-webkit-input-placeholder{color:#b0bec5;opacity:1;}@media screen and (max-width:770px){.banseo{width:85%;}.banbutt{width:123px}}
.bjtx {position:absolute;right:10px;bottom:10px;background-color: rgba(255,255,255,0.13);padding:3px;font-size: 12px;color:#656565;border-radius: 5px;cursor:pointer}
.banjz { padding-bottom: 40px; }.banseo { top: 126px; }.banseo2 { text-align: right }.banseo2 a { color: #fff ;opacity:.7}

.tcck{
  padding-top:0px;
}
.ui-jqgrid-view>.ui-jqgrid-titlebar{
background-color:black;
}
.ui-jqgrid tr.jqgrow td{
height:46px;
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
      <a class="navbar-logo" href="<%=basePath%>login/jumpfont_index.action"><img src="<%=basePath%>picture/logo.jpg" height="100%" alt="户外，你灵魂的家园"></a> </div>
    <div id="navbar" class="navbar-collapse collapse">
      
      <ul class="nav navbar-nav navbar-right">
      <!-- 登陆测试 -->
        
   

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
<!--主体-->
<div class="container-fluid m" id="zt">  
      	<div class="page-content">

					<div class="page-content-area">

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<div class="well well-sm">
									<button type="button" class="close line-height-0" data-dismiss="alert">
										<i class="ace-icon fa fa-times smaller-75"></i>
									</button>
									活动记录表
									<i class="fa fa-external-link bigger-110"></i>
								</div>

								<table id="grid-table"></table>

								<div id="grid-pager"></div>

							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content-area -->
				</div><!-- /.page-content -->

              
     
</div>
<!--end主体-->
<div class="auto_hidden" id="tauto"></div>
<script src="<%=basePath%>js/jquery.min.js"></script>
<script src="<%=basePath%>js/bootstrap.min.js"></script>
<script type="text/javascript">
$("#seobut").click(function () { var seo = $("#searchtxt").val(); if (seo.length > 1) { window.location.href = "search?seo=" + seo } }); $('#searchtxt').bind('keypress', function (event) { if (event.keyCode == "13") { var seo = $("#searchtxt").val(); if (seo.length > 1) { window.location.href = "search?seo=" + seo } } });
if (window.location.href == "http://jq22.com/") { window.location.href = "http://www.jq22.com/"; }
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
 	
	<script type="text/javascript">
				window.jQuery || document.write("<script src='<%=basePath%>assets/js/jquery.min.js'>"+"<"+"/script>");
			</script>
		<!-- <![endif]-->
		<!--[if IE]>
			<script type="text/javascript">
			 window.jQuery || document.write("<script src='<%=basePath%>assets/js/jquery1x.min.js'>"+"<"+"/script>");
			</script>
		<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='<%=basePath%>assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="<%=basePath%>assets/js/bootstrap.min.js"></script>
		<!--[if lte IE 8]>
		  <script src="<%=basePath%>assets/js/excanvas.min.js"></script>
		<![endif]-->
				<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='<%=basePath%>assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="<%=basePath%>assets/js/bootstrap.min.js"></script>

		<!-- page specific plugin scripts -->
		<script src="<%=basePath%>assets/js/date-time/bootstrap-datepicker.min.js"></script>
		<script src="<%=basePath%>assets/js/jqGrid/jquery.jqGrid.min.js"></script>
		<script src="<%=basePath%>assets/js/jqGrid/i18n/grid.locale-en.js"></script>

		<!-- ace scripts -->
		<script src="<%=basePath%>assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath%>assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			var subgrid_data = 
			[
			{id:"黄飞鸿", name:"120150", qty: 34},
			{id:"黄飞鸿", name:"120150", qty: 34},
			{id:"黄飞鸿", name:"120150", qty: 34},
			{id:"黄飞鸿", name:"120150", qty: 34},
			{id:"黄飞鸿", name:"120150", qty: 34},
			{id:"黄飞鸿", name:"120150", qty: 34},
			{id:"黄飞鸿", name:"120150", qty: 34},
			{id:"黄飞鸿", name:"120150", qty: 34}
			];
			
			jQuery(function($) {
				var grid_selector = "#grid-table";
				var pager_selector = "#grid-pager";
				
				//resize to fit page size
				$(window).on('resize.jqGrid', function () {
					$(grid_selector).jqGrid( 'setGridWidth', $(".page-content").width() );
			    })
				//resize on sidebar collapse/expand
				var parent_column = $(grid_selector).closest('[class*="col-"]');
				$(document).on('settings.ace.jqGrid' , function(ev, event_name, collapsed) {
					if( event_name === 'sidebar_collapsed' || event_name === 'main_container_fixed' ) {
						//setTimeout is for webkit only to give time for DOM changes and then redraw!!!
						setTimeout(function() {
							$(grid_selector).jqGrid( 'setGridWidth', parent_column.width() );
						}, 0);
					}
			    })
			
			
			
				jQuery(grid_selector).jqGrid({
					//direction: "rtl",
					 url : '${pageContext.request.contextPath}/memberecord/selectmemrecordlist.action?zy=${sessionScope.user.hname}', 
			
					//subgrid options
					subGrid : false,
					//subGridModel: [{ name : ['No','Item Name','Qty'], width : [55,200,80] }],
					//datatype: "xml",
					subGridOptions : {
						plusicon : "ace-icon fa fa-plus center bigger-110 blue",
						minusicon  : "ace-icon fa fa-minus center bigger-110 blue",
						openicon : "ace-icon fa fa-chevron-right center orange"
					},
					//for this example we are using local data
					subGridRowExpanded: function (subgridDivId, rowId) {
						var subgridTableId = subgridDivId + "_t";
						$("#" + subgridDivId).html("<table id='" + subgridTableId + "'></table>");
						$("#" + subgridTableId).jqGrid({
							datatype: 'local',
							data: subgrid_data,
							colNames: ['No','Item Name','Qty'],
							colModel: [
								{ name: 'id', width: 50 },
								{ name: 'name', width: 150 },
								{ name: 'qty', width: 50 }
							]
						});
					},
					
			
			
					//data: grid_data,
					datatype: "json",
					/* jsonReader : {  
				        root : "formList", // json中代表实际模型数据的入口  
				        records : "records", // json中代表数据行总数的数据  
				        page : "page", // json中代表当前页码的数据  
				        total : "total", // json中代表页码总数的数据  
				        repeatitems : false  
				    },  */ 
					height: 300,
					colNames:[' ',' ',' ','活动名称','路线名称','项目名称', ' ', '会员名称'],
					colModel:[
						{name:'id',index:'', width:80, fixed:true, sortable:false, resize:false,hidden:true,
							formatter:'actions', 
							formatoptions:{ 
								keys:true,
								//delbutton: false,//disable delete button
								
								delOptions:{recreateForm: true, beforeShowForm:beforeDeleteCallback},
								//editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}
							}
						},
						{name:'maid',index:'maid', width:60, sorttype:"int", editable: true,key:true,hidden:true},
						{name:'aid',index:'aid',width:90, editable:true,hidden:true},
						{name:'aname',index:'aname', width:150,editable: true,edittype:'select',editoptions:{value:gettypes()}},
						{name:'alinename',index:'alinename', width:70},
						{name:'aproject',index:'aproject', width:90},
						{name:'mid',index:'mid', width:150, sortable:false,editable:true,hidden:true},
						{name:'mname',index:'mname', width:90, editable: true,edittype:'select',editoptions:{value:gettypess()}}
					], 
			
					viewrecords : false,
					rowNum:10,
					rowList:[10,20,30],
					pager : pager_selector,
					altRows: false,
					//toppager: true,
					
					multiselect: false,
					//multikey: "ctrlKey",
			        multiboxonly: true,
			
					loadComplete : function() {
						var table = this;
						setTimeout(function(){
							styleCheckbox(table);
							
							updateActionIcons(table);
							updatePagerIcons(table);
							enableTooltips(table);
						}, 0);
					},
			
					editurl: "${pageContext.request.contextPath}/memberecord/memrecordupdate.action",//nothing is saved
					caption: "活动记录表"
				});
				$(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size
				
			
				//switch element when editing inline
				function aceSwitch( cellvalue, options, cell ) {
					setTimeout(function(){
						$(cell) .find('input[type=checkbox]')
							.addClass('ace ace-switch ace-switch-5')
							.after('<span class="lbl"></span>');
					}, 0);
				}
				//enable datepicker
				function pickDate( cellvalue, options, cell ) {
					setTimeout(function(){
						$(cell) .find('input[type=text]')
								.datepicker({format:'yyyy-mm-dd' , autoclose:true}); 
					}, 0);
				}
			
			
				//navButtons
				jQuery(grid_selector).jqGrid('navGrid',pager_selector,
					{ 	//navbar options
						edit: true,
						editicon : 'ace-icon fa fa-pencil blue',
						add: true,
						addicon : 'ace-icon fa fa-plus-circle purple',
						del: true,
						delicon : 'ace-icon fa fa-trash-o red',
						search: true,
						searchicon : 'ace-icon fa fa-search orange',
						refresh: true,
						refreshicon : 'ace-icon fa fa-refresh green',
						view: true,
						viewicon : 'ace-icon fa fa-search-plus grey',
					},
					{
						//edit record form
						//closeAfterEdit: true,
						//width: 700,
						recreateForm: true,
						beforeShowForm : function(e) {
							var form = $(e[0]);
							form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
							style_edit_form(form);
						}
					},
					{
						//new record form
						//width: 700,
						closeAfterAdd: true,
						recreateForm: true,
						viewPagerButtons: false,
						beforeShowForm : function(e) {
							var form = $(e[0]);
							form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')
							.wrapInner('<div class="widget-header" />')
							style_edit_form(form);
						}
					},
					{
						//delete record form
						recreateForm: true,
						beforeShowForm : function(e) {
							var form = $(e[0]);
							if(form.data('styled')) return false;
							
							form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
							style_delete_form(form);
							
							form.data('styled', true);
						},
						onClick : function(e) {
							alert(1);
						}
					},
					{
						//search form
						recreateForm: true,
						afterShowSearch: function(e){
							var form = $(e[0]);
							form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
							style_search_form(form);
						},
						afterRedraw: function(){
							style_search_filters($(this));
						}
						,
						multipleSearch: true,
						/**
						multipleGroup:true,
						showQuery: true
						*/
					},
					{
						//view record form
						recreateForm: true,
						beforeShowForm: function(e){
							var form = $(e[0]);
							form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
						}
					}
				)
			
			
				
				function style_edit_form(form) {
					//enable datepicker on "sdate" field and switches for "stock" field
					form.find('input[name=sdate]').datepicker({format:'yyyy-mm-dd' , autoclose:true})
						.end().find('input[name=stock]')
							.addClass('ace ace-switch ace-switch-5').after('<span class="lbl"></span>');
							   //don't wrap inside a label element, the checkbox value won't be submitted (POST'ed)
							  //.addClass('ace ace-switch ace-switch-5').wrap('<label class="inline" />').after('<span class="lbl"></span>');
			
					//update buttons classes
					var buttons = form.next().find('.EditButton .fm-button');
					buttons.addClass('btn btn-sm').find('[class*="-icon"]').hide();//ui-icon, s-icon
					buttons.eq(0).addClass('btn-primary').prepend('<i class="ace-icon fa fa-check"></i>');
					buttons.eq(1).prepend('<i class="ace-icon fa fa-times"></i>')
					
					buttons = form.next().find('.navButton a');
					buttons.find('.ui-icon').hide();
					buttons.eq(0).append('<i class="ace-icon fa fa-chevron-left"></i>');
					buttons.eq(1).append('<i class="ace-icon fa fa-chevron-right"></i>');		
				}
			
				function style_delete_form(form) {
					var buttons = form.next().find('.EditButton .fm-button');
					buttons.addClass('btn btn-sm btn-white btn-round').find('[class*="-icon"]').hide();//ui-icon, s-icon
					buttons.eq(0).addClass('btn-danger').prepend('<i class="ace-icon fa fa-trash-o"></i>');
					buttons.eq(1).addClass('btn-default').prepend('<i class="ace-icon fa fa-times"></i>')
				}
				
				function style_search_filters(form) {
					form.find('.delete-rule').val('X');
					form.find('.add-rule').addClass('btn btn-xs btn-primary');
					form.find('.add-group').addClass('btn btn-xs btn-success');
					form.find('.delete-group').addClass('btn btn-xs btn-danger');
				}
				function style_search_form(form) {
					var dialog = form.closest('.ui-jqdialog');
					var buttons = dialog.find('.EditTable')
					buttons.find('.EditButton a[id*="_reset"]').addClass('btn btn-sm btn-info').find('.ui-icon').attr('class', 'ace-icon fa fa-retweet');
					buttons.find('.EditButton a[id*="_query"]').addClass('btn btn-sm btn-inverse').find('.ui-icon').attr('class', 'ace-icon fa fa-comment-o');
					buttons.find('.EditButton a[id*="_search"]').addClass('btn btn-sm btn-purple').find('.ui-icon').attr('class', 'ace-icon fa fa-search');
				}
				
				function beforeDeleteCallback(e) {
					var form = $(e[0]);
					if(form.data('styled')) return false;
					
					form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
					style_delete_form(form);
					
					form.data('styled', true);
				}
				
				function beforeEditCallback(e) {
					var form = $(e[0]);
					form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
					style_edit_form(form);
				}
				
				//select活动 动态添加
				function gettypes(){

					//动态生成select内容

					var str="";

					$.ajax({

					type:"post",
					dataType:"json",

					async:false,

					url:"${pageContext.request.contextPath}/active/activelist.action",

					success:function(data){
						

					if (data != null) {

					        var jsonobj=eval(data);

					        var length=jsonobj.length;

					        for(var i=0;i<length;i++){

					            if(i!=length-1){

					             str+=jsonobj[i].aname+":"+jsonobj[i].aname+";";

					            }else{

					               str+=jsonobj[i].aname+":"+jsonobj[i].aname;

					            }

					         }   

					                //$.each(jsonobj, function(i){

					                 //str+="personType:"+jsonobj[i].personType+";"

					        //$("<option value='" + jsonobj[i].personType + "'>" + jsonobj[i].personType+ "</option>").appendTo(typeselect);

					        //});

					     }

					           

					}

					});

					 return str;

					    }
				//select 活动动态添加结束
				
				//select会员 动态添加
				function gettypess(){

					//动态生成select内容

					var str="";

					$.ajax({

					type:"post",
					dataType:"json",

					async:false,

					url:"${pageContext.request.contextPath}/member/memberlist.action",

					success:function(data){
						

					if (data != null) {

					        var jsonobj=eval(data);

					        var length=jsonobj.length;

					        for(var i=0;i<length;i++){

					            if(i!=length-1){

					             str+=jsonobj[i].hname+":"+jsonobj[i].hname+";";

					            }else{

					               str+=jsonobj[i].hname+":"+jsonobj[i].hname;

					            }

					         }   

					                //$.each(jsonobj, function(i){

					                 //str+="personType:"+jsonobj[i].personType+";"

					        //$("<option value='" + jsonobj[i].personType + "'>" + jsonobj[i].personType+ "</option>").appendTo(typeselect);

					        //});

					     }

					           

					}

					});

					 return str;

					    }
				//select 会员动态添加结束
			
			
			
				//it causes some flicker when reloading or navigating grid
				//it may be possible to have some custom formatter to do this as the grid is being created to prevent this
				//or go back to default browser checkbox styles for the grid
				function styleCheckbox(table) {
				/**
					$(table).find('input:checkbox').addClass('ace')
					.wrap('<label />')
					.after('<span class="lbl align-top" />')
			
			
					$('.ui-jqgrid-labels th[id*="_cb"]:first-child')
					.find('input.cbox[type=checkbox]').addClass('ace')
					.wrap('<label />').after('<span class="lbl align-top" />');
				*/
				}
				
			
				//unlike navButtons icons, action icons in rows seem to be hard-coded
				//you can change them like this in here if you want
				function updateActionIcons(table) {
					/**
					var replacement = 
					{
						'ui-ace-icon fa fa-pencil' : 'ace-icon fa fa-pencil blue',
						'ui-ace-icon fa fa-trash-o' : 'ace-icon fa fa-trash-o red',
						'ui-icon-disk' : 'ace-icon fa fa-check green',
						'ui-icon-cancel' : 'ace-icon fa fa-times red'
					};
					$(table).find('.ui-pg-div span.ui-icon').each(function(){
						var icon = $(this);
						var $class = $.trim(icon.attr('class').replace('ui-icon', ''));
						if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
					})
					*/
				}
				
				//replace icons with FontAwesome icons like above
				function updatePagerIcons(table) {
					var replacement = 
					{
						'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',
						'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',
						'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',
						'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'
					};
					$('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon').each(function(){
						var icon = $(this);
						var $class = $.trim(icon.attr('class').replace('ui-icon', ''));
						
						if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
					})
				}
			
				function enableTooltips(table) {
					$('.navtable .ui-pg-button').tooltip({container:'body'});
					$(table).find('.ui-pg-div').tooltip({container:'body'});
				}
			
				//var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');
			
				$(document).on('ajaxloadstart', function(e) {
					$(grid_selector).jqGrid('GridUnload');
					$('.ui-jqdialog').remove();
				});
			});
		</script>
</body>
</html>