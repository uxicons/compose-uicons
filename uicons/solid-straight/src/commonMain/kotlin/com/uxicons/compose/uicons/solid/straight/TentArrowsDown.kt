package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowsDown: ImageVector? = null

val Icons.Ss.TentArrowsDown: ImageVector
    get() = _TentArrowsDown ?: UXIcon(name = "TentArrowsDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.59f, 8.42f)
                lineTo(0.29f, 5.12f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                lineTo(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.01f)
                lineToRelative(2.29f, -2.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                close()
                moveTo(19f, 9.0f)
                curveToRelative(0.51f, 0f, 1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.29f, 2.3f)
                lineTo(20.0f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.0f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
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
        }.also { _TentArrowsDown = it}
