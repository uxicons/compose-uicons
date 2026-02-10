package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretUp: ImageVector? = null

val Icons.Bs.CaretUp: ImageVector
    get() = _CaretUp ?: UXIcon(name = "CaretUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15.29f)
                horizontalLineTo(5f)
                lineTo(11.29f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                close()
            }
        }.also { _CaretUp = it}
