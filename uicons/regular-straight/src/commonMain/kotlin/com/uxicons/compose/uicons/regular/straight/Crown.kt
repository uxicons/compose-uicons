package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crown: ImageVector? = null

val Icons.Rs.Crown: ImageVector
    get() = _Crown ?: UXIcon(name = "Crown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21.71f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(2.29f)
                lineToRelative(6f, 6f)
                lineToRelative(6f, -6f)
                lineToRelative(6f, 6f)
                lineToRelative(6f, -6f)
                verticalLineTo(18.71f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 21.71f)
                close()
                moveTo(2f, 7.12f)
                verticalLineTo(18.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(7.12f)
                lineToRelative(-4f, 4f)
                lineToRelative(-6f, -6f)
                lineToRelative(-6f, 6f)
                close()
            }
        }.also { _Crown = it}
