package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteamIron: ImageVector? = null

val Icons.Sr.SteamIron: ImageVector
    get() = _SteamIron ?: UXIcon(name = "SteamIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                horizontalLineTo(10.46f)
                curveTo(5.27f, 11f, 0.91f, 14.71f, 0.08f, 19.88f)
                curveToRelative(-0.08f, 0.45f, -0.31f, 1.82f, 0.62f, 2.92f)
                curveToRelative(0.68f, 0.8f, 1.77f, 1.21f, 3.26f, 1.21f)
                horizontalLineToRelative(15.04f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineTo(11f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(3.11f, 8f)
                horizontalLineToRelative(0.34f)
                lineToRelative(1.2f, 1.6f)
                curveToRelative(0.37f, 0.53f, 1.23f, 0.53f, 1.6f, 0f)
                lineToRelative(1.2f, -1.6f)
                horizontalLineToRelative(0.55f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.43f, -1.01f, -2.63f, -2.36f, -2.93f)
                curveToRelative(-0.56f, -1.23f, -1.8f, -2.07f, -3.19f, -2.07f)
                curveToRelative(-1.41f, 0f, -2.66f, 0.85f, -3.21f, 2.1f)
                curveToRelative(-0.59f, 0.15f, -1.12f, 0.48f, -1.53f, 0.96f)
                curveTo(0.14f, 3.73f, -0.1f, 4.62f, 0.04f, 5.5f)
                curveToRelative(0.23f, 1.43f, 1.55f, 2.5f, 3.07f, 2.5f)
                close()
            }
        }.also { _SteamIron = it}
