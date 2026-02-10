package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unity: ImageVector? = null

val Icons.Brand.Unity: ImageVector
    get() = _Unity ?: UXIcon(name = "Unity") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.9f, 14.71f)
            verticalLineToRelative(-4.41f)
            curveToRelative(0f, -0.2f, -0.15f, -0.3f, -0.3f, -0.2f)
            lineToRelative(-4.5f, 2.6f)
            curveToRelative(-0.1f, 0.05f, -0.2f, 0.2f, -0.2f, 0.35f)
            verticalLineToRelative(5.2f)
            curveToRelative(0f, 0.2f, 0.15f, 0.3f, 0.3f, 0.2f)
            lineTo(18f, 16.26f)
            lineToRelative(3.71f, 2.15f)
            lineToRelative(-9.66f, 5.58f)
            lineTo(12.03f, 24f)
            lineToRelative(-0.03f, -0.01f)
            lineTo(5.46f, 20.2f)
            lineTo(2.36f, 18.4f)
            lineToRelative(3.69f, -2.14f)
            lineToRelative(3.81f, 2.2f)
            curveToRelative(0.15f, 0.1f, 0.3f, -0.05f, 0.25f, -0.25f)
            verticalLineToRelative(-5.21f)
            curveToRelative(0f, -0.15f, -0.05f, -0.25f, -0.2f, -0.34f)
            lineToRelative(-4.5f, -2.6f)
            curveToRelative(-0.1f, -0.05f, -0.3f, 0.05f, -0.3f, 0.2f)
            verticalLineToRelative(4.4f)
            lineToRelative(-3.7f, 2.15f)
            verticalLineTo(5.61f)
            lineTo(11.15f, 0f)
            verticalLineToRelative(4.3f)
            lineTo(7.34f, 6.51f)
            curveToRelative(-0.15f, 0.04f, -0.15f, 0.3f, 0f, 0.34f)
            lineToRelative(4.5f, 2.6f)
            curveToRelative(0.1f, 0.05f, 0.26f, 0.1f, 0.41f, 0f)
            lineToRelative(4.5f, -2.6f)
            curveToRelative(0.15f, -0.04f, 0.15f, -0.25f, 0f, -0.34f)
            lineTo(12.95f, 4.3f)
            verticalLineTo(0f)
            lineToRelative(9.66f, 5.61f)
            verticalLineToRelative(11.18f)
            lineTo(18.9f, 14.71f)
            close()
        }
    }.also { _Unity = it }
