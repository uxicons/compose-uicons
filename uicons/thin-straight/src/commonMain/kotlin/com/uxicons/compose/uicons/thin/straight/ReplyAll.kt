package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReplyAll: ImageVector? = null

val Icons.Ts.ReplyAll: ImageVector
    get() = _ReplyAll ?: UXIcon(name = "ReplyAll") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-1f)
                verticalLineTo(10.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(7.25f)
                lineToRelative(6.62f, 7.16f)
                lineToRelative(-0.73f, 0.68f)
                lineToRelative(-6.68f, -7.22f)
                curveToRelative(-0.61f, -0.61f, -0.61f, -1.63f, 0.01f, -2.25f)
                lineTo(13.13f, 0.16f)
                lineToRelative(0.73f, 0.68f)
                lineToRelative(-6.62f, 7.16f)
                horizontalLineToRelative(14.25f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(1.19f, 8.06f)
                lineTo(7.87f, 0.84f)
                lineToRelative(-0.73f, -0.68f)
                lineTo(0.47f, 7.37f)
                curveToRelative(-0.62f, 0.62f, -0.62f, 1.64f, -0.01f, 2.25f)
                lineToRelative(6.68f, 7.22f)
                lineToRelative(0.73f, -0.68f)
                lineTo(1.18f, 8.93f)
                curveToRelative(-0.23f, -0.23f, -0.23f, -0.62f, 0.01f, -0.86f)
                close()
            }
        }.also { _ReplyAll = it}
