package com.algolia.search.objects;

import com.algolia.search.AbstractIndex;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.annotation.Nonnull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IndexQuery {

  private final Query query;
  private final String indexName;

  public IndexQuery(@Nonnull String indexName, @Nonnull Query query) {
    this.indexName = indexName;
    this.query = query;
  }

  public IndexQuery(@Nonnull AbstractIndex<?> index, @Nonnull Query query) {
    this.query = query;
    this.indexName = index.getName();
  }

  public Query getQuery() {
    return query;
  }

  public String getIndexName() {
    return indexName;
  }
}
