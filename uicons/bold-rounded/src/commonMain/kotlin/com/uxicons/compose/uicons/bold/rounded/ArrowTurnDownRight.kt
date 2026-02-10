package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownRight: ImageVector? = null

val Icons.Br.ArrowTurnDownRight: ImageVector
    get() = _ArrowTurnDownRight ?: UXIcon(name = "ArrowTurnDownRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.97f, 16.97f)
            lineToRelative(-4.39f, 4.57f)
            curveToRelative(-0.29f, 0.31f, -0.69f, 0.46f, -1.08f, 0.46f)
            reflectiveCurveToRelative(-0.75f, -0.14f, -1.04f, -0.42f)
            curveToRelative(-0.6f, -0.58f, -0.62f, -1.52f, -0.04f, -2.12f)
            lineToRelative(3.33f, -3.46f)
            horizontalLineTo(5.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(14.25f)
            lineToRelative(-3.33f, -3.46f)
            curveToRelative(-0.57f, -0.6f, -0.56f, -1.55f, 0.04f, -2.12f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.56f, 2.12f, 0.04f)
            lineToRelative(4.41f, 4.59f)
            curveToRelative(1.34f, 1.34f, 1.34f, 3.56f, -0.02f, 4.93f)
            close()
        }
    }.also { _ArrowTurnDownRight = it }
