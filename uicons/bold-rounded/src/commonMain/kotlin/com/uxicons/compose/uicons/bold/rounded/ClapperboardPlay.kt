package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperboardPlay: ImageVector? = null

val Icons.Br.ClapperboardPlay: ImageVector
    get() = _ClapperboardPlay ?: UXIcon(name = "ClapperboardPlay") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 1f)
            lineTo(5.5f, 1f)
            curveTo(2.47f, 1f, 0f, 3.47f, 0f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 6.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 7f)
            horizontalLineToRelative(-3.88f)
            lineToRelative(2.65f, -2.65f)
            curveToRelative(0.73f, 0.44f, 1.23f, 1.24f, 1.23f, 2.15f)
            verticalLineToRelative(0.5f)
            close()
            moveTo(9.12f, 7f)
            lineToRelative(3f, -3f)
            horizontalLineToRelative(3.76f)
            lineToRelative(-3f, 3f)
            horizontalLineToRelative(-3.76f)
            close()
            moveTo(5.5f, 4f)
            horizontalLineToRelative(2.38f)
            lineToRelative(-3f, 3f)
            horizontalLineToRelative(-1.88f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(18.5f, 20f)
            lineTo(5.5f, 20f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7.5f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(15.05f, 15.8f)
            lineToRelative(-4.63f, 2.48f)
            curveToRelative(-0.62f, 0.37f, -1.41f, -0.07f, -1.41f, -0.8f)
            verticalLineToRelative(-4.96f)
            curveToRelative(0f, -0.72f, 0.79f, -1.17f, 1.41f, -0.8f)
            lineToRelative(4.63f, 2.48f)
            curveToRelative(0.6f, 0.36f, 0.6f, 1.24f, 0f, 1.6f)
            close()
        }
    }.also { _ClapperboardPlay = it }
