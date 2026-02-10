package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxIn: ImageVector? = null

val Icons.Ss.InboxIn: ImageVector
    get() = _InboxIn ?: UXIcon(name = "InboxIn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 12f)
                lineTo(8f, 12f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(12f, 11.0f)
                curveToRelative(0.51f, 0f, 1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 8f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                close()
            }
        }.also { _InboxIn = it}
