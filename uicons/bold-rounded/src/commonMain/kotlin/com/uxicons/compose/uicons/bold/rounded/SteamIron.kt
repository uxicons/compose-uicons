package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteamIron: ImageVector? = null

val Icons.Br.SteamIron: ImageVector
    get() = _SteamIron ?: UXIcon(name = "SteamIron") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.01f, 4.76f)
            curveToRelative(-0.15f, -1.5f, 1.02f, -2.76f, 2.49f, -2.76f)
            curveToRelative(0.19f, 0f, 0.56f, 0f, 0.56f, 0f)
            curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.44f, -2f)
            reflectiveCurveToRelative(2.21f, 0.86f, 2.44f, 2f)
            curveToRelative(0f, 0f, 0.37f, 0f, 0.56f, 0f)
            curveToRelative(1.47f, 0f, 2.64f, 1.26f, 2.49f, 2.76f)
            curveToRelative(-0.13f, 1.3f, -1.32f, 2.24f, -2.63f, 2.24f)
            horizontalLineToRelative(-0.86f)
            lineToRelative(-1.38f, 2.07f)
            curveToRelative(-0.3f, 0.44f, -0.95f, 0.44f, -1.24f, 0f)
            lineToRelative(-1.38f, -2.07f)
            horizontalLineToRelative(-0.86f)
            curveTo(1.33f, 7f, 0.14f, 6.06f, 0.01f, 4.76f)
            close()
            moveTo(24f, 9.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(4.37f, 24f)
            curveToRelative(-1.62f, 0f, -2.82f, -0.47f, -3.58f, -1.39f)
            curveToRelative(-0.71f, -0.86f, -0.95f, -2.04f, -0.68f, -3.4f)
            curveToRelative(1.03f, -5.22f, 4.77f, -8.21f, 10.26f, -8.21f)
            horizontalLineToRelative(10.63f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
            close()
            moveTo(21f, 14f)
            lineTo(10.37f, 14f)
            curveToRelative(-4.1f, 0f, -6.56f, 1.95f, -7.32f, 5.79f)
            curveToRelative(-0.08f, 0.42f, -0.06f, 0.77f, 0.05f, 0.91f)
            curveToRelative(0.12f, 0.14f, 0.51f, 0.3f, 1.27f, 0.3f)
            horizontalLineToRelative(14.13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4.5f)
            close()
        }
    }.also { _SteamIron = it }
