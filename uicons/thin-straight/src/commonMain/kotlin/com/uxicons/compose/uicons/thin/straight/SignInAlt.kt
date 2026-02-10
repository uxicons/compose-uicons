package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignInAlt: ImageVector? = null

val Icons.Ts.SignInAlt: ImageVector
    get() = _SignInAlt ?: UXIcon(name = "SignInAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.45f, -1.05f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.45f, 0f, -2.5f, -1.05f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.9f, 0.6f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.9f, 0f, 1.5f, -0.6f, 1.5f, -1.5f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.9f, -0.6f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.9f, 0f, -1.5f, 0.6f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                lineTo(0f, 9f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.05f, 1.05f, 0f, 2.5f, 0f)
                horizontalLineToRelative(19f)
                curveToRelative(1.45f, 0f, 2.5f, 1.05f, 2.5f, 2.5f)
                close()
                moveTo(17.71f, 12.7f)
                lineToRelative(-4.56f, 4.44f)
                lineToRelative(0.7f, 0.72f)
                lineToRelative(4.57f, -4.44f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f)
                reflectiveCurveToRelative(-0.21f, -1.04f, -0.59f, -1.42f)
                lineToRelative(-4.56f, -4.48f)
                lineToRelative(-0.7f, 0.71f)
                lineToRelative(4.56f, 4.47f)
                curveToRelative(0.06f, 0.06f, 0.1f, 0.14f, 0.14f, 0.21f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(17.85f)
                curveToRelative(-0.04f, 0.07f, -0.08f, 0.14f, -0.14f, 0.2f)
                close()
            }
        }.also { _SignInAlt = it}
