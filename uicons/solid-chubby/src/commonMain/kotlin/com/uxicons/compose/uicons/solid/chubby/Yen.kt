package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Yen: ImageVector? = null

val Icons.Sc.Yen: ImageVector
    get() = _Yen ?: UXIcon(name = "Yen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.81f, 1.01f)
                curveToRelative(-0.83f, -0.11f, -1.58f, 0.47f, -1.69f, 1.29f)
                curveToRelative(-0.01f, 0.08f, -1.1f, 7.8f, -6.12f, 9.12f)
                curveTo(7.02f, 10.11f, 5.9f, 2.41f, 5.88f, 2.3f)
                curveToRelative(-0.11f, -0.82f, -0.86f, -1.39f, -1.69f, -1.28f)
                curveToRelative(-0.82f, 0.11f, -1.4f, 0.87f, -1.29f, 1.69f)
                curveToRelative(0.04f, 0.3f, 0.78f, 5.46f, 3.91f, 8.89f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.74f)
                verticalLineToRelative(1.53f)
                horizontalLineToRelative(-3.74f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.74f)
                verticalLineToRelative(2.38f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.38f)
                horizontalLineToRelative(3.74f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.74f)
                verticalLineToRelative(-1.53f)
                horizontalLineToRelative(3.74f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(3.14f, -3.44f, 3.87f, -8.59f, 3.91f, -8.89f)
                curveToRelative(0.11f, -0.82f, -0.47f, -1.58f, -1.29f, -1.69f)
                close()
            }
        }.also { _Yen = it}
