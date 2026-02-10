package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPyramid: ImageVector? = null

val Icons.Rr.ChartPyramid: ImageVector
    get() = _ChartPyramid ?: UXIcon(name = "ChartPyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 18.24f)
                lineTo(15.59f, 2.27f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.18f, 0f)
                lineTo(0.59f, 18.24f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.18f, 24f)
                lineTo(19.82f, 24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.59f, -5.76f)
                close()
                moveTo(19.6f, 15f)
                lineTo(4.4f, 15f)
                lineTo(6.85f, 10f)
                horizontalLineToRelative(10.3f)
                close()
                moveTo(10.2f, 3.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.59f, 0f)
                lineTo(16.17f, 8f)
                lineTo(7.83f, 8f)
                close()
                moveTo(21.51f, 21.05f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.7f, 0.94f)
                lineTo(4.18f, 22.0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.8f, -2.88f)
                lineTo(3.42f, 17f)
                lineTo(20.58f, 17f)
                lineToRelative(1.04f, 2.12f)
                arcTo(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.52f, 21.06f)
                close()
            }
        }.also { _ChartPyramid = it}
