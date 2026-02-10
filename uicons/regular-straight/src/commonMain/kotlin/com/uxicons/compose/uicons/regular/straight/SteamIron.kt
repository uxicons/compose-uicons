package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteamIron: ImageVector? = null

val Icons.Rs.SteamIron: ImageVector
    get() = _SteamIron ?: UXIcon(name = "SteamIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                lineTo(10.5f, 11f)
                curveTo(4.71f, 11f, 0f, 15.71f, 0f, 21.5f)
                verticalLineToRelative(2.5f)
                lineTo(24f, 24f)
                lineTo(24f, 10f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.69f, 3.81f, -8.5f, 8.5f, -8.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(9f)
                close()
                moveTo(3.11f, 8f)
                horizontalLineToRelative(0.34f)
                lineToRelative(2f, 2.67f)
                lineToRelative(2f, -2.67f)
                horizontalLineToRelative(0.55f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.43f, -1.01f, -2.63f, -2.36f, -2.93f)
                curveToRelative(-0.56f, -1.23f, -1.8f, -2.07f, -3.19f, -2.07f)
                curveToRelative(-1.41f, 0f, -2.66f, 0.85f, -3.21f, 2.1f)
                curveToRelative(-0.59f, 0.15f, -1.12f, 0.48f, -1.53f, 0.96f)
                curveTo(0.14f, 3.73f, -0.1f, 4.62f, 0.04f, 5.5f)
                curveToRelative(0.23f, 1.43f, 1.55f, 2.5f, 3.07f, 2.5f)
                close()
                moveTo(2.24f, 4.35f)
                curveToRelative(0.19f, -0.22f, 0.47f, -0.35f, 0.76f, -0.35f)
                horizontalLineToRelative(0.82f)
                lineToRelative(0.16f, -0.8f)
                curveToRelative(0.14f, -0.69f, 0.76f, -1.2f, 1.47f, -1.2f)
                reflectiveCurveToRelative(1.33f, 0.5f, 1.47f, 1.2f)
                lineToRelative(0.16f, 0.8f)
                horizontalLineToRelative(0.92f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.55f)
                lineToRelative(-1f, 1.33f)
                lineToRelative(-1f, -1.33f)
                horizontalLineToRelative(-1.34f)
                curveToRelative(-0.91f, 0.02f, -1.45f, -0.99f, -0.87f, -1.65f)
                close()
            }
        }.also { _SteamIron = it}
