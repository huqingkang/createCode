/*
package bigdata.uitools.utils;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Component
public class ExcelUtils  {

    */
/**
     * 导出Excel
     *
     * @param workbook
     * @param sheetName
     * @param mapList
     * @return
     *//*

    public Workbook exportExcel(Workbook workbook, String sheetName, List<Map<String, Object>> mapList) throws Exception {
        //创建工作表
        Sheet sheet = workbook.createSheet(sheetName);
        //设置单元格样式
        XSSFCellStyle xssfCellStyle = (XSSFCellStyle) workbook.createCellStyle();
        xssfCellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);//居中显示
        xssfCellStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);//纵向居中
        Map<String, Object> titleMap = mapList.get(0);
        //创建标题行
        Row titleRow = sheet.createRow(0);
        int titleIndex = 0;
        for (String titleKey : titleMap.keySet()) {
            Cell titleCell = titleRow.createCell(titleIndex);
            titleCell.setCellValue(titleKey);
            titleIndex++;
        }
        //创建数据行
        int dataRowIndex = 1;
        for (Map<String, Object> dataMap : mapList) {
            int dataIndex = 0;
            Row dataRows = sheet.createRow(dataRowIndex);
            for (String dataKey : dataMap.keySet()) {
                Cell dataCells = dataRows.createCell(dataIndex);
                dataCells.setCellValue(getMapValue(dataMap, dataKey));
                dataIndex++;
            }
            dataRowIndex++;
        }
        return workbook;
    }


    */
/**
     * 截去字符串最后一位
     *
     * @param str
     * @return
     *//*

    private String sub(String str) {
        //
        return str.substring(0, str.length() - 1);
    }

    */
/**
     * Map获取Null情况处理
     *
     * @param map
     * @param column
     * @return
     *//*

    private String getMapValue(Map<String, Object> map, String column) {
        Object str = map.get(column);
        if (str == null) {
            return "";
        } else {
            return str.toString();
        }
    }

}
*/
