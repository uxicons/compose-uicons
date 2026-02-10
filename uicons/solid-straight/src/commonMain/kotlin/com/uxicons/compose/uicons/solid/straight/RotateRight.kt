package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateRight: ImageVector? = null

val Icons.Ss.RotateRight: ImageVector
    get() = _RotateRight ?: UXIcon(name = "RotateRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.86f, -7f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineToRelative(5.14f)
                arcTo(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 5.14f)
                verticalLineTo(0f)
                horizontalLineTo(20f)
                verticalLineTo(3.06f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                close()
            }
        }.also { _RotateRight = it}
