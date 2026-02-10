package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMobile: ImageVector? = null

val Icons.Sr.LaptopMobile: ImageVector
    get() = _LaptopMobile ?: UXIcon(name = "LaptopMobile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 24f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 14f)
                horizontalLineToRelative(-3f)
                lineToRelative(-0.25f, -0.29f)
                curveToRelative(-0.38f, -0.45f, -0.94f, -0.71f, -1.53f, -0.71f)
                lineTo(2.5f, 13f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(12f, 18f)
                verticalLineToRelative(-4f)
                close()
                moveTo(7.23f, 11f)
                curveToRelative(0.98f, 0f, 1.92f, 0.36f, 2.65f, 1f)
                horizontalLineToRelative(2.22f)
                curveToRelative(0.48f, -2.83f, 2.94f, -5f, 5.91f, -5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.7f, 0f, 1.37f, 0.13f, 2f, 0.35f)
                verticalLineToRelative(-2.35f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(6.11f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.11f, 1f, -0.11f)
                lineTo(7.23f, 11f)
                close()
            }
        }.also { _LaptopMobile = it}
