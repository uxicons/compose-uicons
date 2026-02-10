package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mercury: ImageVector? = null

val Icons.Tr.Mercury: ImageVector
    get() = _Mercury ?: UXIcon(name = "Mercury") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                curveToRelative(0f, -3.44f, -2.19f, -6.37f, -5.24f, -7.5f)
                curveToRelative(0.98f, -0.36f, 1.89f, -0.91f, 2.67f, -1.64f)
                curveToRelative(0.2f, -0.19f, 0.21f, -0.5f, 0.03f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.22f, -0.71f, -0.03f)
                curveToRelative(-1.3f, 1.2f, -2.99f, 1.87f, -4.76f, 1.87f)
                reflectiveCurveToRelative(-3.46f, -0.66f, -4.76f, -1.87f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.18f, -0.71f, 0.03f)
                curveToRelative(-0.19f, 0.2f, -0.18f, 0.52f, 0.03f, 0.71f)
                curveToRelative(0.78f, 0.73f, 1.69f, 1.27f, 2.67f, 1.64f)
                curveToRelative(-3.05f, 1.13f, -5.24f, 4.06f, -5.24f, 7.5f)
                curveToRelative(0f, 4.24f, 3.32f, 7.71f, 7.5f, 7.97f)
                verticalLineToRelative(3.02f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.02f)
                curveToRelative(4.18f, -0.26f, 7.5f, -3.73f, 7.5f, -7.97f)
                close()
                moveTo(5f, 10f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                close()
            }
        }.also { _Mercury = it}
