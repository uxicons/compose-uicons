package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RockHammer: ImageVector? = null

val Icons.Ss.RockHammer: ImageVector
    get() = _RockHammer ?: UXIcon(name = "RockHammer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.53f, 11.49f)
                lineToRelative(-6.19f, 12.48f)
                lineTo(0.02f, 21.2f)
                lineTo(6.2f, 8.77f)
                lineToRelative(5.34f, 2.72f)
                close()
                moveTo(17.79f, 9.65f)
                lineToRelative(0.92f, -1.77f)
                curveToRelative(0.64f, -1.22f, 0.16f, -2.73f, -1.08f, -3.38f)
                lineTo(10.82f, 1.09f)
                curveTo(6.04f, -1.4f, 2.35f, 0.97f, 1.07f, 2.56f)
                lineToRelative(-0.77f, 0.96f)
                lineToRelative(14.13f, 7.2f)
                curveToRelative(1.18f, 0.64f, 2.78f, 0.14f, 3.37f, -1.07f)
                close()
                moveTo(23.91f, 19.41f)
                lineToRelative(-2.5f, 4.59f)
                horizontalLineToRelative(-7.07f)
                lineToRelative(-3.33f, -3.4f)
                verticalLineToRelative(-3.63f)
                lineToRelative(3.89f, -3.97f)
                lineToRelative(6.62f, 0.01f)
                lineToRelative(2.4f, 6.41f)
                close()
                moveTo(18.0f, 20f)
                horizontalLineToRelative(-1.66f)
                lineToRelative(-1.86f, -1.9f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(2.45f, 2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _RockHammer = it}
