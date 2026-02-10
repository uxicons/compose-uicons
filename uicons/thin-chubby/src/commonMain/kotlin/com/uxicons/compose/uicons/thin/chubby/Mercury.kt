package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mercury: ImageVector? = null

val Icons.Tc.Mercury: ImageVector
    get() = _Mercury ?: UXIcon(name = "Mercury") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 10f)
                curveToRelative(0f, -3.6f, -1.13f, -5.68f, -3.67f, -6.53f)
                curveToRelative(0.91f, -0.37f, 1.59f, -0.93f, 2.09f, -1.7f)
                curveToRelative(0.15f, -0.23f, 0.08f, -0.54f, -0.15f, -0.69f)
                curveToRelative(-0.23f, -0.15f, -0.54f, -0.08f, -0.69f, 0.15f)
                curveToRelative(-0.77f, 1.21f, -2.23f, 1.77f, -4.58f, 1.77f)
                reflectiveCurveToRelative(-3.81f, -0.56f, -4.58f, -1.77f)
                curveToRelative(-0.15f, -0.23f, -0.46f, -0.3f, -0.69f, -0.15f)
                curveToRelative(-0.23f, 0.15f, -0.3f, 0.46f, -0.15f, 0.69f)
                curveToRelative(0.49f, 0.77f, 1.18f, 1.33f, 2.09f, 1.7f)
                curveToRelative(-2.53f, 0.86f, -3.67f, 2.94f, -3.67f, 6.53f)
                curveToRelative(0f, 4.73f, 1.96f, 6.84f, 6.5f, 6.99f)
                verticalLineToRelative(2.51f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.51f)
                curveToRelative(4.54f, -0.14f, 6.5f, -2.25f, 6.5f, -6.99f)
                close()
                moveTo(6f, 10f)
                curveToRelative(0f, -4.37f, 1.63f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 1.63f, 6f, 6f)
                reflectiveCurveToRelative(-1.63f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -1.63f, -6f, -6f)
                close()
            }
        }.also { _Mercury = it}
