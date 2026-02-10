package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleRight: ImageVector? = null

val Icons.Bs.AngleDoubleRight: ImageVector
    get() = _AngleDoubleRight ?: UXIcon(name = "AngleDoubleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.33f, 9.53f)
                lineTo(12.8f, 0.01f)
                lineTo(10.68f, 2.13f)
                lineToRelative(9.53f, 9.53f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.69f)
                lineTo(10.68f, 21.87f)
                lineTo(12.8f, 24f)
                lineToRelative(9.53f, -9.53f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.33f, 9.53f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.8f, 10.94f)
                lineTo(2.86f, 0.01f)
                lineTo(0.74f, 2.13f)
                lineTo(10.61f, 12f)
                lineTo(0.74f, 21.87f)
                lineTo(2.86f, 24f)
                lineTo(13.8f, 13.06f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.8f, 10.94f)
                close()
            }
        }.also { _AngleDoubleRight = it}
