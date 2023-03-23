package com.yulim.day_0323.finalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemManager {
	Member member;
	Library library = new Library();

	Scanner sc = new Scanner(System.in);

	public void run() throws Exception {
		int option;

		library.temp();
		while (true) {
			System.out.println("\n<도서 관리 프로그램 시작>\n0. 프로그램 종료 1. 관리자로 시작하기 2. 회원 가입 3. 회원 로그인");
			option = sc.nextInt();

			switch (option) {
			// 프로그램 종료
			case 0: {
				break;
			}
			// 관리자로 시작
			case 1: {
				while (true) {
					System.out.println("\n<관리자로 시작>\n0. 뒤로 가기 1. 회원 관리 2. 도서 관리");
					int temp = sc.nextInt();
					switch (temp) {
					case 0: {
						break;
					}
					case 1: {
						회원관리();
						break;
					}
					case 2: {
						도서관리();
						break;
					}
					default: {
						System.out.println("0~2 사이로 다시 입력해주세요");
						continue;
					}
					}
					if (temp == 0)
						break;
				}
				break;
			}
			// 회원 가입
			case 2: {
				join();
				if (library.getMemberList() == null) {
					ArrayList<Member> memberList = new ArrayList<Member>();
					memberList.add(member);
					library.setMemberList(memberList);
				} else {
					library.getMemberList().add(member);
				}
				로그인();
				break;

			}
			// 회원 로그인
			case 3: {
				while (true) {
					System.out.println("\n<회원 로그인>\n회원번호를 입력하세요.");
					int memberId = sc.nextInt();
					if (isSuccessLogin(memberId)) {
						System.out.println(library.getMemberList().get(memberId) + " 로그인 성공");
						member = library.getMemberList().get(memberId);
						로그인();
						break;
					} else {
						break;
					}
				}
				break;
			}
			default: {
				System.out.println("0~3 사이로 다시 입력해주세요");
				continue;
			}
			}
			if (option == 0) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

	public void 회원관리() {
		int option;
		while (true) {
			System.out.println("\n<회원 관리>\n0. 뒤로 가기 1. 회원 조회 2. 회원 수정 3. 회원 삭제 4. 삭제 취소");
			option = sc.nextInt();

			switch (option) {
			// 뒤로 가기
			case 0: {
				break;
			}
			// 회원 조회
			case 1: {
				// 회원 다 호출해
				library.readMemeber();
				break;
			}
			// 회원 수정
			case 2: {
				// 수정하게 해
				library.updateMember(sc);
				break;
			}
			// 회원 삭제
			case 3: {
				library.deleteMember(sc);
				break;
			}
			// 삭제 취소
			case 4: {
				library.recoverMember();
				break;
			}
			default: {
				System.out.println("0~4 사이로 다시 입력해주세요");
				continue;
			}
			}
			if (option == 0) {
				return;
			}
		}

	}

	public void 도서관리() {
		int option;
		while (true) {
			System.out.println("\n<도서 관리>\n0. 뒤로 가기 1. 도서 추가 2. 도서 조회 3. 도서 수정 4. 도서 삭제");
			option = sc.nextInt();

			switch (option) {
			case 0: {
				break;
			}
			case 1: {
				library.addBook(sc);
				break;
			}
			case 2: {
				library.readBook();
				break;
			}
			case 3: {
				library.updateBook(sc);
				break;
			}
			case 4: {
				library.deleteBook(sc);
				break;
			}
			default: {
				System.out.println("0~4 사이로 다시 입력해주세요");
				continue;
			}
			}
			if (option == 0) {
				return;
			}
		}

	}

	public void join() {
		System.out.println("\n<회원가입>\n이름을 입력해주세요.");
		String name = sc.next();
		System.out.println("성별을 입력해주세요. (여자/남자)");
		String gender = sc.next();
		System.out.println("생일을 입력해주세요. (19980102의 형식)");
		String birth = sc.next();
		System.out.println("주소를 입력해주세요.");
		String address = sc.next();
		System.out.println("연락처를 입력해주세요.");
		String phone = sc.next();

		member = new Member(name, address, birth, gender, phone);
		System.out.println("\n<회원가입 완료>\n로그인 시 회원번호 " + member.getId() + "으로 입력해주세요.");
	}

	public boolean isSuccessLogin(int id) {
		// 만약 아이디값이 있으면 성공
		try {
			library.getMemberList().get(id);
			return true;
		} catch (Exception e) {
			System.out.println("<로그인 실패>");
			return false;
		}
	}

	public void 로그인() {
		int option;
		while (true) {
			System.out.println("\n<" + this.member.getName() + "님으로 로그인 상태>\n0. 로그아웃 1. 대출 가능한 책 조회 2. 현재 대출 중인 책 조회");
			option = sc.nextInt();

			switch (option) {
			// 로그아웃
			case 0: {
				break;
			}
			// 대출 가능한 책 조회
			case 1: {
				System.out.println("\n<대출 가능한 책 조회>");
				library.readBook();
				borrowBook();
				break;
			}
			// 현재 대출 중인 책 조회
			case 2: {
				System.out.println("\n<현재 회원님이 대출 중인 책>");
				library.getBookList().stream().filter(it -> it.getCurrentOwnerId() == this.member.getId())
						.forEach(id -> System.out.println(id.toString()));

				returnBook();
				break;
			}
			default: {
				System.out.println("0~2 사이로 다시 입력해주세요");
				continue;
			}
			}
			if (option == 0) {
				return;
			}
		}
	}

	public void borrowBook() {
		int option;
		while (true) {
			System.out.println("\n0. 뒤로 가기 1. 책 대출하기");
			option = sc.nextInt();

			switch (option) {
			// 뒤로 가기
			case 0: {
				break;
			}
			// 책 대출하기
			case 1: {
				library.borrowBook(sc, this.member.getId());
				break;
			}
			default: {
				System.out.println("0 또는 1로 다시 입력해주세요");
				continue;
			}
			}
			if (option == 0) {
				return;
			}
		}
	}

	public void returnBook() {
		int option;
		while (true) {
			System.out.println("\n0. 뒤로 가기 1. 책 반납하기 2. 대출 연장하기");
			option = sc.nextInt();

			switch (option) {
				// 뒤로 가기
				case 0: {
					break;
				}
				// 책 반납하기
				case 1: {
					library.returnBook(sc, member.getId());
					break;
				}
				// 대출 연장하기
				case 2: {
					library.extendBook(sc, member.getId());
					System.out.println(member.getHistory().toString());
					break;
	
				}
				default: {
					System.out.println("0~2 사이로 다시 입력해주세요");
					continue;
				}
			}
			if (option == 0) {
				return;
			}
		}
	}
}
