package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneArrival: ImageVector? = null

val Icons.Rs.PlaneArrival: ImageVector
    get() = _PlaneArrival ?: UXIcon(name = "PlaneArrival") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.68f, 11.83f)
                lineToRelative(17.85f, 8.52f)
                lineToRelative(1.22f, -2.78f)
                curveToRelative(0.66f, -1.51f, -0.02f, -3.27f, -1.52f, -3.94f)
                lineToRelative(-2.4f, -1.17f)
                lineToRelative(-1.45f, -8.35f)
                curveToRelative(-0.1f, -1.09f, -0.78f, -2.05f, -1.79f, -2.49f)
                lineTo(11f, 0.07f)
                lineTo(11f, 9.12f)
                lineToRelative(-3.16f, -1.54f)
                lineToRelative(-1.19f, -3.05f)
                curveToRelative(-0.23f, -0.6f, -0.69f, -1.07f, -1.27f, -1.33f)
                curveToRelative(-0.8f, -0.35f, -1.69f, -0.25f, -2.38f, 0.26f)
                reflectiveCurveToRelative(-1.06f, 1.33f, -0.97f, 2.19f)
                lineToRelative(0.66f, 6.17f)
                close()
                moveTo(13f, 3.11f)
                lineToRelative(0.79f, 0.34f)
                curveToRelative(0.34f, 0.15f, 0.56f, 0.47f, 0.6f, 0.91f)
                lineToRelative(1.21f, 7.01f)
                lineToRelative(-2.6f, -1.27f)
                lineTo(13.0f, 3.11f)
                close()
                moveTo(4.17f, 5.08f)
                curveToRelative(0.07f, -0.05f, 0.21f, -0.13f, 0.4f, -0.04f)
                curveToRelative(0.1f, 0.04f, 0.17f, 0.12f, 0.21f, 0.22f)
                lineToRelative(1.48f, 3.77f)
                lineToRelative(13.14f, 6.42f)
                curveToRelative(0.51f, 0.22f, 0.74f, 0.81f, 0.52f, 1.32f)
                lineToRelative(-0.39f, 0.89f)
                lineTo(4.55f, 10.51f)
                lineToRelative(-0.54f, -5.06f)
                curveToRelative(-0.02f, -0.2f, 0.09f, -0.32f, 0.16f, -0.37f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                close()
            }
        }.also { _PlaneArrival = it}
