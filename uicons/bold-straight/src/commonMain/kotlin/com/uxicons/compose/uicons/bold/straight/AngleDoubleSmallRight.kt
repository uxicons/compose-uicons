package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallRight: ImageVector? = null

val Icons.Bs.AngleDoubleSmallRight: ImageVector
    get() = _AngleDoubleSmallRight ?: UXIcon(name = "AngleDoubleSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.46f, 10.23f)
                lineTo(14.16f, 4.94f)
                lineTo(12.04f, 7.06f)
                lineTo(16.98f, 12f)
                lineToRelative(-4.94f, 4.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(5.29f, -5.29f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.46f, 10.23f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.16f, 10.94f)
                lineToRelative(-6f, -6f)
                lineTo(5.04f, 7.06f)
                lineTo(9.98f, 12f)
                lineTo(5.04f, 16.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(6f, -6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.16f, 10.94f)
                close()
            }
        }.also { _AngleDoubleSmallRight = it}
