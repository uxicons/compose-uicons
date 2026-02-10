package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxEnvelope: ImageVector? = null

val Icons.Br.MailboxEnvelope: ImageVector
    get() = _MailboxEnvelope ?: UXIcon(name = "MailboxEnvelope") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(2f, 15f)
            horizontalLineToRelative(8f)
            curveToRelative(0.13f, 0f, 0.26f, 0.01f, 0.38f, 0.04f)
            lineToRelative(-3.67f, 3.67f)
            curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
            lineToRelative(-3.67f, -3.67f)
            curveToRelative(0.12f, -0.02f, 0.25f, -0.04f, 0.38f, -0.04f)
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
            moveTo(17.5f, 0f)
            lineTo(6.5f, 0f)
            curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.29f, -0.38f, -2.49f, -1.03f, -3.5f)
            horizontalLineToRelative(5.53f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            lineTo(24f, 6.5f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            close()
            moveTo(8f, 8.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _MailboxEnvelope = it }
