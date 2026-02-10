package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsdSquare: ImageVector? = null

val Icons.Tr.UsdSquare: ImageVector
    get() = _UsdSquare ?: UXIcon(name = "UsdSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
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
        }.also { _UsdSquare = it}
