<%@  page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false"   %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!--引入BootStrap的css样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boot/css/bootstrap.css">
    <!--BootStrap与JQGRID整合后的css样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-jqgrid/css/trirand/ui.jqgrid-bootstrap.css">
    <!--引入jquery的js文件-->
    <script src="${pageContext.request.contextPath}/boot/js/jquery-3.3.1.min.js"></script>
    <!--引入BootStrap的js文件-->
    <script src="${pageContext.request.contextPath}/boot/js/bootstrap.js"></script>
    <!--jqgrid与bootstrap整合的国际化的js文件-->
    <script src="${pageContext.request.contextPath}/bootstrap-jqgrid/js/trirand/i18n/grid.locale-cn.js"></script>
    <!--jqgrid与bootstrap整合的js文件-->
    <script src="${pageContext.request.contextPath}/bootstrap-jqgrid/js/trirand/jquery.jqGrid.min.js"></script>
    <script type="application/javascript">
        $(function () {
            //通过jqGrid为表格渲染数据
            $("#table").jqGrid({
                styleUI:"Bootstrap",
                //获取数据的地址
                url:"${pageContext.request.contextPath}/users/selectAll",
                //自动把后台响应回的json协议串自动转换为jquery的对象或集合
                datatype:"json",
                //指定列名
                colNames:["id","用户名","密码","电话","邮箱","IP","系统","角色","状态","操作"],
                caption:"用户列表",
                autowidth:true,
                pager:"#pager",
                //决定每页展示的条数
                rowNum:"3",
                //选中每页展示的条数
                rowList:["3","5","10"],
                //展示总记录数
                viewrecords:true,
                editurl:"${pageContext.request.contextPath}/users/edit",
                colModel:[
                    {name:"id"},
                    {name:"username",editable:true},
                    {name:"password",editable:true},
                    {name:"phone",editable:true},
                    {name:"email",editable:true},
                    {name:"ip",editable:true},
                    {name:"source",editable:true},
                    {name:"role",editable:true},
                    {name:"status",editable:true},
                    {name:"option",formatter:function(cellvalue, options, rowObject){
                           return "<a onclick=\"update('"+rowObject.id+"')\" class='btn btn-primary'>修改</a>&nbsp;&nbsp;&nbsp;<a onclick=\"del('"+rowObject.id+"')\" class='btn btn-danger'>删除</a>"
                        }}
                ],
        }).jqGrid("navGrid","#pager",{edit:true});

            //给对应的按钮添加单击事件
            $("#add").click(function() {
                //给对应的目标JQGRID表格做添加操作
            $("#table").jqGrid('editGridRow', "new", {
                height : 500,
                reloadAfterSubmit : true  //添加过后是否进行刷新
                 });
            });
                /*//修改操作
                $("#update").click(function() {
                //获取选中行的rowid
                var gr = $("#table").jqGrid('getGridParam', 'selrow');
                if (gr != null)
                    //调用修改的方法
                    $("#table").jqGrid('editGridRow', gr, {
                        height : 300,
                        reloadAfterSubmit : true
                    });
                else
                    alert("请选中一行");
                });*/

            /*//删除操作
                $("#delete").click(function() {
                    //改行的ID
                    var gr = $("#table").jqGrid('getGridParam', 'selrow');
                    if (gr != null)
                        $("#table").jqGrid('delGridRow', gr, {
                            reloadAfterSubmit : true
                        });
                    else
                        alert("请选中一行");
                });*/
        });
        function update(rowid) {
            //获取选中行的rowid
            if (rowid != null)
            //调用修改的方法
                $("#table").jqGrid('editGridRow', rowid, {
                    height : 500,
                    reloadAfterSubmit : true
                });
            else
                alert("请选中一行");
        }
        function del(rowid) {
            if (rowid != null)
                $("#table").jqGrid('delGridRow', rowid, {
                    reloadAfterSubmit : true
                });
            else
                alert("请选中一行");
        }
    </script>
</head>
<body>
    <table id="table"></table>
    <div id="pager"></div><br/>
    <button id="add" class="btn btn-success">添加</button>
    <%--<button id="update" class="btn btn-primary">修改</button>
    <button id="delete" class="btn btn-danger">删除</button>--%>
</body>
</html>