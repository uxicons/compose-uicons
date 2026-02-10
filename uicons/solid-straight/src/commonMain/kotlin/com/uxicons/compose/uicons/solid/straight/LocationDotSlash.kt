package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationDotSlash: ImageVector? = null

val Icons.Ss.LocationDotSlash: ImageVector
    get() = _LocationDotSlash ?: UXIcon(name = "LocationDotSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.53f, 6.78f)
                lineToRelative(13.38f, 13.38f)
                lineToRelative(-3.92f, 3.83f)
                lineToRelative(-7.06f, -6.91f)
                curveToRelative(-2.78f, -2.78f, -3.61f, -6.79f, -2.4f, -10.31f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(3.2f, 3.2f)
                curveToRelative(0.09f, -0.1f, 0.18f, -0.21f, 0.28f, -0.31f)
                curveTo(6.82f, 1.05f, 9.33f, 0.01f, 12.0f, 0.01f)
                horizontalLineToRelative(0.0f)
                curveTo(14.67f, 0.01f, 17.18f, 1.05f, 19.07f, 2.94f)
                curveToRelative(1.89f, 1.89f, 2.93f, 4.4f, 2.93f, 7.07f)
                reflectiveCurveToRelative(-1.04f, 5.18f, -2.93f, 7.07f)
                lineToRelative(-0.29f, 0.29f)
                lineToRelative(5.18f, 5.18f)
                close()
                moveTo(15.54f, 6.46f)
                curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0f)
                curveToRelative(-0.1f, 0.1f, -0.17f, 0.22f, -0.26f, 0.32f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.08f, -0.11f, 0.16f, -0.22f, 0.26f, -0.32f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0f)
                reflectiveCurveToRelative(1.17f, 3.07f, 0f, 4.24f)
                curveToRelative(-0.1f, 0.1f, -0.21f, 0.18f, -0.32f, 0.26f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.11f, -0.09f, 0.22f, -0.16f, 0.32f, -0.26f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0f, -7.07f)
                close()
            }
        }.also { _LocationDotSlash = it}
