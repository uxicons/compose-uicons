package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flickr: ImageVector? = null

val Icons.Brand.Flickr: ImageVector
    get() = _Flickr ?: UXIcon(name = "Flickr") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.43f, 0f)
            horizontalLineTo(2.57f)
            curveTo(1.15f, 0f, 0f, 1.15f, 0f, 2.57f)
            verticalLineToRelative(18.86f)
            curveTo(0f, 22.85f, 1.15f, 24f, 2.57f, 24f)
            horizontalLineToRelative(18.86f)
            curveTo(22.85f, 24f, 24f, 22.85f, 24f, 21.43f)
            verticalLineTo(2.57f)
            curveTo(24f, 1.15f, 22.85f, 0f, 21.43f, 0f)
            close()
            moveTo(7.74f, 15.38f)
            curveToRelative(-1.88f, 0f, -3.4f, -1.52f, -3.4f, -3.4f)
            reflectiveCurveToRelative(1.52f, -3.4f, 3.4f, -3.4f)
            reflectiveCurveToRelative(3.4f, 1.52f, 3.4f, 3.4f)
            reflectiveCurveTo(9.62f, 15.38f, 7.74f, 15.38f)
            close()
            moveTo(16.26f, 15.38f)
            curveToRelative(-1.88f, 0f, -3.4f, -1.52f, -3.4f, -3.4f)
            reflectiveCurveToRelative(1.52f, -3.4f, 3.4f, -3.4f)
            reflectiveCurveToRelative(3.4f, 1.52f, 3.4f, 3.4f)
            reflectiveCurveTo(18.14f, 15.38f, 16.26f, 15.38f)
            close()
        }
    }.also { _Flickr = it }
