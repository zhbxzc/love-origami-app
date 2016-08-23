package com.taikang.healthcare.cis.dig.common;


public class Constants {
	
	private static  String servicePath = "tkh-dig-domain";
	//该地址为调用的服务地址,可以本地修改,但是不要提交到服务器上
	private static String didicPath="tkh-dig-domain";
	
	public  static final String queryAllUser = "http://"+servicePath+"/dig/api/v1/role";
	//创建就诊对象
	public  static final String createDiagnosis="http://"+servicePath+"/digdomain/diagnosis";  
	//诊断内容校验
	public  static final String checkDiagnosis="http://"+servicePath+"/digdomain/checkDiagnosis"; 
	//获取当前用户下的所有部门
	public static final String getValuesFromRedisByToken="http://10.136.25.108:8080/userapp/api/getValusRromRedisByToken";
	//科室常用诊断查询
	public static final String selectItemsByDeptId="http://"+servicePath+"/digdomain/selectItemsByDeptId";
	//个人常用诊断查询
	public static final String selectItemsByUserId="http://"+servicePath+"/digdomain/selectItemsByUserId";
	//科室诊断模板新增
	public  static final String createFavoriteDept="http://"+servicePath+"/digdomain/favoriteDept";
	//科室诊断模板删除
	public  static final String deletFavoriteDept="http://"+servicePath+"/digdomain/deletFavoriteDept";
	//个人诊断模板新增
	public  static final String createFavoriteUser="http://"+servicePath+"/digdomain/favoriteUser";
	//个人诊断模板删除
	public  static final String deleteFavoriteUser="http://"+servicePath+"/digdomain/deleteFavoriteUser";
	//诊断显示查询
	public  static final String queryDiagnosisListByEncounterId="http://"+servicePath+"/digdomain/diagnosis";
	//诊断字典新增
	public static final String registerDidic="http://"+didicPath+"/digdomain/dig/didics";
	//诊断字典删除
	public static final String deleteDidic="http://"+didicPath+"/digdomain/dig/didics";
	//诊断字典查询
	public static final String searchDidic="http://"+didicPath+"/digdomain/dig/didics";
	//诊断字典查询
	public static final String searchCountDidic="http://"+didicPath+"/digdomain/dig/didics/counts";
	//诊断字典查询一条
	public static final String getByIdDidic="http://"+didicPath+"/digdomain/dig/didics";
	//诊断字典更新
	public static final String alterDidic="http://"+didicPath+"/digdomain/dig/didics";
	//诊断别名详细
	public  static final String selectAliasInfoById="http://"+servicePath+"/aliasdomain/alias";
	//诊断别名更新
	public  static final String updateAlias="http://"+servicePath+"/aliasdomain/alias";  
	//诊断别名删除
	public  static final String deleteAlias="http://"+servicePath+"/aliasdomain/alias";
	//诊断别名新增
	public  static final String insertAlias="http://"+servicePath+"/aliasdomain/alias";
	public  static final String getUserDeptByToken="http://"+servicePath+"/digdomain/getUserDeptByToken";
	//查询疾病别名列表
	public static final String selectDicAliasList="http://"+servicePath+"/aliasdomain/alias";
	//科室常用诊断列表
	public static final String selectdiagnosisListByDeptId="http://"+servicePath+"/digdomain/diagnosisByDeptId";
	public static final String indexFilePath = "F:/test/lucene/index";
	public static final int pageSize=8;
}
