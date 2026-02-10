package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleRight: ImageVector? = null

val Icons.Bs.AngleRight: ImageVector
    get() = _AngleRight ?: UXIcon(name = "AngleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.13f, 24f)
                lineToRelative(9.51f, -9.52f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.95f)
                lineTo(8.12f, 0f)
                lineTo(6f, 2.12f)
                lineToRelative(9.52f, 9.53f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.71f)
                lineTo(6.01f, 21.88f)
                close()
            }
        }.also { _AngleRight = it}
