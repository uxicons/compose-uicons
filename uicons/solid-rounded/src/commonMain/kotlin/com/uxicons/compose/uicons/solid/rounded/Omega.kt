package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Omega: ImageVector? = null

val Icons.Sr.Omega: ImageVector
    get() = _Omega ?: UXIcon(name = "Omega") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 24f)
                horizontalLineToRelative(-5.36f)
                curveToRelative(-1.46f, 0f, -2.64f, -1.19f, -2.64f, -2.64f)
                curveToRelative(0f, -1.03f, 0.6f, -1.96f, 1.52f, -2.38f)
                curveToRelative(3.38f, -1.54f, 5.48f, -4.59f, 5.48f, -7.98f)
                curveToRelative(0f, -4.96f, -4.49f, -9f, -10f, -9f)
                reflectiveCurveTo(2f, 6.04f, 2f, 11f)
                curveToRelative(0f, 3.38f, 2.1f, 6.44f, 5.48f, 7.98f)
                curveToRelative(0.93f, 0.42f, 1.52f, 1.36f, 1.52f, 2.38f)
                curveToRelative(0f, 1.46f, -1.18f, 2.64f, -2.64f, 2.64f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5.36f)
                curveToRelative(0.35f, 0f, 0.64f, -0.29f, 0.64f, -0.64f)
                curveToRelative(0f, -0.25f, -0.14f, -0.47f, -0.35f, -0.56f)
                curveTo(2.55f, 18.93f, 0f, 15.18f, 0f, 11f)
                curveTo(0f, 4.93f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 4.93f, 12f, 11f)
                curveToRelative(0f, 4.17f, -2.55f, 7.93f, -6.65f, 9.8f)
                curveToRelative(-0.21f, 0.1f, -0.35f, 0.32f, -0.35f, 0.56f)
                curveToRelative(0f, 0.35f, 0.29f, 0.64f, 0.64f, 0.64f)
                horizontalLineToRelative(5.36f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Omega = it}
