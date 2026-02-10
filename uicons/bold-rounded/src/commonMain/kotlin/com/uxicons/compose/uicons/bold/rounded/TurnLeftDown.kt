package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeftDown: ImageVector? = null

val Icons.Br.TurnLeftDown: ImageVector
    get() = _TurnLeftDown ?: UXIcon(name = "TurnLeftDown") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(14.6f)
            lineToRelative(4.41f, -4.63f)
            curveToRelative(0.57f, -0.6f, 1.52f, -0.62f, 2.12f, -0.05f)
            curveToRelative(0.6f, 0.57f, 0.62f, 1.52f, 0.05f, 2.12f)
            lineToRelative(-4.88f, 5.12f)
            curveToRelative(-0.88f, 0.88f, -2.0f, 1.34f, -3.21f, 1.34f)
            reflectiveCurveToRelative(-2.33f, -0.47f, -3.18f, -1.32f)
            lineToRelative(-4.9f, -5.15f)
            curveToRelative(-0.57f, -0.6f, -0.55f, -1.55f, 0.05f, -2.12f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.55f, 2.12f, 0.05f)
            lineToRelative(4.41f, 4.63f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _TurnLeftDown = it }
