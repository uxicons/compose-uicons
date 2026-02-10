package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YinYang: ImageVector? = null

val Icons.Br.YinYang: ImageVector
    get() = _YinYang ?: UXIcon(name = "YinYang") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 6.5f)
            moveToRelative(-1.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 17.5f)
            moveToRelative(-1.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(6.21f, 18.88f)
            curveToRelative(-1.96f, -1.65f, -3.21f, -4.12f, -3.21f, -6.88f)
            curveTo(3f, 7.14f, 6.87f, 3.18f, 11.7f, 3.02f)
            curveToRelative(1.83f, 0.26f, 3.3f, 1.88f, 3.3f, 3.73f)
            reflectiveCurveToRelative(-1.38f, 3.49f, -3.21f, 3.77f)
            curveToRelative(-3.3f, 0.47f, -5.79f, 3.37f, -5.79f, 6.73f)
            curveToRelative(0f, 0.56f, 0.08f, 1.1f, 0.21f, 1.63f)
            close()
            moveTo(12.31f, 20.99f)
            curveToRelative(-1.83f, -0.26f, -3.3f, -1.88f, -3.3f, -3.73f)
            reflectiveCurveToRelative(1.38f, -3.5f, 3.22f, -3.77f)
            curveToRelative(3.29f, -0.49f, 5.78f, -3.39f, 5.78f, -6.73f)
            curveToRelative(0f, -0.56f, -0.08f, -1.1f, -0.21f, -1.63f)
            curveToRelative(1.96f, 1.65f, 3.21f, 4.12f, 3.21f, 6.88f)
            curveToRelative(0f, 4.86f, -3.87f, 8.82f, -8.7f, 8.98f)
            close()
        }
    }.also { _YinYang = it }
