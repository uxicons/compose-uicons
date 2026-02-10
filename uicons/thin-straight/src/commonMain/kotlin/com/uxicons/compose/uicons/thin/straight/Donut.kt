package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Donut: ImageVector? = null

val Icons.Ts.Donut: ImageVector
    get() = _Donut ?: UXIcon(name = "Donut") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(2.52f, 0f, 4.97f, -0.8f, 7f, -2.25f)
                verticalLineToRelative(-1.28f)
                curveToRelative(-1.96f, 1.62f, -4.43f, 2.53f, -7f, 2.53f)
                curveToRelative(-6.07f, 0f, -11.0f, -4.93f, -11f, -11.0f)
                curveToRelative(0.61f, 0.03f, 1.08f, 0.56f, 1.38f, 1.0f)
                curveToRelative(0.43f, 0.65f, 1.01f, 1.0f, 1.62f, 1.0f)
                reflectiveCurveToRelative(1.19f, -0.35f, 1.62f, -1.0f)
                curveToRelative(0.29f, -0.44f, 0.77f, -0.96f, 1.38f, -1.0f)
                curveToRelative(0f, 2.76f, 2.24f, 5.0f, 5f, 5.0f)
                curveToRelative(1.63f, 0f, 3.09f, -0.79f, 4f, -2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-8.5f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(23f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-0.85f, 0f, -1.64f, 0.5f, -2.27f, 1.44f)
                curveToRelative(-0.48f, 0.72f, -1.1f, 0.72f, -1.58f, 0f)
                curveToRelative(-0.6f, -0.9f, -1.35f, -1.4f, -2.16f, -1.44f)
                curveTo(1.55f, 5.4f, 6.27f, 1f, 12f, 1f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                verticalLineToRelative(8.5f)
                close()
            }
        }.also { _Donut = it}
