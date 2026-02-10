package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleB: ImageVector? = null

val Icons.Rr.CircleB: ImageVector
    get() = _CircleB ?: UXIcon(name = "CircleB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(15.56f, 11.16f)
                curveToRelative(0.27f, -0.49f, 0.43f, -1.05f, 0.44f, -1.65f)
                curveToRelative(0.01f, -1.0f, -0.36f, -1.94f, -1.06f, -2.65f)
                curveToRelative(-0.7f, -0.71f, -1.63f, -1.1f, -2.63f, -1.1f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4.23f)
                curveToRelative(1.01f, 0f, 1.95f, -0.4f, 2.66f, -1.11f)
                curveToRelative(0.71f, -0.72f, 1.09f, -1.67f, 1.07f, -2.66f)
                curveToRelative(0f, -1.56f, -1.03f, -2.89f, -2.44f, -3.34f)
                close()
                moveTo(9.04f, 8.77f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.46f, 0f, 0.89f, 0.18f, 1.21f, 0.5f)
                curveToRelative(0.32f, 0.33f, 0.49f, 0.76f, 0.49f, 1.21f)
                curveToRelative(-0.01f, 0.83f, -0.7f, 1.51f, -1.54f, 1.51f)
                horizontalLineToRelative(-3.43f)
                verticalLineToRelative(-2.23f)
                close()
                moveTo(15.5f, 15.75f)
                curveToRelative(-0.33f, 0.33f, -0.77f, 0.52f, -1.23f, 0.52f)
                horizontalLineToRelative(-4.23f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.27f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.51f)
                curveToRelative(0.01f, 0.47f, -0.17f, 0.91f, -0.5f, 1.24f)
                close()
            }
        }.also { _CircleB = it}
