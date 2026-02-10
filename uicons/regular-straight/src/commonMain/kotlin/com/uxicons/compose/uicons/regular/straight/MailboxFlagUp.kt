package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxFlagUp: ImageVector? = null

val Icons.Rs.MailboxFlagUp: ImageVector
    get() = _MailboxFlagUp ?: UXIcon(name = "MailboxFlagUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(12f)
                lineTo(0f, 21f)
                verticalLineToRelative(-12f)
                curveTo(0f, 5.69f, 2.69f, 3f, 6f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.54f)
                curveToRelative(0.95f, 1.06f, 1.54f, 2.46f, 1.54f, 4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.73f, -0.21f, -1.41f, -0.56f, -2f)
                horizontalLineToRelative(2.21f)
                curveToRelative(0.22f, 0.63f, 0.35f, 1.3f, 0.35f, 2f)
                close()
                moveTo(2f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _MailboxFlagUp = it}
