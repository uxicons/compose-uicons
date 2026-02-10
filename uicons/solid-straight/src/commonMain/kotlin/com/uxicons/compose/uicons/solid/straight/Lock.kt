package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lock: ImageVector? = null

val Icons.Ss.Lock: ImageVector
    get() = _Lock ?: UXIcon(name = "Lock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                verticalLineTo(7f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(8f)
                close()
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                close()
            }
        }.also { _Lock = it}
