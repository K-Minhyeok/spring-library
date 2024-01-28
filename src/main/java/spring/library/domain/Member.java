package spring.library.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spring.library.dto.MemberDto;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BorrowTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String name;
    private String feature;
    private String email;
    private String phoneNumber;
    private int numberBooks;

    public static Member toMember(MemberDto memberDto) {
        return Member.builder()
                .memberId(memberDto.getMemberId())
                .name(memberDto.getName())
                .feature(memberDto.getFeature())
                .email(memberDto.getEmail())
                .phoneNumber(memberDto.getPhoneNumber())
                .numberBooks(memberDto.getNumberBooks())
                .build();
        }
    }

