package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeftAndUpRightToCenter: ImageVector? = null

val Icons.Ss.DownLeftAndUpRightToCenter: ImageVector
    get() = _DownLeftAndUpRightToCenter ?: UXIcon(name = "DownLeftAndUpRightToCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.0f, 14.41f)
                lineToRelative(-0.33f, 7.52f)
                lineToRelative(-3.59f, -3.59f)
                lineTo(1.71f, 23.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5.37f, -5.37f)
                lineToRelative(-3.59f, -3.59f)
                lineToRelative(7.52f, -0.33f)
                curveToRelative(0.8f, -0.04f, 1.45f, 0.61f, 1.41f, 1.41f)
                close()
                moveTo(23.71f, 1.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-5.37f, 5.37f)
                lineToRelative(-3.59f, -3.59f)
                lineToRelative(-0.33f, 7.52f)
                curveToRelative(-0.04f, 0.8f, 0.61f, 1.45f, 1.41f, 1.41f)
                lineToRelative(7.52f, -0.33f)
                lineToRelative(-3.59f, -3.59f)
                lineTo(23.71f, 1.71f)
                close()
            }
        }.also { _DownLeftAndUpRightToCenter = it}
