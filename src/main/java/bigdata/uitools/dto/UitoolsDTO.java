package bigdata.uitools.dto;


/**
 * UitoolsDTO.class 类
 * Created by buck on 2018/03/16.
 * @author buck wang
 */
public class UitoolsDTO {
    /**
     * id
     */
    private Integer id;
    /**
     * 标题
     */
    private String titile;
    /**
     * 数据库
     */
    private String dbName;
    /**
     * 文件路径
     */
    private String filePath;
    /**
     * 模板路径
     */
    private String modePath;
    /**
     *  表名
     */
     private String tableName;
     /**
      *创建时间
      */
    private String createtime;
    /**
     * PID
     */
    private String pid;
    /**
     * 数据库类型
     */
    private String dbType;
    /**
     * 开始时间
     */
    private String startDate;
    /**
     * 结束时间
     */
    private String endDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getModePath() {
        return modePath;
    }

    public void setModePath(String modePath) {
        this.modePath = modePath;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
