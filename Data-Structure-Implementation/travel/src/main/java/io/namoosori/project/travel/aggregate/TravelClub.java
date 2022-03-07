package io.namoosori.project.travel.aggregate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/07 && 8:49 PM}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TravelClub {
    //
    private Long id;
    private String name;
    private String intro;
 //   private Date createdTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
