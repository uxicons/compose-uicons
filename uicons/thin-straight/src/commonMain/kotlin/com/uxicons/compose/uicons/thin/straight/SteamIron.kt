package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteamIron: ImageVector? = null

val Icons.Ts.SteamIron: ImageVector
    get() = _SteamIron ?: UXIcon(name = "SteamIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 4f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                lineTo(10f, 12f)
                curveTo(4.49f, 12f, 0f, 16.49f, 0f, 22f)
                verticalLineToRelative(2f)
                lineTo(24f, 24f)
                lineTo(24f, 9.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(10f, 13f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(7f)
                lineTo(1.23f, 20f)
                curveToRelative(0.91f, -4.0f, 4.49f, -7f, 8.77f, -7f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.34f, 0.02f, -0.67f, 0.06f, -1f)
                lineTo(23f, 21f)
                verticalLineToRelative(2f)
                lineTo(1f, 23f)
                close()
                moveTo(3f, 8f)
                horizontalLineToRelative(0.75f)
                lineToRelative(1.75f, 2.33f)
                lineToRelative(1.75f, -2.33f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.54f, -1.17f, -2.81f, -2.67f, -2.98f)
                curveToRelative(-0.41f, -1.19f, -1.55f, -2.02f, -2.83f, -2.02f)
                reflectiveCurveTo(3.08f, 0.83f, 2.67f, 2.02f)
                curveToRelative(-1.5f, 0.17f, -2.67f, 1.44f, -2.67f, 2.98f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
                moveTo(2.95f, 3.0f)
                lineToRelative(0.51f, 0.01f)
                curveToRelative(0.09f, -1.08f, 0.91f, -2.02f, 2.04f, -2.0f)
                curveToRelative(1.13f, -0.01f, 1.95f, 0.93f, 2.04f, 2.0f)
                curveToRelative(1.24f, -0.17f, 2.47f, 0.68f, 2.46f, 2.0f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.25f, 1.67f)
                lineToRelative(-1.25f, -1.67f)
                horizontalLineToRelative(-1.25f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 1.95f, -2.0f)
                close()
            }
        }.also { _SteamIron = it}
