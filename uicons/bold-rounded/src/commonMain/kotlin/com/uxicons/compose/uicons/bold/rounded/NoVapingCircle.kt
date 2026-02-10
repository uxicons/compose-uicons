package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVapingCircle: ImageVector? = null

val Icons.Br.NoVapingCircle: ImageVector
    get() = _NoVapingCircle ?: UXIcon(name = "NoVapingCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.06f, 18f)
            horizontalLineToRelative(-3.06f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-3.06f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.63f, -5.37f, 12f, -12f, 12f)
            curveToRelative(-6.62f, 0f, -12f, -5.38f, -12f, -12f)
            curveToRelative(0.01f, -6.63f, 5.38f, -11.99f, 12f, -12f)
            curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-1.94f, 0f, -3.73f, 0.62f, -5.21f, 1.67f)
            lineToRelative(3.33f, 3.33f)
            horizontalLineToRelative(1.88f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1f, 1f, -1f, 1f, -1f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            verticalLineToRelative(0.5f)
            reflectiveCurveToRelative(1f, 0f, 1f, 1f)
            verticalLineToRelative(6.88f)
            lineToRelative(3.33f, 3.33f)
            curveToRelative(1.05f, -1.47f, 1.67f, -3.27f, 1.67f, -5.21f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            close()
            moveTo(12f, 21f)
            curveToRelative(1.94f, 0f, 3.73f, -0.62f, 5.21f, -1.67f)
            lineToRelative(-12.53f, -12.53f)
            curveToRelative(-1.05f, 1.47f, -1.67f, 3.27f, -1.67f, 5.21f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            close()
        }
    }.also { _NoVapingCircle = it }
