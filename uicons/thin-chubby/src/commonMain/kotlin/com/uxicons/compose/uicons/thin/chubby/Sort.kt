package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Tc.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.51f, 9.83f)
                curveToRelative(1.8f, 0.47f, 3.64f, 0.71f, 5.49f, 0.71f)
                reflectiveCurveToRelative(3.69f, -0.24f, 5.49f, -0.71f)
                curveToRelative(0.27f, -0.07f, 0.42f, -0.34f, 0.36f, -0.61f)
                curveTo(16.49f, 3.93f, 12.31f, 1.1f, 12.27f, 1.07f)
                curveToRelative(-0.17f, -0.1f, -0.36f, -0.1f, -0.53f, 0f)
                curveToRelative(-0.04f, 0.02f, -4.23f, 2.86f, -5.58f, 8.15f)
                curveToRelative(-0.07f, 0.27f, 0.09f, 0.54f, 0.36f, 0.61f)
                close()
                moveTo(12f, 2.12f)
                curveToRelative(0.85f, 0.67f, 3.6f, 3.05f, 4.74f, 6.87f)
                curveToRelative(-3.12f, 0.74f, -6.37f, 0.74f, -9.49f, 0f)
                curveToRelative(1.15f, -3.83f, 3.89f, -6.21f, 4.74f, -6.87f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.49f, 14.17f)
                curveToRelative(-1.8f, -0.47f, -3.64f, -0.71f, -5.49f, -0.71f)
                reflectiveCurveToRelative(-3.69f, 0.24f, -5.49f, 0.71f)
                curveToRelative(-0.27f, 0.07f, -0.42f, 0.34f, -0.36f, 0.61f)
                curveToRelative(1.35f, 5.29f, 5.54f, 8.13f, 5.58f, 8.15f)
                curveToRelative(0.17f, 0.1f, 0.36f, 0.1f, 0.53f, 0f)
                curveToRelative(0.04f, -0.02f, 4.23f, -2.86f, 5.58f, -8.15f)
                curveToRelative(0.07f, -0.27f, -0.09f, -0.54f, -0.36f, -0.61f)
                close()
                moveTo(12f, 21.88f)
                curveToRelative(-0.85f, -0.67f, -3.6f, -3.05f, -4.74f, -6.87f)
                curveToRelative(3.12f, -0.74f, 6.37f, -0.74f, 9.49f, 0f)
                curveToRelative(-1.15f, 3.83f, -3.89f, 6.21f, -4.74f, 6.87f)
                close()
            }
        }.also { _Sort = it}
