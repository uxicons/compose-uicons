package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxEnvelope: ImageVector? = null

val Icons.Bs.MailboxEnvelope: ImageVector
    get() = _MailboxEnvelope ?: UXIcon(name = "MailboxEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.12f, 20.12f)
                lineToRelative(3.88f, -3.88f)
                verticalLineToRelative(7.76f)
                lineTo(0f, 24f)
                verticalLineToRelative(-7.76f)
                lineToRelative(3.88f, 3.88f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.54f, -0.29f, 2.12f, -0.88f)
                close()
                moveTo(5.29f, 18.71f)
                curveToRelative(0.38f, 0.38f, 1.04f, 0.38f, 1.41f, 0f)
                lineToRelative(3.71f, -3.71f)
                lineTo(1.58f, 15.0f)
                lineToRelative(3.71f, 3.71f)
                close()
                moveTo(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.29f, -0.38f, -2.49f, -1.03f, -3.5f)
                horizontalLineToRelative(5.53f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(5f, 7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _MailboxEnvelope = it}
