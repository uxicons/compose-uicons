package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bolt: ImageVector? = null

val Icons.Ss.Bolt: ImageVector
    get() = _Bolt ?: UXIcon(name = "Bolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.57f, 24f)
                horizontalLineTo(8.72f)
                lineToRelative(2f, -8f)
                horizontalLineTo(6.59f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.45f, -3.3f)
                lineTo(7.98f, 0f)
                horizontalLineToRelative(9.47f)
                lineToRelative(-3f, 8f)
                horizontalLineToRelative(4.02f)
                arcToRelative(2.53f, 2.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.11f, 3.93f)
                close()
            }
        }.also { _Bolt = it}
