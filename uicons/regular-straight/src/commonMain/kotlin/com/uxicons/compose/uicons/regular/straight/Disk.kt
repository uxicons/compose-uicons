package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Disk: ImageVector? = null

val Icons.Rs.Disk: ImageVector
    get() = _Disk ?: UXIcon(name = "Disk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(5f)
                close()
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                close()
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(2.83f)
                lineToRelative(3f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
                moveTo(12f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
            }
        }.also { _Disk = it}
