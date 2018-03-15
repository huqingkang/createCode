package bigdata.flow.utils;

/**
 * 流程状态
 * Created by Administrator on 2018/01/08.
 */
public enum FlowStatus {
    未开始(0),
    进行中(1),
    暂停(2),
    结束(3),
    垃圾箱(-1);

    private FlowStatus(Integer value) {
        this.val = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }

    private Integer val;
}

