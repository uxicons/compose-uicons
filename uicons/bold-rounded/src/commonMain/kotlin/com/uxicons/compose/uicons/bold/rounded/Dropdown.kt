package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dropdown: ImageVector? = null

val Icons.Br.Dropdown: ImageVector
    get() = _Dropdown ?: UXIcon(name = "Dropdown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 4f)
            lineTo(5.5f, 4f)
            curveTo(2.47f, 4f, 0f, 6.47f, 0f, 9.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 17f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(5f)
            close()
            moveTo(18.78f, 11.77f)
            lineToRelative(-1.95f, 1.92f)
            curveToRelative(-0.46f, 0.46f, -1.19f, 0.46f, -1.65f, 0f)
            lineToRelative(-1.95f, -1.92f)
            curveToRelative(-0.47f, -0.47f, -0.14f, -1.27f, 0.52f, -1.27f)
            horizontalLineToRelative(4.51f)
            curveToRelative(0.67f, 0f, 1.0f, 0.81f, 0.52f, 1.27f)
            close()
        }
    }.also { _Dropdown = it }
