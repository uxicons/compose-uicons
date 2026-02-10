package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HairConditioner: ImageVector? = null

val Icons.Bs.HairConditioner: ImageVector
    get() = _HairConditioner ?: UXIcon(name = "HairConditioner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 5.3f, 1.76f, 14.84f, 2f, 16.14f)
                verticalLineToRelative(2.86f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.86f)
                curveToRelative(0.24f, -1.3f, 2f, -10.84f, 2f, -16.14f)
                close()
                moveTo(10.96f, 3f)
                curveToRelative(-0.22f, 4.29f, -1.25f, 10.42f, -1.71f, 13f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.46f, -2.58f, -1.49f, -8.71f, -1.71f, -13f)
                close()
                moveTo(9f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 20f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-7.26f)
                curveToRelative(0.69f, -0.83f, 1.13f, -1.87f, 1.24f, -3f)
                horizontalLineToRelative(6.03f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6.22f)
                curveToRelative(0.21f, -1.14f, 0.21f, -1.07f, 0.55f, -3f)
                horizontalLineToRelative(3.25f)
                curveToRelative(0.79f, 0f, 1.43f, -0.64f, 1.43f, -1.43f)
                curveToRelative(0f, -0.85f, -0.27f, -1.48f, -0.61f, -1.93f)
                curveToRelative(-0.19f, 0.3f, -0.42f, 0.56f, -0.7f, 0.77f)
                curveToRelative(-0.76f, 0.59f, -1.7f, 0.59f, -2.34f, 0.59f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(0.15f, -0.91f, 0.3f, -1.94f, 0.46f, -3f)
                curveToRelative(0f, 0f, 0.88f, 0f, 0.88f, -1f)
                verticalLineToRelative(-1.93f)
                lineToRelative(1.98f, 0.67f)
                curveToRelative(0.16f, 0.06f, 4.02f, 1.41f, 4.02f, 5.83f)
                curveToRelative(-0.04f, 0.61f, -0.13f, 1.24f, -0.38f, 1.78f)
                curveToRelative(1.4f, 0.62f, 2.38f, 2.02f, 2.38f, 3.65f)
                close()
            }
        }.also { _HairConditioner = it}
