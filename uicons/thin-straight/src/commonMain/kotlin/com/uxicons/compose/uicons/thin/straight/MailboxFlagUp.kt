package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxFlagUp: ImageVector? = null

val Icons.Ts.MailboxFlagUp: ImageVector
    get() = _MailboxFlagUp ?: UXIcon(name = "MailboxFlagUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.19f, 6f)
                horizontalLineToRelative(-1.21f)
                curveToRelative(0.64f, 0.84f, 1.03f, 1.87f, 1.03f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.09f, -1.07f, -3.92f, -2.69f, -5f)
                horizontalLineToRelative(5.69f)
                verticalLineToRelative(-1f)
                lineTo(5.81f, 3f)
                curveTo(2.61f, 3f, 0f, 5.61f, 0f, 8.81f)
                verticalLineToRelative(12.19f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.09f, -0.3f, -2.12f, -0.81f, -3f)
                close()
                moveTo(11f, 20f)
                lineTo(1f, 20f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(11f)
                close()
                moveTo(18f, 9f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                close()
                moveTo(4f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _MailboxFlagUp = it}
