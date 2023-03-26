package com.yulim.day_0323.finalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    BookManager bm = new BookManager();
    MemberManager mm = new MemberManager();
    LoanManager lm = new LoanManager();

    Scanner sc = new Scanner(System.in);

    public void run() throws Exception {

        bm.list.add(new Book("오만과 편견", "1813", "제인 오스틴"));
        bm.list.add(new Book("설국", "1931", "한강"));
        bm.list.add(new Book("데미안", "1919", "헤르만 헤세"));
        mm.list.add(new Member("최유림", "하안동", "19981223", "여성", "01020271810"));
        mm.list.add(new Member("김현아", "서울특별시", "20020623", "여성", "01028495810"));

        int firstOption;
        while (true) {
            System.out.println("\n<도서 관리 프로그램 시작>\n0. 프로그램 종료 1. 관리자로 시작하기 2. 회원 가입 3. 회원 로그인");
            // first depth option
            firstOption = sc.nextInt();

            switch (firstOption) {
                // 프로그램 종료
                case 0: {
                    break;
                }
                // 관리자로 시작
                case 1: {
                    while (true) {
                        // second depth option
                        System.out.println("\n<관리자로 시작>\n0. 뒤로 가기 1. 회원 관리 2. 도서 관리");
                        int secondOption = sc.nextInt();
                        switch (secondOption) {
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
                        if (secondOption == 0)
                            break;
                    }
                    break;
                }
                // 회원 가입
                case 2: {
                    System.out.println("\n<회원가입>\n이름을 입력해주세요.");
                    String name = sc.next();
                    System.out.println("성별을 입력해주세요.(여자/남자)");
                    String gender = sc.next();
                    System.out.println("생일을 입력해주세요.(19980102의 형식)");
                    String birth = sc.next();
                    System.out.println("주소를 입력해주세요.");
                    String address = sc.next();
                    System.out.println("연락처를 입력해주세요.");
                    String phone = sc.next();

                    int memberId = mm.create(new Member(name, address, birth, gender, phone));
                    System.out.println("\n<회원가입 완료>\n로그인 시 회원번호 " + memberId + "으로 입력해주세요.");

                    로그인(mm.findMember(memberId).getId());
                    break;

                }
                // 회원 로그인
                case 3: {
                    while (true) {
                        System.out.println("\n<회원 로그인>\n회원번호를 입력하세요.");
                        int memberId = sc.nextInt();
                        if (isSuccessLogin(memberId)) {
                            System.out.println("\n로그인 성공\n" + mm.findMember(memberId).toString());
                            로그인(mm.findMember(memberId).getId());
                            break;
                        } else {
                            System.out.println("<로그인 실패>");
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
            if (firstOption == 0) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }

    }

    public void 회원관리() {
        int thirdOption;
        while (true) {
            System.out.println("\n<회원 관리>\n0. 뒤로 가기 1. 회원 조회 2. 회원 수정 3. 회원 삭제 4. 삭제 취소");
            thirdOption = sc.nextInt();

            switch (thirdOption) {
                // 뒤로 가기
                case 0: {
                    break;
                }
                // 회원 조회(id 순으로)
                case 1: {
                    mm.read();
                    break;
                }
                // 회원 수정
                case 2: {
                    if (mm.list.size() == 0) {
                        System.out.println("현재 회원이 아무도 없습니다.");
                    } else {
                        System.out.println("\n<회원 수정>\n수정하고 싶은 회원 번호를 입력하세요.");
                        int id = sc.nextInt();
                        try {
                            System.out.println("이름을 수정해주세요.");
                            String name = sc.next();
                            System.out.println("성별을 수정해주세요. (여자/남자)");
                            String gender = sc.next();
                            System.out.println("생일을 수정해주세요. (19980102의 형식)");
                            String birth = sc.next();
                            System.out.println("주소를 수정해주세요.");
                            String address = sc.next();
                            System.out.println("연락처를 수정해주세요.");
                            String phone = sc.next();
                            mm.update(id, new Member(name, address, birth, gender, phone));

                        } catch (Exception e) {
                            System.out.println("<회원 수정 실패>");
                            return;
                        }

                    }
                    break;
                }
                // 회원 삭제
                case 3: {
                    if (mm.list.size() == 0) {
                        System.out.println("현재 회원이 아무도 없습니다.");
                    } else {
                        System.out.println("\n<회원 삭제>\n삭제하고 싶은 회원 번호를 입력하세요.");

                        int id = sc.nextInt();
                        try {
                            mm.list.indexOf(id);
                            mm.list.remove(id);
                            System.out.println("<삭제 완료>");
                        } catch (Exception e) {
                            System.out.println("<삭제 실패>");
                        }
                    }
                    break;
                }
                // 삭제 취소
                case 4: {
                    mm.redo();
                    break;
                }
                default: {
                    System.out.println("0~4 사이로 다시 입력해주세요");
                    continue;
                }
            }
            if (thirdOption == 0) {
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
                    try {
                        System.out.println("\n<도서 추가>\n추가할 책 이름을 입력하세요.");
                        String name = sc.next();
                        System.out.println("책 저자를 입력해주세요.");
                        String author = sc.next();
                        System.out.println("책 출판일을 입력해주세요.");
                        String publishedDate = sc.next();
                        bm.create(new Book(name, publishedDate, author));
                    } catch (Exception e) {
                        System.out.println("<책 수정 실패>");
                        return;
                    }
                    break;
                }
                case 2: {
                    // 모든 책들을 읽어와야해
                    if (bm.list.size() == 0) {
                        System.out.println("현재 책이 아무것도 없습니다.");
                    } else {
                        for (Book book : bm.getList()) {
                            System.out.println(book);
                        }
                    }
                    break;
                }
                case 3: {
                    if (bm.list.size() == 0) {
                        System.out.println("현재 책이 아무것도 없습니다.");
                    } else {
                        System.out.println("\n<책 수정>\n수정하고 싶은 책 번호를 입력하세요.");
                        int id = sc.nextInt();
                        try {
                            System.out.println("책 이름을 수정해주세요.");
                            String name = sc.next();
                            System.out.println("책 저자를 수정해주세요.");
                            String author = sc.next();
                            System.out.println("책 출판일을 수정해주세요.");
                            String publishedDate = sc.next();
                            bm.update(id, new Book(name, publishedDate, author));

                        } catch (Exception e) {
                            System.out.println("<책 수정 실패>");
                            return;
                        }

                    }
                    break;
                }
                case 4: {
                    if (bm.list.size() == 0) {
                        System.out.println("현재 책이 아무것도 없습니다.");
                    } else {
                        System.out.println("\n<책 삭제>\n삭제하고 싶은 책 번호를 입력하세요.");

                        int id = sc.nextInt();
                        try {
                            bm.list.indexOf(id);
                            bm.delete(id);
                            System.out.println("<삭제 완료>");
                        } catch (Exception e) {
                            System.out.println("<삭제 실패>");
                        }
                    }
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

    public boolean isSuccessLogin(int id) {
        // 만약 아이디값이 있으면 성공
        if (mm.findMember(id) != null)
            return true;
        else
            return false;

    }

    public void 로그인(int id) {
        int option;
        while (true) {
            System.out.println("\n<" + mm.list.get(id).getName()
                    + "님으로 로그인 상태>\n0. 로그아웃 1. 대출 가능한 책 조회 2. 현재 대출 중인 책 조회 3. 대출 이력 모두 보기");
            option = sc.nextInt();

            switch (option) {
                // 로그아웃
                case 0: {
                    break;
                }
                // 대출 가능한 책 조회
                case 1: {
                    System.out.println("\n<대출 가능한 책 조회>");
                    bm.read();
                    borrowBook(mm.list.get(id).getId());
                    break;
                }
                // 현재 대출 중인 책 조회
                case 2: {
                    System.out.println("\n<현재 회원님이 대출 중인 책>");
                    lm.readNowBook(id);
                    returnBook(id);
                    break;
                }
                // 대출 이력 모두 보기
                case 3: {
                    System.out.println("\n<대출 이력 조회>");

                    lm.readAllBook(id);
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

    public void borrowBook(int memberId) {
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
                    System.out.println("\n<도서 대출>\n빌리고 싶은 책 번호를 입력해주세요");
                    int bookId = sc.nextInt();

                    // 책이 없을 때
                    if (bm.findBook(bookId) == null) {
                        System.out.println("\n<대출 실패, 해당하는 책이 없습니다.>");
                        return;
                    } else {
                        if (bm.findBook(bookId).getCanBorrow() == false) {
                            System.out.println("\n<대출 실패, 대출 중인 도서입니다.>");
                            return;
                        } else {
                            // 대출 이력 저장
                            lm.loanBook(new Loan(bookId, bm.findBook(bookId).getName(), memberId));

                            // 책 현재 소유자 변경
                            bm.list.get(bm.findBook(bookId).getId()).setCurrentOwnerId(memberId);
                            // 책의 상태 변경
                            bm.changeAvailability(bookId);
                            System.out.println("\n<대출 완료>\n" + mm.list.get(memberId).getName()
                                    + "님이 " + bm.findBook(bookId).getName() + "을 대출했습니다.\n"
                                    + lm.list.get(lm.list.size() - 1).toString());
                        }
                    }

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

    public void returnBook(int memberId) {
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
                    System.out.println("\n<도서 반납>\n반납하고 싶은 책 번호를 입력해주세요");

                    int bookId = sc.nextInt();

                    Book book = bm.findBook(bookId);
                    if (book == null) {
                        System.out.println("\n<반납 실패, 해당하는 책이 없습니다.>");
                    } else {
                        if (book.getCurrentOwnerId() == memberId) {
                            book.setCanBorrow(true);
                            book.setCurrentOwnerId(-1);
                            lm.returnBook(lm.findLoan(bookId, memberId));

                            System.out.println("\n<반납 완료>\n" + mm.list.get(memberId).getName()
                                    + "님이 " + book.getName() + "을 반납했습니다.");

                        } else {
                            System.out.println("\n<반납 실패, 회원님이 대출 중인 도서가 아닙니다.>");

                        }
                    }
                    break;
                }
                // 대출 연장하기
                case 2: {
                    System.out.println("\n<대출 연장>\n대출 연장하고 싶은 책 번호를 입력해주세요");

                    int bookId = sc.nextInt();

                    Book book = bm.findBook(bookId);

                    if (book == null) {
                        System.out.println("\n<연장 실패, 해당하는 책이 없습니다.>");
                    } else {
                        if (book.getCurrentOwnerId() == memberId) {
                            Loan loan = lm.findLoan(book.getId(), memberId);
                            if (loan.getIsExtended() == false) {
                                lm.extendBook(loan);
                                System.out.println("\n<연장 완료>\n" + book.getName() + "이 "
                                        + Util.formattedDateToString(loan.getDeadLine())
                                        + "까지 연장됐습니다.");
                            } else {
                                System.out.println("\n<연장 실패, 이미 연장을 한 도서입니다.>");
                            }

                        } else {
                            System.out.println("\n<연장 실패, 회원님이 대출 중인 도서가 아닙니다.>");
                        }
                    }

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
