package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Checkbox: ImageVector? = null

val Icons.Bs.Checkbox: ImageVector
    get() = _Checkbox ?: UXIcon(name = "Checkbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.67f, 17.79f)
                arcToRelative(2.36f, 2.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.68f, -0.7f)
                lineToRelative(8.71f, -8.71f)
                lineTo(17.94f, 6.26f)
                lineTo(9.67f, 14.53f)
                lineTo(6.06f, 10.92f)
                lineTo(3.94f, 13.04f)
                lineToRelative(4.05f, 4.05f)
                arcTo(2.36f, 2.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.67f, 17.79f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3f)
                lineTo(21f, 3f)
                close()
            }
        }.also { _Checkbox = it}
