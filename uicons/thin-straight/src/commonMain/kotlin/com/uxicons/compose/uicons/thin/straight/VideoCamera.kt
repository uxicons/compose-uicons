package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCamera: ImageVector? = null

val Icons.Ts.VideoCamera: ImageVector
    get() = _VideoCamera ?: UXIcon(name = "VideoCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                lineToRelative(-4f, 3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.79f)
                lineTo(9.71f, 1f)
                lineTo(0f, 1f)
                verticalLineToRelative(1f)
                lineTo(9.29f, 2f)
                lineToRelative(4f, 4f)
                lineTo(2.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                lineTo(20f, 24f)
                verticalLineToRelative(-5f)
                lineToRelative(4f, 3f)
                lineTo(24f, 8f)
                close()
                moveTo(19f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(23f, 20f)
                lineToRelative(-3f, -2.25f)
                verticalLineToRelative(-5.5f)
                lineToRelative(3f, -2.25f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _VideoCamera = it}
