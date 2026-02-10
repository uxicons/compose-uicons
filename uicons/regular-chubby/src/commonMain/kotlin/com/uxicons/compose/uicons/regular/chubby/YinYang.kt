package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YinYang: ImageVector? = null

val Icons.Rc.YinYang: ImageVector
    get() = _YinYang ?: UXIcon(name = "YinYang") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                curveToRelative(-7.18f, -0.1f, -11.16f, 3.18f, -11f, 11f)
                curveToRelative(0f, 7.71f, 3.29f, 11f, 11f, 11f)
                curveToRelative(7.18f, 0.1f, 11.16f, -3.18f, 11f, -11f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -6.33f, 2.29f, -8.82f, 8.35f, -8.98f)
                curveToRelative(2.74f, 0.08f, 3.65f, 1.08f, 3.65f, 3.98f)
                curveToRelative(0f, 3.11f, -1.13f, 3.82f, -3.09f, 4.0f)
                curveToRelative(-3.35f, 0.31f, -4.91f, 2.21f, -4.91f, 6.0f)
                curveToRelative(0f, 1.43f, 0.24f, 2.57f, 0.69f, 3.47f)
                curveToRelative(-3.35f, -1.02f, -4.7f, -3.62f, -4.7f, -8.47f)
                close()
                moveTo(12.65f, 20.98f)
                curveToRelative(-2.74f, -0.08f, -3.65f, -1.08f, -3.65f, -3.98f)
                curveToRelative(0f, -3.11f, 1.13f, -3.82f, 3.09f, -4.0f)
                curveToRelative(3.35f, -0.31f, 4.91f, -2.21f, 4.91f, -6.0f)
                curveToRelative(0f, -1.43f, -0.24f, -2.57f, -0.69f, -3.47f)
                curveToRelative(3.35f, 1.02f, 4.7f, 3.62f, 4.7f, 8.47f)
                curveToRelative(0f, 6.33f, -2.29f, 8.82f, -8.35f, 8.98f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(14f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _YinYang = it}
