package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spinner: ImageVector? = null

val Icons.Bs.Spinner: ImageVector
    get() = _Spinner ?: UXIcon(name = "Spinner") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.41f, 12.05f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.17f, -4.36f)
                lineTo(20.79f, 8.78f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6.54f)
                lineToRelative(2.79f, 1.09f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.41f, 12.05f)
                close()
            }
        }.also { _Spinner = it}
