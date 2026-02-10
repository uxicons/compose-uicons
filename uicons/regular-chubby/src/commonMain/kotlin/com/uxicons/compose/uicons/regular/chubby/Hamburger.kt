package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamburger: ImageVector? = null

val Icons.Rc.Hamburger: ImageVector
    get() = _Hamburger ?: UXIcon(name = "Hamburger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13.06f)
                curveToRelative(0f, -1.01f, -0.54f, -1.89f, -1.34f, -2.38f)
                curveToRelative(-0.93f, -5.21f, -4.68f, -8.56f, -9.66f, -8.56f)
                reflectiveCurveTo(3.27f, 5.46f, 2.34f, 10.67f)
                curveToRelative(-0.81f, 0.49f, -1.34f, 1.38f, -1.34f, 2.38f)
                curveToRelative(0f, 0.98f, 0.51f, 1.84f, 1.27f, 2.34f)
                curveToRelative(0.94f, 5.81f, 5.99f, 6.49f, 9.73f, 6.49f)
                curveToRelative(4.07f, 0f, 8.83f, -0.75f, 9.73f, -6.49f)
                curveToRelative(0.76f, -0.5f, 1.27f, -1.36f, 1.27f, -2.33f)
                close()
                moveTo(9.54f, 15.22f)
                curveToRelative(0.04f, 0.1f, 0.06f, 0.21f, 0.06f, 0.32f)
                curveToRelative(0f, 0.5f, -0.41f, 0.9f, -0.93f, 0.9f)
                reflectiveCurveToRelative(-0.93f, -0.4f, -0.93f, -0.9f)
                curveToRelative(0f, -0.11f, 0.02f, -0.21f, 0.06f, -0.32f)
                curveToRelative(0.12f, -0.31f, 0.08f, -0.66f, -0.1f, -0.93f)
                reflectiveCurveToRelative(-0.5f, -0.44f, -0.83f, -0.44f)
                lineTo(3.83f, 13.86f)
                curveToRelative(-0.46f, 0f, -0.83f, -0.36f, -0.83f, -0.8f)
                reflectiveCurveToRelative(0.37f, -0.8f, 0.83f, -0.8f)
                lineTo(20.17f, 12.26f)
                curveToRelative(0.46f, 0f, 0.83f, 0.36f, 0.83f, 0.8f)
                reflectiveCurveToRelative(-0.37f, 0.8f, -0.83f, 0.8f)
                lineTo(10.47f, 13.86f)
                curveToRelative(-0.33f, 0f, -0.64f, 0.16f, -0.83f, 0.44f)
                reflectiveCurveToRelative(-0.23f, 0.62f, -0.1f, 0.93f)
                close()
                moveTo(12f, 4.11f)
                curveToRelative(3.77f, 0f, 6.57f, 2.32f, 7.52f, 6.14f)
                lineTo(4.47f, 10.26f)
                curveToRelative(0.96f, -3.82f, 3.76f, -6.14f, 7.53f, -6.14f)
                close()
                moveTo(12f, 19.89f)
                curveToRelative(-4.54f, 0f, -6.82f, -1.18f, -7.59f, -4.03f)
                horizontalLineToRelative(1.36f)
                curveToRelative(0.16f, 1.45f, 1.4f, 2.58f, 2.91f, 2.58f)
                reflectiveCurveToRelative(2.75f, -1.13f, 2.91f, -2.58f)
                horizontalLineToRelative(8.01f)
                curveToRelative(-0.74f, 2.88f, -2.97f, 4.03f, -7.6f, 4.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.69f, 6.94f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.0f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.99f, 8.21f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.0f, 0f)
            }
        }.also { _Hamburger = it}
