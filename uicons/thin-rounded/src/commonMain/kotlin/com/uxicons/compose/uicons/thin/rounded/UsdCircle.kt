package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsdCircle: ImageVector? = null

val Icons.Tr.UsdCircle: ImageVector
    get() = _UsdCircle ?: UXIcon(name = "UsdCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(16f, 14.37f)
                curveToRelative(0f, 1.45f, -1.18f, 2.63f, -2.63f, 2.63f)
                horizontalLineToRelative(-0.87f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-0.93f)
                curveToRelative(-0.98f, 0f, -1.89f, -0.53f, -2.38f, -1.38f)
                curveToRelative(-0.14f, -0.24f, -0.06f, -0.55f, 0.18f, -0.68f)
                curveToRelative(0.24f, -0.14f, 0.54f, -0.06f, 0.68f, 0.18f)
                curveToRelative(0.31f, 0.54f, 0.89f, 0.88f, 1.52f, 0.88f)
                horizontalLineToRelative(2.8f)
                curveToRelative(0.9f, 0f, 1.63f, -0.73f, 1.63f, -1.63f)
                curveToRelative(0f, -0.8f, -0.57f, -1.48f, -1.37f, -1.6f)
                lineToRelative(-3.42f, -0.55f)
                curveToRelative(-1.28f, -0.21f, -2.21f, -1.3f, -2.21f, -2.59f)
                curveToRelative(0f, -1.45f, 1.18f, -2.63f, 2.63f, -2.63f)
                horizontalLineToRelative(0.87f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(0.93f)
                curveToRelative(0.98f, 0f, 1.89f, 0.53f, 2.38f, 1.38f)
                curveToRelative(0.14f, 0.24f, 0.06f, 0.55f, -0.18f, 0.68f)
                curveToRelative(-0.24f, 0.14f, -0.55f, 0.06f, -0.68f, -0.18f)
                curveToRelative(-0.31f, -0.54f, -0.89f, -0.88f, -1.52f, -0.88f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(-0.9f, 0f, -1.63f, 0.73f, -1.63f, 1.63f)
                curveToRelative(0f, 0.8f, 0.57f, 1.48f, 1.37f, 1.6f)
                lineToRelative(3.42f, 0.55f)
                curveToRelative(1.28f, 0.21f, 2.21f, 1.3f, 2.21f, 2.59f)
                close()
            }
        }.also { _UsdCircle = it}
