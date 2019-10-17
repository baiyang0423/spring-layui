layui.use(['table',"layer","jquery","form",'element','carousel'], function(){

    var $ = layui.jquery ,table = layui.table
        ,element = layui.element,layer = layui.layer
        ,carousel = layui.carousel;

    /*******************************************************/
    /*                                                     */
    /*              初始化快捷菜单                         */
    /*                                                     */
    /*******************************************************/
    $.get('/web-top/sys/function/index/data/all', "", function(res) {
        //初始化快捷菜单
        var _quickMenu = QuickMenuData("100001" , res.data);
        $("#layui-quick-module").html(_quickMenu);
    }, 'json');
    /**
     * 初始化快捷菜单
     * @param pid
     * @param array
     * @constructor
     */
    function  QuickMenuData(pid ,array){
        var str = '';
        for(var i in array){
            if(array[i].parentId == pid){
                var path = array[i].path;
                //注意icon，这个空格在idea中不显示，在text中展现，unicode编码
                var _icon = array[i].icon == null ? "":array[i].icon;
                var title = array[i].title == null ? "":array[i].title;

                str +='<div class="layui-col-xs6 layui-col-sm6 layui-col-md3">' ;
                str +='  <div class="layadmin-shortcut">\n' ;
                str +='     <a href="#'+path+'" class="layui-quick-menu">\n' ;
                str +='         <i class="layui-icon">'+_icon+'</i>' ;
                str +='         <cite>'+title+'</cite>\n' ;
                str +='     </a>\n' ;
                str +='  </div>\n' ;
                str +='</div>';

            }
        }
        return str;
    }

    /*******************************************************/
    /*                                                     */
    /*              初始化任务模块                         */
    /*                                                     */
    /*******************************************************/

    //监听Tab切换
    element.on('tab(demo)', function(data){
        alert("111");
        layer.tips('切换了 '+ data.index +'：'+ this.innerHTML, this, {
            tips: 1
        });
    });


    //初始化全部表格
    table.render({
        elem: '#LAY-app-message-all'
        ,url:'/web-top/sys/function/select/page'
        ,title: '用户数据表'
        ,page: {
            layout: [ 'prev', 'page', 'next','limit', 'count', 'skip'] //自定义分页布局
            ,groups: 5 //只显示 1 个连续页码
            ,limit:5
            ,limits: [5, 10, 15,20]
            ,first: true //不显示首页
            ,last: true //不显示尾页
            ,theme: '#FF5722'
        }
        ,cols: [[
            {field:'title',  title: '标题'}
            ,{field:'code',  title: '代码'}
            ,{field:'url', title: '路径'}
        ]]
    });
    //初始化代办表格
    table.render({
        elem: '#LAY-app-message-none'
        ,url:'/web-top/sys/user/select/page'
        ,title: '用户数据表'
        ,page: {
            layout: [ 'prev', 'page', 'next','limit', 'count', 'skip'] //自定义分页布局
            ,groups: 5 //只显示 1 个连续页码
            ,limit:5
            ,limits: [5, 10, 15,20]
            ,first: true //不显示首页
            ,last: true //不显示尾页
            ,theme: '#FF5722'
        }
        ,cols: [[
            {field:'name',  title: '标题'}
            ,{field:'password',  title: '代码'}
            ,{field:'account', title: '路径'}
        ]]
    });
    //初始化已办表格
    table.render({
        elem: '#LAY-app-message-done'
        ,url:'/web-top/sys/function/select/page'
        ,title: '用户数据表'
        ,page: {
            layout: [ 'prev', 'page', 'next','limit', 'count', 'skip'] //自定义分页布局
            ,groups: 5 //只显示 1 个连续页码
            ,limit:5
            ,limits: [5, 10, 15,20]
            ,first: true //不显示首页
            ,last: true //不显示尾页
            ,theme: '#FF5722'
        }
        ,cols: [[
            {field:'title',  title: '标题'}
            ,{field:'code',  title: '代码'}
            ,{field:'url', title: '路径'}
        ]]
    });

    /*******************************************************/
    /*                                                     */
    /*              初始化轮播模块                         */
    /*                                                     */
    /*******************************************************/
    carousel.render({
        elem: '#lay-news'
        ,width: '100%'
        ,interval: 2000
    });

})