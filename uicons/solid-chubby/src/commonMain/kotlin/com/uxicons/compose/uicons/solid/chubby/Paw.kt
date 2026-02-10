package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paw: ImageVector? = null

val Icons.Sc.Paw: ImageVector
    get() = _Paw ?: UXIcon(name = "Paw") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.23f)
                curveToRelative(-3.51f, 0f, -5.86f, 2.78f, -5.86f, 6.91f)
                curveToRelative(0f, 1.39f, 0.35f, 2.3f, 1.08f, 2.78f)
                curveToRelative(1.08f, 0.71f, 2.43f, 0.12f, 3.52f, -0.34f)
                curveToRelative(0.43f, -0.19f, 1.02f, -0.44f, 1.26f, -0.44f)
                reflectiveCurveToRelative(0.84f, 0.24f, 1.26f, 0.44f)
                curveToRelative(2.3f, 1.09f, 3.15f, 0.58f, 3.52f, 0.34f)
                curveToRelative(0.73f, -0.48f, 1.08f, -1.39f, 1.08f, -2.78f)
                curveToRelative(0f, -4.13f, -2.36f, -6.91f, -5.86f, -6.91f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.27f, 8.65f)
                curveToRelative(-1.25f, 0f, -2.73f, 0.52f, -2.73f, 2.96f)
                reflectiveCurveToRelative(1.48f, 2.97f, 2.73f, 2.97f)
                reflectiveCurveToRelative(2.73f, -0.52f, 2.73f, -2.97f)
                reflectiveCurveToRelative(-1.48f, -2.96f, -2.73f, -2.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.73f, 8.65f)
                curveToRelative(-1.25f, 0f, -2.73f, 0.52f, -2.73f, 2.96f)
                reflectiveCurveToRelative(1.48f, 2.97f, 2.73f, 2.97f)
                reflectiveCurveToRelative(2.73f, -0.52f, 2.73f, -2.97f)
                reflectiveCurveToRelative(-1.48f, -2.96f, -2.73f, -2.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.24f, 9.68f)
                curveToRelative(1.25f, 0f, 2.73f, -0.52f, 2.73f, -2.96f)
                reflectiveCurveToRelative(-1.48f, -2.97f, -2.73f, -2.97f)
                reflectiveCurveToRelative(-2.73f, 0.52f, -2.73f, 2.97f)
                reflectiveCurveToRelative(1.48f, 2.96f, 2.73f, 2.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.76f, 9.68f)
                curveToRelative(1.25f, 0f, 2.73f, -0.52f, 2.73f, -2.96f)
                reflectiveCurveToRelative(-1.48f, -2.97f, -2.73f, -2.97f)
                reflectiveCurveToRelative(-2.73f, 0.52f, -2.73f, 2.97f)
                reflectiveCurveToRelative(1.48f, 2.96f, 2.73f, 2.96f)
                close()
            }
        }.also { _Paw = it}
