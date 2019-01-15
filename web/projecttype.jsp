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
		<title>项目类型</title>
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
							<a href="index.html">菜单管理</a>
						</li>
						<li>
							<a href="javascript:void(0)">项目管理</a>
						</li>
						<li>
							<a href="javascript:void(0)">项目类型</a>
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
												<h5 class="bigger" style="color:#fff">水上项目</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															跟水有关的项目
														</li>

														<li>
															<i class="icon-ok green"></i>
															主要有：潜水，水上球类运动，水上的集体活动等
														</li>

														<li>
															<i class="icon-ok green"></i>
															要求参与人员会游泳或有专业人员陪同
														</li>

														<li>
															<i class="icon-ok green"></i>
															难度较高，危险等级一般较高
														</li>
														<li>
															<i class="icon-ok green"></i>
															参与者签署的保险较高
														</li>
														<li>
															<i class="icon-ok green"></i>
															费用不定
														</li>
													</ul>

													<hr />
													<div class="price">
														water
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
												<h5 class="bigger lighter" style="color:#333">陆地项目</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															陆地上从事的活动项目
														</li>

														<li>
															<i class="icon-ok green"></i>
															活动项目繁多
														</li>

														<li>
															<i class="icon-ok green"></i>
															参与人员的主要参与的项目
														</li>

														<li>
															<i class="icon-ok green"></i>
															危险等级和强度等级不等
														</li>
														<li>
															<i class="icon-ok green"></i>
															参与者签署的保险不等
														</li>
														<li>
															<i class="icon-ok green"></i>
															费用不定
														</li>
													</ul>


													<hr />
													<div class="price">
														ground
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
												<h5 class="bigger lighter" style="color:#fff">空中项目</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															空中从事的运动项目
														</li>

														<li>
															<i class="icon-ok green"></i>
															活动项目不多
														</li>

														<li>
															<i class="icon-ok green"></i>
															活动人员多为特殊爱好者，或职业人员
														</li>

														<li>
															<i class="icon-ok green"></i>
															危险等级都定位为A
														</li>
														<li>
															<i class="icon-ok green"></i>
															参与者签署的保险不等
														</li>
														<li>
															<i class="icon-ok green"></i>
															高费用
														</li>
													</ul>


													<hr />
													<div class="price">
														sky
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
									
									<div class="col-xs-6 col-sm-3 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-blue" style="background: #307ecc;border-color: #fff;">
												<h5 class="bigger lighter" style="color:#fff">综合项目</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															陆地，天空，水上包括2项或2项以上
														</li>

														<li>
															<i class="icon-ok green"></i>
															活动项目繁多
														</li>

														<li>
															<i class="icon-ok green"></i>
															主要参与人员为特殊爱好者
														</li>

														<li>
															<i class="icon-ok green"></i>
															危险等级和强度等级不等
														</li>
														<li>
															<i class="icon-ok green"></i>
															参与者签署的保险不等
														</li>
														<li>
															<i class="icon-ok green"></i>
															费用不定
														</li>
													</ul>


													<hr />
													<div class="price">
														all
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