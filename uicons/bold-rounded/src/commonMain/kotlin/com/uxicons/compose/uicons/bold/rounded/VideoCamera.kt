package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCamera: ImageVector? = null

val Icons.Br.VideoCamera: ImageVector
    get() = _VideoCamera ?: UXIcon(name = "VideoCamera") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.41f, 8.7f)
            arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.52f, 0.41f)
            lineToRelative(-1.08f, 0.81f)
            arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.72f, 6.1f)
            lineTo(10.15f, 1.52f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.67f, 0.5f)
            horizontalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
            horizontalLineTo(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 3.5f)
            horizontalLineTo(7.67f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.35f, 0.15f)
            lineTo(10.38f, 6f)
            horizontalLineTo(5.32f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
            verticalLineToRelative(7.36f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.32f, 24f)
            horizontalLineToRelative(8.36f)
            arcToRelative(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.13f, -3.91f)
            lineToRelative(1.2f, 0.89f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.49f, 0.5f)
            arcTo(2.53f, 2.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.97f, 21f)
            arcTo(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.85f)
            verticalLineTo(11.03f)
            arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.41f, 8.7f)
            close()
            moveTo(16f, 18.68f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.68f, 21f)
            horizontalLineTo(5.32f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.68f)
            verticalLineTo(11.32f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.32f, 9f)
            horizontalLineToRelative(8.36f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11.32f)
            close()
        }
    }.also { _VideoCamera = it }
