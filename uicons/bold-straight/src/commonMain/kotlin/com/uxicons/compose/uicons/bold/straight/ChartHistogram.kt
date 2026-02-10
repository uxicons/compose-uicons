package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartHistogram: ImageVector? = null

val Icons.Bs.ChartHistogram: ImageVector
    get() = _ChartHistogram ?: UXIcon(name = "ChartHistogram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.13f, 8.03f)
                arcToRelative(2.26f, 2.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -0.66f)
                lineTo(10.37f, 3.22f)
                lineTo(8.3f, 5.3f)
                lineTo(6.17f, 3.17f)
                lineTo(8.77f, 0.58f)
                arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.21f, 0f)
                lineToRelative(4.15f, 4.15f)
                lineTo(20.44f, 0.42f)
                lineToRelative(2.12f, 2.12f)
                lineTo(17.73f, 7.37f)
                arcTo(2.26f, 2.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.13f, 8.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 20.5f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                verticalLineTo(20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
                horizontalLineTo(24f)
                close()
            }
        }.also { _ChartHistogram = it}
