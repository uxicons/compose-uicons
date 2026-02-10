package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalStreamSlash: ImageVector? = null

val Icons.Bs.SignalStreamSlash: ImageVector
    get() = _SignalStreamSlash ?: UXIcon(name = "SignalStreamSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.02f, 18.92f)
                lineToRelative(2.96f, 2.96f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.06f, 2.21f)
                lineTo(2.18f, 0.08f)
                lineTo(11.24f, 9.15f)
                curveToRelative(0.23f, -0.1f, 0.49f, -0.15f, 0.76f, -0.15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.27f, -0.05f, 0.52f, -0.15f, 0.76f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(1.04f, -1.55f, 0.88f, -3.68f, -0.49f, -5.06f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(2.54f, 2.54f, 2.72f, 6.58f, 0.52f, 9.32f)
                lineToRelative(1.42f, 1.42f)
                curveToRelative(2.97f, -3.53f, 2.8f, -8.83f, -0.52f, -12.16f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(4.49f, 4.49f, 4.67f, 11.7f, 0.53f, 16.4f)
                close()
                moveTo(7.06f, 15.95f)
                lineToRelative(1.96f, -1.96f)
                lineToRelative(-3.94f, -3.94f)
                curveToRelative(-0.29f, 2.1f, 0.37f, 4.3f, 1.98f, 5.91f)
                close()
                moveTo(3.4f, 8.37f)
                lineTo(1.07f, 6.05f)
                curveTo(-0.93f, 10.47f, -0.11f, 15.86f, 3.51f, 19.49f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-2.43f, -2.43f, -3.18f, -5.91f, -2.24f, -8.99f)
                close()
            }
        }.also { _SignalStreamSlash = it}
