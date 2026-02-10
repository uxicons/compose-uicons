package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleC: ImageVector? = null

val Icons.Rc.CircleC: ImageVector
    get() = _CircleC ?: UXIcon(name = "CircleC") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(0f, 3.38f, 1.01f, 4f, 3f, 4f)
                curveToRelative(0.87f, 0f, 1.5f, -0.15f, 1.93f, -0.45f)
                curveToRelative(0.46f, -0.32f, 1.08f, -0.2f, 1.39f, 0.25f)
                curveToRelative(0.32f, 0.45f, 0.2f, 1.08f, -0.25f, 1.39f)
                curveToRelative(-0.78f, 0.54f, -1.78f, 0.81f, -3.07f, 0.81f)
                curveToRelative(-4.48f, 0f, -5f, -3.42f, -5f, -6f)
                reflectiveCurveToRelative(0.52f, -6f, 5f, -6f)
                curveToRelative(1.29f, 0f, 2.29f, 0.26f, 3.07f, 0.81f)
                curveToRelative(0.45f, 0.32f, 0.56f, 0.94f, 0.25f, 1.39f)
                curveToRelative(-0.32f, 0.45f, -0.94f, 0.56f, -1.39f, 0.25f)
                curveToRelative(-0.43f, -0.3f, -1.06f, -0.45f, -1.93f, -0.45f)
                curveToRelative(-1.99f, 0f, -3f, 0.62f, -3f, 4f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -6.56f, -2.44f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.44f, -9f, 9f)
                reflectiveCurveToRelative(2.44f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -2.44f, 9f, -9f)
                close()
            }
        }.also { _CircleC = it}
