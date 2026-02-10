package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _T: ImageVector? = null

val Icons.Ts.T: ImageVector
    get() = _T ?: UXIcon(name = "T") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                lineToRelative(-20f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(9.5f, 0f)
                lineToRelative(0f, 23f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -23f)
                lineToRelative(9.5f, 0f)
                lineToRelative(0f, -1f)
                close()
            }
        }.also { _T = it}
