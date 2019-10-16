layui.use(['table',"layer","jquery","form"], function(){

    var $ = layui.jquery ;
    var menus = "";

    $.get('/web-top/sys/function/index/data/all', "", function(res) {
            var _menus = GetMenuData("0",res.data);
            //初始化框架菜单
            $("#menu-box").html(_menus);
            // console.info(_menus);
            //初始化快捷菜单
            var _quickMenu = QuickMenuData("100001" , res.data);
            $("#layui-quick-module").html(_quickMenu);
    }, 'json');


    /**
     * 递归现在所有子节点
     * @type {string}
     */
    function GetMenuData(rootId,array){
        var childArry = GetParentArry(rootId, array);
        if (childArry.length > 0) {
            if(childArry[0].lev == '2'){
                menus += '<ul class="kit-menu-child layui-anim layui-anim-upbit">';
            }else{
                menus += '<ul class="kit-menu">';
            }
            for (var i in childArry) {
                var path = childArry[i].path;
                //注意icon，这个空格在idea中不显示，在text中展现，unicode编码
                var _icon = childArry[i].icon == null ? "":childArry[i].icon;
                var title = childArry[i].title == null ? "":childArry[i].title;
                menus+=	'<li class="kit-menu-item">';
                if(path == null || path == ""){
                    menus+=	    '<a href="javascript:;">';
                }else {
                    menus+=	    '<a href="#'+path+'">';
                }
                menus+=     	'<i class="layui-icon">'+_icon+'</i>';
                menus+=     	'<span>'+title+'</span>';
                menus+=     '</a>';
                            GetMenuData(childArry[i].id,array)
                menus+=  '</li>';
            }
            menus += '</ul>';
        }
        return menus;
    };


    /**
     * 根据父节点查询子集合
     * @param id
     * @param array
     * @returns {any[]}
     * @constructor
     */
    function GetParentArry(id,array){
        var newArry = new Array();
        for (var i in array) {
            if (array[i].parentId === id)
                newArry.push(array[i]);
        }
        return newArry;
    };


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
               var path = childArry[i].path;
               //注意icon，这个空格在idea中不显示，在text中展现，unicode编码
               var _icon = childArry[i].icon == null ? "":childArry[i].icon;
               var title = childArry[i].title == null ? "":childArry[i].title;

               str +='<div class="layui-col-xs6 layui-col-sm6 layui-col-md3">\n' ;
               str +='  <div class="layadmin-shortcut">\n' ;
               str +='     <a href="#'+path+'" class="layui-quick-menu">\n' ;
               str +='         <i class="layui-icon layui-icon-template-1"></i>\n' ;
               str +='         <cite>'+title+'</cite>\n' ;
               str +='     </a>\n' ;
               str +='  </div>\n' ;
               str +='</div>';

           }
       }

       return str;
    }



})