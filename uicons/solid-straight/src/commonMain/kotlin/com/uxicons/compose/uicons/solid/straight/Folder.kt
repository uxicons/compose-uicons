package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folder: ImageVector? = null

val Icons.Ss.Folder: ImageVector
    get() = _Folder ?: UXIcon(name = "Folder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.88f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(12.24f)
                lineToRelative(-4f, -2f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                verticalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8.99f)
                lineToRelative(0f, 14.01f)
                lineToRelative(24f, 0f)
                lineToRelative(0f, -14.12f)
                lineToRelative(-24f, 0.12f)
                close()
            }
        }.also { _Folder = it}
