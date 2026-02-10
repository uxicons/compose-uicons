package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microphone: ImageVector? = null

val Icons.Sc.Microphone: ImageVector
    get() = _Microphone ?: UXIcon(name = "Microphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.62f, 10.11f)
                curveToRelative(-0.83f, -0.06f, -1.55f, 0.55f, -1.61f, 1.38f)
                curveToRelative(-0.41f, 5.21f, -3.11f, 7.85f, -8.01f, 7.85f)
                reflectiveCurveToRelative(-7.59f, -2.64f, -8.01f, -7.85f)
                curveToRelative(-0.07f, -0.83f, -0.78f, -1.44f, -1.61f, -1.38f)
                curveToRelative(-0.83f, 0.07f, -1.44f, 0.79f, -1.38f, 1.61f)
                curveToRelative(0.76f, 9.58f, 7.94f, 10.61f, 10.99f, 10.61f)
                reflectiveCurveToRelative(10.23f, -1.03f, 10.99f, -10.61f)
                curveToRelative(0.07f, -0.83f, -0.55f, -1.55f, -1.38f, -1.61f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.31f, 10.55f)
                curveToRelative(0.54f, 0f, 0.98f, 0.45f, 0.98f, 1f)
                reflectiveCurveToRelative(-0.44f, 1f, -0.98f, 1f)
                horizontalLineToRelative(-3.49f)
                curveToRelative(0.67f, 3.39f, 2.68f, 4.99f, 6.18f, 4.99f)
                reflectiveCurveToRelative(5.51f, -1.6f, 6.18f, -4.99f)
                horizontalLineToRelative(-3.49f)
                curveToRelative(-0.54f, 0f, -0.98f, -0.45f, -0.98f, -1f)
                reflectiveCurveToRelative(0.44f, -1f, 0.98f, -1f)
                horizontalLineToRelative(3.73f)
                curveToRelative(0.01f, -0.31f, 0.02f, -0.62f, 0.02f, -0.95f)
                reflectiveCurveToRelative(-0.01f, -0.65f, -0.02f, -0.95f)
                horizontalLineToRelative(-3.73f)
                curveToRelative(-0.54f, 0f, -0.98f, -0.45f, -0.98f, -1f)
                reflectiveCurveToRelative(0.44f, -1f, 0.98f, -1f)
                horizontalLineToRelative(3.49f)
                curveToRelative(-0.67f, -3.39f, -2.68f, -4.99f, -6.18f, -4.99f)
                reflectiveCurveToRelative(-5.51f, 1.6f, -6.18f, 4.99f)
                horizontalLineToRelative(3.49f)
                curveToRelative(0.54f, 0f, 0.98f, 0.45f, 0.98f, 1f)
                reflectiveCurveToRelative(-0.44f, 1f, -0.98f, 1f)
                horizontalLineToRelative(-3.73f)
                curveToRelative(-0.01f, 0.31f, -0.02f, 0.62f, -0.02f, 0.95f)
                reflectiveCurveToRelative(0.01f, 0.65f, 0.02f, 0.95f)
                horizontalLineToRelative(3.73f)
                close()
            }
        }.also { _Microphone = it}
