package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AirplaneWindowOpen: ImageVector? = null

val Icons.Br.AirplaneWindowOpen: ImageVector
    get() = _AirplaneWindowOpen ?: UXIcon(name = "AirplaneWindowOpen") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(7.04f, 0f, 3f, 4.04f, 3f, 9f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            verticalLineToRelative(-6f)
            curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.34f, 0.04f, -0.67f, 0.09f, -1f)
            horizontalLineToRelative(11.82f)
            curveToRelative(0.06f, 0.33f, 0.09f, 0.66f, 0.09f, 1f)
            verticalLineToRelative(4.51f)
            curveToRelative(-0.3f, -0.22f, -0.64f, -0.39f, -1.02f, -0.46f)
            curveToRelative(-0.11f, -1.7f, -1.5f, -3.05f, -3.23f, -3.05f)
            curveToRelative(-1.79f, 0f, -3.25f, 1.46f, -3.25f, 3.25f)
            curveToRelative(0f, 0.39f, 0.08f, 0.76f, 0.21f, 1.11f)
            curveToRelative(-0.95f, 0.06f, -1.71f, 0.85f, -1.71f, 1.81f)
            curveToRelative(0f, 1.01f, 0.82f, 1.83f, 1.83f, 1.83f)
            horizontalLineToRelative(5.67f)
            curveToRelative(0.27f, 0f, 0.53f, -0.05f, 0.77f, -0.13f)
            curveToRelative(-1.02f, 1.86f, -3.0f, 3.13f, -5.27f, 3.13f)
            close()
        }
    }.also { _AirplaneWindowOpen = it }
