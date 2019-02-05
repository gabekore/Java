# JTableについて

## コンストラクタ
```
new JTable(行数, 列数)
```

## 列ヘッダ
```
JTableHeader header = jTable.getTableHeader();
```

しかし、`JTable` を `JScrollPane` に入れれば、自動で列ヘッダは付くので、これを明示的に書くことは無いはず

`JScrollPane` にはカラムヘッダ（`columnHeader`）がある

`JTable` が `JScrollPane` に内包されている場合、`JTable` の `getTableHeader()` を`JScrollPane` の `setColumnHeader()` に渡している



# 横スクロール

`JTable` を `JScrollPane` に入れても通常横スクは表示されない

`JTable` を継承したクラスで `getScrollableTracksViewPortWidth()` をオーバーライドして `false` を `return` すれば表示される

ビューポートの幅が `JTable` の幅より小さくなった時に横スクを表示する等の制御が必要なら、その計算をして `return false` や `true` をする



# 列について
指定した列オブジェクトを取得する方法

## 列名（String）で指定する場合

```
// Aは列の識別子
TableColumn col = jTable.getColumn("A");

// headerValueは列タイトルに表示されているもの
Object headerValue = col.getHeaderValue();

// 列タイトルの設定
col.setHeaderValue("hoge");

// 列の識別子をセットする（画面に表示されるものではない）、初期値はAとかB
col.setIdentifer("fuga");
```





