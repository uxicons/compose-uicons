package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square9: ImageVector? = null

val Icons.Sc.Square9: ImageVector
    get() = _Square9 ?: UXIcon(name = "Square9") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 10f)
                curveToRelative(0f, 1.17f, -0.21f, 2f, -3f, 2f)
                reflectiveCurveToRelative(-3f, -0.83f, -3f, -2f)
                reflectiveCurveToRelative(0.21f, -2f, 3f, -2f)
                reflectiveCurveToRelative(3f, 0.83f, 3f, 2f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 4.5f, -0.98f, 9.02f, -1.02f, 9.21f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.19f, 0.04f, -4.71f, 1.02f, -9.21f, 1.02f)
                reflectiveCurveToRelative(-9.02f, -0.98f, -9.21f, -1.02f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.04f, -0.19f, -1.02f, -4.71f, -1.02f, -9.21f)
                reflectiveCurveToRelative(0.98f, -9.02f, 1.02f, -9.21f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.19f, -0.04f, 4.71f, -1.02f, 9.21f, -1.02f)
                reflectiveCurveToRelative(9.02f, 0.98f, 9.21f, 1.02f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.04f, 0.19f, 1.02f, 4.71f, 1.02f, 9.21f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, -3.58f, -2.85f, -4f, -5f, -4f)
                reflectiveCurveToRelative(-5f, 0.41f, -5f, 4f)
                reflectiveCurveToRelative(2.85f, 4f, 5f, 4f)
                curveToRelative(0.93f, 0f, 2.0f, -0.08f, 2.9f, -0.46f)
                curveToRelative(-0.29f, 2.04f, -1.27f, 2.46f, -2.9f, 2.46f)
                curveToRelative(-1.53f, 0f, -2.58f, -0.41f, -2.62f, -0.42f)
                curveToRelative(-0.51f, -0.21f, -1.09f, 0.03f, -1.3f, 0.54f)
                curveToRelative(-0.21f, 0.51f, 0.03f, 1.1f, 0.54f, 1.31f)
                curveToRelative(0.06f, 0.02f, 1.41f, 0.58f, 3.38f, 0.58f)
                curveToRelative(4.48f, 0f, 5f, -3.42f, 5f, -6f)
                close()
            }
        }.also { _Square9 = it}
