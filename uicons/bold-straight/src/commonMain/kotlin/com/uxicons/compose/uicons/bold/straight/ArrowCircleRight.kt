package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleRight: ImageVector? = null

val Icons.Bs.ArrowCircleRight: ImageVector
    get() = _ArrowCircleRight ?: UXIcon(name = "ArrowCircleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, -9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                close()
                moveTo(10.94f, 8.11f)
                lineTo(13.06f, 5.99f)
                lineTo(17.3f, 10.23f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.54f)
                lineTo(13.06f, 18.01f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.39f, -2.39f)
                lineTo(6f, 13.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.33f)
                close()
            }
        }.also { _ArrowCircleRight = it}
