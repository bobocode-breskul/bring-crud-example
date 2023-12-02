package com.bring.pictures.configuration;

import io.github.bobocodebreskul.context.annotations.BringBean;
import io.github.bobocodebreskul.context.annotations.BringConfiguration;

@BringConfiguration
public class AppConfiguration {

  @BringBean
  public String namePrefix() {
    return "picture_";
  }
}
