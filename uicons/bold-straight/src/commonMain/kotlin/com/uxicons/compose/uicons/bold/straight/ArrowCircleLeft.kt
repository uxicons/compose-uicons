package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleLeft: ImageVector? = null

val Icons.Bs.ArrowCircleLeft: ImageVector
    get() = _ArrowCircleLeft ?: UXIcon(name = "ArrowCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(3f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                close()
                moveTo(13.06f, 15.89f)
                lineTo(10.94f, 18.01f)
                lineTo(6.7f, 13.77f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.54f)
                lineTo(10.94f, 5.99f)
                lineToRelative(2.12f, 2.12f)
                lineTo(10.67f, 10.5f)
                lineTo(18f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(10.67f, 13.5f)
                close()
            }
        }.also { _ArrowCircleLeft = it}
