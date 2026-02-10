package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltAuto: ImageVector? = null

val Icons.Sr.BoltAuto: ImageVector
    get() = _BoltAuto ?: UXIcon(name = "BoltAuto") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.45f, 22.74f)
                lineToRelative(-2.43f, -7.17f)
                curveToRelative(-0.32f, -0.92f, -1.11f, -1.51f, -2.02f, -1.51f)
                reflectiveCurveToRelative(-1.7f, 0.59f, -2.02f, 1.51f)
                lineToRelative(-2.43f, 7.17f)
                curveToRelative(-0.18f, 0.52f, 0.1f, 1.09f, 0.63f, 1.27f)
                curveToRelative(0.52f, 0.18f, 1.09f, -0.1f, 1.27f, -0.63f)
                lineToRelative(0.47f, -1.38f)
                horizontalLineToRelative(4.17f)
                lineToRelative(0.47f, 1.38f)
                curveToRelative(0.14f, 0.42f, 0.53f, 0.68f, 0.95f, 0.68f)
                curveToRelative(0.11f, 0f, 0.21f, -0.02f, 0.32f, -0.05f)
                curveToRelative(0.52f, -0.18f, 0.8f, -0.74f, 0.63f, -1.27f)
                close()
                moveTo(17.59f, 20f)
                lineToRelative(1.28f, -3.78f)
                curveToRelative(0.07f, -0.22f, 0.18f, -0.22f, 0.25f, -0.0f)
                lineToRelative(1.28f, 3.78f)
                horizontalLineToRelative(-2.81f)
                close()
                moveTo(15.49f, 12.55f)
                lineToRelative(-6.42f, 10.46f)
                curveToRelative(-0.43f, 0.65f, -1.06f, 1f, -1.7f, 1f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.06f, -0.77f, -0.17f)
                curveToRelative(-0.93f, -0.43f, -1.37f, -1.52f, -1.06f, -2.6f)
                lineToRelative(1.2f, -5.23f)
                horizontalLineToRelative(-3.83f)
                curveToRelative(-1.08f, 0f, -2.06f, -0.59f, -2.57f, -1.55f)
                curveToRelative(-0.51f, -0.95f, -0.44f, -2.1f, 0.16f, -3.0f)
                lineTo(6.92f, 1.0f)
                curveToRelative(0.61f, -0.91f, 1.59f, -1.23f, 2.47f, -0.83f)
                curveToRelative(0.93f, 0.43f, 1.37f, 1.52f, 1.06f, 2.6f)
                lineToRelative(-1.21f, 5.23f)
                lineToRelative(3.83f, 0.0f)
                curveToRelative(1.08f, 0f, 2.06f, 0.59f, 2.57f, 1.55f)
                curveToRelative(0.51f, 0.95f, 0.44f, 2.1f, -0.16f, 3.0f)
                close()
            }
        }.also { _BoltAuto = it}
