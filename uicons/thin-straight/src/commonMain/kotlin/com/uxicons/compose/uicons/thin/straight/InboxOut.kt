package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxOut: ImageVector? = null

val Icons.Ts.InboxOut: ImageVector
    get() = _InboxOut ?: UXIcon(name = "InboxOut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 13f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                lineTo(0f, 13f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(21.5f, 24f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 13f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                lineTo(6f, 14f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(8.35f, 4.44f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(10.94f, 0.44f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.15f, -3.15f)
                lineTo(12.5f, 11f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 1.29f)
                lineToRelative(-3.15f, 3.15f)
                close()
            }
        }.also { _InboxOut = it}
