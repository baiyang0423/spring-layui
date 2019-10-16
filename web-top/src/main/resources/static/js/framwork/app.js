layui.use(['table',"layer","jquery","form"], function(){

    var $ = layui.jquery ;
    var menus = "";

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



})