package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mug: ImageVector? = null

val Icons.Bs.Mug: ImageVector
    get() = _Mug ?: UXIcon(name = "Mug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineTo(1f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                verticalLineTo(19.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 23f)
                horizontalLineToRelative(11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19.5f)
                verticalLineTo(18f)
                horizontalLineToRelative(5f)
                close()
                moveTo(15.5f, 20f)
                horizontalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(19.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 20f)
                close()
                moveTo(21f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
            }
        }.also { _Mug = it}
