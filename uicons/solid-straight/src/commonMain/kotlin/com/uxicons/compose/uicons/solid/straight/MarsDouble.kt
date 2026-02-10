package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsDouble: ImageVector? = null

val Icons.Ss.MarsDouble: ImageVector
    get() = _MarsDouble ?: UXIcon(name = "MarsDouble", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(384.05f, 43.47f)
                verticalLineToRelative(85f)
                horizontalLineToRelative(-42.5f)
                verticalLineTo(73.51f)
                lineToRelative(-72.25f, 72.25f)
                curveToRelative(49.47f, 66f, 36.08f, 159.6f, -29.92f, 209.08f)
                reflectiveCurveTo(79.78f, 390.92f, 30.3f, 324.92f)
                reflectiveCurveTo(-5.77f, 165.32f, 60.22f, 115.84f)
                curveToRelative(53.03f, -39.75f, 125.9f, -39.8f, 178.99f, -0.13f)
                lineToRelative(72.25f, -72.25f)
                horizontalLineToRelative(-54.91f)
                verticalLineToRelative(-42.5f)
                horizontalLineToRelative(85f)
                curveTo(365.02f, 0.96f, 384.05f, 19.99f, 384.05f, 43.47f)
                close()
                moveTo(469.05f, 128.47f)
                horizontalLineToRelative(-85f)
                verticalLineToRelative(42.5f)
                horizontalLineToRelative(54.95f)
                lineToRelative(-72.53f, 72.53f)
                curveToRelative(-7.88f, -6.05f, -16.34f, -11.29f, -25.27f, -15.64f)
                curveToRelative(0f, 2.3f, 0.34f, 4.55f, 0.34f, 6.86f)
                curveToRelative(-0.12f, 105.58f, -85.68f, 191.13f, -191.25f, 191.25f)
                curveToRelative(-2.32f, 0f, -4.57f, -0.28f, -6.86f, -0.34f)
                curveToRelative(34.93f, 74.28f, 123.47f, 106.17f, 197.74f, 71.24f)
                curveToRelative(52.16f, -24.53f, 85.43f, -77.01f, 85.37f, -134.65f)
                curveToRelative(-0.06f, -32.05f, -10.59f, -63.2f, -29.98f, -88.72f)
                lineToRelative(72.48f, -72.48f)
                verticalLineToRelative(54.95f)
                horizontalLineToRelative(42.5f)
                verticalLineToRelative(-85f)
                curveTo(511.55f, 147.49f, 492.52f, 128.47f, 469.05f, 128.47f)
                close()
            }
        }.also { _MarsDouble = it}
