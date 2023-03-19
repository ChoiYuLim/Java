package com.yulim.day_0317.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 조용한곳찾기 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 공사 현장 x좌표, y좌표, 소음크기 생성자
			ConstructionArea constuctionArea = new ConstructionArea(sc.nextInt(), sc.nextInt(), sc.nextInt());

			// 나무 개수 받기 (고민중)
			Tree tree = new Tree(sc.nextInt());

			// Tree 리스트 만들기
			List<Tree> trees = new ArrayList<Tree>();

			// 나무 개수만큼 반복문 리스트에 나무 생성해서 넣기 (x좌표, y좌표 받아서)
			for (int i = 0; i < tree.getCount(); i++) {
				Tree tree2 = new Tree(sc.nextInt(), sc.nextInt());
				trees.add(tree2);
			}

			// 계산기 생성자로 만든 뒤 계산한 거리 값 받아오기
			// 거리와 noise 비교해서 결과 출력
			for (int i = 0; i < tree.getCount(); i++) {
				DistanceCalculator calc = new DistanceCalculator(trees.get(i).getX(), trees.get(i).getY(),
						constuctionArea.getX(), constuctionArea.getY());
				if (calc.getDistance() >= constuctionArea.getNoise()) {
					System.out.println("silent");
				} else {
					System.out.println("noisy");
				}
			}
		}

	}

}
