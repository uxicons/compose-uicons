package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSimple: ImageVector? = null

val Icons.Sc.PersonSimple: ImageVector
    get() = _PersonSimple ?: UXIcon(name = "PersonSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 3f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(16.53f, 7.1f)
                curveToRelative(-0.09f, -0.4f, -0.41f, -0.7f, -0.81f, -0.76f)
                curveToRelative(-0.08f, -0.01f, -2.06f, -0.33f, -3.72f, -0.33f)
                reflectiveCurveToRelative(-3.63f, 0.32f, -3.72f, 0.33f)
                curveToRelative(-0.4f, 0.07f, -0.72f, 0.37f, -0.81f, 0.76f)
                curveToRelative(-0.02f, 0.08f, -0.47f, 2.07f, -0.47f, 4.4f)
                reflectiveCurveToRelative(0.45f, 4.32f, 0.47f, 4.4f)
                curveToRelative(0.09f, 0.4f, 0.41f, 0.7f, 0.81f, 0.76f)
                curveToRelative(0.01f, 0.0f, 0.1f, 0.02f, 0.22f, 0.03f)
                verticalLineToRelative(4.8f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.51f)
                curveToRelative(0.17f, 0.01f, 0.34f, 0.01f, 0.5f, 0.01f)
                reflectiveCurveToRelative(0.33f, -0.01f, 0.5f, -0.01f)
                verticalLineToRelative(4.51f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.8f)
                curveToRelative(0.12f, -0.02f, 0.2f, -0.03f, 0.22f, -0.03f)
                curveToRelative(0.4f, -0.07f, 0.72f, -0.37f, 0.81f, -0.76f)
                curveToRelative(0.02f, -0.08f, 0.47f, -2.07f, 0.47f, -4.4f)
                reflectiveCurveToRelative(-0.45f, -4.32f, -0.47f, -4.4f)
                close()
            }
        }.also { _PersonSimple = it}
