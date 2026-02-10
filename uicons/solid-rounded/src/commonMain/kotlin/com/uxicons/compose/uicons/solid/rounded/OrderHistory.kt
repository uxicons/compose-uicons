package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderHistory: ImageVector? = null

val Icons.Sr.OrderHistory: ImageVector
    get() = _OrderHistory ?: UXIcon(name = "OrderHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(24f, 5f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(16.24f, 0f, 19f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
                moveTo(21f, 7f)
                horizontalLineToRelative(0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.27f, 0.1f, 0.52f, 0.29f, 0.71f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                close()
                moveTo(19f, 12.12f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -0.74f, 0.12f, -1.45f, 0.33f, -2.12f)
                lineTo(5.24f, 3f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                lineTo(1f, -0f)
                curveTo(0.45f, 0f, 0f, 0.45f, 0f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.22f)
                curveToRelative(0.51f, 0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.38f, 11.7f)
                curveToRelative(0.3f, 2.52f, 2.43f, 4.42f, 4.97f, 4.42f)
                horizontalLineToRelative(9.44f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(9.56f, 17.0f)
                curveToRelative(-1.29f, 0f, -2.4f, -0.83f, -2.82f, -2f)
                horizontalLineToRelative(11.42f)
                curveToRelative(2.38f, 0f, 4.44f, -1.69f, 4.9f, -4.02f)
                lineToRelative(0.04f, -0.21f)
                curveToRelative(-1.16f, 0.84f, -2.57f, 1.34f, -4.1f, 1.34f)
                close()
            }
        }.also { _OrderHistory = it}
