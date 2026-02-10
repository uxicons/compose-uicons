package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimePast: ImageVector? = null

val Icons.Br.TimePast: ImageVector
    get() = _TimePast ?: UXIcon(name = "TimePast") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.04f, 3.04f)
            lineTo(2.71f, 1.71f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2.41f)
            verticalLineTo(7f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
            horizontalLineTo(6.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -1.71f)
            lineTo(6.16f, 5.16f)
            arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12.26f)
            arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, 13.32f)
            arcTo(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.61f, 12f)
            horizontalLineToRelative(0f)
            arcTo(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, 13.66f)
            arcTo(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.47f, 23.99f)
            arcTo(12.11f, 12.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.99f, 12.47f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 7f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8.5f)
            verticalLineToRelative(4.29f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.59f, 1.41f)
            lineTo(12.38f, 16f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 13.88f)
            lineToRelative(-1.5f, -1.5f)
            verticalLineTo(8.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 7f)
            close()
        }
    }.also { _TimePast = it }
