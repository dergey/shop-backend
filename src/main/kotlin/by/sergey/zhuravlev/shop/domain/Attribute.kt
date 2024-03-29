package by.sergey.zhuravlev.shop.domain

import javax.persistence.*

@Entity
@Table(name = "attributes")
data class Attribute(

  @Id
  @Column(name = "code", length = 30, nullable = false)
  var code: String,

  @Column(name = "title", length = 100, nullable = false)
  var title: String,

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "catalog_id")
  var catalog: Catalog? = null,

  @OneToMany(mappedBy = "attribute")
  var values: List<AttributeValue>

)
