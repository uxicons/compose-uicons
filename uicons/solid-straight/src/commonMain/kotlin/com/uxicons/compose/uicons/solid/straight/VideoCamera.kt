package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCamera: ImageVector? = null

val Icons.Ss.VideoCamera: ImageVector
    get() = _VideoCamera ?: UXIcon(name = "VideoCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10.24f)
                lineToRelative(0f, 9.51f)
                lineToRelative(3f, 2.24f)
                lineToRelative(0f, -13.99f)
                lineToRelative(-3f, 2.24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 6f)
                horizontalLineTo(14.91f)
                lineToRelative(-5f, -5f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(9.09f)
                lineToRelative(3f, 3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                verticalLineTo(24f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 6f)
                close()
            }
        }.also { _VideoCamera = it}
