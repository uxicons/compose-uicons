package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderHistory: ImageVector? = null

val Icons.Ss.OrderHistory: ImageVector
    get() = _OrderHistory ?: UXIcon(name = "OrderHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(21.76f, 0f, 19f, 0f)
                close()
                moveTo(20.29f, 7.71f)
                lineToRelative(-2.29f, -2.29f)
                lineTo(18f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(9f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(21.84f, 15f)
                lineTo(5.65f, 15f)
                lineToRelative(0.13f, 1.12f)
                curveToRelative(0.06f, 0.5f, 0.49f, 0.88f, 0.99f, 0.88f)
                horizontalLineToRelative(13.22f)
                verticalLineToRelative(2f)
                lineTo(6.78f, 19f)
                curveToRelative(-1.52f, 0f, -2.8f, -1.14f, -2.98f, -2.65f)
                lineTo(2.21f, 2.88f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                lineTo(1.22f, 0f)
                curveToRelative(1.52f, 0f, 2.8f, 1.14f, 2.98f, 2.65f)
                lineToRelative(0.04f, 0.35f)
                lineTo(12.29f, 3f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
                curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                curveToRelative(1.27f, 0f, 2.46f, -0.34f, 3.49f, -0.94f)
                lineToRelative(-0.66f, 3.94f)
                close()
                moveTo(19f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _OrderHistory = it}
