package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Follow: ImageVector? = null

val Icons.Ts.Follow: ImageVector
    get() = _Follow ?: UXIcon(name = "Follow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
                moveTo(12f, 6f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(23.72f, 9.44f)
                curveToRelative(0.18f, 0.83f, 0.28f, 1.68f, 0.28f, 2.56f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
                curveToRelative(0.88f, 0f, 1.73f, 0.1f, 2.56f, 0.28f)
                curveToRelative(-0.24f, 0.28f, -0.45f, 0.58f, -0.64f, 0.9f)
                curveToRelative(-0.62f, -0.11f, -1.26f, -0.18f, -1.92f, -0.18f)
                curveToRelative(-6.06f, 0f, -11.0f, 4.93f, -11.0f, 11f)
                curveToRelative(0f, 3.85f, 1.99f, 7.24f, 5f, 9.21f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.71f)
                curveToRelative(3.01f, -1.97f, 5f, -5.36f, 5f, -9.21f)
                curveToRelative(0f, -0.66f, -0.07f, -1.29f, -0.18f, -1.92f)
                curveToRelative(0.32f, -0.19f, 0.62f, -0.4f, 0.9f, -0.64f)
                close()
                moveTo(12f, 23f)
                curveToRelative(1.8f, 0f, 3.5f, -0.44f, 5f, -1.21f)
                verticalLineToRelative(-3.29f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.29f)
                curveToRelative(1.5f, 0.77f, 3.2f, 1.21f, 5f, 1.21f)
                close()
            }
        }.also { _Follow = it}
