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
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>危险等级</title>
		<meta name="description" content="Restyling jQuery UI Widgets and Elements" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="<%=basePath%>assets/css/font-awesome.min.css" />
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

	<body class="no-skin">
		
		<div class="main-container" id="main-container">

			<!-- /section:basics/sidebar -->
			<div class="main-content">
				<!-- #section:basics/content.breadcrumbs -->
				<div class="breadcrumbs" id="breadcrumbs">
					<ul class="breadcrumb">
						<li>
							<i class="ace-icon fa fa-home home-icon"></i>
							<a href="<%=basePath%>index.html">菜单管理</a>
						</li>
						<li>
							<a href="javascript:void(0)">安全管理</a>
						</li>
						<li>
							<a href="javascript:void(0)">危险等级</a>
						</li>
					</ul><!-- /.breadcrumb -->

					<!-- #section:basics/content.searchbox -->
					<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon">
								<input type="text" placeholder="请输入关键字 ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
								<i class="ace-icon fa fa-search nav-search-icon"></i>
							</span>
						</form>
					</div><!-- /.nav-search -->
				</div>


				<!-- /section:basics/content.breadcrumbs -->
				<div class="page-content">

					<!-- /section:settings.box -->
					<div class="page-content-area">
						<div class="row">
									<div class="col-xs-6 col-sm-3 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-dark" style="background: #404040;border-color: #fff;">
												<h5 class="bigger" style="color:#fff">A</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															高度危险
														</li>

														<li>
															<i class="icon-ok green"></i>
															非常规山地活动，需要特殊的户外技能
														</li>

														<li>
															<i class="icon-ok green"></i>
															不可预测和控制因素多
														</li>

														<li>
															<i class="icon-ok green"></i>
															行程长，强度大，自然条件艰难
														</li>
														<li>
															<i class="icon-ok green"></i>
															参与者需要良好的心理素质和丰富的户外经验
														</li>
														<li>
															<i class="icon-ok green"></i>
															保险等级为最高（强制）
														</li>
													</ul>

													<hr />
													<div class="price">
														高度危险
													</div>
												</div>

												<div>
													<a href="#" class="btn btn-block btn-inverse">
														<i class=" bigger-110"></i>
													</a>
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-6 col-sm-3 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-orange" style="background: #ffc657;border-color: #fff;">
												<h5 class="bigger lighter" style="color:#333">B</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															中度危险
														</li>

														<li>
															<i class="icon-ok green"></i>
															难度较大的常规山地活动，强度较大的骑马、滑雪活动，未知领域的大强度探索穿越活动
														</li>

														<li>
															<i class="icon-ok green"></i>
															不可预测和控制因素多
														</li>

														<li>
															<i class="icon-ok green"></i>
															行程较长，强度较大，自然条件一般
														</li>
														<li>
															<i class="icon-ok green"></i>
															参与者需要良好的心理素质和丰富的户外经验
														</li>
														<li>
															<i class="icon-ok green"></i>
															保险等级为最高（强制）
														</li>
													</ul>


													<hr />
													<div class="price">
														中度危险
													</div>
												</div>

												<div>
													<a href="#" class="btn btn-block btn-warning">
														<i class=" bigger-110"></i>
														
													</a>
												</div>
											</div>
										</div>
									</div>
									
									<div class="col-xs-6 col-sm-3 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-orange" style="background: #ffc657;border-color: #fff;">
												<h5 class="bigger lighter" style="color:#333">C</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															低度危险
														</li>

														<li>
															<i class="icon-ok green"></i>
															多数常规活动，如常规登山、攀岩、滑雪、骑马、游泳等
														</li>

														<li>
															<i class="icon-ok green"></i>
															不可预测和控制因素少
														</li>

														<li>
															<i class="icon-ok green"></i>
															行程中等，强度低，一般有1-3次野营。
														</li>
														<li>
															<i class="icon-ok green"></i>
															需要参与者有一般的生活常识和较好的心理素质
														</li>
														<li>
															<i class="icon-ok green"></i>
															保险等级为中等
														</li>
													</ul>


													<hr />
													<div class="price">
														低度危险
													</div>
												</div>

												<div>
													<a href="#" class="btn btn-block btn-warning">
														<i class=" bigger-110"></i>
														
													</a>
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-6 col-sm-3 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-blue" style="background: #307ecc;border-color: #fff;">
												<h5 class="bigger lighter" style="color:#fff">D</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															无危险度
														</li>

														<li>
															<i class="icon-ok green"></i>
															一般的休闲游，如旅游景点游玩，安全有充分保障的短期野外旅行
														</li>

														<li>
															<i class="icon-ok green"></i>
															线路明了的短期常规山地攀登。无意外情况发生
														</li>

														<li>
															<i class="icon-ok green"></i>
															行程短，强度低
														</li>
														<li>
															<i class="icon-ok green"></i>
															对参与者没有什么特殊要求
														</li>
														<li>
															<i class="icon-ok green"></i>
															保险等级低
														</li>
													</ul>


													<hr />
													<div class="price">
														无危险度
													</div>
												</div>

												<div>
													<a href="#" class="btn btn-block btn-primary">
														<i class=" bigger-110"></i>
														
													</a>
												</div>
											</div>
										</div>
									</div>

									
								</div>
					</div><!-- /.page-content-area -->
				</div><!-- /.page-content -->
			</div><!-- /.main-content -->


			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
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
		<script src="<%=basePath%>assets/js/bootstrap.min.js"></script>

		<!-- page specific plugin scripts -->

		<!-- ace scripts -->
		<script src="<%=basePath%>assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath%>assets/js/ace.min.js"></script>

	</body>
</html>