package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Route: ImageVector? = null

val Icons.Rc.Route: ImageVector
    get() = _Route ?: UXIcon(name = "Route") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.98f, 10.86f)
                curveToRelative(0.16f, 0.1f, 0.34f, 0.14f, 0.52f, 0.14f)
                reflectiveCurveToRelative(0.36f, -0.05f, 0.52f, -0.14f)
                curveToRelative(0.41f, -0.24f, 3.98f, -2.48f, 3.98f, -5.36f)
                curveToRelative(0f, -2.44f, -2.06f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.06f, -4.5f, 4.5f)
                curveToRelative(0f, 2.88f, 3.58f, 5.11f, 3.98f, 5.36f)
                close()
                moveTo(18.5f, 3f)
                curveToRelative(1.18f, 0f, 2.5f, 1.03f, 2.5f, 2.5f)
                curveToRelative(0f, 1.23f, -1.53f, 2.6f, -2.5f, 3.3f)
                curveToRelative(-0.97f, -0.7f, -2.5f, -2.06f, -2.5f, -3.3f)
                curveToRelative(0f, -1.47f, 1.32f, -2.5f, 2.5f, -2.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 13f)
                curveToRelative(-2.44f, 0f, -4.5f, 2.06f, -4.5f, 4.5f)
                curveToRelative(0f, 2.88f, 3.58f, 5.11f, 3.98f, 5.36f)
                curveToRelative(0.16f, 0.1f, 0.34f, 0.14f, 0.52f, 0.14f)
                reflectiveCurveToRelative(0.36f, -0.05f, 0.52f, -0.14f)
                curveToRelative(0.41f, -0.24f, 3.98f, -2.48f, 3.98f, -5.36f)
                curveToRelative(0f, -2.44f, -2.06f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(5.5f, 20.8f)
                curveToRelative(-0.97f, -0.7f, -2.5f, -2.06f, -2.5f, -3.3f)
                curveToRelative(0f, -1.47f, 1.32f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.03f, 2.5f, 2.5f)
                curveToRelative(0f, 1.23f, -1.53f, 2.6f, -2.5f, 3.3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 14f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _Route = it}
