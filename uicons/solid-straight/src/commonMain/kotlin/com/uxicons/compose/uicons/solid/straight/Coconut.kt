package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coconut: ImageVector? = null

val Icons.Ss.Coconut: ImageVector
    get() = _Coconut ?: UXIcon(name = "Coconut") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.67f, 16.33f)
                curveToRelative(-0.72f, -0.72f, -0.86f, -2.16f, -0.37f, -3.85f)
                curveToRelative(0.51f, -1.74f, 1.62f, -3.53f, 3.14f, -5.04f)
                curveToRelative(1.68f, -1.67f, 3.71f, -2.87f, 5.58f, -3.28f)
                curveToRelative(1.44f, -0.32f, 2.67f, -0.13f, 3.32f, 0.52f)
                curveToRelative(0.72f, 0.72f, 0.86f, 2.16f, 0.38f, 3.85f)
                curveToRelative(-0.5f, 1.74f, -1.62f, 3.53f, -3.14f, 5.04f)
                curveToRelative(-1.68f, 1.67f, -3.71f, 2.87f, -5.58f, 3.28f)
                curveToRelative(-0.47f, 0.1f, -0.91f, 0.15f, -1.31f, 0.15f)
                curveToRelative(-0.86f, 0f, -1.57f, -0.23f, -2.01f, -0.67f)
                close()
                moveTo(24f, 11.64f)
                curveToRelative(0f, 3.3f, -1.28f, 6.4f, -3.62f, 8.74f)
                curveToRelative(-2.41f, 2.41f, -5.57f, 3.61f, -8.74f, 3.61f)
                reflectiveCurveToRelative(-6.33f, -1.2f, -8.74f, -3.61f)
                lineToRelative(-1.27f, -1.34f)
                curveTo(-1.42f, 15.73f, -0.12f, 9.49f, 4.68f, 4.68f)
                curveTo(9.5f, -0.14f, 15.77f, -1.43f, 19.07f, 1.67f)
                lineToRelative(1.31f, 1.24f)
                curveToRelative(2.33f, 2.33f, 3.62f, 5.44f, 3.62f, 8.74f)
                close()
                moveTo(3.2f, 17.8f)
                curveToRelative(2.39f, 2.39f, 7.75f, 1.06f, 11.7f, -2.9f)
                curveToRelative(3.96f, -3.96f, 5.28f, -9.32f, 2.9f, -11.7f)
                curveToRelative(-0.81f, -0.81f, -1.96f, -1.19f, -3.27f, -1.19f)
                curveToRelative(-2.58f, 0f, -5.81f, 1.47f, -8.43f, 4.08f)
                curveToRelative(-3.96f, 3.96f, -5.28f, 9.32f, -2.9f, 11.7f)
                close()
            }
        }.also { _Coconut = it}
