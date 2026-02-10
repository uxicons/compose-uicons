package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeftAndUpRightToCenter: ImageVector? = null

val Icons.Bs.DownLeftAndUpRightToCenter: ImageVector
    get() = _DownLeftAndUpRightToCenter ?: UXIcon(name = "DownLeftAndUpRightToCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.0f, 14.41f)
                lineToRelative(-0.33f, 7.52f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(-5.28f, 5.28f)
                lineTo(0.03f, 21.85f)
                lineToRelative(5.28f, -5.28f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(7.52f, -0.33f)
                curveToRelative(0.8f, -0.04f, 1.45f, 0.61f, 1.41f, 1.41f)
                close()
                moveTo(23.98f, 2.14f)
                lineTo(21.86f, 0.02f)
                lineToRelative(-5.29f, 5.29f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(-0.33f, 7.52f)
                curveToRelative(-0.04f, 0.8f, 0.61f, 1.45f, 1.41f, 1.41f)
                lineToRelative(7.52f, -0.33f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(5.29f, -5.29f)
                close()
            }
        }.also { _DownLeftAndUpRightToCenter = it}
