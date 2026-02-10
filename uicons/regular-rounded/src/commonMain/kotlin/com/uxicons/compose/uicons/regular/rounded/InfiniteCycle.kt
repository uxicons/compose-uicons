package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InfiniteCycle: ImageVector? = null

val Icons.Rr.InfiniteCycle: ImageVector
    get() = _InfiniteCycle ?: UXIcon(name = "InfiniteCycle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-3.48f, 0f, -6.74f, -1.54f, -9f, -4.1f)
                verticalLineToRelative(2.1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.99f)
                curveToRelative(1.88f, 2.49f, 4.84f, 4f, 7.99f, 4f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -5.51f, 4.49f, -10f, 10f, -10f)
                curveToRelative(3.15f, 0f, 6.12f, 1.51f, 7.99f, 4f)
                horizontalLineToRelative(-2.99f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.1f)
                curveToRelative(-2.26f, -2.56f, -5.52f, -4.1f, -9f, -4.1f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(15.5f, 8.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.39f, 0f, -2.69f, -1.08f, -3.5f, -1.95f)
                curveToRelative(-0.81f, 0.86f, -2.11f, 1.95f, -3.5f, 1.95f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.39f, 0f, 2.69f, 1.08f, 3.5f, 1.95f)
                curveToRelative(0.81f, -0.86f, 2.11f, -1.95f, 3.5f, -1.95f)
                close()
                moveTo(10.71f, 12f)
                curveToRelative(-0.67f, -0.74f, -1.59f, -1.5f, -2.21f, -1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.61f, 0f, 1.53f, -0.76f, 2.21f, -1.5f)
                close()
                moveTo(15.5f, 10.5f)
                curveToRelative(-0.61f, 0f, -1.53f, 0.76f, -2.21f, 1.5f)
                curveToRelative(0.67f, 0.74f, 1.59f, 1.5f, 2.21f, 1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _InfiniteCycle = it}
