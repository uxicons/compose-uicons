package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroadcastTower: ImageVector? = null

val Icons.Rs.BroadcastTower: ImageVector
    get() = _BroadcastTower ?: UXIcon(name = "BroadcastTower") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 1.58f, 1.06f, 2.9f, 2.5f, 3.34f)
                verticalLineToRelative(11.66f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11.66f)
                curveToRelative(1.44f, -0.43f, 2.5f, -1.76f, 2.5f, -3.34f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(12f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.76f, 4.83f)
                curveToRelative(-2.34f, 2.34f, -2.34f, 6.15f, 0f, 8.48f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-3.12f, -3.12f, -3.12f, -8.2f, 0f, -11.31f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(20f, 9.08f)
                curveToRelative(0f, 2.14f, -0.83f, 4.15f, -2.34f, 5.66f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.13f, -1.13f, 1.76f, -2.64f, 1.76f, -4.24f)
                reflectiveCurveToRelative(-0.62f, -3.11f, -1.76f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(1.51f, 1.51f, 2.34f, 3.52f, 2.34f, 5.66f)
                close()
                moveTo(4.93f, 16.15f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(-1.16f, 12.88f, -1.16f, 5.27f, 3.52f, 0.59f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0f, 14.14f)
                close()
                moveTo(24f, 9.08f)
                curveToRelative(0f, 3.21f, -1.25f, 6.22f, -3.52f, 8.48f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.89f, -1.89f, 2.93f, -4.4f, 2.93f, -7.07f)
                reflectiveCurveToRelative(-1.04f, -5.18f, -2.93f, -7.07f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(2.27f, 2.27f, 3.52f, 5.28f, 3.52f, 8.48f)
                close()
            }
        }.also { _BroadcastTower = it}
