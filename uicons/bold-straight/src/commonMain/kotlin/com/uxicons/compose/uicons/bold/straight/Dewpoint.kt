package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Bs.Dewpoint: ImageVector
    get() = _Dewpoint ?: UXIcon(name = "Dewpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 24f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 6.93f)
                lineTo(10f, 0.01f)
                lineToRelative(7.06f, 6.9f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 14.15f)
                horizontalLineToRelative(0f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 24f)
                close()
                moveTo(10f, 4.21f)
                lineTo(5.04f, 9.06f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.95f, 9.05f)
                close()
                moveTo(19f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2.5f)
                close()
            }
        }.also { _Dewpoint = it}
