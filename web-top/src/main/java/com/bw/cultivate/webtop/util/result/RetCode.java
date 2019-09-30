package com.bw.cultivate.webtop.util.result;

public enum RetCode {
    SUCCESS("请求成功", "0"),
    USEREMPTY("无登录用户", "1"),
    PARAMEMPTY("参数缺失", "2"),
    OPERATION_FAIL("操作失败","4"),
    EXCEPTION("通用异常", "9"),
    DICTEMPTY("缺少字典配置", "COMP0001"),
    SSHFAIL("SSH连接失败", "COMP0002"),
    fILESERVEREMPTY("无文档服务器", "COMP0003"),
    SALT_EXIST_LEFT("salt返回错误结果", "COMP0004"),
    SALT_API_FAIL("salt调用异常", "COMP0005"),
    NOT_SUPPORT_SCRIPT_TYPE("不支持的脚本类型", "COMP0006"),
    NO_FOUND_HOST("没有找到主机", "COMP0007"),
    NO_FOUND_PWD("没有找到密码", "COMP0008"),
    SCRIPT_DOWNLOAD_FAIL("下载安装脚本失败", "COMP0009"),
    SCRIPT_UPLOAD_FAIL("上传安装脚本失败", "COMP0010"),
    NOT_TO_TARGET("无法转化为有效的目标主机", "COMP0011"),
    SALT_CRAETE_FAIL("saltsatck创建连接失败", "COMP0012"),
    SALT_CMD_FAIL("saltstack执行cmd命令错误", "COMP0013"),
    NO_FOUND_JOB("没有发现JOB", "COMP0014");
    // 中文名称
    private String name;
    // 编码
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private RetCode(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public static RetCode valueFromCode(String code) {
        RetCode retCode = RetCode.SUCCESS;
        for (RetCode type : RetCode.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }

        return retCode;
    }
}
