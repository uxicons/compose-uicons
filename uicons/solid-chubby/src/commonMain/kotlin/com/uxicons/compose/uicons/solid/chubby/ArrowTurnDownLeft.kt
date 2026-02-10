package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownLeft: ImageVector? = null

val Icons.Sc.ArrowTurnDownLeft: ImageVector
    get() = _ArrowTurnDownLeft ?: UXIcon(name = "ArrowTurnDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 6.28f, -2.23f, 8.5f, -8.5f, 8.5f)
                horizontalLineToRelative(-5.99f)
                curveToRelative(1.09f, -1.22f, 2.35f, -2.31f, 3.79f, -3.24f)
                curveToRelative(0.69f, -0.45f, 0.89f, -1.38f, 0.43f, -2.08f)
                curveToRelative(-0.45f, -0.69f, -1.38f, -0.89f, -2.08f, -0.43f)
                curveToRelative(-2.65f, 1.73f, -4.81f, 3.9f, -6.44f, 6.45f)
                curveToRelative(-0.32f, 0.49f, -0.32f, 1.12f, 0f, 1.62f)
                curveToRelative(1.63f, 2.55f, 3.8f, 4.72f, 6.44f, 6.45f)
                curveToRelative(0.68f, 0.45f, 1.62f, 0.26f, 2.08f, -0.43f)
                curveToRelative(0.45f, -0.69f, 0.26f, -1.62f, -0.43f, -2.08f)
                curveToRelative(-1.43f, -0.94f, -2.7f, -2.03f, -3.79f, -3.24f)
                horizontalLineToRelative(5.99f)
                curveToRelative(7.95f, 0f, 11.5f, -3.55f, 11.5f, -11.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowTurnDownLeft = it}
