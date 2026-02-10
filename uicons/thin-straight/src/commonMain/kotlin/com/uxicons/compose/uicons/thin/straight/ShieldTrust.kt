package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldTrust: ImageVector? = null

val Icons.Ts.ShieldTrust: ImageVector
    get() = _ShieldTrust ?: UXIcon(name = "ShieldTrust") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 12f)
                lineToRelative(-3.46f, 3.46f)
                verticalLineToRelative(5.04f)
                horizontalLineToRelative(-5.04f)
                lineToRelative(-3.46f, 3.46f)
                lineToRelative(-3.46f, -3.46f)
                lineTo(3.5f, 20.5f)
                verticalLineToRelative(-5.04f)
                lineTo(0.04f, 12f)
                lineToRelative(3.46f, -3.46f)
                lineTo(3.5f, 3.5f)
                horizontalLineToRelative(5.04f)
                lineTo(12f, 0.04f)
                lineToRelative(3.46f, 3.46f)
                horizontalLineToRelative(4.5f)
                lineToRelative(-1.01f, 1f)
                horizontalLineToRelative(-3.91f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-3.04f, 3.04f)
                horizontalLineToRelative(-4.46f)
                verticalLineToRelative(4.46f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(3.04f, 3.04f)
                verticalLineToRelative(4.46f)
                horizontalLineToRelative(4.46f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(3.04f, -3.04f)
                horizontalLineToRelative(4.46f)
                verticalLineToRelative(-4.46f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(-2.02f, -2.02f)
                lineToRelative(0.71f, -0.7f)
                lineToRelative(2.72f, 2.72f)
                close()
                moveTo(12.05f, 14f)
                curveToRelative(-0.11f, 0f, -0.21f, -0.04f, -0.29f, -0.12f)
                lineToRelative(-3.91f, -3.85f)
                lineToRelative(-0.7f, 0.71f)
                lineToRelative(3.9f, 3.84f)
                curveToRelative(0.27f, 0.27f, 0.62f, 0.41f, 1.0f, 0.41f)
                horizontalLineToRelative(0f)
                curveToRelative(0.38f, 0f, 0.73f, -0.15f, 0.99f, -0.41f)
                lineToRelative(9.81f, -9.73f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-9.81f, 9.73f)
                curveToRelative(-0.08f, 0.08f, -0.18f, 0.12f, -0.29f, 0.12f)
                close()
            }
        }.also { _ShieldTrust = it}
