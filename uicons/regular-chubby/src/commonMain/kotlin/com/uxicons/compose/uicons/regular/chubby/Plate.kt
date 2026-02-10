package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plate: ImageVector? = null

val Icons.Rc.Plate: ImageVector
    get() = _Plate ?: UXIcon(name = "Plate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                curveToRelative(0f, 7.5f, 3.5f, 11f, 11f, 11f)
                curveToRelative(5.12f, 0f, 11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.39f, 0f, -9f, -2.61f, -9f, -9f)
                curveTo(3f, 4.53f, 6.6f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                reflectiveCurveToRelative(-3.6f, 9f, -9f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 4.51f, -1.01f, 5f, -5f, 5f)
                curveToRelative(-4.16f, 0f, -5f, -0.84f, -5f, -5f)
                curveToRelative(0f, -4.51f, 1.01f, -5f, 5f, -5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(-4.74f, 0f, -7f, 1.05f, -7f, 7f)
                curveToRelative(0f, 5.23f, 1.77f, 7f, 7f, 7f)
                curveToRelative(4.74f, 0f, 7f, -1.05f, 7f, -7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Plate = it}
