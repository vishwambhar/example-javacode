package com.example.sample.util;


import java.util.StringJoiner;

/**
 * Java 8 shipped with {@code StringJoiner} utility to help join {@code String} literals.
 * It internally uses {@code StringBuilder} to append {@code String} objects.
 */
public class StringJoinerExample {

    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",", "{", "}"); //delimiter, prefix, suffix
        joiner.add("Australia").add("United States"); //add String objects at the convenience of Fluent Design pattern.
        System.out.println(joiner); //calls joiner.toString() internally
    }
}
