package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picture: ImageVector? = null

val Icons.Bs.Picture: ImageVector
    get() = _Picture ?: UXIcon(name = "Picture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.59f, 0f)
                horizontalLineTo(3.41f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3.41f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.59f, 0f)
                close()
                moveTo(3.41f, 3f)
                horizontalLineTo(20.59f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 3.41f)
                verticalLineTo(21f)
                lineTo(10.41f, 10.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
                lineTo(3f, 15f)
                verticalLineTo(3.41f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.41f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 7.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
        }.also { _Picture = it}
