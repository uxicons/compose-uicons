package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pot: ImageVector? = null

val Icons.Bs.Pot: ImageVector
    get() = _Pot ?: UXIcon(name = "Pot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                horizontalLineTo(13.5f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
                horizontalLineToRelative(13f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20.5f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                close()
            }
        }.also { _Pot = it}
