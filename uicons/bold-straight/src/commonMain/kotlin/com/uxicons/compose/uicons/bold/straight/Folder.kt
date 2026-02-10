package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folder: ImageVector? = null

val Icons.Bs.Folder: ImageVector
    get() = _Folder ?: UXIcon(name = "Folder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(12.37f)
                lineTo(8.55f, 1f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                verticalLineTo(23f)
                horizontalLineTo(24f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                close()
                moveTo(3f, 20f)
                verticalLineTo(7.97f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                close()
            }
        }.also { _Folder = it}
