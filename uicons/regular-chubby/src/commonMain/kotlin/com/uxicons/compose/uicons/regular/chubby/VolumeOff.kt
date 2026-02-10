package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeOff: ImageVector? = null

val Icons.Rc.VolumeOff: ImageVector
    get() = _VolumeOff ?: UXIcon(name = "VolumeOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.1f, 3.16f)
                curveToRelative(-0.61f, -0.29f, -1.29f, -0.18f, -1.7f, 0.31f)
                curveToRelative(-1.16f, 1.49f, -2.83f, 3.27f, -3.47f, 3.61f)
                lineToRelative(-3.7f, 0.35f)
                curveToRelative(-0.29f, 0.03f, -0.55f, 0.18f, -0.72f, 0.42f)
                curveToRelative(-0.96f, 1.34f, -1.51f, 2.45f, -1.51f, 4.16f)
                reflectiveCurveToRelative(0.55f, 2.82f, 1.51f, 4.16f)
                curveToRelative(0.17f, 0.24f, 0.43f, 0.39f, 0.72f, 0.42f)
                lineToRelative(3.7f, 0.35f)
                curveToRelative(0.63f, 0.33f, 2.3f, 2.12f, 3.46f, 3.6f)
                curveToRelative(0.41f, 0.51f, 1.13f, 0.59f, 1.7f, 0.31f)
                curveToRelative(1.44f, -0.69f, 2.9f, -3.94f, 2.9f, -8.84f)
                reflectiveCurveToRelative(-1.46f, -8.15f, -2.9f, -8.84f)
                close()
                moveTo(11.52f, 18.74f)
                curveToRelative(-0.88f, -1.08f, -2.81f, -3.31f, -4.01f, -3.73f)
                curveToRelative(-0.08f, -0.03f, -0.16f, -0.04f, -0.24f, -0.05f)
                lineToRelative(-3.39f, -0.32f)
                curveToRelative(-0.59f, -0.89f, -0.88f, -1.58f, -0.88f, -2.63f)
                reflectiveCurveToRelative(0.28f, -1.74f, 0.88f, -2.63f)
                lineToRelative(3.39f, -0.32f)
                curveToRelative(0.08f, -0.01f, 0.16f, -0.03f, 0.24f, -0.05f)
                curveToRelative(1.2f, -0.42f, 3.13f, -2.65f, 4.01f, -3.73f)
                curveToRelative(0.55f, 0.77f, 1.48f, 2.95f, 1.48f, 6.73f)
                reflectiveCurveToRelative(-0.94f, 5.97f, -1.48f, 6.74f)
                close()
            }
        }.also { _VolumeOff = it}
