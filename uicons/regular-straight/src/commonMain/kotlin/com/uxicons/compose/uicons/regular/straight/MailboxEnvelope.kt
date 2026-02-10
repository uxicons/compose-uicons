package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxEnvelope: ImageVector? = null

val Icons.Rs.MailboxEnvelope: ImageVector
    get() = _MailboxEnvelope ?: UXIcon(name = "MailboxEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                lineTo(22f, 6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-7.54f)
                curveToRelative(0.95f, 1.06f, 1.54f, 2.46f, 1.54f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(2f, 3.79f, 2f, 6f)
                verticalLineToRelative(6f)
                lineTo(0f, 12f)
                verticalLineToRelative(-6f)
                curveTo(0f, 2.69f, 2.69f, 0f, 6f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
                moveTo(4f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(20f, 10f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 16.5f)
                verticalLineToRelative(7.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(3.59f, 16f)
                lineToRelative(1.71f, 1.71f)
                curveToRelative(0.38f, 0.38f, 1.04f, 0.38f, 1.41f, 0f)
                lineToRelative(1.71f, -1.71f)
                lineTo(3.59f, 16.0f)
                close()
                moveTo(10f, 22f)
                verticalLineToRelative(-4.76f)
                lineToRelative(-1.88f, 1.88f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-1.88f, -1.88f)
                verticalLineToRelative(4.76f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _MailboxEnvelope = it}
