package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RockHammer: ImageVector? = null

val Icons.Bs.RockHammer: ImageVector
    get() = _RockHammer ?: UXIcon(name = "RockHammer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.69f, 10.66f)
                curveToRelative(1.44f, 0.76f, 3.28f, 0.2f, 4.04f, -1.28f)
                lineToRelative(0.92f, -1.77f)
                curveToRelative(0.76f, -1.47f, 0.19f, -3.28f, -1.34f, -4.08f)
                lineTo(12.19f, 1.15f)
                curveTo(7.12f, -1.49f, 3.18f, 1.04f, 1.81f, 2.75f)
                lineToRelative(-1.17f, 1.46f)
                lineToRelative(6.95f, 3.44f)
                lineTo(0.37f, 22.16f)
                lineToRelative(3.55f, 1.84f)
                lineToRelative(7.24f, -14.59f)
                lineToRelative(2.53f, 1.25f)
                close()
                moveTo(10.87f, 3.84f)
                lineToRelative(5.13f, 2.39f)
                lineToRelative(-0.95f, 1.76f)
                lineTo(5.82f, 3.42f)
                curveToRelative(1.14f, -0.5f, 2.84f, -0.73f, 5.04f, 0.42f)
                close()
                moveTo(21.53f, 13.01f)
                lineToRelative(-6.65f, -0.01f)
                lineToRelative(-3.88f, 3.88f)
                verticalLineToRelative(3.74f)
                lineToRelative(3.38f, 3.38f)
                horizontalLineToRelative(7.0f)
                lineToRelative(2.59f, -4.64f)
                lineToRelative(-2.44f, -6.36f)
                close()
                moveTo(19.62f, 21f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-1.62f, -1.62f)
                verticalLineToRelative(-1.26f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.35f, 0.0f)
                lineToRelative(1.2f, 3.12f)
                lineToRelative(-1.05f, 1.88f)
                close()
            }
        }.also { _RockHammer = it}
