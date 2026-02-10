package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LiraSign: ImageVector? = null

val Icons.Br.LiraSign: ImageVector
    get() = _LiraSign ?: UXIcon(name = "LiraSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 11f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 4.69f, -3.81f, 8.5f, -8.5f, 8.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.4f)
            lineToRelative(6.01f, -2.19f)
            curveToRelative(0.78f, -0.28f, 1.18f, -1.15f, 0.9f, -1.92f)
            curveToRelative(-0.28f, -0.78f, -1.14f, -1.18f, -1.92f, -0.9f)
            lineToRelative(-4.99f, 1.81f)
            verticalLineToRelative(-1.81f)
            lineToRelative(6.01f, -2.19f)
            curveToRelative(0.78f, -0.28f, 1.18f, -1.15f, 0.9f, -1.92f)
            curveToRelative(-0.28f, -0.78f, -1.14f, -1.18f, -1.92f, -0.9f)
            lineToRelative(-4.99f, 1.81f)
            verticalLineTo(1.5f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            verticalLineTo(6.99f)
            lineToRelative(-3.01f, 1.1f)
            curveToRelative(-0.78f, 0.28f, -1.18f, 1.15f, -0.9f, 1.92f)
            curveToRelative(0.28f, 0.79f, 1.16f, 1.18f, 1.92f, 0.9f)
            lineToRelative(1.99f, -0.72f)
            verticalLineToRelative(1.81f)
            lineToRelative(-3.01f, 1.1f)
            curveToRelative(-0.78f, 0.28f, -1.18f, 1.15f, -0.9f, 1.92f)
            curveToRelative(0.28f, 0.79f, 1.16f, 1.18f, 1.92f, 0.9f)
            lineToRelative(1.99f, -0.72f)
            verticalLineToRelative(4.31f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            curveToRelative(6.34f, 0f, 11.5f, -5.16f, 11.5f, -11.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _LiraSign = it }
