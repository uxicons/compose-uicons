package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sphere: ImageVector? = null

val Icons.Tr.Sphere: ImageVector
    get() = _Sphere ?: UXIcon(name = "Sphere") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 1f)
                curveToRelative(5.3f, 0f, 9.74f, 3.77f, 10.77f, 8.77f)
                curveToRelative(-1.93f, -1.66f, -5.98f, -2.77f, -10.77f, -2.77f)
                reflectiveCurveToRelative(-8.84f, 1.12f, -10.77f, 2.77f)
                curveTo(2.26f, 4.77f, 6.7f, 1f, 12f, 1f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 1.89f, -4.52f, 4f, -11f, 4f)
                reflectiveCurveTo(1f, 13.89f, 1f, 12f)
                reflectiveCurveToRelative(4.52f, -4f, 11f, -4f)
                reflectiveCurveToRelative(11f, 2.11f, 11f, 4f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-5.3f, 0f, -9.74f, -3.77f, -10.77f, -8.77f)
                curveToRelative(1.93f, 1.66f, 5.98f, 2.77f, 10.77f, 2.77f)
                reflectiveCurveToRelative(8.84f, -1.12f, 10.77f, -2.77f)
                curveToRelative(-1.03f, 5.0f, -5.47f, 8.77f, -10.77f, 8.77f)
                close()
            }
        }.also { _Sphere = it}
