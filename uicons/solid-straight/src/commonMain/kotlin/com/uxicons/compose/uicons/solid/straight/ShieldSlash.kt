package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Ss.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.86f, 18.44f)
                curveToRelative(1.42f, -1.93f, 2.15f, -4.11f, 2.15f, -6.48f)
                verticalLineToRelative(-5.75f)
                curveToRelative(0f, -1.73f, -1.1f, -3.25f, -2.74f, -3.8f)
                lineTo(12f, 0.01f)
                lineToRelative(-7.26f, 2.41f)
                curveToRelative(-0.22f, 0.07f, -0.43f, 0.17f, -0.64f, 0.28f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.1f, -4.1f)
                close()
                moveTo(17.03f, 21.27f)
                curveToRelative(-1.71f, 1.3f, -3.41f, 2.08f, -4.24f, 2.41f)
                lineToRelative(-0.84f, 0.34f)
                lineToRelative(-0.81f, -0.4f)
                curveToRelative(-2.15f, -1.07f, -9.15f, -5.08f, -9.15f, -11.65f)
                verticalLineToRelative(-5.72f)
                lineToRelative(15.03f, 15.03f)
                close()
            }
        }.also { _ShieldSlash = it}
