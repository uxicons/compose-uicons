package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneArrival: ImageVector? = null

val Icons.Ss.PlaneArrival: ImageVector
    get() = _PlaneArrival ?: UXIcon(name = "PlaneArrival") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(21.8f, 17.57f)
                curveToRelative(0.55f, -1.26f, -0.02f, -2.73f, -1.28f, -3.29f)
                lineTo(6.93f, 7.44f)
                lineToRelative(-1.26f, -3.23f)
                curveToRelative(-0.19f, -0.47f, -0.55f, -0.85f, -1.01f, -1.05f)
                curveToRelative(-0.63f, -0.28f, -1.33f, -0.2f, -1.89f, 0.21f)
                curveToRelative(-0.56f, 0.41f, -0.84f, 1.05f, -0.77f, 1.74f)
                lineToRelative(0.63f, 5.89f)
                lineToRelative(18.16f, 8.88f)
                lineToRelative(1.01f, -2.31f)
                close()
                moveTo(16.35f, 9.96f)
                lineToRelative(-0.97f, -6.64f)
                curveToRelative(-0.08f, -0.91f, -0.65f, -1.71f, -1.49f, -2.08f)
                lineToRelative(-2.89f, -1.25f)
                lineTo(11.0f, 7.26f)
                lineToRelative(5.35f, 2.7f)
                close()
            }
        }.also { _PlaneArrival = it}
