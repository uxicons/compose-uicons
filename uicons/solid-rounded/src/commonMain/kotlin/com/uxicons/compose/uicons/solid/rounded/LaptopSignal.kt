package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSignal: ImageVector? = null

val Icons.Sr.LaptopSignal: ImageVector
    get() = _LaptopSignal ?: UXIcon(name = "LaptopSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(20f, 8f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(16f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(15.85f, 19f)
                curveToRelative(-0.59f, 0f, -1.15f, 0.26f, -1.53f, 0.71f)
                lineToRelative(-0.25f, 0.29f)
                horizontalLineToRelative(-4.15f)
                lineToRelative(-0.25f, -0.29f)
                curveToRelative(-0.38f, -0.45f, -0.94f, -0.71f, -1.53f, -0.71f)
                horizontalLineToRelative(-5.65f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21f, 10.22f)
                curveToRelative(-0.53f, 0.48f, -1.23f, 0.78f, -2f, 0.78f)
                reflectiveCurveToRelative(-1.47f, -0.3f, -2f, -0.78f)
                curveToRelative(-0.53f, 0.48f, -1.23f, 0.78f, -2f, 0.78f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6.11f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.11f, 1f, -0.11f)
                horizontalLineToRelative(5.15f)
                curveToRelative(0.98f, 0f, 1.92f, 0.36f, 2.65f, 1f)
                horizontalLineToRelative(2.4f)
                curveToRelative(0.73f, -0.64f, 1.66f, -1f, 2.65f, -1f)
                horizontalLineToRelative(5.15f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.11f)
                verticalLineToRelative(-6.11f)
                curveToRelative(0f, -0.07f, -0.02f, -0.13f, -0.02f, -0.19f)
                curveToRelative(-0.37f, -0.13f, -0.7f, -0.33f, -0.98f, -0.59f)
                close()
            }
        }.also { _LaptopSignal = it}
