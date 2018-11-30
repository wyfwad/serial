package com.wyf.serial.util;

public class Constant {

    public static class Base {
        public static final String SESSION_USER = "SESSION_USER";//
        public static final int CAPACITY_SIZE = 16;

    }

    /**
     * ehr
     *
     */
    public static class Ehr {

        public static final String TOPIC_REC = "t_012";//

        public static final String TOPIC_BACK = "t_sysback";//

        public static final String TOPIC_EHRCHECK = "t_ehrcheck"; // ehr集中核查
                                                                  // 消息队列topic：

        public static final String ENTRY = "A";//

        public static final String DIMISSION = "I";//

        public static final String SYS_NO = "G000";// 系统编号

    }

    /**
     * ajax请求结果
     * 
     * @author zl
     *
     */
    public static class AjaxStatus {

        public static final String SUCCESS = "SUCCESS";//

        public static final String FAIL = "FAIL";//

    }

    /**
     * 数据状态
     * 
     * @author zl
     *
     */
    public static class RecordStatus {

        public static final Long VALID = 1L;// 有效的

        public static final Long INVALID = 0L;// 无效的

    }

    /**
     * 派工池中单据的状态
     */
    public static class DocumentStatus {
        public static final String WAITING = "WAITING";// 等待状态
        public static final String PROCESS = "IN_PROCESS";// 处理中
        public static final String REJECT = "REJECT";// 拒绝状态
        public static final String RETURN = "RETURN";// 退回
    }

    /**
     * 派工池个人表中审批状态
     */
    public static class LineStatus {
        public static final String REJECT = "REJECT";// 拒绝
        public static final String IN_PROCESS = "IN_PROCESS";// 处理中
        public static final String APPROVED = "APPROVED";// 同意
        public static final String CONFIRM_RETURN = "CONFIRM_RETURN";// 确认退回
        public static final String REFUSE_RETURN = "REFUSE_RETURN";// 拒绝退回
        public static final String RETURN = "RETURN";// 退回

    }

    /**
     * 操作状态
     */
    public static class OperationStatus {
        public static final String F_ASSIGNED = "F_ASSIGNED";// 强制分派
    }

    /**
     * 处理状态
     */
    public static class HandleStatus {
        public static final String COMPLETED = "COMPLETED";// 已完成
        public static final String HANDLE = "HANDLE";// 处理中
    }

    /**
     * 用户状态
     */
    public static class UserStatus {
        public static final Long VALID = 1L;// 有效的

        public static final Long INVALID = 0L;// 无效的
    }

    /**
     * 用Y和N来表示数据的状态
     */
    public static class YOrNStatus {
        public static final String Y = "Y";

        public static final String N = "N";
    }

    public static class DispatchRule {
        public static final String CONTAIN = "CONTAIN";

        public static final String EXCLUDE = "EXCLUDE";

        public static final String OR = "OR";

        public static final String AND = "AND";

    }

    /**
     * 事项的单据状态
     */
    public static class MatterStatus {
        public static final String GENERATE = "GENERATE";
        public static final String SUBMITTED = "SUBMITTED";
        public static final String REJECTED = "REJECTED";
        public static final String TAKEN_BACK = "TAKEN_BACK";
        public static final String COMPLETELY_APPROVED = "COMPLETELY_APPROVED";

        public static final String getMatterOperate(String matterStatus) {
            switch (matterStatus) {
                case GENERATE:
                    return "新建单据";
                case SUBMITTED:
                    return "单据提交";
                case REJECTED:
                    return "拒绝";
                case TAKEN_BACK:
                    return "单据收回";
                case COMPLETELY_APPROVED:
                    return "完全审批";
                default:
                    return "";
            }
        }

    }

    /**
     * 单据的操作.
     */
    public static class DocumentOperation {
        public static final String DOCUMENT_CREATE = "单据创建";
        public static final String DOCUMENT_SAVE_TEMP = "单据保存";
        public static final String DOCUMENT_UPDATE_TEMP = "修改保存";
    }

    public static class ParamCode {
        public static final String ORG_NEDD_DISPATCH = "SSC_DISPATCH_ENABLED";

        public static final String FINASHAR_BUSINESS_TYPE = "FINASHAR";
    }

    public static class Excel {
        public static final int SHEET_NO_ONE = 1;
        public static final int HEAD_LINE_MUN_ONE = 1;
    }

    public static class  AnalysisDataStatus{
        public static final int DATA_NOT_CONFIRM = 0;

        public static final int DATA_CONFIRM =1;
    }

    public static class ModuleCode{
        public static final String DISPATCH = "DISPATCH";
    }
    /**
     * 系统自动任务运行状态(系统设置-自动任务设置模块，作为运行状态EXECUTESTATUS用)
     * 
     * @author zl
     *
     */
    public static class ExecuteStatus {

        public static final long STOP = 1L; // 未运行

        public static final long RUN = 2L; // 运行中
    }

    /**
     * 系统自动任务状态(系统设置-自动任务设置模块，作为任务状态TASKSTATUS用)
     * 
     * @author zl
     */
    public static class TaskStatus {

        public static final long STOPUSING = 1L; // 停止

        public static final long ACTIVATE = 2L; // 激活

    }

    /**
     * 
     * excel后缀
     * 
     * @author zl
     *
     */
    public static class ExcelSuffix {

        public static final String XLS = ".xls";

        public static final String XLSX = ".xlsx";

    }

    /**
     * 
     * 发票导入类型
     * 
     * @author zl
     *
     */
    public static class InvoiceImportType {

        public static final String REAL = "SJFP";// 实际发票

        public static final String FICTITIOUS = "XNFP";// 虚拟发票

        public static final String TOLL = "TXFP";// 通行费专用发票

    }

    /**
     * 
     * 发票认证类型
     * 
     * @author zl
     *
     */
    public static class InvoiceAuthStatus {

        public static final long NO_AUTHENTICATION = 0L; // 无需认证

        public static final long NORMAL_SUCCESS = 1L; // 传统认证成功

        public static final long BOTTOMACCOUNT_SUCCESS = 2L; // 底账认证成功

        public static final long BOTTOMACCOUNT_SELECTED = 3L; // 底账已勾选

    }

    /**
     * 
     * 发票导入审核状态
     * 
     * @author zl
     *
     */
    public static class ImportApprovalStatus {

        public static final long APPROVAL_PENDING = 1L; // 待审批

        public static final long APPROVAL_SUCCESS = 2L; // 审批成功

        public static final long APPROVAL_REJECTION = 3L; // 审批拒绝

    }

    /**
     * 
     * 发票勾选状态
     * 
     * @author zl
     *
     */
    public static class InvoiceCheckStatus {
        public static final String CHECK_FAIL = "-1"; // 勾选失败
        public static final String CHECK_SUCCESS = "1"; // 勾选成功
        public static final String CHECK_PROCESSING = "2"; // 勾选中
        public static final String CHECK_NOT = "3"; // 未勾选
    }

    /**
     * 
     * 发票操作类型
     * 
     * @author zl
     *
     */
    public static class InvoiceOperationType {
        public static final long VERIFY = 1L; // 验真
        public static final long CHECK = 2L; // 勾选
        public static final long AUTHENTICATION = 3L; // 认证
        public static final long MATCHING = 4L; // 匹配
    }

    /**
     * 消息队列
     * 
     * @author zl
     *
     */
    public static class MsgQueue {
        public static final String CHECK = "invoiceAuthRequestUpload";// 勾选
        public static final String CHECK_RESULT = "invoiceAuthRequestResultDownload";// 勾选结果
        public static final String VERIFY = "invoiceVerifyUpload";// 验真
        public static final String VERIFY_RESULT = "invoiceVerifyResultDownload";// 验真结果
        public static final String ELECTRONICLEDGERRECEIPT = "invoiceElectronicLedgerReceiptDownload";// 协同
        public static final String ELECTRONICLEDGERRECEIPT_RESULT = "invoiceElectronicLedgerReceiptResultUpload";// 协同

    }

    /**
     * mq返回勾选,验真状态
     * 
     * @author zl
     *
     */
    public static class MsgBizStatus {
        public static final String SUCCESS = "1";// 成功
        public static final String FAIL = "-1";// 失败

    }

    /**
     * 使用状态
     * 
     * @author zl
     *
     */
    public static class UseStatus {
        public static final String USE = "Y";// 使用
        public static final String NOT = "N";// 不适用

    }

    /**
     * 启动自动勾选
     * 
     * @author zl
     *
     */
    public static class PurchasertaxnoOperateType {
        public static final String START = "2";// 启动
        public static final String STOP = "3";// 关闭

    }

    /**
     * 接口操作状态
     * 
     * @author zl
     *
     */
    public static class IOperationStatus {
        public static final String SUCCESS = "1";// 成功
        public static final String FAIL = "2";// 失败
        public static final String PROCESS = "3";// 处理中

    }

    /**
     * 通知状态
     * 
     * @author zl
     *
     */
    public static class INoticeStatus {
        public static final long NOT = 0L;// 未通知
        public static final long SUCCESS = 1L;// 通知成功
        public static final long FAIL = 2L;// 通知失败

    }

    /**
     * 审批状态
     * 
     * @author zl
     *
     */
    public static class ApprovalStatus {
        public static final long APPROVAL_SAVE = 1L;// 保存
        public static final long APPROVAL_PROCESS = 2L;// 审批中
        public static final long APPROVAL_SUCCESS = 3L;// 审批成功
        public static final long APPROVAL_FAIL = 4L;// 审批失败

    }

    /**
     * 微服务名称.
     * 
     * @className ApplicationName
     * @author zl
     * @version V1.0 2018年9月7日 下午3:45:13
     */
    public static class ApplicationName {
        public static final String BASIC = "basic";// 基础模块服务
        public static final String DISPATCH = "dispatch";// 派工模块服务
        public static final String WORKFLOW = "workflow";// 工作流模块服务
        public static final String QUANTITATIVE_ANALYSIS = "quantitative-analysis";// 量化分析
    }

    /**
     * 系统参数key.
     * 
     * @className ParameterKey
     * @author zl
     * @version V1.0 2018年10月19日 上午11:15:52
     */
    public static class ParameterKey {
        public static final String IS_USE_NATIONAL_SECRET = "IS_USE_NATIONAL_SECRET";// 是否使用国密
    }

    /**
     * 登陆状态.
     * 
     * @className LoginStatus
     * @author zl
     * @version V1.0 2018年10月19日 下午2:20:28
     */
    public static class LoginStatus {

        public static final long OFFLINE = 0L;

        public static final long ONLINE = 1L;
    }

    /**
     * 审核操作.
     * 
     * @className ApprovalOperation
     * @author zl
     * @version V1.0 2018年10月19日 下午2:20:28
     */
    public static class ApprovalOperation {

        public static final String PASS = "1";// 通过

        public static final String REJECT = "2";// 拒绝

        public static final String FORCE_DISPATCH = "3";// 强制派工

        public static final String FORCE_DIS_OPINION = "4";// 强制分派描述

        public static final String FORCE_RETURN = "5";// 强制分派描述

        /**
         * 获取名称.
         * 
         * @param lCode code
         * @return
         */
        public static final String getName(String lCode) {

            String strReturn = "";
            switch (lCode) {
                case PASS:
                    strReturn = "通过";
                    break;
                case REJECT:
                    strReturn = "拒绝";
                    break;
                case FORCE_DISPATCH:
                    strReturn = "强制派工";
                    break;
                case FORCE_DIS_OPINION:
                    strReturn = ":强制分派给:";
                    break;
                case FORCE_RETURN:
                    strReturn = ":强制退回";
                    break;
                default:
                    strReturn = "";
                    break;
            }
            return strReturn;
        }

    }

    /**
     * 工作流操作.
     * 
     * @className WorkFlowOperation
     * @author zl
     * @version V1.0 2018年11月14日 下午5:24:00
     */
    public static class WorkFlowOperation {

        public static final String PASS = "1";// 通过

        public static final String REJECT = "2";// 驳回

        public static final String TRANSFER = "3";// 转办

        public static final String COMMUNICATE = "4";// 沟通

        public static final String CANCEL_COMMUNICATE = "5";// 取消沟通

        public static final String TRANSFERRED = "6";// 被转办

        public static final String REPLY_COMMUNICATED = "8";// 回复沟通

    }

    /**
     * 
     * 任务类别
     * 
     * @className TaskCategory
     * @author zl
     * @version V1.0 2018年11月27日 下午4:29:51
     */
    public static class TaskCategory {

        public static final String COMMUNICATING = "COMMUNICATING";// 沟通中

        public static final String COMMUNICATED = "COMMUNICATED";// 被沟通

        public static final String RESOLVED = "RESOLVED";// 沟通完成

    }

}
