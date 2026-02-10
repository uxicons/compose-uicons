package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cannon: ImageVector? = null

val Icons.Bs.Cannon: ImageVector
    get() = _Cannon ?: UXIcon(name = "Cannon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.3f, 13.53f)
                lineToRelative(5.78f, -5.23f)
                lineToRelative(-5.01f, -7.07f)
                lineToRelative(-10.28f, 5.64f)
                curveTo(7.7f, 3.17f, 4.53f, 1.01f, 0f, 1.01f)
                verticalLineToRelative(3f)
                curveToRelative(2.44f, 0f, 5.4f, 0.78f, 6.07f, 4.34f)
                lineToRelative(-3.33f, 1.84f)
                curveTo(-0.18f, 12.27f, -0.88f, 16.33f, 1.2f, 19.26f)
                curveToRelative(1.26f, 1.79f, 3.27f, 2.74f, 5.31f, 2.74f)
                curveToRelative(1.26f, 0f, 2.53f, -0.37f, 3.65f, -1.13f)
                curveToRelative(1.01f, 1.3f, 2.58f, 2.14f, 4.34f, 2.14f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0f, -1.56f, -0.66f, -2.96f, -1.7f, -3.97f)
                close()
                moveTo(20.09f, 7.86f)
                lineToRelative(-4.66f, 4.22f)
                curveToRelative(-0.3f, -0.05f, -0.61f, -0.09f, -0.93f, -0.09f)
                curveToRelative(-1.88f, 0f, -3.55f, 0.95f, -4.54f, 2.4f)
                lineToRelative(-2.42f, -3.43f)
                lineToRelative(10.62f, -5.83f)
                lineToRelative(1.93f, 2.72f)
                close()
                moveTo(3.65f, 17.52f)
                curveToRelative(-1.1f, -1.55f, -0.75f, -3.7f, 0.77f, -4.83f)
                lineToRelative(0.48f, -0.27f)
                lineToRelative(3.96f, 5.61f)
                lineToRelative(-0.4f, 0.36f)
                curveToRelative(-1.57f, 1.06f, -3.71f, 0.67f, -4.81f, -0.88f)
                close()
                moveTo(14.5f, 20f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _Cannon = it}
