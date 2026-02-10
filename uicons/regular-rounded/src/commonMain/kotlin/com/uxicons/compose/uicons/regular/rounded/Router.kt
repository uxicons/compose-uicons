package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Router: ImageVector? = null

val Icons.Rr.Router: ImageVector
    get() = _Router ?: UXIcon(name = "Router") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                lineTo(4f, 15f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(4f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                close()
                moveTo(15f, 5f)
                curveToRelative(1.82f, 0f, 3.53f, 0.71f, 4.81f, 1.99f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.91f, -0.91f, -2.11f, -1.41f, -3.4f, -1.41f)
                reflectiveCurveToRelative(-2.49f, 0.5f, -3.4f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(1.28f, -1.28f, 2.99f, -1.99f, 4.81f, -1.99f)
                close()
                moveTo(6f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(6.22f, 3.82f)
                curveTo(8.48f, 1.39f, 11.68f, 0f, 15f, 0f)
                reflectiveCurveToRelative(6.52f, 1.39f, 8.78f, 3.82f)
                curveToRelative(0.38f, 0.4f, 0.35f, 1.04f, -0.05f, 1.41f)
                curveToRelative(-0.19f, 0.18f, -0.44f, 0.27f, -0.68f, 0.27f)
                curveToRelative(-0.27f, 0f, -0.53f, -0.11f, -0.73f, -0.32f)
                curveToRelative(-1.89f, -2.02f, -4.55f, -3.18f, -7.32f, -3.18f)
                reflectiveCurveToRelative(-5.43f, 1.16f, -7.32f, 3.18f)
                curveToRelative(-0.38f, 0.4f, -1.01f, 0.42f, -1.41f, 0.05f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                close()
            }
        }.also { _Router = it}
