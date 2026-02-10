package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowTurnLeft: ImageVector? = null

val Icons.Bs.TentArrowTurnLeft: ImageVector
    get() = _TentArrowTurnLeft ?: UXIcon(name = "TentArrowTurnLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 2.98f)
                horizontalLineTo(4f)
                verticalLineTo(-0.02f)
                lineTo(0.29f, 3.77f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.71f, 3.79f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(4.52f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.52f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                lineTo(2.43f, 19.57f)
                curveToRelative(-0.55f, 0.91f, -0.57f, 2.0f, -0.05f, 2.93f)
                curveToRelative(0.52f, 0.93f, 1.52f, 1.51f, 2.61f, 1.51f)
                horizontalLineToRelative(14.04f)
                curveToRelative(1.08f, 0f, 2.08f, -0.58f, 2.61f, -1.51f)
                curveToRelative(0.52f, -0.93f, 0.5f, -2.02f, -0.08f, -2.98f)
                lineTo(12f, 6f)
                close()
                moveTo(15.26f, 21.02f)
                lineToRelative(-3.26f, -4.52f)
                lineToRelative(-3.27f, 4.53f)
                lineToRelative(-3.68f, 0.01f)
                lineToRelative(6.95f, -9.6f)
                lineToRelative(6.93f, 9.58f)
                lineToRelative(-3.67f, 0.01f)
                close()
            }
        }.also { _TentArrowTurnLeft = it}
