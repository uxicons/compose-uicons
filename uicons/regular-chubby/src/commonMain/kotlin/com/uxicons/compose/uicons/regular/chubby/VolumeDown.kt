package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Rc.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.09f, 3.16f)
                curveToRelative(-0.6f, -0.28f, -1.29f, -0.18f, -1.69f, 0.31f)
                curveToRelative(-1.14f, 1.47f, -2.84f, 3.33f, -3.41f, 3.64f)
                lineToRelative(-3.75f, 0.35f)
                curveToRelative(-0.29f, 0.03f, -0.56f, 0.18f, -0.73f, 0.42f)
                curveToRelative(-0.98f, 1.38f, -1.51f, 2.44f, -1.51f, 4.12f)
                curveToRelative(0f, 1.71f, 0.55f, 2.82f, 1.51f, 4.16f)
                curveToRelative(0.17f, 0.24f, 0.43f, 0.39f, 0.72f, 0.41f)
                lineToRelative(3.7f, 0.35f)
                curveToRelative(0.64f, 0.33f, 2.29f, 2.12f, 3.47f, 3.61f)
                curveToRelative(0.41f, 0.5f, 1.12f, 0.58f, 1.7f, 0.3f)
                curveToRelative(1.47f, -0.7f, 2.96f, -3.96f, 2.96f, -8.84f)
                reflectiveCurveToRelative(-1.49f, -8.14f, -2.97f, -8.84f)
                close()
                moveTo(11.52f, 18.74f)
                curveToRelative(-0.92f, -1.13f, -2.83f, -3.32f, -4.01f, -3.74f)
                curveToRelative(-0.08f, -0.03f, -0.16f, -0.04f, -0.24f, -0.05f)
                lineToRelative(-3.39f, -0.32f)
                curveToRelative(-0.6f, -0.89f, -0.88f, -1.58f, -0.88f, -2.63f)
                curveToRelative(0f, -1.04f, 0.26f, -1.68f, 0.88f, -2.59f)
                lineToRelative(3.21f, -0.28f)
                curveToRelative(0.17f, -0.02f, 0.43f, -0.08f, 0.6f, -0.14f)
                curveToRelative(1.07f, -0.43f, 2.95f, -2.63f, 3.83f, -3.72f)
                curveToRelative(0.56f, 0.77f, 1.54f, 2.94f, 1.54f, 6.73f)
                reflectiveCurveToRelative(-0.98f, 5.99f, -1.53f, 6.74f)
                close()
                moveTo(20.0f, 12f)
                curveToRelative(0f, 1.23f, -0.6f, 2.41f, -1.9f, 3.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.89f, -0.89f, 1.31f, -1.64f, 1.31f, -2.29f)
                reflectiveCurveToRelative(-0.43f, -1.41f, -1.31f, -2.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(1.3f, 1.3f, 1.9f, 2.47f, 1.9f, 3.71f)
                close()
            }
        }.also { _VolumeDown = it}
