package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Disk: ImageVector? = null

val Icons.Ss.Disk: ImageVector
    get() = _Disk ?: UXIcon(name = "Disk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 0f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(5f)
                close()
                moveTo(12f, 18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                close()
            }
        }.also { _Disk = it}
