package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarPanelSun: ImageVector? = null

val Icons.Bs.SolarPanelSun: ImageVector
    get() = _SolarPanelSun ?: UXIcon(name = "SolarPanelSun") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 19f)
                horizontalLineToRelative(10.51f)
                lineToRelative(-1.94f, -6.5f)
                curveToRelative(-0.44f, -1.47f, -1.82f, -2.5f, -3.35f, -2.5f)
                lineTo(5.32f, 10f)
                curveToRelative(-1.54f, 0f, -2.92f, 1.03f, -3.35f, 2.5f)
                lineTo(0.03f, 19f)
                horizontalLineToRelative(10.47f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10.13f, 16f)
                lineToRelative(0.25f, -3f)
                horizontalLineToRelative(3.24f)
                lineToRelative(0.25f, 3f)
                horizontalLineToRelative(-3.74f)
                close()
                moveTo(19.2f, 13.36f)
                lineToRelative(0.79f, 2.64f)
                horizontalLineToRelative(-3.11f)
                lineToRelative(-0.25f, -3f)
                horizontalLineToRelative(2.09f)
                curveToRelative(0.22f, 0f, 0.42f, 0.14f, 0.48f, 0.36f)
                close()
                moveTo(4.84f, 13.36f)
                curveToRelative(0.06f, -0.21f, 0.26f, -0.36f, 0.48f, -0.36f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-0.25f, 3f)
                horizontalLineToRelative(-3.07f)
                lineToRelative(0.79f, -2.64f)
                close()
                moveTo(10f, 8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.23f)
                curveToRelative(0.18f, -0.57f, 0.47f, -1.09f, 0.83f, -1.55f)
                lineToRelative(-1.19f, -1.72f)
                lineTo(9.34f, 0.02f)
                lineToRelative(1.19f, 1.71f)
                curveToRelative(0.47f, -0.14f, 0.96f, -0.23f, 1.48f, -0.23f)
                reflectiveCurveToRelative(1.01f, 0.09f, 1.48f, 0.23f)
                lineTo(14.66f, 0.02f)
                lineToRelative(2.47f, 1.71f)
                lineToRelative(-1.19f, 1.72f)
                curveToRelative(0.36f, 0.46f, 0.65f, 0.98f, 0.83f, 1.55f)
                horizontalLineToRelative(2.23f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _SolarPanelSun = it}
