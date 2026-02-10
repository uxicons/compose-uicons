package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleLeft: ImageVector? = null

val Icons.Bs.AngleDoubleLeft: ImageVector
    get() = _AngleDoubleLeft ?: UXIcon(name = "AngleDoubleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.62f, 11.65f)
                lineToRelative(9.53f, -9.53f)
                lineTo(11.03f, 0.01f)
                lineTo(1.5f, 9.53f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.93f)
                lineTo(11.03f, 24f)
                lineToRelative(2.12f, -2.12f)
                lineTo(3.62f, 12.35f)
                arcTo(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.62f, 11.65f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.09f, 2.13f)
                lineTo(20.97f, 0.01f)
                lineTo(10.03f, 10.94f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.12f)
                lineTo(20.97f, 24f)
                lineToRelative(2.12f, -2.12f)
                lineTo(13.22f, 12f)
                close()
            }
        }.also { _AngleDoubleLeft = it}
