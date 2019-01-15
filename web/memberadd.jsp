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
		<link rel="stylesheet" href="<%=basePath%>assets/css/select2.css" />
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
		<style type="text/css">
			#baibai{
				background-color: white;
			}
			.newtwo{
				width: 200px;
				height: 40px;
				border:1px solid gray;
				background-color: white;
				
			}
		</style>
	</head>
	<body>
		<div class="main-content">
				<div class="breadcrumbs" id="breadcrumbs">
					<ul class="breadcrumb">
						<li>
							<i class="ace-icon fa fa-home home-icon"></i>
							<a href="index.html">管理菜单</a>
						</li>
						<li>
							<a href="javascript:void(0)">会员管理</a>
						</li>
						<li>
							<a href="elements.html">会员信息录入</a>
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

					<div class="page-content-area">

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<div class="well well-sm">
									<button type="button" class="close line-height-0" data-dismiss="alert">
										<i class="ace-icon fa fa-times smaller-75"></i>
									</button>
									会员信息录入
									<i class="fa fa-external-link bigger-110"></i>
								</div>

								<table id="grid-table"></table>

								<div id="grid-pager"></div>

							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content-area -->
				</div><!-- /.page-content -->
			
		
                                        <div class="step-pane active  pre-scrollable col-xs-12" id="baibai">
													<h3 class="lighter block blue">会员信息的录入</h3>

													<form class="form-horizontal " action="${pageContext.request.contextPath}/member/memberadd.action" method="post" id="validation-form" >
														<div class="form-group">
															<label class="control-label col-xs-12 col-sm-3 no-padding-right" for="email">Email:</label>

															<div class="col-xs-12 col-sm-9">
																<div class="clearfix">
																	<input type="email" name="hemail" id="email" class="col-xs-12 col-sm-6" />
																</div>
															</div>
														</div>

														<div class="space-2"></div>

														<div class="form-group">
															<label class="control-label col-xs-12 col-sm-3 no-padding-right" for="password">密码:</label>

															<div class="col-xs-12 col-sm-9">
																<div class="clearfix">
																	<input type="password" name="hpwd" id="password" class="col-xs-12 col-sm-4" />
																</div>
															</div>
														</div>

														<div class="space-2"></div>

														<div class="form-group">
															<label class="control-label col-xs-12 col-sm-3 no-padding-right" for="password2">确认密码:</label>

															<div class="col-xs-12 col-sm-9">
																<div class="clearfix">
																	<input type="password" name="hpwd2" id="password2" class="col-xs-12 col-sm-4" />
																</div>
															</div>
														</div>

														<div class="hr hr-dotted"></div>

														<div class="form-group">
															<label class="control-label col-xs-12 col-sm-3 no-padding-right" for="name">会员姓名:</label>

															<div class="col-xs-12 col-sm-9">
																<div class="clearfix">
																	<input type="text" id="name" name="hname" class="col-xs-12 col-sm-5" />
																</div>
															</div>
														</div>

														<div class="space-2"></div>

														<div class="form-group">
															<label class="control-label col-xs-12 col-sm-3 no-padding-right" for="phone">手机号码:</label>

															<div class="col-xs-12 col-sm-9">
																<div class="input-group">
																	<span class="input-group-addon">
																		<i class="ace-icon fa fa-phone"></i>
																	</span>

																	<input type="tel" id="phone" name="hphonenumber" />
																</div>
															</div>
														</div>

														<div class="space-2"></div>

														<div class="form-group">
															<label class="control-label col-xs-12 col-sm-3 no-padding-right">身份证号:</label>

															<div class="col-xs-12 col-sm-9">
																<div>
																	<input type="text"  name="hidcard" class="col-xs-12 col-sm-8" />
																</div>
															</div>
														</div>

														<div class="hr hr-dotted"></div>

										

														<div class="space-2"></div>

														<div class="form-group">
															<label class="control-label col-xs-12 col-sm-3 no-padding-right">性别</label>

															<div class="col-xs-12 col-sm-9">
																<div>
																	<label class="line-height-1 blue">
																		<input name="gender" value="1" type="radio" class="ace" />
																		<span class="lbl"> 男</span>
																	</label>
																</div>

																<div>
																	<label class="line-height-1 blue">
																		<input name="gender" value="2" type="radio" class="ace" />
																		<span class="lbl"> 女</span>
																	</label>
																</div>
															</div>
														</div>

														<div class="hr hr-dotted"></div>


														<div class="form-group">
															<label class="control-label col-xs-12 col-sm-3 no-padding-right" for="platform">户外等级</label>

															<div class="col-xs-12 col-sm-9">
																<div class="clearfix">
																	<select class="input-medium" id="platform" name="hlv">
																		
																		<option value="0">0</option>
																		<option value="1">1</option>
																		<option value="2">2</option>
																		<option value="3">3</option>
																	</select>
																</div>
															</div>
														</div>

														<div class="space-2"></div>

														<div class="form-group">
															<label class="control-label col-xs-12 col-sm-3 no-padding-right" for="comment">信息备注</label>

															<div class="col-xs-12 col-sm-9">
																<div class="clearfix">
																	<textarea class="input-xlarge" name="comment" id="comment"></textarea>
																</div>
															</div>
														</div>

														<div class="space-8"></div>

														<div class="form-group">
															<div class="col-xs-12 col-sm-4 col-sm-offset-3">
																<label>
																	<input name="agree" id="agree" type="checkbox" class="ace" />
																	<span class="lbl"> 我接受用户协议</span>
																</label>
															</div>
														</div>
														<div class="form-group">
															<div class="col-xs-12 col-sm-4 col-sm-offset-3">
																<label>
																	<input name="submit" id="submit" type="submit" class="ace newtwo" />
																	<input name="reset" id="reset" type="reset" class="ace newtwo">
																</label>
															</div>

														</div>
													</form>
												</div>
												</div><!-- /.main-content -->
			<!-- /.main-content -->
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
			if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="assets/js/bootstrap.min.js"></script>

		<!-- page specific plugin scripts -->
		<script src="<%=basePath%>assets/js/fuelux/fuelux.wizard.min.js"></script>
		<script src="<%=basePath%>assets/js/jquery.validate.min.js"></script>
		<script src="<%=basePath%>assets/js/additional-methods.min.js"></script>
		<script src="<%=basePath%>assets/js/bootbox.min.js"></script>
		<script src="<%=basePath%>assets/js/jquery.maskedinput.min.js"></script>
		<script src="<%=basePath%>assets/js/select2.min.js"></script>

		<!-- ace scripts -->
		<script src="<%=basePath%>assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath%>assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			jQuery(function($) {
			
				$('[data-rel=tooltip]').tooltip();
			
				$(".select2").css('width','200px').select2({allowClear:true})
				.on('change', function(){
					$(this).closest('form').validate().element($(this));
				}); 
			
			
				var $validation = false;
				$('#fuelux-wizard')
				.ace_wizard({
					//step: 2 //optional argument. wizard will jump to step "2" at first
				})
				.on('change' , function(e, info){
					if(info.step == 1 && $validation) {
						if(!$('#validation-form').valid()) return false;
					}
				})
				.on('finished', function(e) {
					bootbox.dialog({
						message: "你的订单已经生成，请注意出票和登机时间。", 
						buttons: {
							"success" : {
								"label" : "确定并关闭",
								"className" : "btn-sm btn-primary"
							}
						}
					});
				}).on('stepclick', function(e){
					//e.preventDefault();//this will prevent clicking and selecting steps
				});
			
			
				//jump to a step
				$('#step-jump').on('click', function() {
					var wizard = $('#fuelux-wizard').data('wizard')
					wizard.currentStep = 3;
					wizard.setState();
				})
				//determine selected step
				//wizard.selectedItem().step
			
			
			
				//hide or show the other form which requires validation
				//this is for demo only, you usullay want just one form in your application
				$('#skip-validation').removeAttr('checked').on('click', function(){
					$validation = this.checked;
					if(this.checked) {
						$('#sample-form').hide();
						$('#validation-form').removeClass('hide');
					}
					else {
						$('#validation-form').addClass('hide');
						$('#sample-form').show();
					}
				})
			
			
			
				
			
			
				$.mask.definitions['~']='[+-]';
				$('#phone').mask('99999999999');
			
				jQuery.validator.addMethod("hphonenumber", function (value, element) {
					return this.optional(element) ||/13[123569]{1}\d{8}|15[1235689]\d{8}|188\d{8}/.test(value);
				}, "请输入一个有效的电话号码.");
			
				$('#validation-form').validate({
					errorElement: 'div',
					errorClass: 'help-block',
					focusInvalid: false,
					rules: {
						email: {
							required: true,
							email:true
						},
						hpwd: {
							required: true,
							minlength: 5
						},
						hpwd2: {
							required: true,
							minlength: 5,
							equalTo: "#password"
						},
						hname: {
							required: true
						},
						hphonenumber: {
							required: true,
							phone: 'required'
						},
						hidcard: {
							required: true,
							
						},
						comment: {
							required: true
						},
						state: {
							required: true
						},
						platform: {
							required: true
						},
						subscription: {
							required: true
						},
						gender: {
							required: true,
						},
						agree: {
							required: true,
						}
					},
			
					messages: {
						email: {
							required: "请输入有效的email地址.",
							email: "请输入有效的email地址."
						},
						password: {
							required: "请输入有效的密码.",
							minlength: "请输入有效的密码."
						},
						subscription: "请至少选择一项",
						gender: "请选择性别",
						agree: "请勾选同意协议"
					},
			
			
					highlight: function (e) {
						$(e).closest('.form-group').removeClass('has-info').addClass('has-error');
					},
			
					success: function (e) {
						$(e).closest('.form-group').removeClass('has-error');//.addClass('has-info');
						$(e).remove();
					},
			
					errorPlacement: function (error, element) {
						if(element.is('input[type=checkbox]') || element.is('input[type=radio]')) {
							var controls = element.closest('div[class*="col-"]');
							if(controls.find(':checkbox,:radio').length > 1) controls.append(error);
							else error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));
						}
						else if(element.is('.select2')) {
							error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
						}
						else if(element.is('.chosen-select')) {
							error.insertAfter(element.siblings('[class*="chosen-container"]:eq(0)'));
						}
						else error.insertAfter(element.parent());
					},
			
					submitHandler: function (form) {
						form.submit();
					},
					invalidHandler: function (form) {
					}
				});
			

			})
		</script>


	</body>
	</html>