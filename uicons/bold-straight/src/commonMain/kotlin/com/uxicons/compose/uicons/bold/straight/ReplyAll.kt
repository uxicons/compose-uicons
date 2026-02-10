package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReplyAll: ImageVector? = null

val Icons.Bs.ReplyAll: ImageVector
    get() = _ReplyAll ?: UXIcon(name = "ReplyAll") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(11.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(11.54f)
                lineToRelative(5.51f, 5.93f)
                lineToRelative(-2.2f, 2.04f)
                lineToRelative(-7.13f, -7.67f)
                curveToRelative(-0.98f, -0.98f, -0.98f, -2.63f, 0.04f, -3.64f)
                lineTo(14.82f, 0.06f)
                lineToRelative(2.2f, 2.04f)
                lineToRelative(-5.48f, 5.9f)
                horizontalLineToRelative(8.96f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(10.02f, 2.1f)
                lineTo(7.82f, 0.06f)
                lineTo(0.76f, 7.66f)
                curveToRelative(-1.01f, 1.01f, -1.01f, 2.66f, -0.04f, 3.64f)
                lineToRelative(7.13f, 7.67f)
                lineToRelative(2.2f, -2.04f)
                lineTo(3.15f, 9.5f)
                lineTo(10.02f, 2.1f)
                close()
            }
        }.also { _ReplyAll = it}
