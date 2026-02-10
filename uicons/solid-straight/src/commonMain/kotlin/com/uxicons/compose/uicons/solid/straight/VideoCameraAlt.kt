package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCameraAlt: ImageVector? = null

val Icons.Ss.VideoCameraAlt: ImageVector
    get() = _VideoCameraAlt ?: UXIcon(name = "VideoCameraAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.01f)
                verticalLineToRelative(13.98f)
                lineToRelative(-3f, -2.24f)
                lineTo(21f, 7.24f)
                lineToRelative(3f, -2.24f)
                close()
                moveTo(19f, 7f)
                verticalLineToRelative(13f)
                lineTo(0f, 20f)
                lineTo(0f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _VideoCameraAlt = it}
