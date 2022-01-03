### 게시판 기능 연습
    ## 근데 이제 스프링을 이용한..


### 1. 커밋 유형 지정
    + FEAT : 새로운 기능의 추가
    + FIX: 버그 수정
    + DOCS: 문서 수정
    + STYLE: 스타일 관련 기능(코드 포맷팅, 세미콜론 누락, 코드 자체의 변경이 없는 경우)
    + REFACTOR: 코드 리펙토링
    + TEST: 테스트 코트, 리펙토링 테스트 코드 추가
    + CHORE: 빌드 업무 수정, 패키지 매니저 수정(ex .gitignore 수정 같은 경우)

### 2. 버그 잡기 기록
    + JQuery Selector는 변수에 담아서 사용하기
    + 자바스크립트 비교 연산자는 == 말고 ===을 더 권장(==은 '값' 비교라서 형변환을 가져옴.)
    + JPA로 생성/수정시간 자동 생성하기 -> 메인 application에 @EnableJpaAuditing 해주어야 사용할 수 있음!
    + ManyToOne으로 연결한 article table과 comment table이 서로 무한이 참조(순환 참조라고 함) -> @JsonIgnore로 해결

