<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>Document</title>
		<meta name="description" content="Restyling jQuery UI Widgets and Elements" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
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
	</head>
	

	<body class="login-layout blur-login">
		<div class="main-container">
			<div class="main-content">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1">
						<div class="login-container">
							<div class="center">
								<h1>
									<span class="white">户外运动俱乐部管理系统</span>
								</h1>
							</div>

							<div class="space-6"></div>

							<div class="position-relative">
								<div id="login-box" class="login-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header blue lighter bigger">
												<i class="ace-icon fa fa-coffee green"></i>
												输入登录信息<span style="font-size:12px;color:red">${error}</span>
											</h4>

											<div class="space-6"></div>

											<form action="<%=basePath%>/login/login.action" method="post">
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" name="username" class="form-control" placeholder="用户名" />
															<i class="ace-icon fa fa-user"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" name="pwd" class="form-control" placeholder="密码" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
													</label>

													<div class="space"></div>

													<div class="clearfix">
														<label class="inline">
															<input type="radio" name="status" value="adminstatus" class="ace" />
										
															<span class="lbl"> 管理员</span>
														</label><br>
														
														<label class="inline">
															<input type="radio" name="status" value="staffstatus" class="ace" />
										
															<span class="lbl"> 员工</span>
														</label><br>
														<label class="inline">
															<input type="radio" name="status" value="memberstatus" checked class="ace" />
										
															<span class="lbl"> 会员</span>
														</label>

														<div  class="width-35 pull-right btn btn-sm btn-primary">
															<i class="ace-icon fa fa-key"></i><br>
															<span class="bigger-110">
																<input type="submit" class="form-control" value="登陆" >
															</span>
															
														</div>
													</div>

													<div class="space-4"></div>
												</fieldset>
											</form>

										</div><!-- /.widget-main -->

										<div class="toolbar clearfix">
											<div>
												<a href="#" data-target="#forgot-box" class="forgot-password-link">
													<i class="ace-icon fa fa-arrow-left"></i>
													忘记密码
												</a>
											</div>

											<div>
												<a href="#" data-target="#signup-box" class="user-signup-link">
													用户注册
													<i class="ace-icon fa fa-arrow-right"></i>
												</a>
											</div>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.login-box -->

								<div id="forgot-box" class="forgot-box widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header red lighter bigger">
												<i class="ace-icon fa fa-key"></i>
												重置密码
											</h4>

											<div class="space-6"></div>
											<p>
												输入您注册时候的email，用以接收密码重置信息
											</p>

											<form>
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="email" class="form-control" placeholder="Email" />
															<i class="ace-icon fa fa-envelope"></i>
														</span>
													</label>

													<div class="clearfix">
														<button type="button" class="width-35 pull-right btn btn-sm btn-danger">
															<i class="ace-icon fa fa-lightbulb-o"></i>
															<span class="bigger-110">发送!</span>
														</button>
													</div>
												</fieldset>
											</form>
										</div><!-- /.widget-main -->

										<div class="toolbar center">
											<a href="#" data-target="#login-box" class="back-to-login-link">
												返回登录
												<i class="ace-icon fa fa-arrow-right"></i>
											</a>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.forgot-box -->

								<div id="signup-box" class="signup-box widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header green lighter bigger">
												<i class="ace-icon fa fa-users blue"></i>
												新用户注册
											</h4>

											<div class="space-6"></div>
											<p> 输入详细信息: </p>

											<form  action="<%=basePath%>/login/zhuce.action" method="post" onsubmit="return run()">
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="email" name="email" id="emailId" class="form-control" placeholder="Email" />
															<i class="ace-icon fa fa-envelope"></i>
															<span id="espan"></span>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" name="username"  id="nameId" class="form-control" placeholder="用户名" />
															<i class="ace-icon fa fa-user"></i>
															<span id="uspan"></span>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" name="pwd" id="pwdId" class="form-control" placeholder="密码" />
															<i class="ace-icon fa fa-lock"></i>
															<span id="pspan"></span>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" name="rpwd" id="repwdId" class="form-control" placeholder="确认密码" />
															<i class="ace-icon fa fa-lock"></i>
															<span id="repspan"></span>
														</span>
													</label>
													
													

													<label class="block">
														<input type="checkbox" class="ace" />
														<span class="lbl">
															我接受
															<a href="#">用户协议</a>
														</span>
													</label>

													<div class="space-24"></div>

													<div class="clearfix">
														<button type="reset" class="width-30 pull-left btn btn-sm">
															<i class="ace-icon fa fa-refresh"></i>
															<span class="bigger-110">重置</span>
														</button>

														<div  class="width-65 pull-right btn btn-sm btn-success">
															
															<input type="submit" value="注册" class="form-control" style="background-color:#87b87f;border:0">

															<i class="ace-icon fa fa-arrow-right icon-on-right"></i>
														</div>
														<script type="text/javascript">  
													        //简单的前台校验，还有后台校验  
													        //run1 姓名提示  
													        function run1(){  
													            var uspan = document.getElementById("uspan");  
													            uspan.innerHTML = "不能输入特殊字符";  
													        }  
													        //表单校验，必须有返回值 run  
													        function run(){  
													        	//邮箱检验  
													            var email = document.getElementById("emailId").value;  
													            if( !/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(email) ){  
													                var repspan = document.getElementById("espan");  
													                espan.innerHTML = "邮箱格式不正确！";  
													                return false;  
													            }else{
													            	var repspan = document.getElementById("espan");  
													                espan.innerHTML = "";
													            }  
													            //校验姓名 ，不能为空  
													            var username = document.getElementById("nameId").value;  
													            if(username == "" || username.length == 0){  
													                var uspan = document.getElementById("uspan");  
													                uspan.innerHTML = "用户名不能为空";  
													                return false;  
													            }else{
													            	var uspan = document.getElementById("uspan");  
													                uspan.innerHTML = ""; 
													            }  
													            //校验密码格式  
													            var pwd = document.getElementById("pwdId").value;  
													            if(pwd == "" || pwd.length < 6){  
													                var pspan = document.getElementById("pspan");  
													                pspan.innerHTML = "密码至少6位";  
													                return false;  
													            }else{
													            	var pspan = document.getElementById("pspan");  
													                pspan.innerHTML = "";
													            }  
													              
													            //校验两次密码是否一致   
													            var repwd = document.getElementById("repwdId").value;  
													            if(pwd != repwd){  
													                var repspan = document.getElementById("repspan");  
													                repspan.innerHTML = "两次密码不一致";  
													                return false;  
													            }else{
													            	var repspan = document.getElementById("repspan");  
													                repspan.innerHTML = ""; 
													            }  
   
													        }//end function  
													          
													          
													    </script>
													</div>
												</fieldset>
											</form>
										</div>

										<div class="toolbar center">
											<a href="#" data-target="#login-box" class="back-to-login-link">
												<i class="ace-icon fa fa-arrow-left"></i>
												返回登录
											</a>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.signup-box -->
							</div><!-- /.position-relative -->

						</div>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div><!-- /.main-content -->
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
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

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			jQuery(function($) {
			 $(document).on('click', '.toolbar a[data-target]', function(e) {
				e.preventDefault();
				var target = $(this).data('target');
				$('.widget-box.visible').removeClass('visible');//hide others
				$(target).addClass('visible');//show target
			 });
			});

		</script>
	</body>
</html>
