package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whale: ImageVector? = null

val Icons.Sc.Whale: ImageVector
    get() = _Whale ?: UXIcon(name = "Whale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 8f)
                curveToRelative(-3.58f, 0f, -6.27f, 0.55f, -8.33f, 1.7f)
                curveToRelative(-0.16f, -1.1f, -0.15f, -3.65f, -0.16f, -3.75f)
                curveToRelative(2.53f, -0.24f, 3.74f, -1.43f, 3.98f, -3.96f)
                curveToRelative(0.05f, -0.56f, -0.43f, -1.04f, -0.98f, -0.99f)
                curveToRelative(-4.01f, 0.4f, -4.01f, 3.1f, -4.01f, 3.1f)
                reflectiveCurveToRelative(0f, -2.71f, -4.01f, -3.1f)
                curveToRelative(-0.56f, -0.06f, -1.04f, 0.43f, -0.98f, 0.99f)
                curveToRelative(0.23f, 2.41f, 1.34f, 3.6f, 3.63f, 3.91f)
                curveToRelative(-1.28f, 1.17f, -3.64f, 3.77f, -3.64f, 7.1f)
                curveToRelative(0f, 8.45f, 4.88f, 10f, 14.5f, 10f)
                curveToRelative(5.19f, 0f, 7.5f, -2.31f, 7.5f, -7.5f)
                reflectiveCurveToRelative(-2.31f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(16.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Whale = it}
