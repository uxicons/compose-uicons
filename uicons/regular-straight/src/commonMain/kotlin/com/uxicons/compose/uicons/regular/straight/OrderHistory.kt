package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderHistory: ImageVector? = null

val Icons.Rs.OrderHistory: ImageVector
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
                moveTo(5.42f, 13f)
                lineToRelative(-0.94f, -8f)
                horizontalLineToRelative(5.59f)
                curveToRelative(0.09f, -0.7f, 0.26f, -1.37f, 0.52f, -2f)
                lineTo(4.24f, 3f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                lineTo(0f, 0f)
                lineTo(0f, 2f)
                lineTo(1.22f, 2f)
                curveToRelative(0.51f, 0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.58f, 13.47f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(13.22f)
                verticalLineToRelative(-2f)
                lineTo(6.78f, 17f)
                curveToRelative(-0.51f, 0f, -0.93f, -0.38f, -0.99f, -0.88f)
                lineToRelative(-0.13f, -1.12f)
                lineTo(21.84f, 15f)
                lineToRelative(0.36f, -2f)
                lineTo(5.42f, 13f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(14.69f, 0f, 18f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22f, 6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(19f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.41f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.71f, -1.71f)
                lineTo(19f, 3f)
                close()
            }
        }.also { _OrderHistory = it}
