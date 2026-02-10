package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxFull: ImageVector? = null

val Icons.Ts.InboxFull: ImageVector
    get() = _InboxFull ?: UXIcon(name = "InboxFull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.71f, 0f)
                lineTo(2.27f, 0f)
                lineTo(0f, 13f)
                lineToRelative(0.01f, 8.49f)
                curveToRelative(-0.0f, 0.67f, 0.26f, 1.3f, 0.73f, 1.77f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-8.5f)
                lineTo(21.71f, 0f)
                close()
                moveTo(3.11f, 1f)
                horizontalLineToRelative(17.76f)
                lineToRelative(2.12f, 12f)
                horizontalLineToRelative(-6.99f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                lineTo(1.01f, 13f)
                lineTo(3.11f, 1f)
                close()
                moveTo(21.5f, 23f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                lineToRelative(-0.01f, -7.5f)
                horizontalLineToRelative(6.01f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.41f, 10f)
                lineTo(4.58f, 10f)
                lineToRelative(0.17f, -1f)
                horizontalLineToRelative(14.48f)
                lineToRelative(0.18f, 1f)
                close()
                moveTo(18.88f, 7f)
                lineTo(5.11f, 7f)
                lineToRelative(0.17f, -1f)
                horizontalLineToRelative(13.43f)
                lineToRelative(0.18f, 1f)
                close()
                moveTo(18.35f, 4f)
                lineTo(5.63f, 4f)
                lineToRelative(0.17f, -1f)
                horizontalLineToRelative(12.37f)
                lineToRelative(0.18f, 1f)
                close()
            }
        }.also { _InboxFull = it}
