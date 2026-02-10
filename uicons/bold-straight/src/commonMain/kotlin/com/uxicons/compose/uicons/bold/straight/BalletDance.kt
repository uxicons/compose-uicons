package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalletDance: ImageVector? = null

val Icons.Bs.BalletDance: ImageVector
    get() = _BalletDance ?: UXIcon(name = "BalletDance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.56f, 14.85f)
                curveToRelative(-0.78f, 0.48f, -1.64f, 0.95f, -2.56f, 1.37f)
                verticalLineToRelative(7.78f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.66f)
                curveToRelative(-3.44f, 1.01f, -6.28f, 0.86f, -6.88f, -0.56f)
                curveToRelative(-0.61f, -1.43f, 1.24f, -3.71f, 4.34f, -5.64f)
                curveTo(3.28f, 7.54f, 1f, 3.01f, 1f, 0f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 1.42f, 0.86f, 3.68f, 2.33f, 6f)
                horizontalLineToRelative(4.48f)
                curveToRelative(1.49f, -2.36f, 2.33f, -4.63f, 2.33f, -6f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 2.55f, -1.59f, 6.16f, -4.03f, 9.4f)
                curveToRelative(0.42f, 0.6f, 0.82f, 1.13f, 1.08f, 1.4f)
                curveToRelative(0.41f, -0.45f, 1.42f, -1.61f, 1.81f, -2.75f)
                curveToRelative(2.0f, -0.19f, 3.47f, 0.19f, 3.88f, 1.17f)
                curveToRelative(0.18f, 0.42f, 0.14f, 0.92f, -0.08f, 1.46f)
                lineToRelative(4.32f, -1.13f)
                lineToRelative(0.76f, 2.9f)
                reflectiveCurveToRelative(-9.15f, 2.36f, -9.32f, 2.4f)
                close()
                moveTo(8.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _BalletDance = it}
