package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationCircle: ImageVector? = null

val Icons.Ts.TransformationCircle: ImageVector
    get() = _TransformationCircle ?: UXIcon(name = "TransformationCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 5.71f)
                verticalLineToRelative(4.29f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.58f)
                curveToRelative(0f, -0.78f, -0.64f, -1.42f, -1.42f, -1.42f)
                horizontalLineToRelative(-4.58f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.29f)
                lineToRelative(-4.16f, 4.16f)
                curveToRelative(-1.5f, -1.34f, -3.47f, -2.16f, -5.64f, -2.16f)
                curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
                curveToRelative(0f, -2.16f, -0.82f, -4.13f, -2.16f, -5.64f)
                lineToRelative(4.16f, -4.16f)
                close()
                moveTo(8.5f, 23f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.36f, 7.5f, -7.5f, 7.5f)
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, 3.45f, -2.07f, 6.43f, -5.04f, 7.75f)
                curveToRelative(0.02f, -0.25f, 0.04f, -0.5f, 0.04f, -0.76f)
                curveToRelative(0f, -0.12f, -0.01f, -0.24f, -0.02f, -0.36f)
                curveToRelative(2.39f, -1.25f, 4.02f, -3.75f, 4.02f, -6.64f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                curveToRelative(-2.88f, 0f, -5.38f, 1.63f, -6.64f, 4.02f)
                curveToRelative(-0.12f, -0.01f, -0.24f, -0.02f, -0.36f, -0.02f)
                curveToRelative(-0.26f, 0f, -0.51f, 0.02f, -0.76f, 0.04f)
                curveTo(9.07f, 2.07f, 12.05f, 0f, 15.5f, 0f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                close()
            }
        }.also { _TransformationCircle = it}
