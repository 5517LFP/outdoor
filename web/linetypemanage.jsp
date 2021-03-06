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
		<title>活动类型管理</title>
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
							<a href="<%=basePath%>index.html">管理菜单</a>
						</li>
						<li>
							<a href="javascript:void(0)">路线管理</a>
						</li>
						<li>
							<a href="javascript:void(0)">路线类型</a>
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
									<div class="col-xs-6 col-sm-4 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-dark" style="background: #404040;border-color: #fff;">
												<h5 class="bigger" style="color:#fff">短程路线</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															活动时间为1~2天
														</li>

														<li>
															<i class="icon-ok green"></i>
															多为市内景区和城市周边活动
														</li>

														<li>
															<i class="icon-ok green"></i>
															主要活动为，公路骑行，园林采摘，参观博物馆
														</li>

														<li>
															<i class="icon-ok green"></i>
															危险等级和强度等级非常低
														</li>
														<li>
															<i class="icon-ok green"></i>
															周末放松首选
														</li>
														<li>
															<i class="icon-ok green"></i>
															基本无费用
														</li>
													</ul>

													<hr />
													<div class="price">
														short
														<small>1-2天</small>
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

									<div class="col-xs-6 col-sm-4 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-orange" style="background: #ffc657;border-color: #fff;">
												<h5 class="bigger lighter" style="color:#333">中程路线</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															活动时间为5-10天
														</li>

														<li>
															<i class="icon-ok green"></i>
															主要活动为：远足，自驾旅行，异域生活体验
														</li>

														<li>
															<i class="icon-ok green"></i>
															活动地点为周边城市及其景点
														</li>

														<li>
															<i class="icon-ok green"></i>
															危险等级和强度等级中等左右
														</li>
														<li>
															<i class="icon-ok green"></i>
															长假首选
														</li>
														<li>
															<i class="icon-ok green"></i>
															费用不定
														</li>
													</ul>


													<hr />
													<div class="price">
														middium 5-10天
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

									<div class="col-xs-6 col-sm-4 pricing-box">
										<div class="widget-box">
											<div class="widget-header header-color-blue" style="background: #307ecc;border-color: #fff;">
												<h5 class="bigger lighter" style="color:#fff">远程路线</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															活动时间  15+
														</li>

														<li>
															<i class="icon-ok green"></i>
															主要活动为职业人员准备，活动筹备时间较长
														</li>

														<li>
															<i class="icon-ok green"></i>
															主要活动地带不定
														</li>

														<li>
															<i class="icon-ok green"></i>
															危险等级和强度等级很高
														</li>
														<li>
															<i class="icon-ok green"></i>
															大多活动为职业人员准备
														</li>
														<li>
															<i class="icon-ok green"></i>
															费用不定
														</li>
													</ul>


													<hr />
													<div class="price">
														long 15+天
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