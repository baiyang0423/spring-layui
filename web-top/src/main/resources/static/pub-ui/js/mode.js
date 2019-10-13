layui.config({
    base: "../../pub-ui/js/mods/"
}).use("mods", function (mods) {
    //初始化消息组件
    mods(["layer", "jsanNotice"], function (layer) {
        var notice = layer.noticeMarker({
            "elem": "#noticeMarker",
            "positionX": "right",
            "positionY": "100px",
            "lowKey": true,
            "noticeWindow": {
                "type": 1,
                "title": "消息",
                "classType": {"notice": "通知", "alerted": "预警", "other": "其他"},
                "width": "300px",
                "height": "720px",
                "contentWidth": "80%",
                "contentHeight": "65%"
            }
        });

        //手动推送新消息，在使用消息组件自带的消息窗口时使用
        notice.addNews({
            "lowKey": true,
            "classTypeId": "notice",
            "content": [{"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"},
                {"title": "【通知】一条来自测试的消息消息消息消息消息消息消息消息消息", "content": "一条来自测试的消息，最多20字，最多20字，最多20字，最多20字，最多20字，最多20字", "date": "2019-07-28 19:30:36", "url": "https://www.baidu.com"}
            ]
        });

        //手动进行消息盒子提醒，通常用于自定义消息窗口的时候使用
        /*notice.remind({
            "lowKey": false
        });*/
    });
});