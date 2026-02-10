package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Icicles: ImageVector? = null

val Icons.Ss.Icicles: ImageVector
    get() = _Icicles ?: UXIcon(name = "Icicles") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                lineToRelative(24f, 0f)
                lineToRelative(0f, 0.64f)
                lineToRelative(-3f, 21.36f)
                lineToRelative(-3.13f, -12.72f)
                lineToRelative(-2.86f, 8.86f)
                lineToRelative(-3.1f, -8.88f)
                lineToRelative(-3.91f, 14.73f)
                lineToRelative(-3.43f, -14.47f)
                lineToRelative(-2.57f, 7.47f)
                lineToRelative(-2f, -16.36f)
                lineToRelative(0f, -0.64f)
                close()
            }
        }.also { _Icicles = it}
