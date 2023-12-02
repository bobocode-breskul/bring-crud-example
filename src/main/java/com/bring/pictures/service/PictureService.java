package com.bring.pictures.service;

import com.bring.pictures.bean.Picture;
import io.github.bobocodebreskul.context.annotations.BringComponent;
import java.util.ArrayList;
import java.util.List;

@BringComponent
public class PictureService {

  private final List<Picture> pictures = new ArrayList<>();
  private int idCounter = 0;

  public List<Picture> getPictures() {
    return pictures;
  }

  public Picture getPicture(int id) {
    return pictures.stream().filter(picture -> picture.getId() == id).findFirst().orElse(null);
  }

  public Picture addPicture(Picture picture) {
    Picture res = new Picture(++idCounter, picture.getName(), picture.getAuthor());
    pictures.add(res);
    return res;
  }

  public Picture updatePicture(Picture picture) {
    Picture sourceImage = this.getPicture(picture.getId());
    int index = pictures.indexOf(sourceImage);
    sourceImage.setName(picture.getName());
    sourceImage.setAuthor(picture.getAuthor());
    pictures.set(index, sourceImage);
    return sourceImage;
  }

  public Picture deletePicture(int id) {
    Picture picture = getPicture(id);
    if (picture != null) {
      pictures.remove(picture);
    }
    return picture;
  }
}
