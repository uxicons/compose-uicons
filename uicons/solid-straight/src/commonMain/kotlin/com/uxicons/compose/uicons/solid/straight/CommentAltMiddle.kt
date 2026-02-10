package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddle: ImageVector? = null

val Icons.Ss.CommentAltMiddle: ImageVector
    get() = _CommentAltMiddle ?: UXIcon(name = "CommentAltMiddle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 23.66f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineTo(21f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineTo(20f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                close()
            }
        }.also { _CommentAltMiddle = it}
