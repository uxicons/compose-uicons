package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageAlert: ImageVector? = null

val Icons.Bs.MessageAlert: ImageVector
    get() = _MessageAlert ?: UXIcon(name = "MessageAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.98f)
                horizontalLineToRelative(0f)
                curveToRelative(0.0f, 2f, -0.48f, 3.93f, -1.4f, 5.64f)
                lineToRelative(-1.92f, -3.29f)
                curveToRelative(0.2f, -0.76f, 0.32f, -1.55f, 0.32f, -2.36f)
                curveToRelative(-0.0f, -4.97f, -4.04f, -9.01f, -9.01f, -9.01f)
                curveToRelative(-4.75f, 0.0f, -8.7f, 3.71f, -8.99f, 8.45f)
                lineToRelative(0.0f, 9.58f)
                horizontalLineToRelative(6.43f)
                reflectiveCurveToRelative(-1.75f, 3f, -1.75f, 3f)
                lineTo(0f, 24f)
                lineTo(0f, 11.33f)
                curveTo(0.4f, 4.92f, 5.66f, -0.02f, 11.98f, -0.02f)
                curveToRelative(6.63f, 0f, 12.02f, 5.39f, 12.02f, 12.01f)
                horizontalLineToRelative(0f)
                close()
                moveTo(17f, 8.0f)
                lineTo(7f, 8.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 12.0f)
                lineToRelative(7f, 12f)
                lineTo(10f, 24.0f)
                lineToRelative(7f, -12f)
                close()
                moveTo(18f, 21.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 16.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(12.38f, 16.0f)
                lineToRelative(1.82f, -3f)
                lineTo(7f, 13.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.38f)
                close()
            }
        }.also { _MessageAlert = it}
