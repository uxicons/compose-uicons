package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Laptop: ImageVector? = null

val Icons.Rs.Laptop: ImageVector
    get() = _Laptop ?: UXIcon(name = "Laptop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(15f)
                close()
                moveTo(4f, 5f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(14.92f)
                lineToRelative(-0.85f, 1f)
                horizontalLineTo(9.93f)
                lineToRelative(-0.85f, -1f)
                horizontalLineTo(4f)
                close()
                moveTo(22f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(17f)
                horizontalLineTo(8.15f)
                lineTo(9f, 18f)
                horizontalLineToRelative(6f)
                lineToRelative(0.85f, -1f)
                horizontalLineTo(22f)
                close()
            }
        }.also { _Laptop = it}
