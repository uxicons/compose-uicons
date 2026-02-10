package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Omega: ImageVector? = null

val Icons.Tr.Omega: ImageVector
    get() = _Omega ?: UXIcon(name = "Omega") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 24f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-1.08f, 0f, -1.96f, -0.88f, -1.96f, -1.96f)
                curveToRelative(0f, -0.81f, 0.5f, -1.53f, 1.24f, -1.82f)
                curveToRelative(4.11f, -1.56f, 6.76f, -5.18f, 6.76f, -9.23f)
                curveToRelative(0f, -5.51f, -4.93f, -10f, -11f, -10f)
                reflectiveCurveTo(1f, 5.49f, 1f, 11f)
                curveToRelative(0f, 4.04f, 2.65f, 7.67f, 6.76f, 9.23f)
                curveToRelative(0.74f, 0.28f, 1.24f, 1.01f, 1.24f, 1.82f)
                curveToRelative(0f, 1.08f, -0.88f, 1.96f, -1.96f, 1.96f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.54f)
                curveToRelative(0.53f, 0f, 0.96f, -0.43f, 0.96f, -0.96f)
                curveToRelative(0f, -0.39f, -0.24f, -0.75f, -0.59f, -0.88f)
                curveTo(2.91f, 19.45f, 0f, 15.46f, 0f, 11f)
                curveTo(0f, 4.93f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 4.93f, 12f, 11f)
                curveToRelative(0f, 4.46f, -2.91f, 8.45f, -7.41f, 10.16f)
                curveToRelative(-0.35f, 0.13f, -0.59f, 0.49f, -0.59f, 0.88f)
                curveToRelative(0f, 0.53f, 0.43f, 0.96f, 0.96f, 0.96f)
                horizontalLineToRelative(6.54f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _Omega = it}
