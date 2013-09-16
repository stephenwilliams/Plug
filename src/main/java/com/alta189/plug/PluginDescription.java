package com.alta189.plug;

import java.util.List;

public final class PluginDescription {
	private final String name;
	private final String version;
	private final String description;
	private final String author;
	private final List<String> contributors;
	private final String website;
	private final String license;
	private final String licenseUrl;
	private final List<String> dependencies;
	private final List<String> softDependencies;

	protected PluginDescription(String name, String version, String description, String author, List<String> contributors, String website, String license, String licenseUrl, List<String> dependencies, List<String> softdependencies) {
		this.name = name;
		this.version = version;
		this.description = description;
		this.author = author;
		this.contributors = contributors;
		this.website = website;
		this.license = license;
		this.licenseUrl = licenseUrl;
		this.dependencies = dependencies;
		this.softDependencies = softdependencies;
	}

	/**
	 * Returns the name of the plugin
	 *
	 * @return plugin's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the version of the plugin
	 *
	 * @return plugin's version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Returns the description of the plugin
	 *
	 * @return plugin's description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Returns the author of the plugin
	 *
	 * @return plugin's author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Returns a list of contributors to the plugin
	 *
	 * @return plugin's contributors
	 */
	public List<String> getContributors() {
		return contributors;
	}

	/**
	 * Returns the website of the plugin
	 *
	 * @return plugin's website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * Returns the name of the license used by the plugin
	 *
	 * @return plugin's license
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * Returns a url to the license used by the plugin
	 *
	 * @return license's url
	 */
	public String getLicenseUrl() {
		return licenseUrl;
	}

	/**
	 * Returns a list of dependencies necessary for the plugin
	 * to use that must be enabled in order for this plugin to
	 * run
	 *
	 * @return plugin's dependencies
	 */
	public List<String> getDependencies() {
		return dependencies;
	}

	/**
	 * <p>
	 *     Returns a list of soft dependencies that should be
	 *     enabled before this plugin is enabled.
	 * </p>
	 * <p>
	 *     This do not have to exist in order for this plugin
	 *     to successfully enable
	 * </p>
	 *
	 * @return plugin's soft dependencies
	 */
	public List<String> getSoftDependencies() {
		return softDependencies;
	}
}
