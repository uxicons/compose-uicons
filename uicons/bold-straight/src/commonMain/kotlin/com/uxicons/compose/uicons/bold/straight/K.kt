package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _K: ImageVector? = null

val Icons.Bs.K: ImageVector
    get() = _K ?: UXIcon(name = "K") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.95f, 24f)
                lineToRelative(3.67f, 0f)
                lineToRelative(-7.83f, -11.06f)
                lineToRelative(7.77f, -12.94f)
                lineToRelative(-3.5f, 0f)
                lineToRelative(-6.62f, 11f)
                lineToRelative(-7.45f, 0f)
                lineToRelative(0f, -11f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 24f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -10f)
                lineToRelative(6.86f, 0f)
                lineToRelative(7.09f, 10f)
                close()
            }
        }.also { _K = it}
