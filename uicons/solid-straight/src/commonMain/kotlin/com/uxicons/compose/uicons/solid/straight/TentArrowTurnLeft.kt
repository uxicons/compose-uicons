package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowTurnLeft: ImageVector? = null

val Icons.Ss.TentArrowTurnLeft: ImageVector
    get() = _TentArrowTurnLeft ?: UXIcon(name = "TentArrowTurnLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
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
                moveTo(9.11f, 24f)
                horizontalLineToRelative(5.78f)
                lineToRelative(-2.89f, -4.37f)
                lineToRelative(-2.89f, 4.37f)
                close()
                moveTo(12f, 6.24f)
                lineTo(2.37f, 20.19f)
                curveToRelative(-0.47f, 0.78f, -0.49f, 1.72f, -0.04f, 2.51f)
                curveToRelative(0.45f, 0.8f, 1.31f, 1.3f, 2.25f, 1.3f)
                horizontalLineToRelative(2.15f)
                lineToRelative(5.28f, -8f)
                lineToRelative(5.29f, 8f)
                horizontalLineToRelative(2.15f)
                curveToRelative(0.94f, 0f, 1.79f, -0.5f, 2.25f, -1.3f)
                curveToRelative(0.45f, -0.79f, 0.43f, -1.73f, -0.08f, -2.56f)
                lineTo(12f, 6.24f)
                close()
            }
        }.also { _TentArrowTurnLeft = it}
