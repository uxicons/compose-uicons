package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSunglasses: ImageVector? = null

val Icons.Rr.FaceSunglasses: ImageVector
    get() = _FaceSunglasses ?: UXIcon(name = "FaceSunglasses") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.73f, 0f, 6.98f, 2.05f, 8.7f, 5.09f)
                curveToRelative(-0.23f, -0.05f, -0.46f, -0.09f, -0.7f, -0.09f)
                horizontalLineToRelative(-4.08f)
                curveToRelative(-1.02f, 0f, -1.98f, 0.36f, -2.77f, 1f)
                horizontalLineToRelative(-2.3f)
                curveToRelative(-0.78f, -0.64f, -1.74f, -1f, -2.77f, -1f)
                lineTo(4.0f, 7f)
                curveToRelative(-0.24f, 0f, -0.47f, 0.03f, -0.7f, 0.09f)
                curveToRelative(1.72f, -3.03f, 4.97f, -5.09f, 8.7f, -5.09f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.29f, 0f, -9.63f, -4.14f, -9.97f, -9.35f)
                curveToRelative(0.74f, 0.83f, 1.81f, 1.35f, 2.99f, 1.35f)
                horizontalLineToRelative(2.14f)
                curveToRelative(1.84f, 0f, 3.44f, -1.25f, 3.88f, -3.03f)
                lineToRelative(0.24f, -0.97f)
                horizontalLineToRelative(1.44f)
                lineToRelative(0.24f, 0.97f)
                curveToRelative(0.45f, 1.78f, 2.04f, 3.03f, 3.88f, 3.03f)
                horizontalLineToRelative(2.14f)
                curveToRelative(1.17f, 0f, 2.25f, -0.52f, 2.99f, -1.35f)
                curveToRelative(-0.34f, 5.21f, -4.67f, 9.35f, -9.97f, 9.35f)
                close()
                moveTo(17.75f, 15.34f)
                curveToRelative(0.37f, 0.41f, 0.33f, 1.04f, -0.08f, 1.41f)
                curveToRelative(-0.1f, 0.09f, -2.56f, 2.25f, -5.67f, 2.25f)
                reflectiveCurveToRelative(-5.56f, -2.16f, -5.67f, -2.25f)
                curveToRelative(-0.41f, -0.37f, -0.45f, -1f, -0.08f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1.0f, -0.45f, 1.41f, -0.08f)
                curveToRelative(0.03f, 0.02f, 2.01f, 1.75f, 4.34f, 1.75f)
                reflectiveCurveToRelative(4.32f, -1.73f, 4.34f, -1.75f)
                curveToRelative(0.41f, -0.36f, 1.04f, -0.33f, 1.41f, 0.08f)
                close()
            }
        }.also { _FaceSunglasses = it}
