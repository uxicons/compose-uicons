package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ts1: ImageVector? = null

val Icons.Ts.Ts1: ImageVector
    get() = _Ts1 ?: UXIcon(name = "Ts1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, -22.46f)
                lineToRelative(-6.42f, 6.6f)
                lineToRelative(-0.72f, -0.7f)
                lineToRelative(7.24f, -7.45f)
                lineToRelative(0.89f, 0f)
                lineToRelative(0f, 24f)
                close()
            }
        }.also { _Ts1 = it}
