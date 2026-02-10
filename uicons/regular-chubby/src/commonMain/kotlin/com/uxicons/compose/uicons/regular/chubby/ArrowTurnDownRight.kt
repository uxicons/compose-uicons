package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownRight: ImageVector? = null

val Icons.Rc.ArrowTurnDownRight: ImageVector
    get() = _ArrowTurnDownRight ?: UXIcon(name = "ArrowTurnDownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.84f, 14.54f)
                curveToRelative(-1.59f, 2.49f, -3.71f, 4.61f, -6.29f, 6.3f)
                curveToRelative(-0.46f, 0.3f, -1.08f, 0.18f, -1.38f, -0.29f)
                curveToRelative(-0.3f, -0.46f, -0.17f, -1.08f, 0.29f, -1.39f)
                curveToRelative(1.79f, -1.17f, 3.31f, -2.57f, 4.58f, -4.16f)
                horizontalLineToRelative(-8.03f)
                curveToRelative(-7.71f, 0f, -11f, -3.29f, -11f, -11f)
                curveToRelative(0f, -0.36f, 0.01f, -0.7f, 0.02f, -1.04f)
                curveToRelative(0.02f, -0.55f, 0.49f, -1.01f, 1.04f, -0.96f)
                curveToRelative(0.55f, 0.02f, 0.98f, 0.49f, 0.96f, 1.04f)
                curveToRelative(-0.01f, 0.31f, -0.02f, 0.63f, -0.02f, 0.96f)
                curveToRelative(0f, 6.56f, 2.44f, 9f, 9f, 9f)
                horizontalLineToRelative(8.03f)
                curveToRelative(-1.27f, -1.59f, -2.79f, -2.99f, -4.58f, -4.16f)
                curveToRelative(-0.46f, -0.3f, -0.59f, -0.92f, -0.29f, -1.39f)
                curveToRelative(0.3f, -0.46f, 0.92f, -0.59f, 1.38f, -0.29f)
                curveToRelative(2.58f, 1.69f, 4.7f, 3.81f, 6.29f, 6.3f)
                curveToRelative(0.21f, 0.33f, 0.21f, 0.75f, 0f, 1.08f)
                close()
            }
        }.also { _ArrowTurnDownRight = it}
