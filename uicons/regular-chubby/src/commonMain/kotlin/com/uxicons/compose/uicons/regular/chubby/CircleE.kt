package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleE: ImageVector? = null

val Icons.Rc.CircleE: ImageVector
    get() = _CircleE ?: UXIcon(name = "CircleE") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.26f, 8.2f)
                curveToRelative(-0.08f, 0.62f, -0.2f, 1.64f, -0.24f, 2.81f)
                horizontalLineToRelative(3.98f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.98f)
                curveToRelative(0.05f, 1.17f, 0.16f, 2.19f, 0.24f, 2.81f)
                curveToRelative(0.5f, 0.09f, 1.33f, 0.2f, 2.49f, 0.2f)
                curveToRelative(0.66f, 0f, 1.36f, -0.06f, 2.1f, -0.17f)
                curveToRelative(0.55f, -0.08f, 1.05f, 0.3f, 1.14f, 0.84f)
                curveToRelative(0.08f, 0.55f, -0.3f, 1.05f, -0.84f, 1.14f)
                curveToRelative(-0.84f, 0.12f, -1.65f, 0.19f, -2.4f, 0.19f)
                curveToRelative(-2.35f, 0f, -3.56f, -0.38f, -3.69f, -0.43f)
                curveToRelative(-0.35f, -0.12f, -0.6f, -0.41f, -0.67f, -0.78f)
                curveToRelative(-0.02f, -0.09f, -0.39f, -2.24f, -0.39f, -4.8f)
                reflectiveCurveToRelative(0.37f, -4.71f, 0.39f, -4.8f)
                curveToRelative(0.06f, -0.36f, 0.32f, -0.66f, 0.67f, -0.78f)
                curveToRelative(0.13f, -0.04f, 1.35f, -0.43f, 3.69f, -0.43f)
                curveToRelative(0.75f, 0f, 1.56f, 0.06f, 2.4f, 0.19f)
                curveToRelative(0.55f, 0.08f, 0.92f, 0.59f, 0.84f, 1.14f)
                curveToRelative(-0.08f, 0.55f, -0.58f, 0.92f, -1.14f, 0.84f)
                curveToRelative(-0.74f, -0.11f, -1.45f, -0.17f, -2.1f, -0.17f)
                curveToRelative(-1.15f, 0f, -1.98f, 0.1f, -2.49f, 0.2f)
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
        }.also { _CircleE = it}
