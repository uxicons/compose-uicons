package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarPanelSun: ImageVector? = null

val Icons.Ss.SolarPanelSun: ImageVector
    get() = _SolarPanelSun ?: UXIcon(name = "SolarPanelSun") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 22f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(6f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.28f)
                lineToRelative(0.29f, -4f)
                horizontalLineToRelative(6.03f)
                lineToRelative(0.29f, 4f)
                horizontalLineToRelative(-2.32f)
                verticalLineToRelative(2f)
                close()
                moveTo(9.15f, 14f)
                horizontalLineToRelative(5.75f)
                lineToRelative(-0.29f, -4f)
                horizontalLineToRelative(-5.17f)
                lineToRelative(-0.29f, 4f)
                close()
                moveTo(16.61f, 10f)
                lineToRelative(0.29f, 4f)
                horizontalLineToRelative(5.64f)
                lineToRelative(-0.47f, -1.77f)
                curveToRelative(-0.35f, -1.31f, -1.54f, -2.23f, -2.9f, -2.23f)
                horizontalLineToRelative(-2.55f)
                close()
                moveTo(17.32f, 20f)
                horizontalLineToRelative(6.79f)
                lineToRelative(-1.06f, -4f)
                horizontalLineToRelative(-6.02f)
                lineToRelative(0.29f, 4f)
                close()
                moveTo(7.43f, 10f)
                horizontalLineToRelative(-2.59f)
                curveToRelative(-1.36f, 0f, -2.55f, 0.92f, -2.9f, 2.23f)
                lineToRelative(-0.47f, 1.77f)
                horizontalLineToRelative(5.67f)
                lineToRelative(0.29f, -4f)
                close()
                moveTo(7.0f, 16f)
                lineTo(0.94f, 16f)
                lineTo(-0.12f, 20f)
                horizontalLineToRelative(6.83f)
                lineToRelative(0.29f, -4f)
                close()
                moveTo(19.5f, 6f)
                horizontalLineToRelative(-2.6f)
                curveToRelative(-0.19f, -0.94f, -0.66f, -1.77f, -1.3f, -2.44f)
                lineToRelative(1.66f, -2.4f)
                lineTo(15.62f, 0.02f)
                lineToRelative(-1.66f, 2.4f)
                curveToRelative(-0.6f, -0.26f, -1.26f, -0.42f, -1.96f, -0.42f)
                reflectiveCurveToRelative(-1.35f, 0.16f, -1.96f, 0.42f)
                lineTo(8.4f, 0.04f)
                lineToRelative(-1.65f, 1.14f)
                lineToRelative(1.65f, 2.38f)
                curveToRelative(-0.64f, 0.67f, -1.11f, 1.5f, -1.3f, 2.44f)
                horizontalLineToRelative(-2.6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _SolarPanelSun = it}
