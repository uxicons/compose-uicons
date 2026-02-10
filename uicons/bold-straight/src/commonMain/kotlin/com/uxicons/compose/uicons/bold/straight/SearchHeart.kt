package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchHeart: ImageVector? = null

val Icons.Bs.SearchHeart: ImageVector
    get() = _SearchHeart ?: UXIcon(name = "SearchHeart", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(512f, 466.93f)
                lineTo(403.62f, 358.55f)
                curveToRelative(74.16f, -98.99f, 54.04f, -239.35f, -44.94f, -313.52f)
                reflectiveCurveTo(119.32f, -9.01f, 45.16f, 89.98f)
                reflectiveCurveTo(-8.88f, 329.33f, 90.11f, 403.5f)
                curveToRelative(79.53f, 59.59f, 188.82f, 59.64f, 268.4f, 0.13f)
                lineTo(466.89f, 512f)
                lineTo(512f, 466.93f)
                close()
                moveTo(65.75f, 225.12f)
                curveToRelative(0f, -88.02f, 71.36f, -159.38f, 159.38f, -159.38f)
                reflectiveCurveTo(384.5f, 137.1f, 384.5f, 225.12f)
                reflectiveCurveToRelative(-71.36f, 159.38f, -159.38f, 159.38f)
                curveTo(137.14f, 384.4f, 65.84f, 313.1f, 65.75f, 225.12f)
                close()
                moveTo(320.2f, 203.34f)
                curveToRelative(0f, 55.08f, -95.63f, 122.72f, -95.63f, 122.72f)
                reflectiveCurveToRelative(-95.63f, -67.64f, -95.63f, -122.72f)
                curveToRelative(-1.25f, -27.7f, 20.12f, -51.21f, 47.81f, -52.59f)
                curveToRelative(27.7f, 1.38f, 49.08f, 24.89f, 47.81f, 52.59f)
                curveToRelative(-1.25f, -27.7f, 20.12f, -51.21f, 47.81f, -52.59f)
                curveTo(300.08f, 152.12f, 321.46f, 175.63f, 320.2f, 203.34f)
                close()
            }
        }.also { _SearchHeart = it}
