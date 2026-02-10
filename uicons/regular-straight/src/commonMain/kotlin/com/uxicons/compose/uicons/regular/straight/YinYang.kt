package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YinYang: ImageVector? = null

val Icons.Rs.YinYang: ImageVector
    get() = _YinYang ?: UXIcon(name = "YinYang") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.59f, 6.33f, 2.16f, 11.7f, 2f)
                curveToRelative(2.39f, 0.11f, 4.3f, 2.08f, 4.3f, 4.5f)
                reflectiveCurveToRelative(-1.8f, 4.3f, -4.09f, 4.5f)
                curveToRelative(-3.31f, 0.3f, -5.91f, 3.15f, -5.91f, 6.5f)
                curveToRelative(0f, 1.08f, 0.27f, 2.1f, 0.73f, 3f)
                curveToRelative(-2.84f, -1.77f, -4.73f, -4.91f, -4.73f, -8.5f)
                close()
                moveTo(12.3f, 22f)
                curveToRelative(-2.39f, -0.11f, -4.3f, -2.08f, -4.3f, -4.5f)
                reflectiveCurveToRelative(1.8f, -4.3f, 4.09f, -4.5f)
                curveToRelative(3.31f, -0.3f, 5.91f, -3.15f, 5.91f, -6.5f)
                curveToRelative(0f, -1.08f, -0.27f, -2.1f, -0.73f, -3f)
                curveToRelative(2.84f, 1.77f, 4.73f, 4.91f, 4.73f, 8.5f)
                curveToRelative(0f, 5.41f, -4.33f, 9.84f, -9.7f, 10f)
                close()
                moveTo(10f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(14f, 17.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _YinYang = it}
