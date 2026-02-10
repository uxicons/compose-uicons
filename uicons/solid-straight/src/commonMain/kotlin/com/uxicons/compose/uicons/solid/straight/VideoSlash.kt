package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoSlash: ImageVector? = null

val Icons.Ss.VideoSlash: ImageVector
    get() = _VideoSlash ?: UXIcon(name = "VideoSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.09f)
                verticalLineToRelative(15.83f)
                lineToRelative(-3f, -3f)
                lineTo(21f, 7.09f)
                lineToRelative(3f, -3f)
                close()
                moveTo(19f, 17.59f)
                lineToRelative(4.96f, 4.96f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(3.96f, 3.96f)
                horizontalLineToRelative(10.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(10.59f)
                close()
                moveTo(0.77f, 5.01f)
                curveToRelative(-0.47f, 0.53f, -0.77f, 1.22f, -0.77f, 1.99f)
                verticalLineToRelative(13f)
                lineTo(15.76f, 20f)
                lineTo(0.77f, 5.01f)
                close()
            }
        }.also { _VideoSlash = it}
