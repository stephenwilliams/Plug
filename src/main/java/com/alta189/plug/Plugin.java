package com.alta189.plug;

import java.io.File;
import java.util.logging.Logger;

import com.alta189.commons.objects.Named;

public interface Plugin extends Named {
	/**
	 * Return the plugin loader of this plugin
	 *
	 * @return loader of this plugin
	 */
	public PluginLoader getLoader();

	/**
	 * Returns whether the plugin has been enabled
	 *
	 * @return enable status
	 */
	public boolean isEnabled();

	/**
	 * Enables or disables this plugin
	 *
	 * @param enabled  flag to enable or disable plugin
	 */
	public void setEnabled(boolean enabled);

	/**
	 * Returns the logger for the plugin
	 *
	 * @return plugin's logger
	 */
	public Logger getLogger();

	/**
	 * Returns the plugin's data folder
	 *
	 * @return folder that contains the plugin's data
	 */
	public File getDataFolder();

	/**
	 * Returns a File that is the plugin's jar file.
	 *
	 * @return jar file
	 */
	public File getFile();

	/**
	 * Loads a library and makes it available to the plugin
	 *
	 * @param file  library to be loaded
	 */
	public void loadLibrary(File file);
}
