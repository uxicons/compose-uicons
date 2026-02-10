package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YinYang: ImageVector? = null

val Icons.Rr.YinYang: ImageVector
    get() = _YinYang ?: UXIcon(name = "YinYang") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(6.73f, 20.5f)
                curveToRelative(-0.47f, -0.9f, -0.73f, -1.92f, -0.73f, -3f)
                curveToRelative(0f, -3.34f, 2.6f, -6.2f, 5.91f, -6.5f)
                curveToRelative(2.29f, -0.21f, 4.09f, -2.18f, 4.09f, -4.5f)
                reflectiveCurveToRelative(-1.91f, -4.39f, -4.3f, -4.5f)
                curveTo(6.33f, 2.16f, 2f, 6.59f, 2f, 12f)
                curveToRelative(0f, 3.58f, 1.89f, 6.73f, 4.73f, 8.5f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -3.58f, -1.89f, -6.73f, -4.73f, -8.5f)
                curveToRelative(0.47f, 0.9f, 0.73f, 1.92f, 0.73f, 3f)
                curveToRelative(0f, 3.34f, -2.6f, 6.2f, -5.91f, 6.5f)
                curveToRelative(-2.29f, 0.21f, -4.09f, 2.18f, -4.09f, 4.5f)
                reflectiveCurveToRelative(1.91f, 4.39f, 4.3f, 4.5f)
                curveToRelative(5.38f, -0.16f, 9.7f, -4.58f, 9.7f, -10f)
                close()
            }
        }.also { _YinYang = it}
