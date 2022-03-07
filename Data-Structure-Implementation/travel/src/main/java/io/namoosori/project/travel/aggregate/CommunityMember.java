package io.namoosori.project.travel.aggregate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/10 && 11:02 PM}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommunityMember {
    //
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
}
