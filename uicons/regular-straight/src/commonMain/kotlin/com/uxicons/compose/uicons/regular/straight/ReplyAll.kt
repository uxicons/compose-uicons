package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReplyAll: ImageVector? = null

val Icons.Rs.ReplyAll: ImageVector
    get() = _ReplyAll ?: UXIcon(name = "ReplyAll") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                verticalLineTo(11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(8.89f)
                lineToRelative(5.85f, 6.32f)
                lineToRelative(-1.47f, 1.36f)
                lineToRelative(-6.68f, -7.22f)
                curveToRelative(-0.79f, -0.79f, -0.79f, -2.12f, 0.03f, -2.94f)
                lineTo(13.27f, 0.32f)
                lineToRelative(1.47f, 1.36f)
                lineToRelative(-5.85f, 6.32f)
                horizontalLineToRelative(12.11f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2.06f, 8.9f)
                lineTo(8.73f, 1.68f)
                lineTo(7.27f, 0.32f)
                lineTo(0.61f, 7.51f)
                curveToRelative(-0.82f, 0.82f, -0.82f, 2.15f, -0.03f, 2.94f)
                lineToRelative(6.68f, 7.22f)
                lineToRelative(1.47f, -1.36f)
                lineTo(2.03f, 9.07f)
                curveToRelative(-0.04f, -0.04f, -0.04f, -0.1f, 0.03f, -0.17f)
                close()
            }
        }.also { _ReplyAll = it}
