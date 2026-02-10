package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pot: ImageVector? = null

val Icons.Ss.Pot: ImageVector
    get() = _Pot ?: UXIcon(name = "Pot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                horizontalLineToRelative(8f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                close()
                moveTo(2f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _Pot = it}
