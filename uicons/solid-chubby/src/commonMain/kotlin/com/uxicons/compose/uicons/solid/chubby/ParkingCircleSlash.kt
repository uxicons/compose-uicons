package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Sc.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 9.51f)
                curveToRelative(0f, -1.59f, -0.64f, -2.5f, -3.9f, -2.5f)
                curveToRelative(0f, 0f, -0.68f, -0.0f, -0.88f, 0.0f)
                curveToRelative(-0.03f, 0.32f, -0.06f, 0.73f, -0.1f, 1.21f)
                lineToRelative(3.48f, 3.48f)
                curveToRelative(1.0f, -0.35f, 1.39f, -0.99f, 1.39f, -2.19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 12f)
                curveToRelative(0f, 9.86f, 6.28f, 11f, 11f, 11f)
                curveToRelative(2.64f, 0f, 5.47f, -0.33f, 7.6f, -1.98f)
                lineToRelative(-16.54f, -16.54f)
                curveToRelative(-1.38f, 1.8f, -2.06f, 4.3f, -2.06f, 7.52f)
                close()
                moveTo(8.48f, 12.03f)
                curveToRelative(0.54f, -0.03f, 1.01f, 0.42f, 1.03f, 0.97f)
                curveToRelative(0.08f, 2.77f, 0.51f, 4.77f, 0.51f, 4.79f)
                curveToRelative(0.12f, 0.54f, -0.23f, 1.07f, -0.77f, 1.19f)
                curveToRelative(-0.07f, 0.02f, -0.14f, 0.02f, -0.21f, 0.02f)
                curveToRelative(-0.46f, 0f, -0.88f, -0.32f, -0.98f, -0.79f)
                curveToRelative(-0.02f, -0.09f, -0.47f, -2.18f, -0.56f, -5.16f)
                curveToRelative(-0.02f, -0.55f, 0.42f, -1.01f, 0.97f, -1.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-3.22f, 0f, -5.72f, 0.68f, -7.52f, 2.06f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.03f, -0.26f, 0.04f, -0.4f, 0.05f, -0.41f)
                curveToRelative(0.06f, -0.44f, 0.4f, -0.79f, 0.83f, -0.86f)
                curveToRelative(0.55f, -0.09f, 1.95f, -0.08f, 1.95f, -0.08f)
                curveToRelative(1.46f, 0f, 5.89f, 0f, 5.89f, 4.5f)
                curveToRelative(0f, 1.69f, -0.65f, 2.94f, -1.9f, 3.68f)
                lineToRelative(6.4f, 6.4f)
                curveToRelative(1.23f, -1.65f, 2.0f, -4.06f, 2.0f, -7.59f)
                curveToRelative(-0.0f, -9.75f, -5.88f, -11.0f, -11.0f, -11.0f)
                close()
            }
        }.also { _ParkingCircleSlash = it}
