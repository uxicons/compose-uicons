package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Follow: ImageVector? = null

val Icons.Rr.Follow: ImageVector
    get() = _Follow ?: UXIcon(name = "Follow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(23.8f, 9.82f)
                curveToRelative(0.13f, 0.71f, 0.2f, 1.45f, 0.2f, 2.18f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
                curveToRelative(0.73f, 0f, 1.47f, 0.07f, 2.18f, 0.2f)
                curveToRelative(0.54f, 0.1f, 0.9f, 0.62f, 0.8f, 1.16f)
                curveToRelative(-0.1f, 0.54f, -0.61f, 0.9f, -1.16f, 0.8f)
                curveToRelative(-0.59f, -0.11f, -1.21f, -0.17f, -1.82f, -0.17f)
                curveToRelative(-5.51f, 0f, -10.0f, 4.49f, -10.0f, 10f)
                curveToRelative(0f, 3.39f, 1.7f, 6.38f, 4.28f, 8.19f)
                curveToRelative(0.77f, -2.46f, 3.04f, -4.19f, 5.72f, -4.19f)
                reflectiveCurveToRelative(4.95f, 1.74f, 5.72f, 4.19f)
                curveToRelative(2.58f, -1.81f, 4.28f, -4.8f, 4.28f, -8.19f)
                curveToRelative(0f, -0.61f, -0.06f, -1.22f, -0.17f, -1.82f)
                curveToRelative(-0.1f, -0.54f, 0.26f, -1.06f, 0.8f, -1.16f)
                curveToRelative(0.54f, -0.1f, 1.06f, 0.26f, 1.16f, 0.8f)
                close()
                moveTo(12f, 22f)
                curveToRelative(1.38f, 0f, 2.7f, -0.28f, 3.9f, -0.79f)
                curveToRelative(-0.37f, -1.85f, -1.98f, -3.21f, -3.9f, -3.21f)
                reflectiveCurveToRelative(-3.53f, 1.36f, -3.9f, 3.21f)
                curveToRelative(1.2f, 0.51f, 2.52f, 0.79f, 3.9f, 0.79f)
                close()
                moveTo(16f, 10f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(14f, 10f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _Follow = it}
