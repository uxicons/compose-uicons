package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YinYang: ImageVector? = null

val Icons.Sc.YinYang: ImageVector
    get() = _YinYang ?: UXIcon(name = "YinYang") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 18f)
                curveToRelative(0f, -4.1f, 1.58f, -6.39f, 4.82f, -6.98f)
                curveToRelative(1.65f, -0.3f, 3.18f, -1.12f, 3.18f, -5.02f)
                curveToRelative(0f, -3.42f, -1.06f, -4.77f, -4.12f, -4.97f)
                curveToRelative(-6.91f, 0.32f, -9.88f, 3.64f, -9.88f, 10.97f)
                curveToRelative(0f, 6.27f, 2.18f, 9.62f, 7.14f, 10.65f)
                curveToRelative(-0.77f, -1.12f, -1.14f, -2.65f, -1.14f, -4.65f)
                close()
                moveTo(10.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(15.86f, 1.35f)
                curveToRelative(0.77f, 1.12f, 1.14f, 2.65f, 1.14f, 4.65f)
                curveToRelative(0f, 4.1f, -1.58f, 6.39f, -4.82f, 6.98f)
                curveToRelative(-1.65f, 0.3f, -3.18f, 1.12f, -3.18f, 5.02f)
                curveToRelative(0f, 3.42f, 1.06f, 4.77f, 4.12f, 4.97f)
                curveToRelative(6.91f, -0.32f, 9.88f, -3.64f, 9.88f, -10.97f)
                curveToRelative(0f, -6.27f, -2.18f, -9.62f, -7.14f, -10.65f)
                close()
                moveTo(13.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _YinYang = it}
