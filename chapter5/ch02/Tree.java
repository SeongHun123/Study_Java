package ch02;

public class Tree {

}
/*
트리-> 부모 노드와 지삭 노드간의 연결로 이루어진 자료 구조
힙(heap):Priority queue를 구현
Max heap: 부모 노드는 자식노 드보다 항상 크거나 같은 값을 갖는 경우
Min heap: 부모 노드는 자식 노드보다 항상 작거나 같은 값을 갖는 경우
heap 정렬에 활용 할 수 있음
 
이진 검색 트리(binary search tree)
- 자료(key)의 중복을 허용하지 않음
- 왼쪽 자식 노드는 부모 노드보다 작은 값, 오른쪽 자식 노드는 부모 노드보다 큰 값을 가짐
- 자료를 검색에 걸리는 시간이 평균 log(n) 임
- inorder traversal 탐색을 하게 되면 자료가 정렬되어 출력
 
그래프(Graph)
정점과 간선들의 유한 집합 G=(V,E)
정점(vertex): 여러 특성을 가지는 객체,노드
간선(edge): 이 객체들을 연결 관계를 나타냄
간선은 방향성이 있는 경우와 없는 경우가 있음
그래프를 구현하는 방법: 인접 행렬,인접 리스트
그래프를 탐색하는 방법: BFS,DFS

해싱(Hashing)->자료를 검색하기 위한 자료 구조
검색을 위한 자료구조
키(key)에 대한 자료를 검색하기 위한 사전(dictionary)개념의 자료 구조
key는 유일하고 이에 대한 value를 쌍으로 저장
index=h(key): 해시 함수가 key에 대한 인덱스를 반환해줌 해당 인덱스 위치에 자료를 저장하거나 검색하게 됨
해시 함수에 의해 인덱스 연산이 산술적으로 가능
저장되는 메모리 구조를 해시테이블이라 함
jdk 클래스: HashMap,Properties
 */