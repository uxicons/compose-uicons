package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddle: ImageVector? = null

val Icons.Bs.CommentAltMiddle: ImageVector
    get() = _CommentAltMiddle ?: UXIcon(name = "CommentAltMiddle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 23.67f)
                curveToRelative(-0.59f, 0f, -1.2f, -0.21f, -1.68f, -0.64f)
                lineToRelative(-3.6f, -3.03f)
                lineTo(0f, 20f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(24f, 20f)
                horizontalLineToRelative(-6.67f)
                lineToRelative(-3.71f, 3.06f)
                curveToRelative(-0.45f, 0.4f, -1.02f, 0.6f, -1.61f, 0.6f)
                close()
                moveTo(11.7f, 20.77f)
                lineToRelative(-0.03f, 0.02f)
                lineToRelative(0.03f, -0.02f)
                close()
                moveTo(12.29f, 20.75f)
                lineToRelative(0.02f, 0.01f)
                lineToRelative(-0.02f, -0.01f)
                close()
                moveTo(3f, 17.0f)
                lineTo(7.84f, 17.0f)
                lineToRelative(4.17f, 3.51f)
                lineToRelative(4.25f, -3.51f)
                horizontalLineToRelative(4.75f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
            }
        }.also { _CommentAltMiddle = it}
