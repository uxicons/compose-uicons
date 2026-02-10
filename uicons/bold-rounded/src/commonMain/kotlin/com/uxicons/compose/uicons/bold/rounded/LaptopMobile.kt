package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMobile: ImageVector? = null

val Icons.Br.LaptopMobile: ImageVector
    get() = _LaptopMobile ?: UXIcon(name = "LaptopMobile") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 9f)
            horizontalLineToRelative(-2f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(2f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(21f, 20f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(7f)
            close()
            moveTo(9.23f, 14f)
            horizontalLineToRelative(2.77f)
            verticalLineToRelative(4f)
            lineTo(1.85f, 18f)
            curveToRelative(-1.02f, 0f, -1.85f, -0.83f, -1.85f, -1.85f)
            verticalLineToRelative(-1.15f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            lineTo(2f, 5.5f)
            curveTo(2f, 2.47f, 4.47f, 0f, 7.5f, 0f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(7.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(3.31f)
            lineToRelative(0.92f, 1f)
            close()
        }
    }.also { _LaptopMobile = it }
