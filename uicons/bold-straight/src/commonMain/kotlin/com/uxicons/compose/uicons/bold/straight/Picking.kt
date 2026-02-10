package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picking: ImageVector? = null

val Icons.Bs.Picking: ImageVector
    get() = _Picking ?: UXIcon(name = "Picking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1f)
                verticalLineToRelative(11.58f)
                lineToRelative(-6.66f, 7.29f)
                lineToRelative(-0.04f, -0.04f)
                curveToRelative(-0.98f, 1.08f, -2.06f, 1.75f, -2.27f, 1.88f)
                curveToRelative(-0.32f, 0.19f, -0.68f, 0.28f, -1.02f, 0.28f)
                curveToRelative(-0.68f, 0f, -1.34f, -0.35f, -1.72f, -0.97f)
                curveToRelative(-0.56f, -0.95f, -0.26f, -2.17f, 0.69f, -2.74f)
                curveToRelative(0.85f, -0.52f, 2.03f, -1.64f, 2.03f, -2.29f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.35f, 0.49f, -2.59f, 1.31f, -3.55f)
                lineToRelative(-1.15f, 0.59f)
                lineToRelative(-2.3f, 4.63f)
                curveToRelative(-0.26f, 0.53f, -0.79f, 0.83f, -1.34f, 0.83f)
                curveToRelative(-0.23f, 0f, -0.45f, -0.05f, -0.67f, -0.16f)
                curveToRelative(-0.74f, -0.37f, -1.04f, -1.27f, -0.68f, -2.01f)
                lineToRelative(2.67f, -5.37f)
                lineToRelative(6.16f, -3.46f)
                verticalLineToRelative(3.21f)
                curveToRelative(0.48f, -0.14f, 0.98f, -0.21f, 1.5f, -0.21f)
                curveToRelative(2.78f, 0f, 5.08f, 2.08f, 5.44f, 4.76f)
                lineToRelative(3.06f, -3.34f)
                verticalLineToRelative(-7.42f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(3f)
                lineToRelative(-9.0f, 2.91f)
                curveToRelative(-0.78f, 0.28f, -1.64f, -0.13f, -1.92f, -0.91f)
                curveToRelative(-0.28f, -0.78f, 0.13f, -1.64f, 0.91f, -1.92f)
                lineToRelative(9.44f, -3.09f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(20.5f)
                close()
            }
        }.also { _Picking = it}
