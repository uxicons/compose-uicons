package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Donut: ImageVector? = null

val Icons.Rs.Donut: ImageVector
    get() = _Donut ?: UXIcon(name = "Donut") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(3.08f, 0f, 5.88f, -1.17f, 8f, -3.08f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(-1.67f, 1.25f, -3.73f, 2f, -5.97f, 2f)
                curveToRelative(-5.16f, 0f, -9.41f, -3.92f, -9.94f, -8.94f)
                curveToRelative(0.22f, 0.07f, 0.43f, 0.18f, 0.62f, 0.33f)
                curveToRelative(0.51f, 0.4f, 1.16f, 0.61f, 1.82f, 0.61f)
                reflectiveCurveToRelative(1.31f, -0.22f, 1.82f, -0.61f)
                curveToRelative(0.23f, -0.18f, 0.5f, -0.31f, 0.78f, -0.37f)
                curveToRelative(0.47f, 2.27f, 2.49f, 3.99f, 4.9f, 3.99f)
                reflectiveCurveToRelative(4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.54f, 0f, 0.98f, 0.43f, 1f, 0.99f)
                verticalLineToRelative(4.01f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.02f, -0.56f, 0.46f, -1.0f, 1f, -1.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(21f, 11f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.29f, -2.0f, 0.77f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.77f, -2.0f, -0.77f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                reflectiveCurveToRelative(-4.43f, 1.72f, -4.9f, 3.99f)
                curveToRelative(-0.73f, 0.08f, -1.42f, 0.36f, -2.01f, 0.82f)
                curveToRelative(-0.32f, 0.25f, -0.86f, 0.25f, -1.19f, 0f)
                curveToRelative(-0.55f, -0.42f, -1.18f, -0.7f, -1.86f, -0.8f)
                curveTo(2.55f, 5.96f, 6.82f, 2f, 12f, 2f)
                curveToRelative(5.23f, 0f, 9.54f, 4.04f, 9.96f, 9.16f)
                curveToRelative(-0.3f, -0.1f, -0.63f, -0.16f, -0.96f, -0.16f)
                close()
            }
        }.also { _Donut = it}
