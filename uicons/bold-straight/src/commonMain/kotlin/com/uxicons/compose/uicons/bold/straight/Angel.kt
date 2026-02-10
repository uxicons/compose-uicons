package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angel: ImageVector? = null

val Icons.Bs.Angel: ImageVector
    get() = _Angel ?: UXIcon(name = "Angel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(8.06f, 4.87f)
                curveToRelative(0.12f, -0.7f, 0.41f, -1.34f, 0.84f, -1.87f)
                curveToRelative(0f, 0f, 0.6f, -1f, 3.1f, -1f)
                reflectiveCurveToRelative(3.1f, 1f, 3.1f, 1f)
                curveToRelative(0.43f, 0.53f, 0.73f, 1.17f, 0.84f, 1.87f)
                curveToRelative(0.66f, -0.51f, 1.06f, -1.15f, 1.06f, -1.87f)
                curveToRelative(0f, -1.71f, -2.15f, -3f, -5f, -3f)
                reflectiveCurveToRelative(-5f, 1.29f, -5f, 3f)
                curveToRelative(0f, 0.72f, 0.4f, 1.36f, 1.06f, 1.87f)
                close()
                moveTo(20f, 19f)
                verticalLineToRelative(1.4f)
                lineToRelative(1.59f, 3.6f)
                lineTo(2.41f, 24f)
                lineToRelative(1.59f, -3.6f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                lineTo(0f, 17f)
                curveTo(0f, 6f, 2.54f, 6f, 3.5f, 6f)
                curveToRelative(3.5f, 0f, 6.26f, 2.78f, 7.15f, 3.79f)
                curveToRelative(0.88f, 0.28f, 1.82f, 0.28f, 2.7f, 0f)
                curveToRelative(0.89f, -1.01f, 3.65f, -3.79f, 7.15f, -3.79f)
                curveToRelative(0.96f, 0f, 3.5f, 0f, 3.5f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16.0f, 11.34f)
                lineToRelative(2.5f, 5.66f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.95f)
                curveToRelative(-0.12f, -2.68f, -0.47f, -5.11f, -0.87f, -5.98f)
                curveToRelative(-1.74f, 0.19f, -3.28f, 1.51f, -4.08f, 2.32f)
                close()
                moveTo(3.05f, 15f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.5f)
                lineToRelative(2.5f, -5.66f)
                curveToRelative(-0.8f, -0.81f, -2.35f, -2.13f, -4.08f, -2.32f)
                curveToRelative(-0.4f, 0.86f, -0.75f, 3.3f, -0.87f, 5.98f)
                close()
                moveTo(16.99f, 21f)
                lineToRelative(-3.59f, -8.13f)
                curveToRelative(-0.92f, 0.18f, -1.87f, 0.18f, -2.79f, 0f)
                lineToRelative(-3.59f, 8.13f)
                horizontalLineToRelative(9.97f)
                close()
            }
        }.also { _Angel = it}
