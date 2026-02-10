package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallLeft: ImageVector? = null

val Icons.Bs.AngleDoubleSmallLeft: ImageVector
    get() = _AngleDoubleSmallLeft ?: UXIcon(name = "AngleDoubleSmallLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.54f, 7.06f)
                lineTo(9.42f, 4.94f)
                lineTo(4.13f, 10.23f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
                lineToRelative(5.29f, 5.29f)
                lineToRelative(2.12f, -2.12f)
                lineTo(6.6f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.54f, 7.06f)
                lineTo(16.42f, 4.94f)
                lineToRelative(-6f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.12f)
                lineToRelative(6f, 6f)
                lineToRelative(2.12f, -2.12f)
                lineTo(13.6f, 12f)
                close()
            }
        }.also { _AngleDoubleSmallLeft = it}
