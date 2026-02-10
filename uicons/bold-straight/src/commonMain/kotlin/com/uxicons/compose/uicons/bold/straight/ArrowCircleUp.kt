package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleUp: ImageVector? = null

val Icons.Bs.ArrowCircleUp: ImageVector
    get() = _ArrowCircleUp ?: UXIcon(name = "ArrowCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
                moveTo(8.11f, 13.06f)
                lineTo(5.99f, 10.94f)
                lineTo(10.23f, 6.7f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.54f, 0f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(13.5f, 10.67f)
                verticalLineTo(18f)
                horizontalLineToRelative(-3f)
                verticalLineTo(10.67f)
                close()
            }
        }.also { _ArrowCircleUp = it}
