package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleL: ImageVector? = null

val Icons.Rc.CircleL: ImageVector
    get() = _CircleL ?: UXIcon(name = "CircleL") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.98f, 16.46f)
                curveToRelative(0.1f, 0.54f, -0.26f, 1.06f, -0.8f, 1.17f)
                curveToRelative(-0.66f, 0.12f, -1.85f, 0.36f, -3.43f, 0.37f)
                curveToRelative(-1.87f, 0f, -3.53f, -0.39f, -3.6f, -0.4f)
                curveToRelative(-0.39f, -0.09f, -0.69f, -0.41f, -0.76f, -0.8f)
                curveToRelative(-0.02f, -0.09f, -0.39f, -2.24f, -0.39f, -4.8f)
                reflectiveCurveToRelative(0.37f, -5.04f, 0.39f, -5.15f)
                curveToRelative(0.08f, -0.55f, 0.59f, -0.92f, 1.14f, -0.84f)
                curveToRelative(0.55f, 0.08f, 0.92f, 0.59f, 0.84f, 1.14f)
                curveToRelative(-0.0f, 0.02f, -0.36f, 2.46f, -0.36f, 4.85f)
                curveToRelative(0f, 1.56f, 0.15f, 2.98f, 0.26f, 3.78f)
                curveToRelative(0.59f, 0.1f, 1.52f, 0.22f, 2.49f, 0.22f)
                curveToRelative(1.4f, -0.01f, 2.46f, -0.22f, 3.07f, -0.33f)
                curveToRelative(0.54f, -0.1f, 1.06f, 0.26f, 1.17f, 0.8f)
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
        }.also { _CircleL = it}
