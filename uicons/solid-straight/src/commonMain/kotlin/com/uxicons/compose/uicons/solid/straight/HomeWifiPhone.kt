package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeWifiPhone: ImageVector? = null

val Icons.Ss.HomeWifiPhone: ImageVector
    get() = _HomeWifiPhone ?: UXIcon(name = "HomeWifiPhone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 16f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(16f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(13.7f, 11.8f)
                curveToRelative(-0.94f, -0.94f, -2.46f, -0.94f, -3.39f, 0f)
                lineToRelative(-1.13f, -1.13f)
                curveToRelative(1.56f, -1.56f, 4.1f, -1.56f, 5.66f, 0f)
                lineToRelative(-1.13f, 1.13f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
                moveTo(8.0f, 5.42f)
                curveToRelative(0f, -0.41f, 0.19f, -0.8f, 0.51f, -1.05f)
                lineToRelative(2.67f, -2.09f)
                curveToRelative(0.24f, -0.19f, 0.53f, -0.28f, 0.82f, -0.28f)
                reflectiveCurveToRelative(0.58f, 0.09f, 0.82f, 0.28f)
                lineToRelative(2.67f, 2.09f)
                curveToRelative(0.32f, 0.25f, 0.51f, 0.64f, 0.51f, 1.05f)
                verticalLineToRelative(1.74f)
                curveToRelative(-0.91f, -0.57f, -1.93f, -0.94f, -3.0f, -1.09f)
                verticalLineToRelative(-1.07f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.07f)
                curveToRelative(-1.07f, 0.14f, -2.09f, 0.51f, -3.0f, 1.09f)
                verticalLineToRelative(-1.74f)
                close()
                moveTo(12.0f, 7f)
                curveToRelative(1.74f, 0f, 3.37f, 0.68f, 4.6f, 1.9f)
                lineToRelative(-1.13f, 1.13f)
                curveToRelative(-0.93f, -0.93f, -2.15f, -1.44f, -3.46f, -1.44f)
                reflectiveCurveToRelative(-2.54f, 0.51f, -3.46f, 1.44f)
                lineToRelative(-1.13f, -1.13f)
                curveToRelative(1.23f, -1.23f, 2.86f, -1.9f, 4.6f, -1.9f)
                close()
                moveTo(4f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _HomeWifiPhone = it}
