package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabFolder: ImageVector? = null

val Icons.Br.TabFolder: ImageVector
    get() = _TabFolder ?: UXIcon(name = "TabFolder") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.8f, 3.16f)
            lineToRelative(-0.21f, -0.8f)
            curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
            horizontalLineToRelative(-2.65f)
            lineToRelative(0.67f, 2f)
            horizontalLineToRelative(-2.06f)
            lineToRelative(-0.21f, -0.63f)
            curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
            horizontalLineToRelative(-2.64f)
            lineToRelative(0.67f, 2f)
            horizontalLineToRelative(-2.08f)
            lineToRelative(-0.21f, -0.63f)
            curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
            horizontalLineToRelative(-1.38f)
            curveTo(1.79f, 1f, 0f, 2.79f, 0f, 5f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -2.58f, -1.79f, -4.75f, -4.2f, -5.34f)
            close()
            moveTo(21f, 17.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 20f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(17.95f)
            curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
            verticalLineToRelative(9f)
            close()
        }
    }.also { _TabFolder = it }
