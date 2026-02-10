package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoothCurtain: ImageVector? = null

val Icons.Rs.BoothCurtain: ImageVector
    get() = _BoothCurtain ?: UXIcon(name = "BoothCurtain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-14.81f)
                curveToRelative(2.0f, 3.47f, 5.09f, 5.22f, 7.28f, 6.06f)
                curveToRelative(-1.88f, 1.61f, -4.28f, 4.33f, -4.28f, 7.75f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(10f)
                lineTo(2f, 12f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(8f)
                lineTo(2f, 22f)
                close()
                moveTo(13.03f, 2f)
                horizontalLineToRelative(1.93f)
                curveToRelative(0.3f, 5.11f, 2.9f, 7.64f, 5.04f, 8.88f)
                verticalLineToRelative(-2.38f)
                curveToRelative(-1.41f, -1.14f, -2.79f, -3.12f, -3.02f, -6.5f)
                horizontalLineToRelative(4.02f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(10.76f)
                curveToRelative(-2.56f, -0.71f, -8.54f, -3.27f, -8.97f, -11.76f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(0.46f, -2.42f, 2.47f, -4.42f, 3.9f, -5.57f)
                verticalLineToRelative(5.57f)
                close()
                moveTo(4f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BoothCurtain = it}
