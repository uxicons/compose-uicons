package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalStream: ImageVector? = null

val Icons.Rs.SignalStream: ImageVector
    get() = _SignalStream ?: UXIcon(name = "SignalStream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(20.49f, 3.51f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(3.9f, 3.9f, 3.9f, 10.24f, 0f, 14.14f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(4.68f, -4.68f, 4.68f, -12.29f, 0f, -16.97f)
                close()
                moveTo(15.54f, 8.46f)
                curveToRelative(0.94f, 0.94f, 1.46f, 2.2f, 1.46f, 3.54f)
                reflectiveCurveToRelative(-0.52f, 2.59f, -1.46f, 3.54f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.32f, -1.32f, 2.05f, -3.08f, 2.05f, -4.95f)
                reflectiveCurveToRelative(-0.73f, -3.63f, -2.05f, -4.95f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(3.51f, 3.51f)
                curveTo(-1.16f, 8.19f, -1.16f, 15.81f, 3.51f, 20.49f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-3.9f, -3.9f, -3.9f, -10.24f, 0f, -14.14f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(7.05f, 7.05f)
                curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0f, 9.9f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0f, -7.07f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.also { _SignalStream = it}
