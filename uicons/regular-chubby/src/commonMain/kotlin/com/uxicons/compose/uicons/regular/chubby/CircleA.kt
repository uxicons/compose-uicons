package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleA: ImageVector? = null

val Icons.Rc.CircleA: ImageVector
    get() = _CircleA ?: UXIcon(name = "CircleA") {
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
                moveTo(12.79f, 6.39f)
                curveToRelative(-0.38f, -0.49f, -1.2f, -0.49f, -1.58f, 0f)
                curveToRelative(-0.13f, 0.17f, -1.32f, 1.75f, -2.49f, 5.09f)
                curveToRelative(-1.22f, 3.46f, -1.22f, 5.45f, -1.22f, 5.53f)
                curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 1.0f, 0.99f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1f, -1.0f)
                curveToRelative(0f, -0.01f, 0.01f, -0.71f, 0.29f, -2.0f)
                horizontalLineToRelative(4.42f)
                curveToRelative(0.28f, 1.29f, 0.29f, 1.99f, 0.29f, 2.0f)
                curveToRelative(-0.0f, 0.55f, 0.44f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1f, -1.0f)
                curveToRelative(0f, -0.08f, -0.01f, -2.06f, -1.22f, -5.53f)
                curveToRelative(-1.17f, -3.33f, -2.35f, -4.92f, -2.49f, -5.09f)
                close()
                moveTo(10.33f, 13f)
                curveToRelative(0.09f, -0.28f, 0.18f, -0.56f, 0.28f, -0.86f)
                curveToRelative(0.5f, -1.43f, 1.0f, -2.5f, 1.39f, -3.23f)
                curveToRelative(0.39f, 0.74f, 0.89f, 1.8f, 1.39f, 3.23f)
                curveToRelative(0.11f, 0.3f, 0.2f, 0.59f, 0.28f, 0.86f)
                close()
            }
        }.also { _CircleA = it}
