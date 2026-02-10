package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rewind: ImageVector? = null

val Icons.Sr.Rewind: ImageVector
    get() = _Rewind ?: UXIcon(name = "Rewind") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.42f, 20.66f)
                arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.23f, -0.73f)
                lineToRelative(-6.64f, -4.87f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6.1f)
                lineToRelative(6.64f, -4.87f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.2f, 6.85f)
                lineToRelative(3.78f, -2.77f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 7.13f)
                verticalLineToRelative(9.74f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.02f, 3.05f)
                lineTo(14.2f, 17.15f)
                arcToRelative(3.79f, 3.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.78f, 3.51f)
                close()
            }
        }.also { _Rewind = it}
