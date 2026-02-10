package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphCurve: ImageVector? = null

val Icons.Tr.GraphCurve: ImageVector
    get() = _GraphCurve ?: UXIcon(name = "GraphCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.65f, 10.13f)
                lineToRelative(3.13f, -3.13f)
                horizontalLineToRelative(-3.27f)
                curveTo(10.73f, 7f, 2.92f, 13.73f, 2.08f, 22.02f)
                curveToRelative(0.63f, 0.61f, 1.48f, 0.98f, 2.42f, 0.98f)
                horizontalLineToRelative(19f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(4.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineTo(0.5f)
                curveTo(0f, 0.22f, 0.22f, 0f, 0.5f, 0f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 0.46f, 0.09f, 0.89f, 0.25f, 1.29f)
                curveTo(2.71f, 12.54f, 10.63f, 6f, 19.5f, 6f)
                horizontalLineToRelative(3.23f)
                lineToRelative(-3.04f, -3.13f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.52f, 0.01f, -0.71f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.01f)
                lineToRelative(3.21f, 3.29f)
                curveToRelative(0.23f, 0.23f, 0.43f, 0.67f, 0.43f, 1.04f)
                curveToRelative(0.0f, 0.39f, -0.14f, 0.78f, -0.44f, 1.07f)
                lineToRelative(-3.25f, 3.25f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                close()
            }
        }.also { _GraphCurve = it}
