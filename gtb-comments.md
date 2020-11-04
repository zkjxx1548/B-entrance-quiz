### 完成度：
* 只有查询学员和增加学员的API

### 测试：
* 没有测试

### 知识点：

__Details:__
- \- URL 不符合 REST 规范哈
- \- 返回 status code，而不是字符串，了解一下 @ResponseStatus
- \- 建议了解、使用 lombok

### 工程实践：

__Details:__
+ \+ 单独在应用启动后去初始化数据，不错！
- \- 这些实现细节不应该写到 controller 里，不是 controller 的职责，应该放到 service 里去
- \- 不要有 print 语句留下

### 综合：


