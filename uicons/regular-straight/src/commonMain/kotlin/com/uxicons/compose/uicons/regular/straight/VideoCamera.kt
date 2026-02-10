package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCamera: ImageVector? = null

val Icons.Rs.VideoCamera: ImageVector
    get() = _VideoCamera ?: UXIcon(name = "VideoCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.01f)
                lineToRelative(-4f, 2.98f)
                lineTo(20f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(14.91f, 6f)
                lineToRelative(-5f, -5f)
                lineTo(0f, 1f)
                lineTo(0f, 3f)
                lineTo(9.09f, 3f)
                lineToRelative(3f, 3f)
                lineTo(3f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                lineTo(0f, 24f)
                lineTo(20f, 24f)
                lineTo(20f, 19.01f)
                lineToRelative(4f, 2.98f)
                close()
                moveTo(18f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 8f)
                lineTo(17f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(22f, 18.01f)
                lineTo(20f, 16.52f)
                lineTo(20f, 13.48f)
                lineToRelative(2f, -1.49f)
                close()
            }
        }.also { _VideoCamera = it}
