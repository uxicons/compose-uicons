package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoSlash: ImageVector? = null

val Icons.Rs.VideoSlash: ImageVector
    get() = _VideoSlash ?: UXIcon(name = "VideoSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19.91f)
                lineTo(24f, 4.09f)
                lineToRelative(-4f, 4f)
                verticalLineToRelative(-1.09f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5.41f, 4f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.96f, -3.96f)
                verticalLineToRelative(-2.67f)
                lineToRelative(4f, 4f)
                close()
                moveTo(20f, 10.91f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(6.17f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-2.17f)
                close()
                moveTo(18f, 16.59f)
                lineTo(7.41f, 6f)
                horizontalLineToRelative(9.59f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9.59f)
                close()
                moveTo(13.76f, 18f)
                lineToRelative(2f, 2f)
                lineTo(0f, 20f)
                lineTo(0f, 7f)
                curveToRelative(0f, -0.77f, 0.3f, -1.46f, 0.77f, -1.99f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(-0.11f, 0.16f, -0.2f, 0.35f, -0.2f, 0.56f)
                verticalLineToRelative(11f)
                lineTo(13.76f, 18.0f)
                close()
            }
        }.also { _VideoSlash = it}
