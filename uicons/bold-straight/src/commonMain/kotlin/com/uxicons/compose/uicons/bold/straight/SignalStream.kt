package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalStream: ImageVector? = null

val Icons.Bs.SignalStream: ImageVector
    get() = _SignalStream ?: UXIcon(name = "SignalStream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(9.17f, 14.83f)
                curveToRelative(-1.56f, -1.56f, -1.56f, -4.1f, 0f, -5.66f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0f, 9.9f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -1.87f, -0.73f, -3.63f, -2.05f, -4.95f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(0.76f, 0.76f, 1.17f, 1.76f, 1.17f, 2.83f)
                reflectiveCurveToRelative(-0.42f, 2.07f, -1.17f, 2.83f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(1.32f, -1.32f, 2.05f, -3.08f, 2.05f, -4.95f)
                close()
                moveTo(5.64f, 18.36f)
                curveToRelative(-3.51f, -3.51f, -3.51f, -9.22f, 0f, -12.73f)
                lineTo(3.51f, 3.51f)
                curveTo(-1.16f, 8.19f, -1.16f, 15.81f, 3.51f, 20.49f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(20.49f, 3.51f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0f, 12.73f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(4.68f, -4.68f, 4.68f, -12.29f, 0f, -16.97f)
                close()
            }
        }.also { _SignalStream = it}
