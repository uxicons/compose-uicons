package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleRight: ImageVector? = null

val Icons.Rs.AngleRight: ImageVector
    get() = _AngleRight ?: UXIcon(name = "AngleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.41f, 24f)
                lineTo(6f, 22.59f)
                lineToRelative(9.88f, -9.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                lineTo(6.02f, 1.43f)
                lineTo(7.43f, 0.02f)
                lineToRelative(9.86f, 9.86f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.24f)
                close()
            }
        }.also { _AngleRight = it}
