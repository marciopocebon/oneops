package com.oneops;

import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Environment extends OneopsObject {

  private boolean globaldns;
  private String availability;
  private String profile;
  private int totalCores;
  private Map<String, Platform> platforms;
  private Map<String, Cloud> clouds;
  private Map<String, String> variables;
  private Map<String, String> encryptedvariables;

  public Environment() {
    platforms = new HashMap<>();
  }

  public boolean isGlobaldns() {
    return globaldns;
  }

  public void setGlobaldns(boolean globaldns) {
    this.globaldns = globaldns;
  }

  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public Map<String, Platform> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(Map<String, Platform> platforms) {
    this.platforms = platforms;
  }

  public void addPlatform(Platform platform) {
    if (platform != null) {
      platforms.put(platform.getName(), platform);
    }
  }

  public List<Platform> getPlatformList() {
    List<Platform> platformList = Lists.newArrayList();
    for (Entry<String, Platform> entry : platforms.entrySet()) {
      Platform platform = entry.getValue();
      platform.setName(entry.getKey());
      platformList.add(platform);
    }
    return platformList;
  }

  public Map<String, Cloud> getClouds() {
    return clouds;
  }

  public void setClouds(Map<String, Cloud> clouds) {
    this.clouds = clouds;
  }

  public List<Cloud> getCloudList() {
    List<Cloud> cloudList = Lists.newArrayList();
    for (Entry<String, Cloud> entry : clouds.entrySet()) {
      Cloud cloud = entry.getValue();
      cloud.setId(entry.getKey());
      cloudList.add(cloud);
    }
    return cloudList;
  }

  public Map<String, String> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, String> variables) {
    this.variables = variables;
  }

  public Map<String, String> getEncryptedvariables() {
    return encryptedvariables;
  }

  public void setEncryptedvariables(Map<String, String> encryptedvariables) {
    this.encryptedvariables = encryptedvariables;
  }

  public int getTotalCores() {
    return totalCores;
  }

  public void setTotalCores(int totalCores) {
    this.totalCores = totalCores;
  }
}
