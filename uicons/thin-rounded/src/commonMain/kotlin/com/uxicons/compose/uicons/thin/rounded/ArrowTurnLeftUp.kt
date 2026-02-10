package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnLeftUp: ImageVector? = null

val Icons.Tr.ArrowTurnLeftUp: ImageVector
    get() = _ArrowTurnLeftUp ?: UXIcon(name = "ArrowTurnLeftUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(12.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineTo(1.25f)
                lineTo(1.85f, 7.36f)
                curveToRelative(-0.2f, 0.19f, -0.51f, 0.19f, -0.71f, -0.0f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f)
                lineTo(7.37f, 0.47f)
                curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.27f, 0.0f)
                lineToRelative(6.22f, 6.18f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.14f)
                lineTo(9f, 1.25f)
                verticalLineTo(19.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _ArrowTurnLeftUp = it}
