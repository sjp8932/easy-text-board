package com.sbs.example.easytextboard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x; // 미지수 x를 생성
		x = 5;
		System.out.println(x);
		x = 2;
		System.out.println(x);

		Scanner scanner = new Scanner(System.in);

		System.out.println("명령어를 입력해주세요 ");
		String command = scanner.nextLine();

		while (true) {
			if (command.equals("article add")) {
				System.out.println("== 게시물 등록 ==");
			} else if (command.equals("article list")) {
				System.out.println("== 게시물 리스트 ==");
			} else if (command.equals("system exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
			}
			else {
				System.out.println("== 존재하지 않는 명령어 ==");
				
			}
		}
		scanner.close();

	}
}
