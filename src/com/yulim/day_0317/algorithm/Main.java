package com.yulim.day_0317.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// 공사 현장 x좌표, y좌표, 소음크기 생성자
			ConstructionArea constructionArea = new ConstructionArea(sc.nextInt(), sc.nextInt(), sc.nextInt());

			// 나무 개수 받기
			int count = sc.nextInt();

			// Tree 리스트 만들기
			List<Tree> trees = new ArrayList<Tree>();

			// 나무 개수만큼 반복문 리스트에 나무 생성해서 넣기 (x좌표, y좌표 받아서)
			for (int i = 0; i < count; i++) {
				Tree tree = new Tree(sc.nextInt(), sc.nextInt());
				trees.add(tree);
			}

			// 계산기 생성자로 만든 뒤 계산한 거리 값 받아오기
			// Result.getResult로 결과값 받아와서
			// Printer.print로 출력하기
			for (int i = 0; i < count; i++) {
				DistanceCalculator calc = new DistanceCalculator(trees.get(i).getX(), trees.get(i).getY(),
						constructionArea.getX(), constructionArea.getY());

				Printer.print(Result.getResult(calc, constructionArea));
			}
		}

	}

}
