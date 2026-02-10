package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldTrust: ImageVector? = null

val Icons.Ss.ShieldTrust: ImageVector
    get() = _ShieldTrust ?: UXIcon(name = "ShieldTrust") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 9.48f)
                lineTo(21.5f, 3.5f)
                horizontalLineToRelative(-5.98f)
                lineTo(12f, -0.02f)
                lineToRelative(-3.52f, 3.52f)
                lineTo(3.5f, 3.5f)
                verticalLineToRelative(4.98f)
                lineTo(-0.02f, 12f)
                lineToRelative(3.52f, 3.52f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(4.98f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(3.52f, -3.52f)
                horizontalLineToRelative(4.98f)
                verticalLineToRelative(-4.98f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(-2.52f, -2.52f)
                close()
                moveTo(12.1f, 15.44f)
                curveToRelative(-0.36f, 0.36f, -0.84f, 0.56f, -1.35f, 0.56f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.2f, -1.35f, -0.56f)
                lineToRelative(-3.6f, -3.54f)
                lineToRelative(1.4f, -1.43f)
                lineToRelative(3.55f, 3.49f)
                lineToRelative(7.15f, -7.07f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(-7.21f, 7.13f)
                close()
            }
        }.also { _ShieldTrust = it}
