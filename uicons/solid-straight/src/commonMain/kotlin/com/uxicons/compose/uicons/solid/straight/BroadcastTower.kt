package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroadcastTower: ImageVector? = null

val Icons.Ss.BroadcastTower: ImageVector
    get() = _BroadcastTower ?: UXIcon(name = "BroadcastTower") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.42f, 2f, 2.83f)
                verticalLineToRelative(12.17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-12.17f)
                curveToRelative(1.16f, -0.41f, 2f, -1.52f, 2f, -2.83f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8.46f, 5.54f)
                curveToRelative(-0.94f, 0.94f, -1.46f, 2.2f, -1.46f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.46f, 3.54f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-1.32f, -1.32f, -2.05f, -3.08f, -2.05f, -4.95f)
                reflectiveCurveToRelative(0.73f, -3.63f, 2.05f, -4.95f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(16.95f, 4.13f)
                curveToRelative(1.32f, 1.32f, 2.05f, 3.08f, 2.05f, 4.95f)
                reflectiveCurveToRelative(-0.73f, 3.63f, -2.05f, 4.95f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.94f, -0.94f, 1.46f, -2.2f, 1.46f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.46f, -3.54f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(4.93f, 2.0f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0f, 14.14f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(-1.16f, 12.88f, -1.16f, 5.27f, 3.52f, 0.59f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(20.49f, 17.56f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, 0f, -14.14f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(4.68f, 4.68f, 4.68f, 12.29f, 0f, 16.97f)
                close()
            }
        }.also { _BroadcastTower = it}
