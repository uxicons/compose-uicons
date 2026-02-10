package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltAuto: ImageVector? = null

val Icons.Bs.BoltAuto: ImageVector
    get() = _BoltAuto ?: UXIcon(name = "BoltAuto") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.66f, 9.58f)
                curveToRelative(-0.52f, -0.96f, -1.52f, -1.56f, -2.61f, -1.56f)
                horizontalLineToRelative(-3.16f)
                lineTo(12.91f, 0.02f)
                horizontalLineToRelative(-4.19f)
                lineTo(0.48f, 11.42f)
                curveToRelative(-0.6f, 0.9f, -0.65f, 2.06f, -0.14f, 3.02f)
                curveToRelative(0.52f, 0.97f, 1.53f, 1.58f, 2.63f, 1.58f)
                horizontalLineToRelative(3.13f)
                lineToRelative(-2.02f, 8f)
                horizontalLineToRelative(4.19f)
                lineToRelative(8.24f, -11.4f)
                curveToRelative(0.6f, -0.91f, 0.66f, -2.07f, 0.14f, -3.04f)
                close()
                moveTo(8.58f, 18.48f)
                lineToRelative(1.38f, -5.46f)
                lineTo(3.02f, 13.02f)
                lineToRelative(5.39f, -7.46f)
                lineToRelative(-1.38f, 5.46f)
                horizontalLineToRelative(6.94f)
                lineToRelative(-5.39f, 7.46f)
                close()
                moveTo(21.09f, 24.02f)
                horizontalLineToRelative(2.92f)
                lineToRelative(-2.82f, -9.74f)
                curveToRelative(-0.37f, -0.75f, -1.16f, -1.24f, -2.04f, -1.25f)
                curveToRelative(-0.84f, 0.01f, -1.63f, 0.51f, -2.0f, 1.25f)
                lineToRelative(-2.82f, 9.74f)
                horizontalLineToRelative(2.85f)
                lineToRelative(0.29f, -1f)
                horizontalLineToRelative(3.33f)
                lineToRelative(0.28f, 1f)
                close()
                moveTo(17.72f, 21.02f)
                lineToRelative(1.46f, -5.02f)
                lineToRelative(1.41f, 5.02f)
                horizontalLineToRelative(-2.86f)
                close()
            }
        }.also { _BoltAuto = it}
