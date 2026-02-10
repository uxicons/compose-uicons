package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RewindButtonCircle: ImageVector? = null

val Icons.Br.RewindButtonCircle: ImageVector
    get() = _RewindButtonCircle ?: UXIcon(name = "RewindButtonCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(16.95f, 8.5f)
            verticalLineToRelative(7.01f)
            curveToRelative(0f, 0.82f, -0.93f, 1.28f, -1.59f, 0.8f)
            lineToRelative(-3.37f, -2.5f)
            verticalLineToRelative(1.7f)
            curveToRelative(0f, 0.82f, -0.93f, 1.28f, -1.59f, 0.8f)
            lineToRelative(-4.72f, -3.5f)
            curveToRelative(-0.54f, -0.4f, -0.54f, -1.2f, 0f, -1.6f)
            lineToRelative(4.72f, -3.5f)
            curveToRelative(0.66f, -0.49f, 1.59f, -0.02f, 1.59f, 0.8f)
            verticalLineToRelative(1.7f)
            lineToRelative(3.37f, -2.5f)
            curveToRelative(0.66f, -0.49f, 1.59f, -0.02f, 1.59f, 0.8f)
            close()
        }
    }.also { _RewindButtonCircle = it }
