package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownRight: ImageVector? = null

val Icons.Sc.ArrowTurnDownRight: ImageVector
    get() = _ArrowTurnDownRight ?: UXIcon(name = "ArrowTurnDownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.78f, 13.69f)
                curveToRelative(-1.63f, -2.55f, -3.8f, -4.72f, -6.44f, -6.45f)
                curveToRelative(-0.69f, -0.45f, -1.62f, -0.26f, -2.08f, 0.43f)
                reflectiveCurveToRelative(-0.26f, 1.62f, 0.43f, 2.08f)
                curveToRelative(1.43f, 0.94f, 2.7f, 2.03f, 3.79f, 3.25f)
                horizontalLineToRelative(-5.99f)
                curveToRelative(-6.28f, 0f, -8.5f, -2.23f, -8.5f, -8.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 7.95f, 3.55f, 11.5f, 11.5f, 11.5f)
                horizontalLineToRelative(5.99f)
                curveToRelative(-1.09f, 1.22f, -2.35f, 2.31f, -3.79f, 3.25f)
                curveToRelative(-0.69f, 0.45f, -0.89f, 1.38f, -0.43f, 2.08f)
                curveToRelative(0.46f, 0.7f, 1.39f, 0.88f, 2.08f, 0.43f)
                curveToRelative(2.64f, -1.73f, 4.81f, -3.9f, 6.44f, -6.45f)
                curveToRelative(0.32f, -0.49f, 0.32f, -1.12f, 0f, -1.62f)
                close()
            }
        }.also { _ArrowTurnDownRight = it}
