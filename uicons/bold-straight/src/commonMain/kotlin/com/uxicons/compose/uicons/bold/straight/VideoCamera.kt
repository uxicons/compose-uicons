package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCamera: ImageVector? = null

val Icons.Bs.VideoCamera: ImageVector
    get() = _VideoCamera ?: UXIcon(name = "VideoCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.75f)
                lineToRelative(-3f, 2.24f)
                verticalLineTo(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(15.68f)
                lineToRelative(-5.52f, -6f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(8.84f)
                lineTo(11.6f, 6f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                verticalLineTo(24f)
                horizontalLineTo(21f)
                verticalLineTo(19.01f)
                lineToRelative(3f, 2.24f)
                close()
                moveTo(18f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                close()
            }
        }.also { _VideoCamera = it}
