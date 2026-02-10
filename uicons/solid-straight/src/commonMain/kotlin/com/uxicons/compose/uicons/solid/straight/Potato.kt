package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Potato: ImageVector? = null

val Icons.Ss.Potato: ImageVector
    get() = _Potato ?: UXIcon(name = "Potato") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.57f, 1.1f)
                curveToRelative(-2.35f, -1.5f, -5.39f, -1.49f, -7.75f, 0.02f)
                curveToRelative(-1.09f, 0.7f, -1.94f, 1.61f, -2.52f, 2.72f)
                curveToRelative(-0.76f, 1.43f, -1.9f, 2.36f, -3.2f, 2.62f)
                curveToRelative(-2.44f, 0.49f, -4.5f, 1.95f, -5.82f, 4.1f)
                curveToRelative(-2.13f, 3.48f, -1.53f, 8.07f, 1.41f, 10.93f)
                curveToRelative(1.67f, 1.61f, 3.86f, 2.5f, 6.18f, 2.5f)
                curveToRelative(8.2f, 0f, 15.13f, -7.65f, 15.13f, -16.7f)
                curveToRelative(0f, -2.5f, -1.28f, -4.82f, -3.42f, -6.19f)
                close()
                moveTo(7.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 15f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Potato = it}
