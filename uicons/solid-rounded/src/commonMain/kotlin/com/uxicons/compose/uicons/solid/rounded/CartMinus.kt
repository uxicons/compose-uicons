package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartMinus: ImageVector? = null

val Icons.Sr.CartMinus: ImageVector
    get() = _CartMinus ?: UXIcon(name = "CartMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.82f, 9.57f)
                lineToRelative(-0.24f, 1.32f)
                curveToRelative(-0.43f, 2.38f, -2.5f, 4.11f, -4.92f, 4.11f)
                lineTo(5.74f, 15f)
                curveToRelative(0.42f, 1.17f, 1.53f, 2f, 2.82f, 2f)
                horizontalLineToRelative(10.44f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(8.56f, 19f)
                curveToRelative(-2.53f, 0f, -4.67f, -1.9f, -4.97f, -4.42f)
                lineTo(2.21f, 2.88f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                horizontalLineToRelative(-0.22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(0.45f, 0f, 1f, 0f)
                horizontalLineToRelative(0.22f)
                curveToRelative(1.52f, 0f, 2.8f, 1.14f, 2.98f, 2.65f)
                lineToRelative(0.04f, 0.35f)
                lineTo(12.81f, 3f)
                curveToRelative(-0.51f, 0.88f, -0.81f, 1.91f, -0.81f, 3f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(1.98f, 0f, 3.72f, -0.96f, 4.82f, -2.43f)
                close()
                moveTo(7f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _CartMinus = it}
