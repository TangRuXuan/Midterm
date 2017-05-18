# Midterm
完成功能 ：搜索、日期（基本功能）、UI美化、更改背景（附加功能）

1.搜索的activity为search

notelist2为搜索列表的显示 activitu_search为搜索的xml布局文件

2.添加日期在 noteditor类里面的 ContentValues values = new ContentValues();

SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

String time = dateFormat.format(System.currentTimeMillis());

values.put(NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE,time);

notelist.class //这里是将xml布局里面的控件放在adpter，吧日期的数据源放进去 String[] dataColumns = {NotePad.Notes.COLUMN_NAME_TITLE, NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE};

  int[] viewIDs = {android.R.id.text1, R.id.text2};
在notelist_item.xml布局里面

这这放TextView用来显示日期

UI美化：添加了搜索的图标、搜索结果界面

//搜索、日期、搜索图标美化
![pic](https://github.com/TangRuXuan/Midterm/blob/master/%E6%90%9C%E7%B4%A2%E5%92%8C%E6%97%A5%E6%9C%9F.png)
//搜索、日期、搜索图标美化
![pic](https://github.com/TangRuXuan/Midterm/blob/master/%E6%90%9C%E7%B4%A2%E7%95%8C%E9%9D%A2.png)
//搜索、日期、搜索图标美化
![pic](https://github.com/TangRuXuan/Midterm/blob/master/%E6%90%9C%E7%B4%A2%E7%BB%93%E6%9E%9C.png)
//老师提供的源代码
![pic](https://github.com/TangRuXuan/Midterm/blob/master/%E6%BA%90%E4%BB%A3%E7%A0%81%E6%88%AA%E5%9B%BE.png)

其中改变背景为
android:theme="@android:style/Theme.Holo.Light"
