package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownRight: ImageVector? = null

val Icons.Tc.ArrowTurnDownRight: ImageVector
    get() = _ArrowTurnDownRight ?: UXIcon(name = "ArrowTurnDownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.94f, 14.77f)
                curveToRelative(-1.55f, 2.43f, -3.62f, 4.5f, -6.15f, 6.15f)
                curveToRelative(-0.23f, 0.15f, -0.54f, 0.09f, -0.69f, -0.14f)
                curveToRelative(-0.15f, -0.23f, -0.09f, -0.54f, 0.14f, -0.69f)
                curveToRelative(2.13f, -1.39f, 3.9f, -3.11f, 5.31f, -5.08f)
                horizontalLineToRelative(-10.05f)
                curveToRelative(-7.46f, 0f, -10.5f, -3.04f, -10.5f, -10.5f)
                curveToRelative(0f, -0.35f, 0.01f, -1.69f, 0.02f, -2.02f)
                curveToRelative(0.01f, -0.28f, 0.23f, -0.48f, 0.52f, -0.48f)
                curveToRelative(0.28f, 0.01f, 0.49f, 0.24f, 0.48f, 0.52f)
                curveToRelative(-0.01f, 0.32f, -0.02f, 1.64f, -0.02f, 1.98f)
                curveToRelative(0f, 6.84f, 2.66f, 9.5f, 9.5f, 9.5f)
                horizontalLineToRelative(10.05f)
                curveToRelative(-1.41f, -1.97f, -3.18f, -3.69f, -5.31f, -5.08f)
                curveToRelative(-0.23f, -0.15f, -0.3f, -0.46f, -0.14f, -0.69f)
                curveToRelative(0.15f, -0.23f, 0.46f, -0.3f, 0.69f, -0.14f)
                curveToRelative(2.52f, 1.65f, 4.59f, 3.72f, 6.15f, 6.15f)
                curveToRelative(0.1f, 0.16f, 0.1f, 0.38f, 0f, 0.54f)
                close()
            }
        }.also { _ArrowTurnDownRight = it}
