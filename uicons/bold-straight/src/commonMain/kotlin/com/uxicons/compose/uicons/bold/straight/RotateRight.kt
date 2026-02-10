package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateRight: ImageVector? = null

val Icons.Bs.RotateRight: ImageVector
    get() = _RotateRight ?: UXIcon(name = "RotateRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.65f, -6.35f)
                lineTo(16f, 8f)
                horizontalLineToRelative(5.91f)
                arcTo(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 6.91f)
                verticalLineTo(1f)
                lineTo(20.47f, 3.53f)
                arcTo(11.98f, 11.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                close()
            }
        }.also { _RotateRight = it}
