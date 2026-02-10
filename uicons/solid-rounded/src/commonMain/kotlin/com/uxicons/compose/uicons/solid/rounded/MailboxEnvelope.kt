package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxEnvelope: ImageVector? = null

val Icons.Sr.MailboxEnvelope: ImageVector
    get() = _MailboxEnvelope ?: UXIcon(name = "MailboxEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.62f, 15.04f)
                curveToRelative(0.12f, -0.02f, 0.25f, -0.04f, 0.38f, -0.04f)
                horizontalLineToRelative(8f)
                curveToRelative(0.13f, 0f, 0.26f, 0.01f, 0.38f, 0.04f)
                lineToRelative(-3.67f, 3.67f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                lineToRelative(-3.67f, -3.67f)
                close()
                moveTo(8.12f, 20.12f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.54f, -0.29f, -2.12f, -0.88f)
                lineTo(0.12f, 16.36f)
                curveToRelative(-0.07f, 0.2f, -0.12f, 0.42f, -0.12f, 0.64f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.23f, -0.05f, -0.44f, -0.12f, -0.64f)
                lineToRelative(-3.76f, 3.76f)
                close()
                moveTo(0f, 13.56f)
                lineTo(0f, 5.22f)
                curveTo(0f, 2.61f, 1.9f, 0.28f, 4.5f, 0.02f)
                curveToRelative(2.98f, -0.29f, 5.5f, 2.05f, 5.5f, 4.98f)
                verticalLineToRelative(8f)
                lineTo(2.0f, 13f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.21f, -2.0f, 0.56f)
                close()
                moveTo(3f, 7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.47f, -0.81f, -2.75f, -2f, -3.44f)
                lineTo(12f, 5f)
                curveToRelative(0f, -1.96f, -0.81f, -3.73f, -2.11f, -5f)
                horizontalLineToRelative(8.11f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
                moveTo(21f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _MailboxEnvelope = it}
