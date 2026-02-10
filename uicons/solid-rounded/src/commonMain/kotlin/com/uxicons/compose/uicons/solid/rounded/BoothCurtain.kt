package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoothCurtain: ImageVector? = null

val Icons.Sr.BoothCurtain: ImageVector
    get() = _BoothCurtain ?: UXIcon(name = "BoothCurtain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(12f, 2f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.36f, 7.35f, 4.86f, 10.6f, 7.97f, 12f)
                horizontalLineToRelative(4f)
                lineTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(10f, 9.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(18.36f, 9.69f)
                curveToRelative(-1.47f, -1.32f, -2.83f, -3.37f, -3.26f, -6.54f)
                curveToRelative(-0.08f, -0.61f, 0.39f, -1.15f, 1f, -1.15f)
                curveToRelative(0.49f, 0f, 0.93f, 0.36f, 0.99f, 0.84f)
                curveToRelative(0.35f, 2.62f, 1.42f, 4.3f, 2.58f, 5.37f)
                curveToRelative(0.21f, 0.19f, 0.34f, 0.45f, 0.34f, 0.74f)
                curveToRelative(0f, 0.85f, -1.01f, 1.31f, -1.65f, 0.74f)
                close()
                moveTo(19.74f, 16f)
                horizontalLineToRelative(4.26f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-2.44f)
                curveToRelative(-0.97f, 0f, -1.7f, -0.88f, -1.54f, -1.84f)
                curveToRelative(0.43f, -2.63f, 2.56f, -4.72f, 3.72f, -6.16f)
                close()
                moveTo(8f, 4.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _BoothCurtain = it}
