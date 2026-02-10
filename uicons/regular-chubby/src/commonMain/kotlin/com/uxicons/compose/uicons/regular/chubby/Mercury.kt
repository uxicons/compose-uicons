package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mercury: ImageVector? = null

val Icons.Rc.Mercury: ImageVector
    get() = _Mercury ?: UXIcon(name = "Mercury") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 10f)
                curveToRelative(0f, -2.97f, -0.82f, -4.93f, -2.56f, -6.0f)
                curveToRelative(0.61f, -0.38f, 1.11f, -0.86f, 1.5f, -1.46f)
                curveToRelative(0.3f, -0.46f, 0.17f, -1.08f, -0.29f, -1.38f)
                curveToRelative(-0.46f, -0.3f, -1.08f, -0.17f, -1.38f, 0.29f)
                curveToRelative(-0.47f, 0.72f, -1.38f, 1.55f, -4.26f, 1.55f)
                reflectiveCurveToRelative(-3.79f, -0.83f, -4.26f, -1.55f)
                curveToRelative(-0.3f, -0.46f, -0.92f, -0.59f, -1.38f, -0.29f)
                curveToRelative(-0.46f, 0.3f, -0.59f, 0.92f, -0.29f, 1.38f)
                curveToRelative(0.39f, 0.6f, 0.89f, 1.08f, 1.5f, 1.46f)
                curveToRelative(-1.75f, 1.07f, -2.56f, 3.03f, -2.56f, 6.0f)
                curveToRelative(0f, 4.49f, 1.86f, 6.67f, 6f, 6.96f)
                verticalLineToRelative(2.04f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.04f)
                curveToRelative(4.14f, -0.29f, 6f, -2.47f, 6f, -6.96f)
                close()
                moveTo(7f, 10f)
                curveToRelative(0f, -3.74f, 1.26f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.26f, 5f, 5f)
                reflectiveCurveToRelative(-1.26f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -1.26f, -5f, -5f)
                close()
            }
        }.also { _Mercury = it}
