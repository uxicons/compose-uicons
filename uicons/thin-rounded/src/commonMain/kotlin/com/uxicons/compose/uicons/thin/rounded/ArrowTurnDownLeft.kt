package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownLeft: ImageVector? = null

val Icons.Tr.ArrowTurnDownLeft: ImageVector
    get() = _ArrowTurnDownLeft ?: UXIcon(name = "ArrowTurnDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(11.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineTo(1.09f)
                curveToRelative(0.07f, -0.21f, 0.19f, -0.4f, 0.36f, -0.57f)
                lineToRelative(5.41f, -5.59f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                lineTo(0.73f, 13.73f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.56f, 0f, 3.53f)
                lineToRelative(5.41f, 5.59f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                reflectiveCurveToRelative(0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                lineTo(1.44f, 16.56f)
                curveToRelative(-0.16f, -0.16f, -0.28f, -0.36f, -0.35f, -0.56f)
                horizontalLineTo(19.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ArrowTurnDownLeft = it}
