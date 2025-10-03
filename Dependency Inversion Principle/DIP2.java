interface NewsService
{
    String getNews();
}

class APINewsService implements NewsService
{
    @Override
    public String getNews()
    {
        return "News from API";
    }
}

class DatabaseNewsService implements NewsService
{
    @Override
    public String getNews()
    {
        return "News from Database";
    }
}

class FileNewsService implements NewsService
{
    @Override
    public String getNews()
    {
        return "News from File Storage";
    }
}

class NewsReader
{
    private NewsService ns;

    public NewsReader(NewsService ns)
    {
        this.ns = ns;
    }

    public void showNews()
    {
        System.out.println(ns.getNews());
    }
}

public class DIP2
{
    public static void main(String[] args)
    {
        NewsService api = new APINewsService();
        NewsReader reader1 = new NewsReader(api);
        reader1.showNews();

        NewsService db = new DatabaseNewsService();
        NewsReader reader2 = new NewsReader(db);
        reader2.showNews();

        NewsService file = new FileNewsService();
        NewsReader reader3 = new NewsReader(file);
        reader3.showNews();
    }
}