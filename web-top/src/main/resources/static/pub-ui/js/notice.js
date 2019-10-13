layui.use(['jquery', 'notice'], function() {


    var $ = layui.jquery, notice = layui.notice;

    /**
     * 提示组件
     */
    // 初始化配置，同一样式只需要配置一次，非必须初始化，有默认配置
    notice.options = {
        closeButton:true,//显示关闭按钮
        debug:false,//启用debug
        positionClass:"toast-bottom-right",//弹出的位置,
        showDuration:"5000",//显示的时间
        // hideDuration:"1000",//消失的时间
        timeOut:"2000",//停留的时间
        extendedTimeOut:"1000",//控制时间
        showEasing:"swing",//显示时的动画缓冲方式
        hideEasing:"linear",//消失时的动画缓冲方式
        iconClass: 'toast-info', // 自定义图标，有内置，如不需要则传空 支持layui内置图标/自定义iconfont类名
        onclick: function () {
            alert("进入消息体！");
        }, // 点击关闭回调
    };


    notice.warning("您有新的推送消息！");
    notice.info("提示信息：你有新邮件！");
    notice.error("操作异常，点击查看详情！");
    notice.success("邮件发送成功！");


    /**
     * 点击生成推送
     */
    var notice01;
    $("#create1").click(function () {
        var options = {
            closeButton:true,//显示关闭按钮
            debug:false,//启用debug
            positionClass:"toast-top-center",//弹出的位置,
            showDuration:"300",//显示的时间
            hideDuration:"1000",//消失的时间
            timeOut:"0",//停留的时间,0则不自动关闭
            extendedTimeOut:"1000",//控制时间
            showEasing:"swing",//显示时的动画缓冲方式
            hideEasing:"linear",//消失时的动画缓冲方式
            iconClass: 'layui-icon layui-icon-praise', // 自定义图标，有内置，如不需要则传空 支持layui内置图标/自定义iconfont类名,需要完整加上 layui-icon/icon iconfont
            onclick: null, // 点击关闭回调
        }
        notice01 = notice.success("大佬，我咋知道怎么肥四！","我是标题",options);
    });


    /**
     * 手动关闭推送
     */
    $("#closeAll").click(function () {
        layer.msg('移除生成的notice通知');
        notice.clear(notice01);
    });



})