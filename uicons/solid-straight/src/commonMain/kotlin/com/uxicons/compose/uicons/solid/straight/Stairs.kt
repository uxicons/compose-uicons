package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stairs: ImageVector? = null

val Icons.Ss.Stairs: ImageVector
    get() = _Stairs ?: UXIcon(name = "Stairs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 24f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, -8f)
                lineToRelative(6f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, -6f)
                lineToRelative(8f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(-6f, 0f)
                lineToRelative(0f, 6f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, 5f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, 5f)
                lineToRelative(-6f, 0f)
                lineToRelative(0f, 6f)
                close()
            }
        }.also { _Stairs = it}
