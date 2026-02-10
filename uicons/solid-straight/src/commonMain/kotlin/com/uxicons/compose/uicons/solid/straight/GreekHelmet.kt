package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreekHelmet: ImageVector? = null

val Icons.Ss.GreekHelmet: ImageVector
    get() = _GreekHelmet ?: UXIcon(name = "GreekHelmet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 19f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(-0.04f, 24f)
                lineToRelative(2.34f, -3.95f)
                curveToRelative(0.46f, -0.77f, 0.7f, -1.65f, 0.7f, -2.55f)
                verticalLineToRelative(-5.5f)
                curveTo(3f, 5.38f, 8.38f, 0f, 15f, 0f)
                curveToRelative(2.91f, 0f, 5.72f, 1.06f, 7.91f, 2.97f)
                lineToRelative(0.75f, 0.66f)
                lineToRelative(-2.69f, 3.09f)
                curveToRelative(-1.45f, -1.63f, -3.54f, -2.68f, -5.86f, -2.72f)
                curveToRelative(-2.15f, -0.04f, -4.19f, 0.79f, -5.73f, 2.3f)
                curveToRelative(-1.54f, 1.52f, -2.38f, 3.54f, -2.38f, 5.7f)
                verticalLineToRelative(7f)
                close()
                moveTo(19f, 13f)
                lineToRelative(1.43f, 2.86f)
                curveToRelative(0.49f, 0.99f, 1.7f, 1.38f, 2.68f, 0.88f)
                lineToRelative(-2.13f, -4.54f)
                verticalLineToRelative(-0.53f)
                curveToRelative(-0.17f, -3.06f, -2.82f, -5.63f, -5.9f, -5.68f)
                curveToRelative(-0.88f, 0f, -1.86f, 0.15f, -2.65f, 0.55f)
                curveToRelative(-2.18f, 1.1f, -3.44f, 3.17f, -3.44f, 5.45f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.96f, -0.81f, 3.73f, -2.11f, 5f)
                lineTo(23f, 24f)
                lineToRelative(-3.02f, -6.9f)
                lineToRelative(-4.98f, -2.1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _GreekHelmet = it}
