package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSlash: ImageVector? = null

val Icons.Sr.LaptopSlash: ImageVector
    get() = _LaptopSlash ?: UXIcon(name = "LaptopSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(3.18f, 3.18f)
                curveToRelative(0.64f, -0.3f, 1.36f, -0.47f, 2.12f, -0.47f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(6.11f)
                curveToRelative(-0.32f, -0.07f, -0.66f, -0.11f, -1f, -0.11f)
                horizontalLineToRelative(-5.15f)
                curveToRelative(-0.14f, 0f, -0.28f, 0.01f, -0.41f, 0.02f)
                lineToRelative(1.98f, 1.98f)
                horizontalLineToRelative(4.09f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.11f, -0.72f, 2.04f, -1.71f, 2.37f)
                lineToRelative(1.42f, 1.42f)
                close()
                moveTo(8.15f, 14f)
                curveToRelative(0.93f, 0f, 1.81f, 0.32f, 2.52f, 0.89f)
                lineTo(2.24f, 6.46f)
                curveToRelative(-0.16f, 0.48f, -0.24f, 1.0f, -0.24f, 1.54f)
                verticalLineToRelative(6.11f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.11f, 1f, -0.11f)
                horizontalLineToRelative(5.15f)
                close()
                moveTo(9.93f, 17f)
                lineToRelative(-0.25f, -0.29f)
                curveToRelative(-0.38f, -0.45f, -0.94f, -0.71f, -1.53f, -0.71f)
                lineTo(2.5f, 16f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(14.28f)
                lineToRelative(-4f, -4f)
                horizontalLineToRelative(-2.85f)
                close()
            }
        }.also { _LaptopSlash = it}
