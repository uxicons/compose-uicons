package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wind: ImageVector? = null

val Icons.Rc.Wind: ImageVector
    get() = _Wind ?: UXIcon(name = "Wind") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8.99f)
                curveToRelative(0f, -2.28f, -1.84f, -4.14f, -4.11f, -4.14f)
                curveToRelative(-2.15f, 0f, -3.96f, 1.69f, -4.1f, 3.86f)
                curveToRelative(-0.04f, 0.55f, 0.38f, 1.03f, 0.93f, 1.06f)
                curveToRelative(0.55f, 0.03f, 1.03f, -0.38f, 1.06f, -0.93f)
                curveToRelative(0.07f, -1.12f, 1f, -1.99f, 2.11f, -1.99f)
                curveToRelative(1.16f, 0f, 2.11f, 0.96f, 2.11f, 2.14f)
                reflectiveCurveToRelative(-0.95f, 2.14f, -2.11f, 2.14f)
                horizontalLineTo(6.62f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(15.58f)
                curveToRelative(1.16f, 0f, 2.11f, 0.96f, 2.11f, 2.14f)
                reflectiveCurveToRelative(-0.95f, 2.14f, -2.11f, 2.14f)
                curveToRelative(-1.11f, 0f, -2.03f, -0.88f, -2.11f, -1.99f)
                curveToRelative(-0.04f, -0.55f, -0.51f, -0.95f, -1.06f, -0.93f)
                curveToRelative(-0.55f, 0.04f, -0.97f, 0.51f, -0.93f, 1.06f)
                curveToRelative(0.15f, 2.16f, 1.95f, 3.86f, 4.1f, 3.86f)
                curveToRelative(2.27f, 0f, 4.11f, -1.86f, 4.11f, -4.14f)
                curveToRelative(0f, -0.78f, -0.22f, -1.52f, -0.6f, -2.15f)
                curveToRelative(2.17f, -0.11f, 3.91f, -1.92f, 3.91f, -4.13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 9.48f)
                horizontalLineToRelative(7.87f)
                curveToRelative(1.85f, 0f, 3.35f, -1.51f, 3.35f, -3.38f)
                reflectiveCurveToRelative(-1.5f, -3.38f, -3.35f, -3.38f)
                curveToRelative(-1.59f, 0f, -2.97f, 1.14f, -3.29f, 2.7f)
                curveToRelative(-0.11f, 0.54f, 0.24f, 1.07f, 0.78f, 1.18f)
                curveToRelative(0.54f, 0.1f, 1.07f, -0.24f, 1.18f, -0.78f)
                curveToRelative(0.13f, -0.64f, 0.69f, -1.1f, 1.33f, -1.1f)
                curveToRelative(0.75f, 0f, 1.35f, 0.62f, 1.35f, 1.38f)
                reflectiveCurveToRelative(-0.61f, 1.38f, -1.35f, 1.38f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.05f, 14.52f)
                horizontalLineToRelative(-3.7f)
                curveToRelative(-1.85f, 0f, -3.35f, 1.51f, -3.35f, 3.38f)
                reflectiveCurveToRelative(1.5f, 3.38f, 3.35f, 3.38f)
                curveToRelative(1.59f, 0f, 2.97f, -1.14f, 3.29f, -2.7f)
                curveToRelative(0.11f, -0.54f, -0.24f, -1.07f, -0.78f, -1.18f)
                curveToRelative(-0.54f, -0.11f, -1.07f, 0.24f, -1.18f, 0.78f)
                curveToRelative(-0.13f, 0.64f, -0.69f, 1.1f, -1.33f, 1.1f)
                curveToRelative(-0.75f, 0f, -1.35f, -0.62f, -1.35f, -1.38f)
                reflectiveCurveToRelative(0.61f, -1.38f, 1.35f, -1.38f)
                horizontalLineToRelative(3.7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Wind = it}
