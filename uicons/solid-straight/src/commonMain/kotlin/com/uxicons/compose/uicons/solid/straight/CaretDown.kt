package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretDown: ImageVector? = null

val Icons.Ss.CaretDown: ImageVector
    get() = _CaretDown ?: UXIcon(name = "CaretDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9f)
                horizontalLineTo(19f)
                lineToRelative(-6.29f, 6.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                close()
            }
        }.also { _CaretDown = it}
