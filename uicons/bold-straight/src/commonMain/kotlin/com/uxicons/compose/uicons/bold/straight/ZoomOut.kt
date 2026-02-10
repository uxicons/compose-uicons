package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZoomOut: ImageVector? = null

val Icons.Bs.ZoomOut: ImageVector
    get() = _ZoomOut ?: UXIcon(name = "ZoomOut", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 192f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-192f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(403.49f, 358.37f)
                curveToRelative(74.08f, -99f, 53.88f, -239.31f, -45.12f, -313.39f)
                reflectiveCurveTo(119.06f, -8.9f, 44.98f, 90.11f)
                reflectiveCurveTo(-8.9f, 329.41f, 90.11f, 403.49f)
                curveToRelative(79.52f, 59.51f, 188.74f, 59.51f, 268.27f, 0f)
                lineToRelative(108.34f, 108.34f)
                lineToRelative(45.12f, -45.04f)
                lineTo(403.49f, 358.37f)
                close()
                moveTo(225.05f, 384.38f)
                curveToRelative(-87.99f, 0f, -159.33f, -71.33f, -159.33f, -159.33f)
                reflectiveCurveTo(137.06f, 65.72f, 225.05f, 65.72f)
                reflectiveCurveToRelative(159.33f, 71.33f, 159.33f, 159.33f)
                curveTo(384.29f, 313.01f, 313.01f, 384.29f, 225.05f, 384.38f)
                close()
            }
        }.also { _ZoomOut = it}
