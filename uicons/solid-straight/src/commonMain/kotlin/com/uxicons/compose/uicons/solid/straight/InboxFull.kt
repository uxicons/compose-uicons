package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxFull: ImageVector? = null

val Icons.Ss.InboxFull: ImageVector
    get() = _InboxFull ?: UXIcon(name = "InboxFull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                lineTo(21.72f, 0f)
                lineTo(2.29f, 0f)
                lineTo(0f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(4.67f, 4f)
                horizontalLineToRelative(14.66f)
                lineToRelative(0.33f, 2f)
                lineTo(4.35f, 6f)
                lineToRelative(0.33f, -2f)
                close()
                moveTo(3.69f, 10f)
                lineToRelative(0.33f, -2f)
                horizontalLineToRelative(15.96f)
                lineToRelative(0.33f, 2f)
                lineTo(3.69f, 10f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3.0f, 24f)
                curveToRelative(-0.8f, 0f, -1.56f, -0.31f, -2.12f, -0.88f)
                reflectiveCurveTo(0.0f, 21.8f, 0.01f, 20.99f)
                lineToRelative(-0.0f, -4.99f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
            }
        }.also { _InboxFull = it}
