本服务是流水号的生成器，支持高并发
使用数据库，同时支持多个项目生产流水号
使用redis缓存，项目启动的时候，会预生产一定数量的流水号，每次先从缓存中取，当缓存中用完，
才会取数据库取