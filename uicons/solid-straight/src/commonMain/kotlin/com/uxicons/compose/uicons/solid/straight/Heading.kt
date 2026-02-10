package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heading: ImageVector? = null

val Icons.Ss.Heading: ImageVector
    get() = _Heading ?: UXIcon(name = "Heading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                lineToRelative(0f, -2f)
                lineToRelative(-6f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 8.5f)
                lineToRelative(-16f, 0f)
                lineToRelative(0f, -8.5f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-6f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 20f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(6f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, -9.5f)
                lineToRelative(16f, 0f)
                lineToRelative(0f, 9.5f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(6f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, -20f)
                lineToRelative(2f, 0f)
                close()
            }
        }.also { _Heading = it}
