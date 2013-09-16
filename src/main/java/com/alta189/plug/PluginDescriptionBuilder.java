package com.alta189.plug;

import java.util.ArrayList;
import java.util.List;

/**
 * Used to create a {@link PluginDescription}
 */
public class PluginDescriptionBuilder {
	private String name;
	private String version;
	private String description;
	private String author;
	private List<String> contributors;
	private String website;
	private String license;
	private String licenseUrl;
	private List<String> dependencies;
	private List<String> softDependencies;

	/**
	 * Builds the {@link PluginDescription} object and returns it
	 *
	 * @return created description object
	 */
	public PluginDescription build() {
		return new PluginDescription(name, version, description, author, contributors, website, license, licenseUrl, dependencies, softDependencies);
	}

	/**
	 * Adds a contributor to this plugin's list of contributors
	 *
	 * @param contributor  plugin's contributor to add
	 * @return description builder
	 */
	public PluginDescriptionBuilder addContributor(String contributor) {
		if (this.contributors == null) {
			this.contributors = new ArrayList<String>();
		}
		contributors.add(contributor);
		return this;
	}

	/**
	 * Adds a dependency to this plugin's list of dependencies
	 *
	 * @param dependency  plugin's dependency to add
	 * @return description builder
	 */
	public PluginDescriptionBuilder addDependency(String dependency) {
		if (this.dependencies == null) {
			this.dependencies = new ArrayList<String>();
		}
		dependencies.add(dependency);
		return this;
	}

	/**
	 * Adds a dependency to this plugin's list of soft dependencies
	 *
	 * @param dependency  plugin's soft dependency to add
	 * @return description builder
	 */
	public PluginDescriptionBuilder addSoftDependency(String dependency) {
		if (this.softDependencies == null) {
			this.softDependencies = new ArrayList<String>();
		}
		softDependencies.add(dependency);
		return this;
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
	 * Sets the name of the plugin
	 *
	 * @param name  plugin's name
	 * @return description builder
	 */
	public PluginDescriptionBuilder setName(String name) {
		this.name = name;
		return this;
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
	 * Sets the version of the plugin
	 *
	 * @param version  plugin's version
	 * @return description builder
	 */
	public PluginDescriptionBuilder setVersion(String version) {
		this.version = version;
		return this;
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
	 * Sets the description of the plugin
	 *
	 * @param description  plugin's description
	 * @return description builder
	 */
	public PluginDescriptionBuilder setDescription(String description) {
		this.description = description;
		return this;
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
	 * Sets the author of the plugin
	 *
	 * @param author  plugin's author
	 * @return description builder
	 */
	public PluginDescriptionBuilder setAuthor(String author) {
		this.author = author;
		return this;
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
	 * Sets the list of contributors
	 *
	 * @param contributors  plugin's contributors
	 * @return description builder
	 */
	public PluginDescriptionBuilder setContributors(List<String> contributors) {
		this.contributors = contributors;
		return this;
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
	 * Sets the website of the plugin
	 *
	 * @param website  plugin's website
	 * @return description builder
	 */
	public PluginDescriptionBuilder setWebsite(String website) {
		this.website = website;
		return this;
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
	 * Sets the license of the plugin
	 *
	 * @param license  plugin's license
	 * @return description builder
	 */
	public PluginDescriptionBuilder setLicense(String license) {
		this.license = license;
		return this;
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
	 * Sets the url of the plugin's license
	 *
	 * @param licenseUrl license;s url
	 * @return description builder
	 */
	public PluginDescriptionBuilder setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
		return this;
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
	 * Sets the list of the dependencies of the plugin
	 *
	 * @param dependencies  plugin's dependencies
	 * @return description builder
	 */
	public PluginDescriptionBuilder setDependencies(List<String> dependencies) {
		this.dependencies = dependencies;
		return this;
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

	/**
	 * Sets the list of the soft dependencies of the plugin
	 *
	 * @param softDependencies  plugin's soft dependencies
	 * @return description builder
	 */
	public PluginDescriptionBuilder setSoftDependencies(List<String> softDependencies) {
		this.softDependencies = softDependencies;
		return this;
	}
}
