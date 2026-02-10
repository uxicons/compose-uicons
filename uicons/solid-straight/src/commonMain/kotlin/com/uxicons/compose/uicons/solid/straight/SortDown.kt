package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortDown: ImageVector? = null

val Icons.Ss.SortDown: ImageVector
    get() = _SortDown ?: UXIcon(name = "SortDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.97f, 18f)
                curveToRelative(-0.7f, 0f, -1.38f, -0.3f, -1.85f, -0.82f)
                lineTo(1.73f, 8f)
                horizontalLineTo(22.22f)
                lineToRelative(-8.4f, 9.18f)
                curveToRelative(-0.46f, 0.52f, -1.14f, 0.82f, -1.84f, 0.82f)
                close()
            }
        }.also { _SortDown = it}
