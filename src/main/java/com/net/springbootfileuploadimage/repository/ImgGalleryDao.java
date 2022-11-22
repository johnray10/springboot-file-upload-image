package com.net.springbootfileuploadimage.repository;

import com.net.springbootfileuploadimage.models.ImgGallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgGalleryDao extends JpaRepository<ImgGallery, Long> {

}
