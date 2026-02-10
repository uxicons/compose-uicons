package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxFull: ImageVector? = null

val Icons.Bs.InboxFull: ImageVector
    get() = _InboxFull ?: UXIcon(name = "InboxFull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.19f, 3f)
                lineTo(6.82f, 3f)
                lineToRelative(0.56f, -3f)
                horizontalLineToRelative(9.27f)
                lineToRelative(0.55f, 3f)
                close()
                moveTo(24f, 12.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineToRelative(0.03f, -8.27f)
                lineTo(2.29f, 0f)
                horizontalLineToRelative(3.05f)
                lineToRelative(-2.04f, 11f)
                horizontalLineToRelative(5.2f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(5.2f)
                lineTo(18.67f, 0f)
                horizontalLineToRelative(3.05f)
                lineToRelative(2.28f, 12.5f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-0.25f, 2.25f, -2.16f, 4f, -4.47f, 4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.31f, 0f, -4.22f, -1.75f, -4.47f, -4f)
                horizontalLineToRelative(-2.53f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(17.58f, 5f)
                lineTo(6.42f, 5f)
                lineToRelative(-0.55f, 3f)
                horizontalLineToRelative(12.25f)
                lineToRelative(-0.55f, -3f)
                close()
            }
        }.also { _InboxFull = it}
