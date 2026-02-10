package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopLock: ImageVector? = null

val Icons.Sr.LaptopLock: ImageVector
    get() = _LaptopLock ?: UXIcon(name = "LaptopLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 17f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.04f, -1f, 0.11f)
                verticalLineToRelative(-6.11f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(3.35f)
                curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(-1.03f, -0.03f, -2.04f, 0.32f, -2.8f, 1f)
                horizontalLineToRelative(-2.4f)
                curveToRelative(-0.73f, -0.64f, -1.66f, -1f, -2.65f, -1f)
                close()
                moveTo(21.5f, 19f)
                horizontalLineToRelative(-5.65f)
                curveToRelative(-0.59f, 0f, -1.15f, 0.26f, -1.53f, 0.71f)
                lineToRelative(-0.25f, 0.29f)
                horizontalLineToRelative(-4.15f)
                lineToRelative(-0.25f, -0.29f)
                curveToRelative(-0.38f, -0.45f, -0.94f, -0.71f, -1.53f, -0.71f)
                horizontalLineToRelative(-5.65f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.47f, 0.81f, -2.75f, 2f, -3.44f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1.56f)
                curveToRelative(1.19f, 0.69f, 2f, 1.97f, 2f, 3.44f)
                close()
                moveTo(19.5f, 10f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20f, 4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _LaptopLock = it}
