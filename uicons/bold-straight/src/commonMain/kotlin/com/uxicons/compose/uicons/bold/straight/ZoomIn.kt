package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZoomIn: ImageVector? = null

val Icons.Bs.ZoomIn: ImageVector
    get() = _ZoomIn ?: UXIcon(name = "ZoomIn", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 128f)
                lineToRelative(-64f, 0f)
                lineToRelative(0f, 64f)
                lineToRelative(-64f, 0f)
                lineToRelative(0f, 64f)
                lineToRelative(64f, 0f)
                lineToRelative(0f, 64f)
                lineToRelative(64f, 0f)
                lineToRelative(0f, -64f)
                lineToRelative(64f, 0f)
                lineToRelative(0f, -64f)
                lineToRelative(-64f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(403.62f, 358.49f)
                curveToRelative(74.1f, -99.03f, 53.9f, -239.39f, -45.14f, -313.49f)
                reflectiveCurveTo(119.1f, -8.9f, 45f, 90.13f)
                reflectiveCurveTo(-8.9f, 329.52f, 90.13f, 403.62f)
                curveToRelative(79.55f, 59.53f, 188.81f, 59.53f, 268.35f, 0f)
                lineTo(466.86f, 512f)
                lineTo(512f, 466.95f)
                lineTo(403.62f, 358.49f)
                close()
                moveTo(225.12f, 384.5f)
                curveToRelative(-88.02f, 0f, -159.38f, -71.36f, -159.38f, -159.38f)
                reflectiveCurveTo(137.1f, 65.74f, 225.12f, 65.74f)
                reflectiveCurveTo(384.5f, 137.1f, 384.5f, 225.12f)
                curveTo(384.42f, 313.11f, 313.11f, 384.42f, 225.12f, 384.5f)
                close()
            }
        }.also { _ZoomIn = it}
