package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeMute: ImageVector? = null

val Icons.Sc.VolumeMute: ImageVector
    get() = _VolumeMute ?: UXIcon(name = "VolumeMute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                curveToRelative(0f, 4.89f, -1.46f, 8.15f, -2.9f, 8.84f)
                curveToRelative(-0.61f, 0.29f, -1.29f, 0.18f, -1.7f, -0.31f)
                curveToRelative(-1.16f, -1.49f, -2.83f, -3.27f, -3.47f, -3.61f)
                lineToRelative(-3.7f, -0.35f)
                curveToRelative(-0.29f, -0.03f, -0.55f, -0.18f, -0.72f, -0.42f)
                curveToRelative(-0.96f, -1.34f, -1.51f, -2.45f, -1.51f, -4.16f)
                reflectiveCurveToRelative(0.55f, -2.82f, 1.51f, -4.16f)
                curveToRelative(0.17f, -0.24f, 0.43f, -0.39f, 0.72f, -0.42f)
                lineToRelative(3.7f, -0.35f)
                curveToRelative(0.63f, -0.33f, 2.3f, -2.12f, 3.47f, -3.61f)
                curveToRelative(0.41f, -0.49f, 1.09f, -0.6f, 1.7f, -0.31f)
                curveToRelative(1.44f, 0.69f, 2.9f, 3.94f, 2.9f, 8.84f)
                close()
                moveTo(21.62f, 12f)
                lineTo(22.56f, 11.06f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                lineToRelative(-0.94f, 0.94f)
                lineToRelative(-0.94f, -0.94f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-0.94f, 0.94f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                lineToRelative(0.94f, -0.94f)
                curveToRelative(0.73f, 0.86f, 1.99f, 2.04f, 3.06f, 0.94f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(-0.94f, -0.94f)
                close()
            }
        }.also { _VolumeMute = it}
