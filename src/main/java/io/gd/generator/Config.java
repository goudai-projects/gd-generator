package io.gd.generator;

public class Config {

	private String queryModelSuffix;

	private String entityPackage;
	private String queryModelPackage;
	private String mybatisMapperPath;
	private String mybatisXmlPath;

	private String url = "jdbc:mysql://127.0.0.1/test";
	private String username = "root";
	private String password;

	private String javaSrc = "/src/main/java";
	private String resources = "/src/main/resources";

	public String getEntityPackage() {
		return entityPackage;
	}

	public void setEntityPackage(String entityPackage) {
		this.entityPackage = entityPackage;
	}

	public String getQueryModelPackage() {
		return queryModelPackage;
	}

	public void setQueryModelPackage(String queryModelPackage) {
		this.queryModelPackage = queryModelPackage;
	}

	public String getMybatisMapperPath() {
		return mybatisMapperPath;
	}

	public void setMybatisMapperPath(String mybatisMapperPath) {
		this.mybatisMapperPath = mybatisMapperPath;
	}

	public String getMybatisXmlPath() {
		return mybatisXmlPath;
	}

	public void setMybatisXmlPath(String mybatisXmlPath) {
		this.mybatisXmlPath = mybatisXmlPath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJavaSrc() {
		return javaSrc;
	}

	public void setJavaSrc(String javaSrc) {
		this.javaSrc = javaSrc;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

	public String getQueryModelSuffix() {
		return queryModelSuffix;
	}

	public void setQueryModelSuffix(String queryModelSuffix) {
		this.queryModelSuffix = queryModelSuffix;
	}

}
