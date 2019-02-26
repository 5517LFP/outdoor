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
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>户外管理系统</title>

		<meta name="description" content="This is page-header (.page-header &gt; h1)" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<link rel="stylesheet" href="<%=basePath%>assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/font-awesome.min.css" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/ace.min.css" id="main-ace-style" />
		<!--[if lte IE 9]>
			<link rel="stylesheet" href="<%=basePath%>assets/css/ace-part2.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="<%=basePath%>assets/css/ace-skins.min.css" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/ace-rtl.min.css" />
		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="<%=basePath%>assets/css/ace-ie.min.css" />
		<![endif]-->
		<!--[if lte IE 8]>
		<script src="<%=basePath%>assets/js/html5shiv.min.js"></script>
		<script src="<%=basePath%>assets/js/respond.min.js"></script>
		<![endif]-->
		<style type="text/css">
			#oneiframe{
				width: 100%;
				height: 100%;
				border:0px solid white;
			}
			#myModal{
				width: 1158px;
				height: 500px;
				border:0px solid white;
			}
		</style>
	</head>

	<body class="no-skin">
		<div id="navbar" class="navbar navbar-default">
			<div class="navbar-container" id="navbar-container">

				<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler">
					<span class="sr-only">Toggle sidebar</span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>
				</button>

				<!-- /section:basics/sidebar.mobile.toggle -->
				<div class="navbar-header pull-left">
					<!-- #section:basics/navbar.layout.brand -->
					<a href="<%=basePath%>index.jsp" class="navbar-brand">
						<small>
							<img src="<%=basePath%>images/logo.jpg" style="height:30px;width:30px" alt="" />
						</small>
						<span style="padding-top:2px;font-size:14px">户外运动俱乐部管理系统</span>
					</a>
				</div>

				<div class="navbar-buttons navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">

					

						<!-- #section:basics/navbar.user_menu -->
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="<%=basePath%>assets/avatars/user.jpg" alt="" />
								<span class="user-info">
									welcome<br/>
									 <c:if test="${not empty sessionScope.staff}">
									 	${sessionScope.staff.name}
									 </c:if>
									  <c:if test="${not empty sessionScope.adminu}">
									 	${sessionScope.adminu.name}
									 </c:if>
									 
									
								</span>

								<i class="ace-icon fa fa-caret-down"></i>
							</a>

							<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="ace-icon fa fa-cog"></i>
										系统设置
									</a>
								</li>

								<li>
									<a href="#">
										<i class="ace-icon fa fa-user"></i>
										个人信息设置
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="<%=basePath%>/login/staffloginout.action">
										<i class="ace-icon fa fa-power-off"></i>
										登出
									</a>
								</li>
							</ul>
						</li>

						<!-- /section:basics/navbar.user_menu -->
					</ul>
				</div>

				<!-- /section:basics/navbar.dropdown -->
			</div><!-- /.navbar-container -->
		</div>

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">

			<!-- #section:basics/sidebar -->
			<div id="sidebar" class="sidebar responsive">


				<ul class="nav nav-list">
					<li class="active">
						<a href="<%=basePath%>headshow.jsp" target="aa">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text"> 管理菜单 </span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-desktop"></i>
							<span class="menu-text"> 会员管理 </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">

							<li class="">
								
									<a href="<%=basePath%>memberlook.jsp"  target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									会员信息查看
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>memberadd.jsp"  target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									会员信息录入
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>memberserch.jsp"  target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									会员信息检索
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>memberupdateanddelete.jsp"  target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									会员信息删改
								</a>

								<b class="arrow"></b>
							</li>
							
							
						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-list"></i>
							<span class="menu-text"> 路线管理 </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="<%=basePath%>linetypemanage.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right" ></i>
									  路线类型
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>linemanagesynthesis.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									路线信息
								</a>

								<b class="arrow"></b>
							</li>
							<li class="">
								<a href="<%=basePath%>lineserch.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									路线信息检索
								</a>

								<b class="arrow"></b>
							</li>
							
						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> 项目管理 </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="<%=basePath%>projecttype.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									项目类型
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>projectmanage.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									项目管理
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>projectserch.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									项目检索
								</a>

								<b class="arrow"></b>
							</li>
				
						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> 安全管理 </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>
						<ul class="submenu">
							<li class="">
								<a href="<%=basePath%>securedanger.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									危险等级
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>securestronger.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									强度等级
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>securepolicies.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									保险管理
								</a>

								<b class="arrow"></b>
							</li>
				
						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> 活动管理 </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>
						
						<ul class="submenu">
							<li class="">
								<a href="<%=basePath%>activelist.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									活动展示
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>activceadd.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									活动制定
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>securepolicies.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									保险管理
								</a>

								<b class="arrow"></b>
							</li>
				
						</ul>
					</li>
					
					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-tag"></i>
							<span class="menu-text"> 报名管理 </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="<%=basePath%>benlistmanage.jsp"  target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									活动审核
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>memactiverecord.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									会员活动记录表
								</a>

								<b class="arrow"></b>
							</li>

						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> 系统管理 </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>
						
						<ul class="submenu">
							<li class="">
								<a href="<%=basePath%>Systemstaff.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									员工管理
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="<%=basePath%>Systemdatabase.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									数据库备份
								</a>

								<b class="arrow"></b>
							</li>

							<%-- <li class="">
								<a href="<%=basePath%>Systemrolemanage.jsp" target="aa">
									<i class="menu-icon fa fa-caret-right"></i>
									角色权限管理
								</a>

								<b class="arrow"></b>
							</li> --%>

							

						</ul>
					</li>

					
				</ul><!-- /.nav-list -->

				<!-- #section:basics/sidebar.layout.minimize -->
				<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
					<i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
				</div>

			</div>

			<!-- /section:basics/sidebar -->
			<!-- 主内容 -->
				<div class="main-content modal-body" id="myModal">
					
					<iframe id="oneiframe" src="" name="aa" scrolling="no"></iframe> 
					
				</div>


			<!-- 主内容 -->
		
			<div class="footer">
				<div class="footer-inner">
					<!-- #section:basics/footer -->
					<div class="footer-content">
						<span class="bigger-120">
							户外运动俱乐部管理系统：<a href="#" >LPF</a>
						</span>
					</div>

					<!-- /section:basics/footer -->
				</div>
			</div>

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

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
		<script src="<%=basePath%>assets/js/bootstrap.min.js"></script>
		<!--[if lte IE 8]>
		  <script src="<%=basePath%>assets/js/excanvas.min.js"></script>
		<![endif]-->
		<script src="<%=basePath%>assets/js/jquery-ui.custom.min.js"></script>
		<script src="<%=basePath%>assets/js/jquery.ui.touch-punch.min.js"></script>
		<script src="<%=basePath%>assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath%>assets/js/ace.min.js"></script>
		<script type="text/javascript">
			  function loadPage(href){
                $("#myModal").load(href);
             }
		</script>

	</body>
</html>