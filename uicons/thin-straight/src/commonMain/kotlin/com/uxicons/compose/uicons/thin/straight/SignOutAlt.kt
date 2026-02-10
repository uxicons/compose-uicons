package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignOutAlt: ImageVector? = null

val Icons.Ts.SignOutAlt: ImageVector
    get() = _SignOutAlt ?: UXIcon(name = "SignOutAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.53f, -0.21f, 1.04f, -0.59f, 1.41f)
                lineToRelative(-4.57f, 4.44f)
                lineToRelative(-0.7f, -0.72f)
                lineToRelative(4.56f, -4.44f)
                curveToRelative(0.06f, -0.06f, 0.09f, -0.13f, 0.14f, -0.2f)
                lineTo(6f, 12.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(16.85f)
                curveToRelative(-0.04f, -0.07f, -0.08f, -0.15f, -0.14f, -0.21f)
                lineToRelative(-4.56f, -4.43f)
                lineToRelative(0.7f, -0.72f)
                lineToRelative(4.56f, 4.44f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.89f, 0.59f, 1.42f)
                close()
                moveTo(11f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(1f)
                lineTo(12f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.5f)
                close()
            }
        }.also { _SignOutAlt = it}
