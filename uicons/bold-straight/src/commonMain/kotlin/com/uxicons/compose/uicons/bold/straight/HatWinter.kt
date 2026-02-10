package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWinter: ImageVector? = null

val Icons.Bs.HatWinter: ImageVector
    get() = _HatWinter ?: UXIcon(name = "HatWinter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.42f, 18.36f)
                curveToRelative(-0.51f, -5.38f, -3.4f, -11.93f, -7.84f, -13.82f)
                curveToRelative(0.27f, -0.45f, 0.42f, -0.97f, 0.42f, -1.53f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.56f, 0.15f, 1.08f, 0.42f, 1.53f)
                curveToRelative(-4.44f, 1.89f, -7.33f, 8.44f, -7.84f, 13.82f)
                curveToRelative(-0.94f, 0.51f, -1.58f, 1.5f, -1.58f, 2.64f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.14f, -0.64f, -2.13f, -1.58f, -2.64f)
                close()
                moveTo(12f, 7f)
                curveToRelative(3.52f, 0f, 6.69f, 5.71f, 7.37f, 11f)
                horizontalLineTo(4.63f)
                curveToRelative(0.13f, -1.0f, 0.34f, -2.01f, 0.64f, -3f)
                horizontalLineToRelative(11.38f)
                curveToRelative(-0.36f, -1.1f, -0.82f, -2.12f, -1.33f, -3f)
                horizontalLineTo(6.43f)
                curveToRelative(1.4f, -2.87f, 3.42f, -5f, 5.57f, -5f)
                close()
            }
        }.also { _HatWinter = it}
