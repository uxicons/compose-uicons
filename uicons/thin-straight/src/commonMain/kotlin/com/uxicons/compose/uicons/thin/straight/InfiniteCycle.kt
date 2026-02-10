package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InfiniteCycle: ImageVector? = null

val Icons.Ts.InfiniteCycle: ImageVector
    get() = _InfiniteCycle ?: UXIcon(name = "InfiniteCycle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-4.03f, 0f, -7.79f, -2.07f, -10f, -5.41f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.19f)
                curveToRelative(2.02f, 3.09f, 5.48f, 5f, 9.19f, 5f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                close()
                moveTo(12f, 1f)
                curveToRelative(3.71f, 0f, 7.17f, 1.91f, 9.19f, 5f)
                horizontalLineToRelative(-4.19f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.41f)
                curveToRelative(-2.21f, -3.35f, -5.97f, -5.41f, -10f, -5.41f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -6.07f, 4.93f, -11f, 11f, -11f)
                close()
                moveTo(16f, 9f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                curveToRelative(-1.48f, 0f, -3.24f, -1.55f, -4f, -2.29f)
                curveToRelative(-0.76f, 0.74f, -2.52f, 2.29f, -4f, 2.29f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                curveToRelative(1.48f, 0f, 3.24f, 1.55f, 4f, 2.29f)
                curveToRelative(0.76f, -0.74f, 2.52f, -2.29f, 4f, -2.29f)
                close()
                moveTo(11.3f, 12f)
                curveToRelative(-0.79f, -0.77f, -2.28f, -2f, -3.3f, -2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(1.01f, 0f, 2.5f, -1.24f, 3.3f, -2f)
                close()
                moveTo(16f, 10f)
                curveToRelative(-1.01f, 0f, -2.5f, 1.24f, -3.3f, 2f)
                curveToRelative(0.79f, 0.77f, 2.28f, 2f, 3.3f, 2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _InfiniteCycle = it}
