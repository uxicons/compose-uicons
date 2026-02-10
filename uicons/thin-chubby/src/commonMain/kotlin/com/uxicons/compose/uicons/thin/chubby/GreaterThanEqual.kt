package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThanEqual: ImageVector? = null

val Icons.Tc.GreaterThanEqual: ImageVector
    get() = _GreaterThanEqual ?: UXIcon(name = "GreaterThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.98f, 22.62f)
                curveToRelative(-0.07f, 0.27f, -0.35f, 0.43f, -0.61f, 0.36f)
                curveToRelative(-1.44f, -0.37f, -4.44f, -0.98f, -8.38f, -0.98f)
                reflectiveCurveToRelative(-6.94f, 0.62f, -8.38f, 0.98f)
                curveToRelative(-0.27f, 0.07f, -0.54f, -0.09f, -0.61f, -0.36f)
                reflectiveCurveToRelative(0.09f, -0.54f, 0.36f, -0.61f)
                curveToRelative(1.49f, -0.38f, 4.58f, -1.02f, 8.62f, -1.02f)
                reflectiveCurveToRelative(7.14f, 0.64f, 8.62f, 1.02f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.36f, 0.61f)
                close()
                moveTo(3.0f, 17.54f)
                curveToRelative(0.02f, 0.28f, 0.27f, 0.48f, 0.54f, 0.46f)
                curveToRelative(9.85f, -0.81f, 17.01f, -7.84f, 17.31f, -8.14f)
                curveToRelative(0.1f, -0.09f, 0.15f, -0.22f, 0.15f, -0.35f)
                reflectiveCurveToRelative(-0.05f, -0.26f, -0.15f, -0.35f)
                curveToRelative(-0.3f, -0.3f, -7.47f, -7.34f, -17.31f, -8.14f)
                curveToRelative(-0.27f, -0.01f, -0.52f, 0.18f, -0.54f, 0.46f)
                reflectiveCurveToRelative(0.18f, 0.52f, 0.46f, 0.54f)
                curveToRelative(8.23f, 0.67f, 14.71f, 6.06f, 16.31f, 7.5f)
                curveToRelative(-1.6f, 1.44f, -8.07f, 6.83f, -16.31f, 7.5f)
                curveToRelative(-0.28f, 0.02f, -0.48f, 0.26f, -0.46f, 0.54f)
                close()
            }
        }.also { _GreaterThanEqual = it}
