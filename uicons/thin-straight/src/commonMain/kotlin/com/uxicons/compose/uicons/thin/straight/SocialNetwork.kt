package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SocialNetwork: ImageVector? = null

val Icons.Ts.SocialNetwork: ImageVector
    get() = _SocialNetwork ?: UXIcon(name = "SocialNetwork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.13f, 7f)
                lineToRelative(0.81f, -2.83f)
                curveToRelative(0.13f, -0.79f, -0.09f, -1.59f, -0.61f, -2.2f)
                curveToRelative(-0.78f, -0.92f, -2.02f, -1.21f, -3.16f, -0.74f)
                curveToRelative(-0.58f, 0.24f, -1.08f, 0.73f, -1.38f, 1.35f)
                lineToRelative(-2.8f, 4.43f)
                lineTo(2.5f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(22.02f, 22f)
                lineToRelative(1.98f, -11.09f)
                verticalLineToRelative(-3.91f)
                lineTo(14.13f, 7f)
                close()
                moveTo(1f, 19.5f)
                lineTo(1f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7.01f, 8f)
                lineToRelative(-0.01f, 13f)
                lineTo(2.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(21.18f, 21f)
                lineTo(8f, 21f)
                lineToRelative(0.01f, -13.76f)
                lineToRelative(2.65f, -4.19f)
                curveToRelative(0.22f, -0.44f, 0.53f, -0.76f, 0.89f, -0.91f)
                curveToRelative(0.73f, -0.3f, 1.52f, -0.12f, 2.02f, 0.47f)
                curveToRelative(0.33f, 0.39f, 0.47f, 0.89f, 0.4f, 1.34f)
                lineToRelative(-1.16f, 4.05f)
                horizontalLineToRelative(10.2f)
                lineToRelative(0.01f, 2.82f)
                lineToRelative(-1.82f, 10.18f)
                close()
            }
        }.also { _SocialNetwork = it}
