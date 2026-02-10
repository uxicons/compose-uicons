package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spinner: ImageVector? = null

val Icons.Rs.Spinner: ImageVector
    get() = _Spinner ?: UXIcon(name = "Spinner") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.41f, 12f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.17f, -4.36f)
                lineToRelative(-1.86f, 0.73f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.41f, 22f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.31f, -6.36f)
                lineToRelative(1.86f, 0.73f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.41f, 12f)
                close()
            }
        }.also { _Spinner = it}
