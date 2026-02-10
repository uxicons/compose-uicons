package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleC: ImageVector? = null

val Icons.Tr.CircleC: ImageVector
    get() = _CircleC ?: UXIcon(name = "CircleC") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(7.5f, 11.12f)
                verticalLineToRelative(1.77f)
                curveToRelative(0f, 2.41f, 2.01f, 4.37f, 4.47f, 4.37f)
                curveToRelative(1.69f, 0f, 3.22f, -0.91f, 3.99f, -2.38f)
                curveToRelative(0.13f, -0.24f, 0.43f, -0.34f, 0.68f, -0.21f)
                curveToRelative(0.24f, 0.13f, 0.34f, 0.43f, 0.21f, 0.68f)
                curveToRelative(-0.94f, 1.8f, -2.81f, 2.92f, -4.88f, 2.92f)
                curveToRelative(-3.02f, 0f, -5.47f, -2.41f, -5.47f, -5.37f)
                verticalLineToRelative(-1.77f)
                curveToRelative(0f, -2.96f, 2.46f, -5.37f, 5.47f, -5.37f)
                curveToRelative(2.06f, 0f, 3.93f, 1.12f, 4.88f, 2.92f)
                curveToRelative(0.13f, 0.24f, 0.03f, 0.55f, -0.21f, 0.68f)
                curveToRelative(-0.24f, 0.13f, -0.55f, 0.03f, -0.68f, -0.21f)
                curveToRelative(-0.77f, -1.47f, -2.3f, -2.38f, -3.99f, -2.38f)
                curveToRelative(-2.47f, 0f, -4.47f, 1.96f, -4.47f, 4.37f)
                close()
            }
        }.also { _CircleC = it}
