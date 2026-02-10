package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxFlagUp: ImageVector? = null

val Icons.Ss.MailboxFlagUp: ImageVector
    get() = _MailboxFlagUp ?: UXIcon(name = "MailboxFlagUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 8f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(0f, 5.24f, 0f, 8f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-13f)
                close()
                moveTo(7f, 11f)
                lineTo(3f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 3f)
                horizontalLineToRelative(-8.11f)
                curveToRelative(1.3f, 1.27f, 2.11f, 3.04f, 2.11f, 5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(20f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(0f, 4f, 0f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _MailboxFlagUp = it}
