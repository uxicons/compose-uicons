package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldTrust: ImageVector? = null

val Icons.Bs.ShieldTrust: ImageVector
    get() = _ShieldTrust ?: UXIcon(name = "ShieldTrust") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.55f, 13.26f)
                lineTo(20.94f, 3.94f)
                lineToRelative(2.11f, 2.13f)
                lineToRelative(-9.81f, 9.73f)
                curveToRelative(-0.45f, 0.45f, -1.05f, 0.7f, -1.7f, 0.7f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.65f, 0f, -1.25f, -0.25f, -1.71f, -0.71f)
                lineToRelative(-3.34f, -3.28f)
                lineToRelative(2.1f, -2.14f)
                lineToRelative(2.94f, 2.89f)
                close()
                moveTo(21.95f, 9.98f)
                lineToRelative(-3.95f, 3.92f)
                verticalLineToRelative(4.1f)
                horizontalLineToRelative(-4.28f)
                lineToRelative(-1.73f, 1.73f)
                lineToRelative(-1.73f, -1.73f)
                horizontalLineToRelative(-4.28f)
                verticalLineToRelative(-4.28f)
                lineToRelative(-1.73f, -1.73f)
                lineToRelative(1.73f, -1.73f)
                verticalLineToRelative(-4.28f)
                horizontalLineToRelative(4.28f)
                lineToRelative(1.73f, -1.73f)
                lineToRelative(1.73f, 1.73f)
                horizontalLineToRelative(2.3f)
                lineToRelative(3.02f, -3f)
                horizontalLineToRelative(-4.08f)
                lineTo(12f, 0.03f)
                lineToRelative(-2.97f, 2.97f)
                lineTo(3f, 3f)
                verticalLineToRelative(6.03f)
                lineTo(0.03f, 12f)
                lineToRelative(2.97f, 2.97f)
                verticalLineToRelative(6.03f)
                horizontalLineToRelative(6.03f)
                lineToRelative(2.97f, 2.97f)
                lineToRelative(2.97f, -2.97f)
                horizontalLineToRelative(6.03f)
                verticalLineToRelative(-6.03f)
                lineToRelative(2.97f, -2.97f)
                lineToRelative(-2.02f, -2.02f)
                close()
            }
        }.also { _ShieldTrust = it}
