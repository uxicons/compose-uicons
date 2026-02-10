package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroadcastTower: ImageVector? = null

val Icons.Bs.BroadcastTower: ImageVector
    get() = _BroadcastTower ?: UXIcon(name = "BroadcastTower") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.99f, 9.07f)
                curveToRelative(0f, 1.11f, -0.61f, 2.06f, -1.5f, 2.58f)
                verticalLineToRelative(12.34f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-12.34f)
                curveToRelative(-0.89f, -0.52f, -1.5f, -1.48f, -1.5f, -2.58f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(6.69f, 3.77f)
                curveToRelative(-2.92f, 2.92f, -2.92f, 7.68f, 0f, 10.61f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-1.75f, -1.75f, -1.75f, -4.61f, 0f, -6.36f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(17.3f, 3.77f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(1.75f, 1.75f, 1.75f, 4.61f, 0f, 6.36f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(2.92f, -2.92f, 2.92f, -7.68f, 0f, -10.61f)
                close()
                moveTo(5.63f, 2.71f)
                lineTo(3.51f, 0.59f)
                curveTo(-1.17f, 5.27f, -1.17f, 12.88f, 3.51f, 17.56f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-3.51f, -3.51f, -3.51f, -9.22f, 0f, -12.73f)
                close()
                moveTo(20.48f, 0.59f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0f, 12.73f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(4.68f, -4.68f, 4.68f, -12.29f, 0f, -16.97f)
                close()
            }
        }.also { _BroadcastTower = it}
