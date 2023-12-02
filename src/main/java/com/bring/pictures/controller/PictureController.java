package com.bring.pictures.controller;

import com.bring.pictures.bean.Picture;
import com.bring.pictures.service.PictureService;
import io.github.bobocodebreskul.server.annotations.Delete;
import io.github.bobocodebreskul.server.annotations.Get;
import io.github.bobocodebreskul.server.annotations.Post;
import io.github.bobocodebreskul.server.annotations.Put;
import io.github.bobocodebreskul.server.annotations.RequestBody;
import io.github.bobocodebreskul.server.annotations.RequestMapping;
import io.github.bobocodebreskul.server.annotations.RequestParam;
import io.github.bobocodebreskul.server.annotations.RestController;
import java.util.List;

@RestController
@RequestMapping("/pictures")
public class PictureController {

  private final PictureService pictureService;

  public PictureController(PictureService pictureService) {
    this.pictureService = pictureService;
  }

  @Get("/all")
  public List<Picture> getPictures() {
    return pictureService.getPictures();
  }

  @Get
  public Picture getPicture(@RequestParam("id") int id) {
    return pictureService.getPicture(id);
  }

  @Post
  public Picture addPicture(@RequestBody Picture picture) {
    return pictureService.addPicture(picture);
  }

  @Put
  public Picture updatePicture(@RequestBody Picture picture) {
    return pictureService.updatePicture(picture);
  }

  @Delete
  public Picture deletePicture(@RequestParam("id") int id) {
    return pictureService.deletePicture(id);
  }
}
