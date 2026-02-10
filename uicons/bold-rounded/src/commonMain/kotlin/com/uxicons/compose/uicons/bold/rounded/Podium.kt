package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Podium: ImageVector? = null

val Icons.Br.Podium: ImageVector
    get() = _Podium ?: UXIcon(name = "Podium") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 9f)
            lineTo(5f, 9f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            curveToRelative(0f, 0f, 0.66f, -0.01f, 0.74f, -0.02f)
            curveToRelative(0.46f, 0.62f, 1.19f, 1.02f, 2.01f, 1.02f)
            horizontalLineToRelative(4.25f)
            curveToRelative(3.29f, -0.06f, 3.29f, -4.95f, 0f, -5f)
            horizontalLineToRelative(-4.25f)
            curveToRelative(-0.83f, 0f, -1.56f, 0.4f, -2.01f, 1.02f)
            curveToRelative(-0.08f, -0.01f, -0.74f, -0.02f, -0.74f, -0.02f)
            curveTo(4.47f, 1f, 2f, 3.47f, 2f, 6.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(0.73f)
            lineToRelative(1.23f, 7.4f)
            curveToRelative(0.44f, 2.66f, 2.73f, 4.6f, 5.42f, 4.6f)
            horizontalLineToRelative(6.22f)
            curveToRelative(2.7f, 0f, 4.98f, -1.93f, 5.42f, -4.6f)
            lineToRelative(1.23f, -7.4f)
            horizontalLineToRelative(0.73f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            close()
            moveTo(17.58f, 18.91f)
            curveToRelative(-0.2f, 1.21f, -1.24f, 2.09f, -2.47f, 2.09f)
            horizontalLineToRelative(-6.22f)
            curveToRelative(-1.23f, 0f, -2.27f, -0.88f, -2.47f, -2.09f)
            lineToRelative(-1.15f, -6.91f)
            horizontalLineToRelative(13.46f)
            lineToRelative(-1.15f, 6.91f)
            close()
        }
    }.also { _Podium = it }
