# Resignation-Problem
## 퇴사
BAEKJOON ONLINE JUDGE
14501번 문제


#### 문제
[https://www.acmicpc.net/problem/14501](https://www.acmicpc.net/problem/14501)

#### 풀이
상담 일정표 나타난 모든 일정에 대해 *BFS 탐색*을 통해 문제를 해결했다.

각 상담을 `Process`, 상담을 수행했을 때 상태를 나타내는 `State`가 있다.  

`State`는 현재 날짜 `startDate`, 얻은 수익 `value`를 가지며,  시작 `State`는 날짜 1일, 수익 0 으로 시작한다.

각 `Process`는 프로세스 구분 번호 `num`,  상담 기간 `duration`, 수익 `value`를 가진다. 

상담 일정표 내 모든 일정에 대해, 다음을 수행한다.
 1. 현재 `State`를 `ArrayList<State> states` 에서 꺼낸다. 
 2. 상담 `Process`에 대해 상담을 수행했을 경우의 `State`를 리스트에 담는다.
 3. `Process`의 `duration`이 퇴사 날짜를 넘어선 경우, 상담을 수행하지 않는다.
 4. 최대 수익 `maxValue`와 현재 `State`의 `value`를 비교하여 `maxValue`를 갱신한다.
 5. 현재 `State`는 `states`에서 삭제한다.
