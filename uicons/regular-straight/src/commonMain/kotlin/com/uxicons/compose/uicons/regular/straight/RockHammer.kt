package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RockHammer: ImageVector? = null

val Icons.Rs.RockHammer: ImageVector
    get() = _RockHammer ?: UXIcon(name = "RockHammer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.43f, 10.72f)
                curveToRelative(1.2f, 0.63f, 2.73f, 0.17f, 3.37f, -1.07f)
                lineToRelative(0.92f, -1.77f)
                curveToRelative(0.64f, -1.22f, 0.16f, -2.73f, -1.08f, -3.38f)
                lineTo(10.82f, 1.09f)
                curveTo(6.04f, -1.4f, 2.35f, 0.97f, 1.07f, 2.56f)
                lineToRelative(-0.77f, 0.96f)
                lineToRelative(6.79f, 3.46f)
                lineTo(0.02f, 21.2f)
                lineToRelative(5.33f, 2.77f)
                lineToRelative(7.08f, -14.27f)
                lineToRelative(2.0f, 1.02f)
                close()
                moveTo(9.92f, 2.87f)
                lineToRelative(6.81f, 3.41f)
                curveToRelative(0.24f, 0.13f, 0.34f, 0.43f, 0.21f, 0.68f)
                lineToRelative(-0.92f, 1.77f)
                curveToRelative(-0.13f, 0.24f, -0.43f, 0.34f, -0.68f, 0.21f)
                lineTo(3.6f, 2.96f)
                curveToRelative(1.17f, -0.79f, 3.34f, -1.63f, 6.31f, -0.09f)
                close()
                moveTo(4.46f, 21.26f)
                lineToRelative(-1.77f, -0.92f)
                lineTo(8.87f, 7.89f)
                lineToRelative(1.77f, 0.9f)
                lineToRelative(-6.19f, 12.47f)
                close()
                moveTo(21.51f, 13.01f)
                lineToRelative(-6.62f, -0.01f)
                lineToRelative(-3.89f, 3.97f)
                verticalLineToRelative(3.63f)
                lineToRelative(3.33f, 3.4f)
                horizontalLineToRelative(7.07f)
                lineToRelative(2.5f, -4.59f)
                lineToRelative(-2.4f, -6.41f)
                close()
                moveTo(20.22f, 22f)
                horizontalLineToRelative(-5.05f)
                lineToRelative(-2.17f, -2.22f)
                verticalLineToRelative(-2.0f)
                lineToRelative(2.73f, -2.78f)
                lineToRelative(4.4f, 0.0f)
                lineToRelative(1.6f, 4.25f)
                lineToRelative(-1.5f, 2.74f)
                close()
            }
        }.also { _RockHammer = it}
