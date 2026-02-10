package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Euro: ImageVector? = null

val Icons.Tc.Euro: ImageVector
    get() = _Euro ?: UXIcon(name = "Euro") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.39f, 18.46f)
                curveToRelative(-2.36f, 2.25f, -4.64f, 3.44f, -6.76f, 3.54f)
                curveToRelative(-3.99f, 0.11f, -8.42f, -3.78f, -9.64f, -7.97f)
                horizontalLineToRelative(7.96f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(4.76f)
                curveToRelative(-0.06f, -0.34f, -0.09f, -0.68f, -0.1f, -1.02f)
                curveToRelative(0.01f, -0.35f, 0.04f, -0.7f, 0.1f, -1.04f)
                horizontalLineTo(12.95f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(4.99f)
                curveTo(6.21f, 5.83f, 10.53f, 2f, 14.47f, 2f)
                curveToRelative(0.05f, 0f, 0.1f, 0f, 0.15f, 0.0f)
                curveToRelative(2.13f, 0.09f, 4.41f, 1.28f, 6.77f, 3.54f)
                curveToRelative(0.2f, 0.19f, 0.52f, 0.18f, 0.71f, -0.02f)
                curveToRelative(0.19f, -0.2f, 0.18f, -0.52f, -0.02f, -0.71f)
                curveToRelative(-2.54f, -2.42f, -5.03f, -3.71f, -7.42f, -3.81f)
                curveToRelative(-0.06f, 0f, -0.11f, -0.0f, -0.17f, -0.0f)
                curveTo(10.07f, 1f, 5.22f, 5.33f, 3.97f, 9.97f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.49f)
                curveToRelative(-0.05f, 0.35f, -0.09f, 0.7f, -0.09f, 1.04f)
                curveToRelative(0.01f, 0.34f, 0.04f, 0.68f, 0.09f, 1.02f)
                horizontalLineToRelative(-1.49f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.7f)
                curveToRelative(1.25f, 4.63f, 6.1f, 8.97f, 10.54f, 8.97f)
                curveToRelative(0.06f, 0f, 0.11f, 0f, 0.17f, -0.0f)
                curveToRelative(2.38f, -0.1f, 4.88f, -1.39f, 7.42f, -3.81f)
                curveToRelative(0.2f, -0.19f, 0.21f, -0.51f, 0.02f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.21f, -0.71f, -0.02f)
                close()
            }
        }.also { _Euro = it}
