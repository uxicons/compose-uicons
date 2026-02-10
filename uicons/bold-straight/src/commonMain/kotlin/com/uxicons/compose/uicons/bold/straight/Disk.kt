package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Disk: ImageVector? = null

val Icons.Bs.Disk: ImageVector
    get() = _Disk ?: UXIcon(name = "Disk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.12f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(5.88f)
                close()
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(3.12f)
                lineToRelative(4f, 4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                moveToRelative(-4f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
            }
        }.also { _Disk = it}
