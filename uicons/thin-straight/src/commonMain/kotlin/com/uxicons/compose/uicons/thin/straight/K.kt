package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _K: ImageVector? = null

val Icons.Ts.K: ImageVector
    get() = _K ?: UXIcon(name = "K") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.13f, 0f)
                lineToRelative(-1.19f, 0f)
                lineToRelative(-7.71f, 12f)
                lineToRelative(-10.23f, 0f)
                lineToRelative(0f, -12f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, 24f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -11f)
                lineToRelative(10.23f, 0f)
                lineToRelative(7.48f, 11f)
                lineToRelative(1.21f, 0f)
                lineToRelative(-7.83f, -11.51f)
                lineToRelative(8.03f, -12.49f)
                close()
            }
        }.also { _K = it}
