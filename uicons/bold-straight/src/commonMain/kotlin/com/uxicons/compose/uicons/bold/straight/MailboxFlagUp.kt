package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxFlagUp: ImageVector? = null

val Icons.Bs.MailboxFlagUp: ImageVector
    get() = _MailboxFlagUp ?: UXIcon(name = "MailboxFlagUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 8.5f)
                verticalLineToRelative(13.5f)
                lineTo(0f, 22f)
                verticalLineToRelative(-13.5f)
                curveTo(0f, 4.92f, 2.92f, 2f, 6.5f, 2f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(0.65f, 1.01f, 1.03f, 2.21f, 1.03f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.54f, -0.13f, -1.04f, -0.35f, -1.5f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.12f, 0.48f, 0.18f, 0.98f, 0.18f, 1.5f)
                close()
                moveTo(3f, 19f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                close()
            }
        }.also { _MailboxFlagUp = it}
