package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretLeft: ImageVector? = null

val Icons.Bs.CaretLeft: ImageVector
    get() = _CaretLeft ?: UXIcon(name = "CaretLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.29f, 19.29f)
                lineTo(8f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
                lineToRelative(6.29f, -6.29f)
                verticalLineToRelative(14f)
            }
        }.also { _CaretLeft = it}
