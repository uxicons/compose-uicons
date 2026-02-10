package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowTurnLeft: ImageVector? = null

val Icons.Rs.TentArrowTurnLeft: ImageVector
    get() = _TentArrowTurnLeft ?: UXIcon(name = "TentArrowTurnLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6.79f)
                lineTo(2.37f, 20.19f)
                curveToRelative(-0.47f, 0.78f, -0.49f, 1.72f, -0.04f, 2.51f)
                curveToRelative(0.45f, 0.8f, 1.31f, 1.3f, 2.25f, 1.3f)
                horizontalLineToRelative(14.87f)
                curveToRelative(0.94f, 0f, 1.79f, -0.5f, 2.25f, -1.3f)
                curveToRelative(0.45f, -0.79f, 0.43f, -1.73f, -0.09f, -2.57f)
                lineTo(12f, 6.79f)
                close()
                moveTo(10.56f, 22f)
                lineToRelative(1.44f, -2.19f)
                lineToRelative(1.44f, 2.19f)
                horizontalLineToRelative(-2.89f)
                close()
                moveTo(19.93f, 21.72f)
                curveToRelative(-0.05f, 0.09f, -0.19f, 0.28f, -0.5f, 0.28f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-3.84f, -5.81f)
                lineToRelative(-3.84f, 5.81f)
                horizontalLineToRelative(-3.59f)
                curveToRelative(-0.31f, 0f, -0.46f, -0.2f, -0.5f, -0.28f)
                curveToRelative(-0.05f, -0.09f, -0.11f, -0.26f, -0.01f, -0.46f)
                lineToRelative(7.94f, -11.04f)
                lineToRelative(7.93f, 11.02f)
                curveToRelative(0.13f, 0.21f, 0.06f, 0.4f, 0.01f, 0.49f)
                close()
                moveTo(24.0f, 10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(2.99f, 6f)
                lineToRelative(2.3f, 2.29f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.58f, 6.41f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.04f, 0f, -2.81f)
                lineTo(3.88f, 0.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.29f, 2.29f)
                horizontalLineToRelative(14.99f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
            }
        }.also { _TentArrowTurnLeft = it}
