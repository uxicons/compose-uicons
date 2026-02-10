package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxFlagUp: ImageVector? = null

val Icons.Br.MailboxFlagUp: ImageVector
    get() = _MailboxFlagUp ?: UXIcon(name = "MailboxFlagUp") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 8.5f)
            lineTo(16f, 3.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(6.5f, 9f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(24f, 8.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            lineTo(3.5f, 22f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-10f)
            curveTo(0f, 4.92f, 2.92f, 2f, 6.5f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.53f)
            curveToRelative(0.65f, 1.01f, 1.03f, 2.21f, 1.03f, 3.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.17f, -0.03f, 0.34f, -0.05f, 0.5f)
            horizontalLineToRelative(7.55f)
            curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -0.24f, -0.02f, -0.47f, -0.07f, -0.7f)
            curveToRelative(-0.17f, -0.81f, 0.36f, -1.6f, 1.17f, -1.77f)
            curveToRelative(0.81f, -0.17f, 1.6f, 0.36f, 1.77f, 1.17f)
            curveToRelative(0.09f, 0.43f, 0.13f, 0.86f, 0.13f, 1.3f)
            close()
            moveTo(10f, 8.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
            verticalLineToRelative(-10f)
            close()
        }
    }.also { _MailboxFlagUp = it }
