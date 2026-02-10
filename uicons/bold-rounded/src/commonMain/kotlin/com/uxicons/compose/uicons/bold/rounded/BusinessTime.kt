package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessTime: ImageVector? = null

val Icons.Br.BusinessTime: ImageVector
    get() = _BusinessTime ?: UXIcon(name = "BusinessTime") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 14f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 8.5f)
            curveTo(0f, 5.47f, 2.47f, 3f, 5.5f, 3f)
            horizontalLineToRelative(0.63f)
            curveToRelative(0.45f, -1.72f, 2.01f, -3f, 3.87f, -3f)
            horizontalLineToRelative(4f)
            curveToRelative(1.86f, 0f, 3.43f, 1.28f, 3.87f, 3f)
            horizontalLineToRelative(0.63f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            curveToRelative(-0.03f, 1.97f, -2.97f, 1.97f, -3f, 0f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 6f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            lineTo(3f, 14f)
            close()
            moveTo(24f, 17.5f)
            curveToRelative(-0.27f, 8.59f, -12.74f, 8.59f, -13f, 0f)
            curveToRelative(0.27f, -8.59f, 12.74f, -8.59f, 13f, 0f)
            close()
            moveTo(19.84f, 17.72f)
            lineToRelative(-0.84f, -0.84f)
            verticalLineToRelative(-1.38f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            verticalLineToRelative(1.79f)
            curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
            lineToRelative(1.14f, 1.14f)
            curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
        }
    }.also { _BusinessTime = it }
