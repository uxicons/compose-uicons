package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unlock: ImageVector? = null

val Icons.Bs.Unlock: ImageVector
    get() = _Unlock ?: UXIcon(name = "Unlock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 8f)
                verticalLineTo(7.15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.49f, 5.2f)
                lineToRelative(2.62f, -1.47f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7.15f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(8f)
                close()
                moveTo(5f, 21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                lineToRelative(0f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Unlock = it}
