package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Route: ImageVector? = null

val Icons.Sc.Route: ImageVector
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
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.25f, 13.5f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.25f)
                curveToRelative(0.96f, 0f, 1.75f, 0.79f, 1.75f, 1.75f)
                reflectiveCurveToRelative(-0.79f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-7.25f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.25f)
                curveToRelative(2.62f, 0f, 4.75f, -2.13f, 4.75f, -4.75f)
                reflectiveCurveToRelative(-2.13f, -4.75f, -4.75f, -4.75f)
                close()
            }
        }.also { _Route = it}
