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
		<title>售价单 - 统一开发平台 - UI库</title>
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
							<a href="javascript:void(0)">安全等级</a>
						</li>
						<li>
							<a href="javascript:void(0)">强度等级</a>
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
												<h5 class="bigger" style="color:#fff">0</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															一般的休闲游，如郊游聚餐等
														</li>

														<li>
															<i class="icon-ok green"></i>
															行程短，一般不野营
														</li>

														<li>
															<i class="icon-ok green"></i>
															不对参与者体能提出要求

														<li>
															<i class="icon-ok green"></i>
															危险等级也是最低
														</li>
														<li>
															<i class="icon-ok green"></i>
															活动地点多为城市周边
														</li>
														<li>
															<i class="icon-ok green"></i>
															保险不做限制
														</li>
													</ul>

													<hr />
													<div class="price">
														休闲强度
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
												<h5 class="bigger lighter" style="color:#333">1</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															数日的常规山地活动，日行程短（一般少于15公里山路），1-2次宿营
														</li>

														<li>
															<i class="icon-ok green"></i>
															主要活动：登云蒙山，爬司马台长城，攀岩，游泳，骑马，滑雪等
														</li>

														<li>
															<i class="icon-ok green"></i>
															对参与者要求其身体健康，装备要求一般
														</li>

														<li>
															<i class="icon-ok green"></i>
															危险等级一般低
														</li>
														<li>
															<i class="icon-ok green"></i>
															活动地点不定
														</li>
														<li>
															<i class="icon-ok green"></i>
															保险低级
														</li>
													</ul>


													<hr />
													<div class="price">
														中等强度
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
												<h5 class="bigger lighter" style="color:#333">2</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															多日的常规山地活动，多数非常规山地活动
														</li>

														<li>
															<i class="icon-ok green"></i>
															日行程山路20公里以上，攀升高度大，以及竞技性活动
														</li>

														<li>
															<i class="icon-ok green"></i>
															主要活动如：如自行车、登山比赛等
														</li>

														<li>
															<i class="icon-ok green"></i>
															对参与者有较高的体能和装备要求，背负重量15公斤以上（男性）
														</li>
														<li>
															<i class="icon-ok green"></i>
															危险等级较高
														</li>
														<li>
															<i class="icon-ok green"></i>
															保险等级较高
														</li>
													</ul>


													<hr />
													<div class="price">
														高等强度
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
												<h5 class="bigger lighter" style="color:#fff">3</h5>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<ul class="list-unstyled spaced2">
														<li>
															<i class="icon-ok green"></i>
															极限环境下的连续活动，非常规山地活动，环境条件恶劣，疲劳度高，恢复期段。
														</li>

														<li>
															<i class="icon-ok green"></i>
															多日日平均行程20公里以上，背负重量高于15公斤（男性）
														</li>

														<li>
															<i class="icon-ok green"></i>
															雪山攀登活动，连续多日的冰雪环境下的探险穿越活动等
														</li>

														<li>
															<i class="icon-ok green"></i>
															危险等级一般极高
														</li>
														<li>
															<i class="icon-ok green"></i>
															保险等级最高（且强制）
														</li>
													</ul>


													<hr />
													<div class="price">
														极高强度
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