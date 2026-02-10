package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleDown: ImageVector? = null

val Icons.Bs.ArrowCircleDown: ImageVector
    get() = _ArrowCircleDown ?: UXIcon(name = "ArrowCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, -9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
                moveTo(15.89f, 10.94f)
                lineTo(18.01f, 13.06f)
                lineTo(13.77f, 17.3f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.54f, 0f)
                lineTo(5.99f, 13.06f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.39f, 2.39f)
                lineTo(10.5f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.33f)
                close()
            }
        }.also { _ArrowCircleDown = it}
