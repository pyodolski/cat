package com.example.cat.repository;

import com.example.cat.entity.entities.PostEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // 데이터 접근 계층의 클래스
public interface PostRepository extends JpaRepository<PostEntity, Long> {
    // nick으로 user의 idx를 가져오는 query
    String findPostByUserNickQuery = "select p.idx from PostEntity p where p.userEntity.nick = :nick";
    @Query(value = findPostByUserNickQuery)
    public List<Long> findPostByNick(String nick);

    // idx로 post의 img path를 가져오는 query
    String findPostImgPathListByIdxQuery = "select pi.path from PostImgEntity pi where pi.postEntity.idx = :idx";
    @Query(value = findPostImgPathListByIdxQuery)
    public List<String> findPostImgPathListByIdx(Long idx);

    // idx로 postLike의 idx를 가져오는 query
    String findPostLikeListByIdxQuery = "select pl.idx from PostLikeEntity pl where pl.postEntity.idx = :idx";
    @Query(value = findPostLikeListByIdxQuery)
    public List<Long> findPostLikeListByIdx(Long idx);

    // idx로 post를 가져오는 query
    String getEntityByIdx = "select p from PostEntity p where p.idx = :idx";
    @Query(value = getEntityByIdx)
    public PostEntity getEntityByIdx(Long idx);

    // idx로 post를 삭제하는 query
    String deletePostImgAllQuery = "delete from PostImgEntity pi where pi.postEntity.idx = :idx";
    @Modifying
    @Query(value = deletePostImgAllQuery)
    public void deletePostImgAllQuery(Long idx);

    // title로 post를 가져오는 query (검색)
    String searchByTitleQuery = "select p from PostEntity p where p.title like %:title%";
    @Query(value = searchByTitleQuery)
    public List<PostEntity> searchByTitle(String title);

    // landing page
    String landingPageQuery = "select p from PostEntity p order by p.updateAt desc"; // order by : 정렬
    @Query(value = landingPageQuery)
    public List<PostEntity> landingPage();

    //    public List<PostEntity> getPage(Pageable pageable);
    Page<PostEntity> findAll(Pageable pageable);

}
