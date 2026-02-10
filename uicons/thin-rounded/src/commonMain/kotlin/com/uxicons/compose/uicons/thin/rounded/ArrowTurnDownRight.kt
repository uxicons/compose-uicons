package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownRight: ImageVector? = null

val Icons.Tr.ArrowTurnDownRight: ImageVector
    get() = _ArrowTurnDownRight ?: UXIcon(name = "ArrowTurnDownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 13.74f)
                lineToRelative(-5.41f, -5.59f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                lineToRelative(5.42f, 5.59f)
                curveToRelative(0.16f, 0.16f, 0.28f, 0.36f, 0.35f, 0.56f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(11.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineTo(22.91f)
                curveToRelative(-0.07f, 0.21f, -0.19f, 0.4f, -0.36f, 0.57f)
                lineToRelative(-5.41f, 5.59f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.14f, 0.35f, 0.14f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.36f, -0.15f)
                lineToRelative(5.41f, -5.58f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.53f)
                close()
            }
        }.also { _ArrowTurnDownRight = it}
