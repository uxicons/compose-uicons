package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Books: ImageVector? = null

val Icons.Br.Books: ImageVector
    get() = _Books ?: UXIcon(name = "Books") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 16f)
            lineTo(7f, 16f)
            lineTo(7f, 8f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(8f)
            close()
            moveTo(5f, 8f)
            lineTo(0f, 8f)
            verticalLineToRelative(8f)
            lineTo(5f, 16f)
            lineTo(5f, 8f)
            close()
            moveTo(12f, 5f)
            lineTo(12f, 2f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(5f)
            close()
            moveTo(7f, 19f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(1f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-3f)
            lineTo(7f, 19f)
            close()
            moveTo(0f, 19f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(1f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-3f)
            lineTo(0f, 19f)
            close()
            moveTo(5f, 5f)
            lineTo(5f, 2f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-1f)
            curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
            verticalLineToRelative(3f)
            lineTo(5f, 5f)
            close()
            moveTo(19.12f, 7.24f)
            lineToRelative(-4.76f, 1.52f)
            lineToRelative(2.63f, 8.19f)
            lineToRelative(4.76f, -1.52f)
            lineToRelative(-2.63f, -8.19f)
            close()
            moveTo(18.21f, 4.38f)
            lineToRelative(-0.99f, -2.99f)
            curveToRelative(-0.34f, -1.05f, -1.46f, -1.63f, -2.52f, -1.29f)
            lineToRelative(-0.95f, 0.3f)
            curveToRelative(-1.05f, 0.34f, -1.63f, 1.46f, -1.29f, 2.52f)
            lineToRelative(0.99f, 2.99f)
            lineToRelative(4.76f, -1.52f)
            close()
            moveTo(17.9f, 19.81f)
            lineToRelative(0.84f, 2.8f)
            curveToRelative(0.34f, 1.05f, 1.46f, 1.63f, 2.52f, 1.29f)
            lineToRelative(0.95f, -0.3f)
            curveToRelative(1.05f, -0.34f, 1.63f, -1.46f, 1.29f, -2.52f)
            lineToRelative(-0.84f, -2.8f)
            lineToRelative(-4.76f, 1.52f)
            close()
        }
    }.also { _Books = it }
