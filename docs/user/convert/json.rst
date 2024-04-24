.. _json_converter:

JSON Converter
==============

The JSON converter handles JSON files. To use the JSON converter, specify ``type = "json"`` in your converter
definition.

Configuration
-------------

The JSON converter supports parsing multiple JSON documents out of a single file.
In order to support JSON path expressions, each JSON document is fully parsed into memory.
For large documents, this may take considerable time and memory. Thus, it is usually better to have multiple
smaller JSON documents per file, when possible.

Since a single JSON document may contain multiple features, the JSON parser supports a
`JSONPath <https://goessner.net/articles/JsonPath/>`__ expression pointing to each feature element. This can
be specified using the ``feature-path`` element.

The ``fields`` element in a JSON converter supports two additional attributes, ``path`` and ``json-type``.
``path`` should be a `JSONPath <https://goessner.net/articles/JsonPath/>`__ expression, which is relative to the
``feature-path``, if defined (above). For absolute paths, ``root-path`` may be used instead of ``path``.
``json-type`` should specify the type of JSON field being read. Valid values are: **string**, **float**, **double**,
**integer**, **long**, **boolean**, **geometry**, **array** and **object**. The value will be appropriately typed,
and available in the ``transform`` element as ``$0``. Geometry types can handle either WKT strings or GeoJSON
geometry objects.

Handling Complex Elements
-------------------------

JSON can contain complex, nested elements that don't necessarily map well to the flat attribute structure used
by ``SimpleFeatureTypes``. These type of elements can be easily handled using GeoMesa's support for
:ref:`json_attributes`. In your ``SimpleFeatureType`` schema, indicate a complex JSON string through the
user data hint ``json=true``. In your converter, select the outer element and then turn it into a JSON string
through the ``toString`` transformer function. You will be able to filter and transform the data using JSONPath
at query time. See :ref:`json_attributes` for more details.

JSON Composite Converters
-------------------------

Composite converters can handle processing different JSON formats in a single stream. To use a composite
converter, specify ``type = "composite-json"`` in your converter definition.

Composite converters can define top-level options, fields, etc, the same as a normal JSON converter. These
values will be inherited by each of the child converters. If each child is unique, then it is valid to not
define anything at the top level.

Composite converters must define a ``converters`` element, which is an array of nested JSON converter
definitions. In addition to the standard configuration, each nested converter must have a ``predicate``
element that determines which converter to use for each JSON document. The value passed into the predicate
will be the parsed JSON document (available as ``$0``), so generally the predicate will make use of the
``jsonPath`` function (below). See :ref:`composite_predicates` for more details on predicates.

.. _json_converter_functions:

JSON Transform Functions
------------------------

The ``transform`` element supports referencing the JSON element through ``$0``. Each column will initially
be typed according to the field's ``json-type``. Most types will be converted to the equivalent Java class,
e.g. java.lang.Integer, etc. **array** and **object** types will be raw JSON elements, and thus usually
require further processing (e.g. ``jsonList`` or ``jsonMap``, below).

In addition to the standard functions in :ref:`converter_functions`, the JSON converter provides the following
JSON-specific functions:

emptyJsonToNull
~~~~~~~~~~~~~~~

This function converts empty JSON objects and arrays to null. A JSON object is also considered empty if all its
values are null.

jsonArrayToObject
~~~~~~~~~~~~~~~~~

This function converts a JSON array into a JSON object, by using the index of each array element as the object
key. This is useful for GeoMesa's JSON attribute types, which currently require a top-level object and not an array.

jsonList
~~~~~~~~

This function converts a JSON array element into a java.util.List. It requires two parameters; the first is the
type of the list elements as a string, and the second is a JSON array. The type of list elements must be one
of the types defined in :ref:`attribute_types`. See below for an example.

jsonMap
~~~~~~~

This function converts a JSON object element into a java.util.Map. It requires three parameters; the first is the
type of the map key elements as a string, the second is the type of the map value elements as a string, and the
third is a JSON object. The type of keys and values must be one of the types defined in :ref:`attribute_types`.
See below for an example.

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 917dff0811 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1d11096373 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7520530797 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 04e3f9e072 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e57217a17d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 35d929bd27 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a81060c48c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d6a8a22c8 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a539011150 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f9397984eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dbc712b84c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7ea07a654a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 4a51d3f071 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c337194ec (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 35b3ecb03d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 354c37f8b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 94213b24aa (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> b720884250 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6d1dac8a25 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 425a920afa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b51333ce3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 206fa4e8ca (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d667e156 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3bba3c74cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 01daab72fe (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ce6cc995b6 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 585cc74744 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 553cbb229b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6be5ad9465 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> e84ffc66b1 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7b73f9aa72 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> bcf168a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6b26d19d93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> a53c4ae77a (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 38876e069f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 339dee0a22 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f54ebeac7e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 0da1bb22c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d5f1bdf64f (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
=======
>>>>>>> a38d1a4cc5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0dc422e29 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6938112d54 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cd8248bbdc (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8effb11c46 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 62ff7eb02c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7b3160b90a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 448369e575 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f0e859ddba (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 38f95b1602 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 36a5acc573 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 91ead0a832 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7558f8f4ee (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6f345c93e8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7b32f6803c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6d73922328 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ff50279c43 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0b213b35a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a20e68fe8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b06af647f3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 350ca1e784 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 32c76144ad (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c630afc60d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e49f1355d3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3f8e82853d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d36d85cd8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> be1369a16b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7352715aad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 289ca829c7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> fde50255e4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d4d9fdd899 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bc158f6396 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b361489158 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ebc30c95c3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb62a334b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e2c230128a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1610750ff (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 549cf6291c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4bd9eb4df (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> e8c33ac76a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c399a7eef (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 4be1359e88 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 008feb67a (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7982d54d93 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 03967b3f4 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 5bd54939f4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4350edc8f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 793ec81151 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3109199f02 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0df4f16d9 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> a76cfdacc5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 04d469083d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 919559e486 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ddadfbdc64 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e634f5d579 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2005590fb6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1143da1625 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 827f49a0be (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 541f1862a7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b196d7bf96 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7705eeb678 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 908ffa0499 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c17c73531f (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1fcaabf843 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 941c4a6320 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9b5d82faee (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e9b36da337 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a3e5500db0 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1ec3ea887f (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b600f3f7a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e29e638726 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0686300b33 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 0da1bb22c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d5f1bdf64 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9b21f252a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1bc88f7e2 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> a38d1a4cc (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0dc422e2 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6938112d5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cd8248bbd (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 09c8a6d2f (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> f586618a0 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 275e53813 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 063b0f26f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 6d26127ad6 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 4623d9a68 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> df76300d2c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 35b3ecb03 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7b395bc2b7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e08000604 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 981685f1ad (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c337194e (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dbc712b84 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89971e000 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 4a51d3f07 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eb01a83da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 94213b24a (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 2db4ecdc72 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 425a920af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6eb7e598f3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 09c8a6d2fd (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> f586618a0c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 275e53813f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 0da1bb22c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> efae05a8fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 339dee0a22 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f54ebeac7e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 063b0f26f0 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 4623d9a687 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ef927e4467 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 063b0f26f0 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 9536729782 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4623d9a687 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5d19c5d68e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f9397984eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dbc712b84c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7ea07a654a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 4a51d3f071 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c337194ec (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 35b3ecb03d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 354c37f8b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 94213b24aa (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 917dff0811 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 425a920afa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96a (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> f8f49130b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7f9b4c88ad (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b51c563993 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 883af44eef (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bd1dd3a906 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 940738d77d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 51ab350ee2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e0e5de6398 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e459bea71c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fcc0d635d3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96a (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> a9e7594a07 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f8f49130b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 595c43086a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 64d8177ac0 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 45dca3e079 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dc17df6c0b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e686 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d898c0c52 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c361 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cdc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
=======
>>>>>>> dc17df6c0b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> bd1dd3a906 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e459bea71c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c52 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7a670f84c4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1d11096373 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a81060c48c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 339dee0a22 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 31b03236c6 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3cb02b7b01 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 097b5a0858 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 275e53813f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0dc422e29 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 289ca829c7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bc158f6396 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb62a334b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2005590fb6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0b213b35a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c17c73531f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 289ca829c7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 9b5d82faee (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bc158f6396 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1ec3ea887f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> cb62a334b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6b26d19d93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 585cc74744 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> a81060c48c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 04e3f9e072 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7520530797 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f54ebeac7e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a76cfdacc5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 6938112d54 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0df4f16d9 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e08000604 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 6938112d54 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a76cfdacc5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3109199f02 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 553cbb229b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 04e3f9e072 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e57217a17d (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 9759ddc1b5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 0d4c68bdad (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9397984eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> dbc712b84c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7ea07a654a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4a51d3f071 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c0dc422e29 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9c337194ec (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea96678625 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> efae05a8fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0da1bb22c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 339dee0a22 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d5f1bdf64f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 275e53813f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> a38d1a4cc5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0dc422e29 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 6938112d54 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> cd8248bbdc (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 6ba18529e (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 62ff7eb02c (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> e7b61a536 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7b3160b90a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> e7b61a536 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 448369e575 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> f0e859ddba (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0df4f16d9 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> a76cfdacc5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3109199f02 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4350edc8f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 793ec81151 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 354c37f8b (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 827f49a0be (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 03967b3f4 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 5bd54939f4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 981685f1ad (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 275e53813 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9b5d82faee (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c0dc422e2 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 1ec3ea887f (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 008feb67a (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7982d54d93 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 941c4a6320 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b600f3f7a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 541f1862a7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1bc88f7e2 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 6938112d5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 01daab72fe (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c399a7eef (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 4be1359e88 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 541f1862a7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 941c4a6320 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9b5d82faee (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6938112d5 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 1b600f3f7a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 2005590fb6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1143da1625 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e9b36da337 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 4bd9eb4df (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e8c33ac76a (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 0d4c68bda (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 919559e486 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 36a5acc573 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6f345c93e8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> dbc712b84 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> ddadfbdc64 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7b32f6803c (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6d73922328 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 89971e000 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e634f5d579 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> ff50279c43 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> eb01a83da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2005590fb6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0b213b35a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4a51d3f07 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 1143da1625 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> a20e68fe8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> c0dc422e2 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 585cc74744 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e08000604 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 981685f1ad (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 350ca1e784 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7a0ab99f8 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 541f1862a7 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 32c76144ad (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9c337194e (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> b196d7bf96 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> c630afc60d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> ea9667862 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7705eeb678 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 3f8e82853d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0da1bb22c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 908ffa0499 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7352715aad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d5f1bdf64 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> c17c73531f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 289ca829c7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9b21f252a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1fcaabf843 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> fde50255e4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 1bc88f7e2 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 941c4a6320 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> d4d9fdd899 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 275e53813 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9b5d82faee (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bc158f6396 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> a38d1a4cc (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e9b36da337 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> b361489158 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> c0dc422e2 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 1ec3ea887f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> cb62a334b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 6938112d5 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 1b600f3f7a (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e2c230128a (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> cd8248bbd (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e29e638726 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> d1610750ff (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e81892dbf2 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 206fa4e8ca (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 33d667e156 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3bba3c74cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 01daab72fe (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6b26d19d93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> ce6cc995b6 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 585cc74744 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 553cbb229b (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 6be5ad9465 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 09373546be (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 595c43086a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 77f1dd8356 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7f9b4c88ad (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 45dca3e079 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b51c563993 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7a670f84c4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 883af44eef (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bd1dd3a906 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 31b03236c6 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 940738d77d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3cb02b7b01 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 51ab350ee2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e0e5de6398 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e459bea71c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 9759ddc1b5 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> fcc0d635d3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 0d4c68bdad (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 6d1dac8a25 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 917dff0811 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> dbc712b84c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 1d11096373 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 7ea07a654a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7520530797 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 04e3f9e072 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 4a51d3f071 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e57217a17d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> a81060c48c (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 9c337194ec (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 5d6a8a22c8 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ef927e4467 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> efae05a8fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 339dee0a22 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f54ebeac7e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
mapToJson
~~~~~~~~~

This function converts a java.util.Map into a JSON string. It requires a single parameter, which must be a
java.util.Map. It can be useful for storing complex JSON as a single attribute, which can then be queried
using GeoMesa's JSON attribute support. See :ref:`json_attributes` for more information.

jsonArrayToObject
~~~~~~~~~~~~~~~~~

This function converts a JSON array into a JSON object, by using the index of each array element as the object
key. This is useful for GeoMesa's JSON attribute types, which currently require a top-level object and not an array.

>>>>>>> 1e76dbd1e (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b51c563993 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 883af44eef (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bd1dd3a906 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 940738d77d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 51ab350ee2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e0e5de6398 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e459bea71c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fcc0d635d3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a9e7594a07 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6d1dac8a25 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b51333ce3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b720884250 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 917dff0811 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1d11096373 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7520530797 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 04e3f9e072 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e57217a17d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 35d929bd27 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a81060c48c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d6a8a22c8 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a539011150 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ef927e4467 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d19c5d68e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9536729782 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> efae05a8fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 339dee0a22 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f54ebeac7e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 4aef7a70f3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d5f1bdf64f (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 275e53813f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a38d1a4cc5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f586618a0c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0dc422e29 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6938112d54 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> cd8248bbdc (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 09c8a6d2fd (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 62ff7eb02c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7b3160b90a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 448369e575 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f0e859ddba (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a76cfdacc5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3109199f02 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 793ec81151 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5bd54939f4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7982d54d93 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4be1359e88 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8c33ac76a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 38f95b1602 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 36a5acc573 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 91ead0a832 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7558f8f4ee (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6f345c93e8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7b32f6803c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6d73922328 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ff50279c43 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0b213b35a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a20e68fe8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b06af647f3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 350ca1e784 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 32c76144ad (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c630afc60d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e49f1355d3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3f8e82853d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> d36d85cd8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> be1369a16b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7352715aad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 289ca829c7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> fde50255e4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d4d9fdd899 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bc158f6396 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b361489158 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ebc30c95c3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb62a334b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e2c230128a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1610750ff (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 549cf6291c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6be5ad9465 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e84ffc66b1 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6b26d19d93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ce6cc995b6 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bcf168a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7b73f9aa72 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 585cc74744 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 553cbb229b (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d5f1bdf64f (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 64d8177ac0 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 45dca3e079 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> dc17df6c0b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2c3111e686 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c52 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee3aea1cdc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4a51d3f071 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 354c37f8b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 9c337194ec (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 35b3ecb03d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ee3aea1cdc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4a51d3f071 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 354c37f8b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 9c337194ec (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 35b3ecb03d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c361 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f9397984eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dbc712b84c (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7ea07a654a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e686 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e459bea71c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9397984eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 917dff0811 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1d11096373 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e7b61a536 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0df4f16d9 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4350edc8f (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 03967b3f4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 008feb67a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c399a7eef (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4bd9eb4df (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 04d469083d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 919559e486 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6eb7e598f3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2db4ecdc72 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e634f5d579 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2005590fb6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1143da1625 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 827f49a0be (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 981685f1ad (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 541f1862a7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b196d7bf96 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7b395bc2b7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7705eeb678 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> df76300d2c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6d26127ad6 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 908ffa0499 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c17c73531f (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1fcaabf843 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 941c4a6320 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9b5d82faee (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e9b36da337 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a3e5500db0 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1ec3ea887f (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b600f3f7a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e29e638726 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0686300b33 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> eb01a83da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 275e53813 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a38d1a4cc (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f586618a0 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0dc422e2 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6938112d5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> cd8248bbd (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 09c8a6d2f (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 89971e000 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d5f1bdf64 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9b21f252a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 1bc88f7e2 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 33d667e156 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3bba3c74cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 01daab72fe (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dbc712b84 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> ddadfbdc64 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 917dff0811 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a670f84c4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 374ba65da3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c44517c361 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
<<<<<<< HEAD
>>>>>>> 354c37f8b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cdc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f9397984eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 01daab72fe (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c361 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cdc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9397984eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 917dff0811 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e459bea71c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 917dff0811 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1d11096373 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> dc17df6c0b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 31b03236c6 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3cb02b7b01 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0da1bb22c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ea07a654a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7520530797 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 04e3f9e072 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 35d929bd27 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a81060c48c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 097b5a0858 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 35d929bd27 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7a670f84c4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 04e3f9e072 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 374ba65da3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ee3aea1cdc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f586618a0c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6938112d54 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> ff50279c43 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0b213b35a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d4d9fdd899 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 354c37f8b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e634f5d579 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2005590fb6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1bc88f7e2 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 941c4a6320 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 275e53813f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a81060c48c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 339dee0a22 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> dc17df6c0b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> c0dc422e29 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 7b3160b90a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 448369e575 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 0b213b35a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 289ca829c7 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
=======
>>>>>>> 0da1bb22c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 097b5a0858 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> efae05a8fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2005590fb6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c17c73531f (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7520530797 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f54ebeac7e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2c3111e686 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 7ea07a654a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7b32f6803c (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> fde50255e4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6d73922328 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9b21f252a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3bba3c74cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7520530797 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f54ebeac7e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7520530797 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 04e3f9e072 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f54ebeac7e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 5d898c0c52 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6938112d54 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> f0e859ddba (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 793ec81151 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 6d73922328 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ff50279c43 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> fde50255e4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d4d9fdd899 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c44517c361 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e57217a17d (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cdc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9759ddc1b5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 206fa4e8ca (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 235691f96a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0d4c68bdad (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b51333ce3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 425a920afa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b720884250 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 94213b24aa (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f9397984eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> dbc712b84c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7ea07a654a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 89971e000d (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> 7b73f9aa72 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 553cbb229b (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e634f5d579 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1fcaabf843 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 941c4a6320 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4a51d3f071 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5bd54939f4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 354c37f8b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c0dc422e29 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 6938112d54 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9c337194ec (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 35b3ecb03d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 0da1bb22c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 206fa4e8ca (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6b26d19d93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> efae05a8fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> efae05a8fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 585cc74744 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6b26d19d93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ea96678625 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 4623d9a687 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 063b0f26f0 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0da1bb22c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 339dee0a22 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> d5f1bdf64f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 553cbb229b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 275e53813f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> a38d1a4cc5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> f586618a0c (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0dc422e29 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6938112d54 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> cd8248bbdc (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 09c8a6d2fd (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> c6103aab4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8effb11c46 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 6ba18529e (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 62ff7eb02c (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7b3160b90a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> e7b61a536 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 448369e575 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> f0e859ddba (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 4350edc8f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 793ec81151 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0da1bb22c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 03967b3f4 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 5bd54939f4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0da1bb22c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f586618a0 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6938112d5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 275e53813 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> c0dc422e2 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 275e53813 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 4bd9eb4df (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e8c33ac76a (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 04d469083d (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 38f95b1602 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 0d4c68bda (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 919559e486 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 36a5acc573 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 425a920af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6eb7e598f3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 91ead0a832 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 94213b24a (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 2db4ecdc72 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7558f8f4ee (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6f345c93e8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> dbc712b84 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> ddadfbdc64 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7b32f6803c (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6d73922328 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 6938112d5 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 89971e000 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e634f5d579 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> ff50279c43 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> ea9667862 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7705eeb678 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 3f8e82853d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4623d9a68 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> df76300d2c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d36d85cd8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 063b0f26f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 6d26127ad6 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> be1369a16b (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 0da1bb22c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 908ffa0499 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7352715aad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> d5f1bdf64 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> c17c73531f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 289ca829c7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 9b21f252a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1fcaabf843 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> fde50255e4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 1bc88f7e2 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 941c4a6320 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> d4d9fdd899 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 275e53813 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9b5d82faee (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bc158f6396 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a38d1a4cc (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e9b36da337 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> b361489158 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> bcf168a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f586618a0 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> a3e5500db0 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> ebc30c95c3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 585cc74744 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c0dc422e2 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 1ec3ea887f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> cb62a334b4 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 6938112d5 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 1b600f3f7a (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> e2c230128a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> e81892dbf2 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 38876e069f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> a53c4ae77a (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 206fa4e8ca (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 33d667e156 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 3bba3c74cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 01daab72fe (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6b26d19d93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> ce6cc995b6 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> bcf168a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7b73f9aa72 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 585cc74744 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 553cbb229b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 1b25b28b73 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f3 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 09373546be (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 7f9b4c88ad (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 4aef7a70f3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 77f1dd8356 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 64d8177ac0 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 7f9b4c88ad (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b51c563993 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> dc17df6c0b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7a670f84c4 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 883af44eef (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd1dd3a906 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 31b03236c6 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 940738d77d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3cb02b7b01 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 51ab350ee2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 097b5a0858 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e0e5de6398 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 374ba65da3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 2c3111e686 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e459bea71c (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5d898c0c52 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> c44517c361 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> aa65d3827d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cdc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9759ddc1b5 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> fcc0d635d3 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 235691f96a (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> a9e7594a07 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6d1dac8a25 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> b51333ce3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b720884250 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> f9397984eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 917dff0811 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1d11096373 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 7ea07a654a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7520530797 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 04e3f9e072 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eb01a83daf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ee8e40a0aa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 4a51d3f071 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e57217a17d (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 354c37f8b4 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 35d929bd27 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e080006042 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> a81060c48c (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 7a0ab99f8b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 8cda894ca7 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 9c337194ec (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 5d6a8a22c8 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 35b3ecb03d (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> a539011150 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ef927e4467 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4623d9a687 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5d19c5d68e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 063b0f26f0 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 9536729782 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> efae05a8fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 339dee0a22 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 9b21f252a6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f54ebeac7e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 1bc88f7e23 (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 2ef7cb6fbd (GEOMESA-3109 Json array to object converter function (#2788))
jsonPath
~~~~~~~~

This function will evaluate a `JSONPath <https://goessner.net/articles/JsonPath/>`__ expression against a
given JSON element. Generally, it is better to use the ``path`` element of the ``fields`` element, but
this method can be useful for composite predicates (see above). The first argument is the path to evaluate,
and the second argument is the element to operate on.

mapToJson
~~~~~~~~~

This function converts a java.util.Map into a JSON string. It requires a single parameter, which must be a
java.util.Map. It can be useful for storing complex JSON as a single attribute, which can then be queried
using GeoMesa's JSON attribute support. See :ref:`json_attributes` for more information.

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
newJsonObject
~~~~~~~~~~~~~
=======
jsonArrayToObject
~~~~~~~~~~~~~~~~~

This function converts a JSON array into a JSON object, by using the index of each array element as the object
key. This is useful for GeoMesa's JSON attribute types, which currently require a top-level object and not an array.

=======
>>>>>>> 1a21a3c300 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
jsonPath
~~~~~~~~
>>>>>>> 1e76dbd1e7 (GEOMESA-3109 Json array to object converter function (#2788))

This function creates a new JSON object from key-value pairs. It can be useful for generating JSON text values.

Example::

  fields = [
    { name = "foo", path = "$.foo", json-type = "String" }
    { name = "bar", path = "$.bar", json-type = "Array" }
    { name = "foobar", transform = "toString(newJsonObject('foo', $foo, 'bar', $bar))"
  ]

mapToJson
~~~~~~~~~

This function converts a java.util.Map into a JSON string. It requires a single parameter, which must be a
java.util.Map. It can be useful for storing complex JSON as a single attribute, which can then be queried
using GeoMesa's JSON attribute support. See :ref:`json_attributes` for more information.

=======
>>>>>>> fd776cb831 (GEOMESA-3109 Json array to object converter function (#2788))
newJsonObject
~~~~~~~~~~~~~
=======
jsonArrayToObject
~~~~~~~~~~~~~~~~~

This function converts a JSON array into a JSON object, by using the index of each array element as the object
key. This is useful for GeoMesa's JSON attribute types, which currently require a top-level object and not an array.

=======
>>>>>>> 9c337194e (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 35b3ecb03 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4a51d3f07 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 354c37f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e08000604 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> 354c37f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
=======
<<<<<<< HEAD
>>>>>>> e08000604 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a0ab99f8 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eb01a83da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 31b03236c (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 4a51d3f07 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 097b5a085 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 354c37f8b (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 64d8177ac (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 2c3111e68 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e08000604 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 7a670f84c (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> c44517c36 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7a0ab99f8 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9c337194e (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 35b3ecb03 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> cd8248bbd (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 09c8a6d2f (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9759ddc1b (GEOMESA-3109 Json array to object converter function (#2788))
>>>>>>> 6be5ad9465 (GEOMESA-3109 Json array to object converter function (#2788))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4aef7a70f (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> 235691f96 (GEOMESA-3109 Json array to object converter function (#2788))
<<<<<<< HEAD
>>>>>>> e84ffc66b1 (GEOMESA-3109 Json array to object converter function (#2788))
=======
=======
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
jsonPath
~~~~~~~~
>>>>>>> 1e76dbd1e (GEOMESA-3109 Json array to object converter function (#2788))

This function creates a new JSON object from key-value pairs. It can be useful for generating JSON text values.

Example::

  fields = [
    { name = "foo", path = "$.foo", json-type = "String" }
    { name = "bar", path = "$.bar", json-type = "Array" }
    { name = "foobar", transform = "toString(newJsonObject('foo', $foo, 'bar', $bar))"
  ]

mapToJson
~~~~~~~~~

This function converts a java.util.Map into a JSON string. It requires a single parameter, which must be a
java.util.Map. It can be useful for storing complex JSON as a single attribute, which can then be queried
using GeoMesa's JSON attribute support. See :ref:`json_attributes` for more information.

=======
>>>>>>> 3b5854c1bb (GEOMESA-3109 Json array to object converter function (#2788))
newJsonObject
~~~~~~~~~~~~~
=======
jsonArrayToObject
~~~~~~~~~~~~~~~~~

This function converts a JSON array into a JSON object, by using the index of each array element as the object
key. This is useful for GeoMesa's JSON attribute types, which currently require a top-level object and not an array.

=======
>>>>>>> 1a21a3c300 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
jsonPath
~~~~~~~~
>>>>>>> 1e76dbd1e7 (GEOMESA-3109 Json array to object converter function (#2788))

This function creates a new JSON object from key-value pairs. It can be useful for generating JSON text values.

Example::

  fields = [
    { name = "foo", path = "$.foo", json-type = "String" }
    { name = "bar", path = "$.bar", json-type = "Array" }
    { name = "foobar", transform = "toString(newJsonObject('foo', $foo, 'bar', $bar))"
  ]

mapToJson
~~~~~~~~~

This function converts a java.util.Map into a JSON string. It requires a single parameter, which must be a
java.util.Map. It can be useful for storing complex JSON as a single attribute, which can then be queried
using GeoMesa's JSON attribute support. See :ref:`json_attributes` for more information.

newJsonObject
~~~~~~~~~~~~~

This function creates a new JSON object from key-value pairs. It can be useful for generating JSON text values.

Example::

  fields = [
    { name = "foo", path = "$.foo", json-type = "String" }
    { name = "bar", path = "$.bar", json-type = "Array" }
    { name = "foobar", transform = "toString(newJsonObject('foo', $foo, 'bar', $bar))"
  ]

Example Usage
-------------

Assume the following SimpleFeatureType:

::

  geomesa.sfts.example = {
    attributes = [
      { name = "name",    type = "String"          }
      { name = "age",     type = "Integer"         }
      { name = "weight",  type = "Double"          }
      { name = "hobbies", type = "List[String]"    }
      { name = "skills",  type = "Map[String,Int]" }
      { name = "source",  type = "String"          }
      { name = "geom",    type = "Point"           }
    ]
  }

And the following JSON document:

::

  {
    "DataSource": { "name": "myjson" },
    "Features": [
      {
        "id": 1,
        "name": "phil",
        "physicals": {
          "age": 32,
          "weight": 150.2
        },
        "hobbies": [ "baseball", "soccer" ],
        "languages": {
          "java": 100,
          "scala": 70
        },
        "geometry": { "type": "Point", "coordinates": [55, 56] }
      },
      {
        "id": 2,
        "name": "fred",
        "physicals": {
          "age": 33,
          "weight": 150.1
        },
        "hobbies": [ "archery", "tennis" ],
        "languages": {
          "c++": 10,
          "fortran": 50
        },
        "geometry": { "type": "Point", "coordinates": [45, 46] }
      }
    ]
  }

You could ingest with the following converter:

::

 geomesa.converters.myjson = {
   type         = "json"
   id-field     = "$id"
   feature-path = "$.Features[*]"
   fields = [
     { name = "id",      json-type = "integer",  path = "$.id",               transform = "toString($0)"                }
     { name = "name",    json-type = "string",   path = "$.name",             transform = "trim($0)"                    }
     { name = "age",     json-type = "integer",  path = "$.physicals.age",                                              }
     { name = "weight",  json-type = "double",   path = "$.physicals.weight"                                            }
     { name = "hobbies", json-type = "array",    path = "$.hobbies",          transform = "jsonList('string', $0)"      }
     { name = "skills",  json-type = "map",      path = "$.languages",        transform = "jsonMap('string','int', $0)" }
     { name = "geom",    json-type = "geometry", path = "$.geometry",         transform = "point($0)"                   }
     { name = "source",  json-type = "string",   root-path = "$.DataSource.name"                                        }
   ]
 }
