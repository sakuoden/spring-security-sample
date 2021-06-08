package com.jtn.springsecuritysample.domain.model;

/**
 * 会員番号
 */
public class MemberNumber {
    String value;

    public MemberNumber(String memberNumber) {
        this.value = memberNumber;
    }

    public boolean equals(MemberNumber other) {
        return this.value.equals(other.value);
    }

    @Override
    public String toString() {
        return this.value;
    }
}
