package com.samsung.lesson5;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberZooPatrol {

    public static String hexdump(byte[] data) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length; i += 16) {
            int end = 16;
            if (i + 16 > data.length) {
                end = data.length - i;
            }
            byte[] part = Arrays.copyOfRange(data, i, i + end);
            StringBuilder row = new StringBuilder(String.format("%8s", Integer.toHexString(i)).replaceAll(" ", "0") + ": ");
            for (byte b : part) {
                int anInt = Byte.toUnsignedInt(b);
                String hex = Integer.toHexString(anInt);
                if (hex.length() == 1) {
                    hex = "0" + hex;
                }
                row.append(hex).append(" ");
            }
            // System.out.println(row.length());
            if (row.length() < 58) {
                int diff = 58 - row.length();
                row.append(" ".repeat(Math.max(0, diff)));
            }
            StringBuilder s = new StringBuilder();
            for (byte b : part) {
                if (b >= 32 && b <= 126) {
                    s.append((char) b);
                } else {
                    s.append(".");
                }

            }
            row.append(" ").append(s);
            result.append(row).append("\n");
        }
        return result.toString();
    }

    public static byte[] dehex(String text) {
        String[] rows = text.split("\n");
        List<Byte> bytes = new ArrayList<>();
        for (String row : rows) {
            String[] tokens = row.split(" ");
            bytes.addAll(
                    Arrays.stream(Arrays.copyOfRange(tokens, 1, 17))
                            .filter(s -> s != null && !s.isEmpty())
                            .map(b -> Integer.parseInt(b, 16))
                            .map(Integer::byteValue)
                            .collect(Collectors.toList())
            );
        }
        byte[] res = new byte[bytes.size()];
        for (int i = 0; i < bytes.size(); i++) {
            res[i] = bytes.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        byte[] bytes = "CodeWars".getBytes(StandardCharsets.UTF_8);
        String dump = hexdump(new byte[]{0x1d, (byte) 0xc4, 0x15, 0x25, (byte) 0x91, (byte) 0xe6, 0x09, 0x59, 0x04, (byte) 0x99, 0x15, 0x29, 0x0a, 0x45, 0x21, 0x29,
                0x26, (byte) 0x8e, 0x74, (byte) 0xa0, 0x1a, (byte) 0xbe, 0x75, 0x68, 0x06, (byte) 0xdd, 0x70, 0x33, (byte) 0xa4, 0x77, 0x7a, 0x5d,
                (byte) 0xb1, (byte) 0xba, 0x22, (byte) 0xa7, (byte) 0xcf, (byte) 0xcc, (byte) 0xf7, (byte) 0xef, (byte) 0xb1, (byte) 0xe3, 0x13, (byte) 0xed, (byte) 0xf1, (byte) 0x89, (byte) 0xad, (byte) 0xad,
                (byte) 0xb8, 0x2a, 0x52, 0x32, 0x65, 0x79, 0x43, (byte) 0x99, 0x6f, (byte) 0xc8, (byte) 0xd3, (byte) 0x8e, (byte) 0xb2, 0x5f, 0x50, (byte) 0xc9,
                0x08, 0x4a, 0x12, 0x25, 0x79, (byte) 0xc2, (byte) 0xdd, 0x31, 0x6b, (byte) 0xb8, 0x77, 0x74, 0x4b, 0x68, 0x4b, (byte) 0xd4,
                (byte) 0xdb, 0x4e, (byte) 0x92, 0x09, (byte) 0xd5, 0x4c, (byte) 0x9f, 0x0b, (byte) 0xfd, (byte) 0xa9, (byte) 0xd1, (byte) 0xd6, 0x13, (byte) 0xf5, (byte) 0xf8, (byte) 0x81});
        System.out.println(dump);
        System.out.println(Arrays.toString(dehex(dump)));
        System.out.println(Arrays.toString(bytes));
    }

}
