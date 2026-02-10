package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleU: ImageVector? = null

val Icons.Rc.CircleU: ImageVector
    get() = _CircleU ?: UXIcon(name = "CircleU") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(16.61f, 6.85f)
                curveToRelative(0.02f, 0.1f, 0.39f, 2.6f, 0.39f, 5.15f)
                curveToRelative(0f, 2.58f, -0.52f, 6f, -5f, 6f)
                reflectiveCurveToRelative(-5f, -3.42f, -5f, -6f)
                curveToRelative(0f, -2.54f, 0.37f, -5.04f, 0.39f, -5.15f)
                curveToRelative(0.08f, -0.55f, 0.6f, -0.91f, 1.14f, -0.84f)
                curveToRelative(0.55f, 0.08f, 0.92f, 0.59f, 0.84f, 1.14f)
                curveToRelative(-0.0f, 0.02f, -0.36f, 2.46f, -0.36f, 4.85f)
                curveToRelative(0f, 3.38f, 1.01f, 4f, 3f, 4f)
                reflectiveCurveToRelative(3f, -0.62f, 3f, -4f)
                curveToRelative(0f, -2.39f, -0.36f, -4.83f, -0.36f, -4.85f)
                curveToRelative(-0.08f, -0.55f, 0.29f, -1.06f, 0.84f, -1.14f)
                curveToRelative(0.54f, -0.07f, 1.05f, 0.29f, 1.14f, 0.84f)
                close()
            }
        }.also { _CircleU = it}
