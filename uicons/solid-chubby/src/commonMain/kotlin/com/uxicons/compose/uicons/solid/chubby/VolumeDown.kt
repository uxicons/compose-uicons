package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Sc.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.06f, 12.0f)
                curveToRelative(0f, 4.88f, -1.49f, 8.14f, -2.96f, 8.84f)
                curveToRelative(-0.57f, 0.28f, -1.29f, 0.2f, -1.7f, -0.3f)
                curveToRelative(-1.17f, -1.49f, -2.83f, -3.28f, -3.47f, -3.61f)
                lineToRelative(-3.7f, -0.35f)
                curveToRelative(-0.29f, -0.03f, -0.55f, -0.18f, -0.72f, -0.41f)
                curveToRelative(-0.96f, -1.34f, -1.51f, -2.45f, -1.51f, -4.16f)
                curveToRelative(0f, -1.68f, 0.53f, -2.75f, 1.51f, -4.12f)
                curveToRelative(0.17f, -0.24f, 0.43f, -0.39f, 0.73f, -0.42f)
                lineToRelative(3.75f, -0.35f)
                curveToRelative(0.57f, -0.31f, 2.27f, -2.17f, 3.41f, -3.64f)
                curveToRelative(0.4f, -0.48f, 1.09f, -0.59f, 1.69f, -0.31f)
                curveToRelative(1.48f, 0.7f, 2.97f, 3.96f, 2.97f, 8.84f)
                close()
                moveTo(18.95f, 7.94f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                reflectiveCurveToRelative(-0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.78f, 0.78f, 1.17f, 1.43f, 1.17f, 1.94f)
                reflectiveCurveToRelative(-0.39f, 1.16f, -1.17f, 1.94f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, 0f, 2.12f)
                reflectiveCurveToRelative(1.53f, 0.59f, 2.12f, 0f)
                curveToRelative(1.38f, -1.38f, 2.05f, -2.71f, 2.05f, -4.06f)
                reflectiveCurveToRelative(-0.67f, -2.68f, -2.05f, -4.06f)
                close()
            }
        }.also { _VolumeDown = it}
