package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddle: ImageVector? = null

val Icons.Rr.CommentAltMiddle: ImageVector
    get() = _CommentAltMiddle ?: UXIcon(name = "CommentAltMiddle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 23.66f)
                curveToRelative(-0.48f, 0f, -0.95f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                horizontalLineToRelative(-2.92f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineTo(4f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineTo(20f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-2.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                close()
                moveTo(4f, 2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3.29f)
                curveToRelative(0.24f, 0f, 0.46f, 0.08f, 0.65f, 0.23f)
                lineToRelative(4.05f, 3.41f)
                lineToRelative(4.17f, -3.42f)
                curveToRelative(0.18f, -0.15f, 0.41f, -0.23f, 0.64f, -0.23f)
                horizontalLineToRelative(3.21f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                close()
            }
        }.also { _CommentAltMiddle = it}
