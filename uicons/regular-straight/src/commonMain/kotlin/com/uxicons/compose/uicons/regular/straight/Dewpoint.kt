package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Rs.Dewpoint: ImageVector
    get() = _Dewpoint ?: UXIcon(name = "Dewpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 23.99f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 6.92f)
                lineTo(10f, 0.01f)
                lineToRelative(7.06f, 6.91f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 14.15f)
                horizontalLineToRelative(0f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 23.99f)
                close()
                moveTo(10f, 2.8f)
                lineTo(4.33f, 8.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.32f, -0.01f)
                close()
                moveTo(21f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                close()
                moveTo(21f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                close()
            }
        }.also { _Dewpoint = it}
