package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Rr.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22f, 10f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 0.49f, -0.35f, 0.9f, -0.83f, 0.99f)
                curveToRelative(-0.06f, 0.01f, -0.11f, 0.01f, -0.17f, 0.01f)
                curveToRelative(-0.42f, 0f, -0.8f, -0.26f, -0.94f, -0.67f)
                curveToRelative(-0.26f, -0.75f, -1.17f, -1.33f, -2.06f, -1.33f)
                reflectiveCurveToRelative(-1.79f, 0.58f, -2.06f, 1.33f)
                curveToRelative(-0.14f, 0.4f, -0.52f, 0.67f, -0.94f, 0.67f)
                reflectiveCurveToRelative(-0.8f, -0.27f, -0.94f, -0.67f)
                curveToRelative(-0.26f, -0.75f, -1.17f, -1.33f, -2.06f, -1.33f)
                reflectiveCurveToRelative(-1.79f, 0.58f, -2.06f, 1.33f)
                curveToRelative(-0.14f, 0.4f, -0.52f, 0.67f, -0.94f, 0.67f)
                reflectiveCurveToRelative(-0.8f, -0.27f, -0.94f, -0.67f)
                curveToRelative(-0.26f, -0.75f, -1.17f, -1.33f, -2.06f, -1.33f)
                reflectiveCurveToRelative(-1.79f, 0.58f, -2.06f, 1.33f)
                curveToRelative(-0.16f, 0.46f, -0.63f, 0.73f, -1.11f, 0.65f)
                curveToRelative(-0.48f, -0.08f, -0.83f, -0.5f, -0.83f, -0.99f)
                verticalLineToRelative(-13f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                close()
                moveTo(20f, 10f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 5.59f, 4f, 10f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.61f, -0.32f, 1.3f, -0.5f, 2f, -0.5f)
                curveToRelative(1.13f, 0f, 2.22f, 0.47f, 3f, 1.23f)
                curveToRelative(0.78f, -0.75f, 1.87f, -1.23f, 3f, -1.23f)
                reflectiveCurveToRelative(2.22f, 0.47f, 3f, 1.23f)
                curveToRelative(0.78f, -0.75f, 1.87f, -1.23f, 3f, -1.23f)
                curveToRelative(0.7f, 0f, 1.39f, 0.18f, 2f, 0.5f)
                verticalLineToRelative(-10.5f)
                close()
            }
        }.also { _Ghost = it}
