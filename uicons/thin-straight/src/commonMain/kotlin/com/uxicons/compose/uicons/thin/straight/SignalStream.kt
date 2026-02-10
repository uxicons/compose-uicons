package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalStream: ImageVector? = null

val Icons.Ts.SignalStream: ImageVector
    get() = _SignalStream ?: UXIcon(name = "SignalStream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(4.22f, 19.78f)
                curveTo(-0.07f, 15.49f, -0.07f, 8.51f, 4.22f, 4.22f)
                lineToRelative(-0.71f, -0.71f)
                curveTo(-1.16f, 8.19f, -1.16f, 15.81f, 3.51f, 20.49f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(20.49f, 3.51f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(4.29f, 4.29f, 4.29f, 11.27f, 0f, 15.56f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(4.68f, -4.68f, 4.68f, -12.29f, 0f, -16.97f)
                close()
                moveTo(7.76f, 16.24f)
                curveToRelative(-2.34f, -2.34f, -2.34f, -6.15f, 0f, -8.49f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-1.32f, 1.32f, -2.05f, 3.08f, -2.05f, 4.95f)
                reflectiveCurveToRelative(0.73f, 3.63f, 2.05f, 4.95f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(16.95f, 7.05f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(2.34f, 2.34f, 2.34f, 6.15f, 0f, 8.49f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(2.73f, -2.73f, 2.73f, -7.17f, 0f, -9.9f)
                close()
            }
        }.also { _SignalStream = it}
