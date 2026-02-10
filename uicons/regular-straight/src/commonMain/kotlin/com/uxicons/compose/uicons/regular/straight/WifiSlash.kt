package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiSlash: ImageVector? = null

val Icons.Rs.WifiSlash: ImageVector
    get() = _WifiSlash ?: UXIcon(name = "WifiSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.17f, 11.41f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(-0.57f, 0.32f, -1.11f, 0.7f, -1.59f, 1.17f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.47f, -0.47f, 0.99f, -0.88f, 1.53f, -1.22f)
                close()
                moveTo(0.69f, 7.69f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.47f, -0.47f, 0.97f, -0.88f, 1.48f, -1.27f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(-0.51f, 0.4f, -1.01f, 0.82f, -1.47f, 1.29f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(13.6f, 12.18f)
                curveToRelative(1.25f, 0.29f, 2.41f, 0.93f, 3.35f, 1.87f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-1.85f, -1.85f, -4.35f, -2.78f, -6.93f, -2.62f)
                lineTo(7.24f, 5.83f)
                curveToRelative(5.1f, -1.85f, 10.77f, -0.61f, 14.66f, 3.27f)
                lineToRelative(1.41f, -1.41f)
                curveTo(18.65f, 3.03f, 11.75f, 1.7f, 5.7f, 4.29f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.6f, 12.18f)
                close()
            }
        }.also { _WifiSlash = it}
