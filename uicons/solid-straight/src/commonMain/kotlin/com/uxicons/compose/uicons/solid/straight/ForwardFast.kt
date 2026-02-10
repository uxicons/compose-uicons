package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ForwardFast: ImageVector? = null

val Icons.Ss.ForwardFast: ImageVector
    get() = _ForwardFast ?: UXIcon(name = "ForwardFast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                lineToRelative(0f, 9.29f)
                lineToRelative(-13.0f, -9.2f)
                lineToRelative(-0.0f, 6.9f)
                lineToRelative(-9f, -6.94f)
                lineToRelative(0f, 23.89f)
                lineToRelative(9f, -6.94f)
                lineToRelative(0.0f, 6.9f)
                lineToRelative(13.0f, -9.2f)
                lineToRelative(0f, 9.29f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -24f)
                lineToRelative(-2f, 0f)
                close()
            }
        }.also { _ForwardFast = it}
