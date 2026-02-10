package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BonusAlt: ImageVector? = null

val Icons.Ss.BonusAlt: ImageVector
    get() = _BonusAlt ?: UXIcon(name = "BonusAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.28f, 10.16f)
                lineToRelative(-0.6f, -0.45f)
                lineToRelative(1.09f, -3.4f)
                lineToRelative(-2.77f, -1.54f)
                verticalLineToRelative(-0.77f)
                horizontalLineToRelative(3.62f)
                lineToRelative(0.98f, -3.75f)
                horizontalLineToRelative(0.81f)
                lineToRelative(0.98f, 3.75f)
                horizontalLineToRelative(3.6f)
                verticalLineToRelative(0.76f)
                lineToRelative(-2.75f, 1.59f)
                lineToRelative(1.1f, 3.36f)
                lineToRelative(-0.62f, 0.44f)
                lineToRelative(-2.72f, -2.1f)
                lineToRelative(-2.73f, 2.11f)
                close()
                moveTo(23.15f, 8.68f)
                curveToRelative(-0.52f, -0.47f, -1.19f, -0.71f, -1.88f, -0.68f)
                curveToRelative(-0.7f, 0.03f, -1.34f, 0.33f, -1.79f, 0.83f)
                lineToRelative(-3.54f, 3.74f)
                curveToRelative(0.03f, 0.21f, 0.07f, 0.42f, 0.07f, 0.64f)
                curveToRelative(0f, 2.08f, -1.55f, 3.88f, -3.62f, 4.17f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(-0.28f, -1.98f)
                lineToRelative(4.24f, -0.61f)
                curveToRelative(1.08f, -0.15f, 1.9f, -1.1f, 1.9f, -2.19f)
                curveToRelative(0f, -1.22f, -0.99f, -2.21f, -2.21f, -2.21f)
                lineTo(3f, 11f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9.66f)
                lineToRelative(10.67f, -11.65f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
            }
        }.also { _BonusAlt = it}
