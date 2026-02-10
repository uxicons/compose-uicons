package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Bs.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 21.21f)
                lineTo(1f, 2.82f)
                lineToRelative(10.71f, 6.84f)
                curveToRelative(0.8f, 0.5f, 1.29f, 1.38f, 1.28f, 2.34f)
                curveToRelative(0f, 0.96f, -0.49f, 1.84f, -1.3f, 2.35f)
                lineTo(1f, 21.21f)
                close()
                moveTo(4f, 8.29f)
                verticalLineToRelative(7.43f)
                lineToRelative(5.81f, -3.72f)
                lineToRelative(-5.81f, -3.71f)
                close()
                moveTo(23f, 21f)
                horizontalLineToRelative(-3f)
                lineTo(20f, 3f)
                horizontalLineToRelative(3f)
                lineTo(23f, 21f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 3f)
                horizontalLineToRelative(3f)
                lineTo(18f, 21f)
                close()
            }
        }.also { _PlayPause = it}
