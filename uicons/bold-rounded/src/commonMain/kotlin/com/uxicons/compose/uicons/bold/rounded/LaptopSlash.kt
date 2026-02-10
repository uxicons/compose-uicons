package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSlash: ImageVector? = null

val Icons.Br.LaptopSlash: ImageVector
    get() = _LaptopSlash ?: UXIcon(name = "LaptopSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.79f, 19.75f)
            curveToRelative(0.46f, 0.46f, 0.14f, 1.25f, -0.52f, 1.25f)
            lineTo(1.85f, 21f)
            curveToRelative(-1.02f, 0f, -1.85f, -0.83f, -1.85f, -1.85f)
            verticalLineToRelative(-1.15f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(3.31f)
            lineToRelative(0.92f, 1f)
            horizontalLineToRelative(2.33f)
            curveToRelative(0.32f, 0f, 0.62f, 0.12f, 0.84f, 0.35f)
            lineToRelative(2.4f, 2.4f)
            close()
            moveTo(22.94f, 20.82f)
            lineToRelative(0.62f, 0.62f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            curveTo(1.02f, -0.15f, 1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(2.94f, 2.94f)
            curveToRelative(0.64f, -0.25f, 1.32f, -0.38f, 2.0f, -0.38f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(7.5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(1.15f)
            curveToRelative(0f, 0.74f, -0.43f, 1.37f, -1.06f, 1.67f)
            close()
            moveTo(8.12f, 6f)
            lineToRelative(10f, 10f)
            horizontalLineToRelative(0.88f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-8.38f)
            close()
        }
    }.also { _LaptopSlash = it }
