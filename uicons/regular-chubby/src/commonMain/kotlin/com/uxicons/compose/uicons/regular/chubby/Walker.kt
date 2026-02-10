package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walker: ImageVector? = null

val Icons.Rc.Walker: ImageVector
    get() = _Walker ?: UXIcon(name = "Walker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.67f, 17.35f)
                curveToRelative(0.12f, -1.18f, 0.33f, -3.48f, 0.33f, -5.35f)
                curveToRelative(0f, -6.1f, -1.08f, -9.21f, -1.12f, -9.34f)
                curveToRelative(-0.1f, -0.29f, -0.34f, -0.52f, -0.64f, -0.62f)
                curveToRelative(-0.14f, -0.04f, -3.36f, -1.05f, -7.74f, -1.05f)
                curveToRelative(-1.48f, 0f, -3.31f, 0.12f, -4.45f, 0.29f)
                curveToRelative(-0.3f, 0.04f, -0.57f, 0.23f, -0.72f, 0.49f)
                curveToRelative(-1.11f, 1.94f, -2.54f, 4.66f, -3.75f, 8.46f)
                curveToRelative(-2.55f, 8.01f, -2.58f, 11.61f, -2.58f, 11.76f)
                curveToRelative(0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1f, -0.99f)
                curveToRelative(0f, -0.03f, 0.05f, -3.46f, 2.44f, -11.0f)
                horizontalLineToRelative(14.54f)
                curveToRelative(0.01f, 0.33f, 0.02f, 0.65f, 0.02f, 1f)
                curveToRelative(0f, 1.7f, -0.19f, 3.85f, -0.31f, 5.02f)
                curveToRelative(-1.78f, 0.11f, -2.69f, 1.1f, -2.69f, 2.98f)
                curveToRelative(0f, 1.99f, 1.01f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.01f, 3f, -3f)
                curveToRelative(0f, -1.32f, -0.45f, -2.2f, -1.33f, -2.65f)
                close()
                moveTo(6.12f, 9f)
                curveToRelative(0.89f, -2.41f, 1.84f, -4.27f, 2.7f, -5.8f)
                curveToRelative(1.04f, -0.12f, 2.5f, -0.2f, 3.67f, -0.2f)
                curveToRelative(3.09f, 0f, 5.6f, 0.55f, 6.63f, 0.81f)
                curveToRelative(0.21f, 0.78f, 0.59f, 2.52f, 0.77f, 5.18f)
                close()
                moveTo(20f, 21f)
                curveToRelative(-0.88f, 0f, -1f, -0.12f, -1f, -1f)
                reflectiveCurveToRelative(0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                reflectiveCurveToRelative(-0.12f, 1f, -1f, 1f)
                close()
            }
        }.also { _Walker = it}
