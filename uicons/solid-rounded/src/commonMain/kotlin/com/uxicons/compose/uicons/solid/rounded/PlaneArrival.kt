package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneArrival: ImageVector? = null

val Icons.Sr.PlaneArrival: ImageVector
    get() = _PlaneArrival ?: UXIcon(name = "PlaneArrival") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.56f, 19f)
                curveToRelative(-0.36f, 0f, -0.71f, -0.08f, -1.05f, -0.24f)
                lineTo(5.66f, 12.44f)
                curveToRelative(-1.87f, -0.89f, -3.17f, -2.72f, -3.39f, -4.77f)
                lineToRelative(-0.27f, -2.5f)
                curveToRelative(-0.06f, -0.55f, 0.11f, -1.1f, 0.47f, -1.52f)
                curveToRelative(0.33f, -0.39f, 0.79f, -0.62f, 1.28f, -0.66f)
                curveToRelative(0.83f, -0.05f, 1.61f, 0.43f, 1.91f, 1.21f)
                lineToRelative(1.26f, 3.22f)
                lineToRelative(13.58f, 6.82f)
                curveToRelative(1.26f, 0.55f, 1.83f, 2.03f, 1.28f, 3.29f)
                curveToRelative(-0.27f, 0.61f, -0.76f, 1.07f, -1.38f, 1.31f)
                curveToRelative(-0.28f, 0.1f, -0.56f, 0.15f, -0.85f, 0.15f)
                close()
                moveTo(24f, 23f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(23f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(16.61f, 10.06f)
                lineToRelative(-1.2f, -6.53f)
                curveToRelative(-0.08f, -0.91f, -0.66f, -1.7f, -1.5f, -2.07f)
                lineToRelative(-0.79f, -0.34f)
                curveToRelative(-0.47f, -0.2f, -0.99f, -0.15f, -1.42f, 0.13f)
                curveToRelative(-0.42f, 0.28f, -0.67f, 0.75f, -0.67f, 1.25f)
                lineTo(11.03f, 7.25f)
                lineToRelative(5.58f, 2.8f)
                close()
            }
        }.also { _PlaneArrival = it}
