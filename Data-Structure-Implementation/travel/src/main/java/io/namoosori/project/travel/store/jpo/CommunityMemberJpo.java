package io.namoosori.project.travel.store.jpo;

import io.namoosori.project.travel.aggregate.CommunityMember;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/10 && 11:25 PM}
 */
@Getter
@Setter
@Entity
@Table(schema = "communityMember")
@AllArgsConstructor
@NoArgsConstructor
public class CommunityMemberJpo {
    //
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", columnDefinition = "Varchar(50)")
    private String name;
    @Column(name = "lastName", columnDefinition = "VARCHAR(100)")
    private String lastName;
    @Column(name = "email", columnDefinition = "VARCHAR(30)")
    private String email;
    @Column(name = "phoneNumber", columnDefinition = "VARCHAR(40)")
    private String phoneNumber;

    public CommunityMemberJpo(CommunityMember communityMember){
        BeanUtils.copyProperties(communityMember, this);
    }

    public CommunityMember toDomain(){
        //
        CommunityMember member = new CommunityMember();
        BeanUtils.copyProperties(this, member);
        return member;
    }

    public static List<CommunityMember> toDomains(List<CommunityMemberJpo> jpos){
        //
        return jpos
                .stream()
                .map(CommunityMemberJpo::toDomain)
                .collect(Collectors.toList());
    }

    public List<CommunityMemberJpo> fromDomains(List<CommunityMember> communityMembers){
        //
        return communityMembers
                .stream()
                .map(CommunityMemberJpo::new)
                .collect(Collectors.toList());
    }
}
