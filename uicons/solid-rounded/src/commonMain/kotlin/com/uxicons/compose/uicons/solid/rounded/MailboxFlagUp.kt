package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxFlagUp: ImageVector? = null

val Icons.Sr.MailboxFlagUp: ImageVector
    get() = _MailboxFlagUp ?: UXIcon(name = "MailboxFlagUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 3.02f)
                curveTo(1.9f, 3.28f, 0f, 5.61f, 0f, 8.22f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -2.92f, -2.52f, -5.27f, -5.5f, -4.98f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(18f, 3f)
                horizontalLineToRelative(-8.11f)
                curveToRelative(1.3f, 1.27f, 2.11f, 3.04f, 2.11f, 5f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.33f, -0.47f, 2.55f, -1.26f, 3.5f)
                horizontalLineToRelative(9.76f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MailboxFlagUp = it}
