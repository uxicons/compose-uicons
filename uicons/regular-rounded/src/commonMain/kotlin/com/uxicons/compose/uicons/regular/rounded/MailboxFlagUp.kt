package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxFlagUp: ImageVector? = null

val Icons.Rr.MailboxFlagUp: ImageVector
    get() = _MailboxFlagUp ?: UXIcon(name = "MailboxFlagUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 6.6f)
                curveToRelative(-0.22f, -0.51f, -0.81f, -0.74f, -1.32f, -0.52f)
                curveToRelative(-0.51f, 0.22f, -0.74f, 0.81f, -0.52f, 1.32f)
                curveToRelative(0.22f, 0.51f, 0.33f, 1.04f, 0.33f, 1.6f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-8.56f)
                curveToRelative(0.34f, -0.59f, 0.56f, -1.27f, 0.56f, -2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.54f, -0.59f, -2.94f, -1.54f, -4f)
                horizontalLineToRelative(3.54f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(6f, 3.0f)
                curveTo(2.69f, 3f, 0f, 5.69f, 0f, 9f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.83f, -0.17f, -1.64f, -0.5f, -2.4f)
                close()
                moveTo(4f, 19f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(8f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 9f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _MailboxFlagUp = it}
