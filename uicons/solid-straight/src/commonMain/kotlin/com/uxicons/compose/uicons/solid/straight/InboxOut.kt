package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxOut: ImageVector? = null

val Icons.Ss.InboxOut: ImageVector
    get() = _InboxOut ?: UXIcon(name = "InboxOut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(11f, 3f)
                verticalLineTo(11f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 0.59f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.29f, -2.29f)
                close()
            }
        }.also { _InboxOut = it}
