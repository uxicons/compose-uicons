package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartHistogram: ImageVector? = null

val Icons.Br.ChartHistogram: ImageVector
    get() = _ChartHistogram ?: UXIcon(name = "ChartHistogram") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(17f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 9f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10.5f)
            verticalLineToRelative(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 9f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 13.5f)
            verticalLineToRelative(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 9.5f)
            verticalLineToRelative(8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 7.5f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.94f, -0.33f)
            lineTo(9.21f, 5.35f)
            arcToRelative(2.39f, 2.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.19f, 0.18f)
            arcToRelative(5.43f, 5.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.3f, 0.3f)
            lineToRelative(3.76f, -3.19f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21.53f, 0.35f)
            lineTo(17.77f, 3.54f)
            arcTo(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.53f, 3.4f)
            arcToRelative(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.19f, -0.4f)
            lineTo(5.06f, 4.83f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7.5f)
            close()
        }
    }.also { _ChartHistogram = it }
