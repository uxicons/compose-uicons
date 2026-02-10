package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxEnvelope: ImageVector? = null

val Icons.Ss.MailboxEnvelope: ImageVector
    get() = _MailboxEnvelope ?: UXIcon(name = "MailboxEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 16.24f)
                verticalLineToRelative(7.76f)
                lineTo(0f, 24f)
                verticalLineToRelative(-7.76f)
                lineToRelative(3.88f, 3.88f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(3.88f, -3.88f)
                close()
                moveTo(6.71f, 18.71f)
                lineToRelative(3.71f, -3.71f)
                lineTo(1.58f, 15.0f)
                lineToRelative(3.71f, 3.71f)
                curveToRelative(0.38f, 0.38f, 1.04f, 0.38f, 1.41f, 0f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                lineTo(12f, 5f)
                curveToRelative(0f, -1.96f, -0.81f, -3.73f, -2.11f, -5f)
                horizontalLineToRelative(8.11f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
                moveTo(21f, 6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10f, 5f)
                verticalLineToRelative(8f)
                lineTo(0f, 13f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
                moveTo(7f, 6f)
                lineTo(3f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _MailboxEnvelope = it}
