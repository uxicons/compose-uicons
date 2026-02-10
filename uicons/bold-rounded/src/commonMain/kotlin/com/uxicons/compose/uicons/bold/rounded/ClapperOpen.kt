package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperOpen: ImageVector? = null

val Icons.Br.ClapperOpen: ImageVector
    get() = _ClapperOpen ?: UXIcon(name = "ClapperOpen") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 11f)
            lineTo(7.07f, 11f)
            lineToRelative(15.28f, -3.6f)
            curveToRelative(0.8f, -0.19f, 1.3f, -0.98f, 1.12f, -1.79f)
            lineToRelative(-0.47f, -2.09f)
            curveToRelative(-0.48f, -2.4f, -3.06f, -4.0f, -5.43f, -3.4f)
            lineTo(3.48f, 3.54f)
            curveTo(1.08f, 4.1f, -0.43f, 6.5f, 0.11f, 8.92f)
            lineToRelative(0.89f, 3.75f)
            verticalLineToRelative(5.83f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(12f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(14.14f, 4.04f)
            lineToRelative(-1.66f, 2.6f)
            lineToRelative(-3.71f, 0.88f)
            lineToRelative(1.65f, -2.57f)
            lineToRelative(3.73f, -0.91f)
            close()
            moveTo(20.07f, 4.17f)
            lineToRelative(0.14f, 0.64f)
            lineToRelative(-3.54f, 0.84f)
            lineToRelative(1.68f, -2.62f)
            curveToRelative(0.09f, -0.02f, 0.17f, -0.03f, 0.26f, -0.03f)
            curveToRelative(0.68f, -0.01f, 1.32f, 0.5f, 1.46f, 1.17f)
            close()
            moveTo(4.17f, 6.46f)
            lineToRelative(2.02f, -0.49f)
            lineToRelative(-1.62f, 2.54f)
            lineToRelative(-1.4f, 0.33f)
            lineToRelative(-0.14f, -0.59f)
            curveToRelative(-0.18f, -0.8f, 0.33f, -1.6f, 1.14f, -1.79f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(6.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-4.5f)
            lineTo(21f, 14f)
            verticalLineToRelative(4.5f)
            close()
        }
    }.also { _ClapperOpen = it }
