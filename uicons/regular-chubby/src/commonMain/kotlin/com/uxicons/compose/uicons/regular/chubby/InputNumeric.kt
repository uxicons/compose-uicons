package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputNumeric: ImageVector? = null

val Icons.Rc.InputNumeric: ImageVector
    get() = _InputNumeric ?: UXIcon(name = "InputNumeric") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.2f, 5.63f)
                curveToRelative(-0.1f, -0.32f, -0.35f, -0.56f, -0.68f, -0.66f)
                curveToRelative(-0.14f, -0.04f, -3.46f, -0.97f, -9.53f, -0.97f)
                reflectiveCurveToRelative(-9.39f, 0.93f, -9.53f, 0.97f)
                curveToRelative(-0.32f, 0.09f, -0.57f, 0.34f, -0.68f, 0.66f)
                curveToRelative(-0.03f, 0.1f, -0.8f, 2.53f, -0.8f, 6.37f)
                reflectiveCurveToRelative(0.77f, 6.27f, 0.8f, 6.37f)
                curveToRelative(0.1f, 0.32f, 0.35f, 0.56f, 0.68f, 0.66f)
                curveToRelative(0.14f, 0.04f, 3.46f, 0.97f, 9.53f, 0.97f)
                reflectiveCurveToRelative(9.39f, -0.93f, 9.53f, -0.97f)
                curveToRelative(0.32f, -0.09f, 0.57f, -0.34f, 0.68f, -0.66f)
                curveToRelative(0.03f, -0.1f, 0.8f, -2.53f, 0.8f, -6.37f)
                reflectiveCurveToRelative(-0.77f, -6.27f, -0.8f, -6.37f)
                close()
                moveTo(20.44f, 17.23f)
                curveToRelative(-1.13f, 0.25f, -4.03f, 0.77f, -8.44f, 0.77f)
                reflectiveCurveToRelative(-7.3f, -0.52f, -8.44f, -0.77f)
                curveToRelative(-0.2f, -0.86f, -0.56f, -2.72f, -0.56f, -5.23f)
                reflectiveCurveToRelative(0.36f, -4.38f, 0.56f, -5.23f)
                curveToRelative(1.13f, -0.25f, 4.03f, -0.77f, 8.44f, -0.77f)
                reflectiveCurveToRelative(7.3f, 0.52f, 8.44f, 0.77f)
                curveToRelative(0.2f, 0.86f, 0.56f, 2.72f, 0.56f, 5.23f)
                reflectiveCurveToRelative(-0.36f, 4.38f, -0.56f, 5.23f)
                close()
                moveTo(8.62f, 8.22f)
                curveToRelative(0.24f, 0.19f, 0.38f, 0.48f, 0.38f, 0.78f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.89f)
                curveToRelative(-0.01f, 0.03f, -0.01f, 0.06f, -0.02f, 0.09f)
                curveToRelative(-0.11f, 0.54f, -0.64f, 0.89f, -1.18f, 0.77f)
                curveToRelative(-0.54f, -0.11f, -0.89f, -0.64f, -0.77f, -1.18f)
                curveToRelative(0.29f, -1.41f, 1.33f, -2.45f, 2.76f, -2.77f)
                curveToRelative(0.3f, -0.07f, 0.61f, 0.01f, 0.84f, 0.19f)
                close()
            }
        }.also { _InputNumeric = it}
