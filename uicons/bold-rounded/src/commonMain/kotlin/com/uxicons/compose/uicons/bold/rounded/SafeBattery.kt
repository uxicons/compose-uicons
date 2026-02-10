package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SafeBattery: ImageVector? = null

val Icons.Br.SafeBattery: ImageVector
    get() = _SafeBattery ?: UXIcon(name = "SafeBattery") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 8f)
            horizontalLineToRelative(-1.21f)
            curveToRelative(-0.66f, -2.31f, -2.77f, -4f, -5.29f, -4f)
            horizontalLineToRelative(-11f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(11f)
            curveToRelative(2.51f, 0f, 4.63f, -1.7f, 5.29f, -4f)
            horizontalLineToRelative(1.21f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            close()
            moveTo(19f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(15f, 10.7f)
            curveToRelative(0f, 1.55f, -1.82f, 3.48f, -3.0f, 4.45f)
            curveToRelative(-0.58f, 0.47f, -1.41f, 0.47f, -1.99f, 0f)
            curveToRelative(-1.19f, -0.96f, -3.0f, -2.89f, -3.0f, -4.45f)
            curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
            reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
            curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
            reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
            close()
        }
    }.also { _SafeBattery = it }
