package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeftDown: ImageVector? = null

val Icons.Sr.TurnLeftDown: ImageVector
    get() = _TurnLeftDown ?: UXIcon(name = "TurnLeftDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(16.61f)
                curveToRelative(-0.04f, -0.03f, -0.08f, -0.04f, -0.12f, -0.08f)
                lineToRelative(-5.18f, -5.13f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.01f, 1.41f)
                lineToRelative(5.17f, 5.13f)
                curveToRelative(0.68f, 0.68f, 1.57f, 1.05f, 2.53f, 1.05f)
                reflectiveCurveToRelative(1.85f, -0.37f, 2.53f, -1.04f)
                lineToRelative(5.18f, -5.13f)
                curveToRelative(0.39f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.4f, -1.41f, -0.01f)
                lineToRelative(-5.18f, 5.14f)
                curveToRelative(-0.03f, 0.03f, -0.08f, 0.05f, -0.12f, 0.07f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _TurnLeftDown = it}
