package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stairs: ImageVector? = null

val Icons.Bs.Stairs: ImageVector
    get() = _Stairs ?: UXIcon(name = "Stairs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 24f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, -9f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(9f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-6f, 0f)
                lineToRelative(0f, 5f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, 5f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, 5f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, 6f)
                close()
            }
        }.also { _Stairs = it}
