package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PasswordProtection: ImageVector? = null

val Icons.Rs.PasswordProtection: ImageVector
    get() = _PasswordProtection ?: UXIcon(name = "PasswordProtection") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.96f, 6.46f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(1.04f, 1.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.04f, -1.04f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.04f, -1.04f)
                lineToRelative(-1.04f, -1.04f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.04f, 1.04f)
                lineToRelative(1.04f, -1.04f)
                close()
                moveTo(10.96f, 9.96f)
                lineTo(14.46f, 6.46f)
                lineTo(13.04f, 5.04f)
                lineTo(12f, 6.09f)
                lineTo(10.96f, 5.04f)
                lineTo(9.54f, 6.46f)
                lineTo(10.59f, 7.5f)
                lineTo(9.54f, 8.54f)
                close()
                moveTo(21f, 1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.71f)
                lineToRelative(1.18f, 0.39f)
                curveToRelative(0.29f, 0.1f, 0.56f, 0.23f, 0.82f, 0.39f)
                verticalLineToRelative(-4.49f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(3.59f)
                curveToRelative(0f, 3.27f, -2.31f, 5.8f, -6.04f, 7.19f)
                curveToRelative(-3.64f, -1.72f, -5.97f, -4.31f, -5.96f, -7.17f)
                verticalLineToRelative(-3.61f)
                curveToRelative(0f, -0.91f, 0.58f, -1.72f, 1.45f, -2.0f)
                lineToRelative(4.55f, -1.51f)
                lineToRelative(4.55f, 1.51f)
                curveToRelative(0.86f, 0.29f, 1.45f, 1.09f, 1.45f, 2.0f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -0.05f, -0.03f, -0.09f, -0.07f, -0.1f)
                lineToRelative(-3.93f, -1.3f)
                lineToRelative(-3.92f, 1.3f)
                curveToRelative(-0.05f, 0.02f, -0.07f, 0.06f, -0.07f, 0.1f)
                verticalLineToRelative(3.59f)
                curveToRelative(0.04f, 1.89f, 1.36f, 3.53f, 4.04f, 4.98f)
                curveToRelative(2.62f, -1.18f, 3.91f, -2.82f, 3.96f, -5.0f)
                close()
            }
        }.also { _PasswordProtection = it}
