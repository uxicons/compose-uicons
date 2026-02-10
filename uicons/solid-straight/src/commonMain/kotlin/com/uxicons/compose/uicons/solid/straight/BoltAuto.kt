package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltAuto: ImageVector? = null

val Icons.Ss.BoltAuto: ImageVector
    get() = _BoltAuto ?: UXIcon(name = "BoltAuto") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.59f, 11.82f)
                lineToRelative(-8.08f, 12.18f)
                horizontalLineToRelative(-3.32f)
                lineToRelative(2.02f, -8f)
                horizontalLineToRelative(-3.77f)
                curveToRelative(-0.92f, 0f, -1.76f, -0.5f, -2.19f, -1.31f)
                curveToRelative(-0.43f, -0.8f, -0.39f, -1.76f, 0.11f, -2.51f)
                lineTo(8.44f, 0f)
                horizontalLineToRelative(3.32f)
                lineToRelative(-2.02f, 8f)
                horizontalLineToRelative(3.8f)
                curveToRelative(0.91f, 0f, 1.74f, 0.5f, 2.17f, 1.3f)
                reflectiveCurveToRelative(0.39f, 1.77f, -0.12f, 2.52f)
                close()
                moveTo(21.41f, 22f)
                horizontalLineToRelative(-4.38f)
                lineToRelative(-0.56f, 2f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(2.82f, -9.74f)
                curveToRelative(0.37f, -0.75f, 1.16f, -1.24f, 2.0f, -1.25f)
                curveToRelative(0.89f, 0.01f, 1.67f, 0.51f, 2.04f, 1.25f)
                lineToRelative(2.82f, 9.74f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.59f, -2f)
                close()
                moveTo(20.82f, 20f)
                lineToRelative(-1.45f, -4.89f)
                curveToRelative(-0.04f, -0.05f, -0.12f, -0.1f, -0.22f, -0.11f)
                curveToRelative(-0.06f, 0.01f, -0.12f, 0.04f, -0.16f, 0.07f)
                lineToRelative(-1.39f, 4.92f)
                horizontalLineToRelative(3.22f)
                close()
            }
        }.also { _BoltAuto = it}
