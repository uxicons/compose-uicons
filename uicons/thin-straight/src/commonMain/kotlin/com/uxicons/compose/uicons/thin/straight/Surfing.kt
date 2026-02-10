package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Surfing: ImageVector? = null

val Icons.Ts.Surfing: ImageVector
    get() = _Surfing ?: UXIcon(name = "Surfing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.24f, 0.76f)
                curveToRelative(-0.55f, -0.55f, -1.31f, -0.82f, -2.08f, -0.75f)
                curveToRelative(-2.33f, 0.23f, -8.23f, 1.23f, -12.58f, 5.58f)
                curveTo(4.22f, 9.94f, 2.0f, 14.28f, 0.01f, 19.37f)
                lineToRelative(4.6f, 4.6f)
                curveToRelative(5.13f, -2.0f, 9.48f, -4.23f, 13.79f, -8.54f)
                curveToRelative(4.35f, -4.35f, 5.35f, -10.25f, 5.58f, -12.59f)
                curveToRelative(0.07f, -0.77f, -0.2f, -1.53f, -0.75f, -2.08f)
                close()
                moveTo(22.99f, 2.75f)
                curveToRelative(-0.22f, 2.23f, -1.17f, 7.86f, -5.29f, 11.98f)
                curveToRelative(-4.11f, 4.11f, -7.98f, 6.16f, -12.84f, 8.08f)
                lineToRelative(-1.48f, -1.48f)
                lineToRelative(13.1f, -13.1f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(2.67f, 20.62f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(1.91f, -4.83f, 3.96f, -8.68f, 8.1f, -12.82f)
                curveTo(13.4f, 2.18f, 19.02f, 1.23f, 21.25f, 1.01f)
                curveToRelative(0.47f, -0.06f, 0.94f, 0.12f, 1.28f, 0.46f)
                reflectiveCurveToRelative(0.51f, 0.81f, 0.46f, 1.28f)
                close()
            }
        }.also { _Surfing = it}
