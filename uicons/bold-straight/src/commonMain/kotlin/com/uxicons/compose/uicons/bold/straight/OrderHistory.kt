package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderHistory: ImageVector? = null

val Icons.Bs.OrderHistory: ImageVector
    get() = _OrderHistory ?: UXIcon(name = "OrderHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(21.76f, 0f, 19f, 0f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(18f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.29f, -2.29f)
                lineTo(18f, 2f)
                close()
                moveTo(19f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(22.24f, 11.2f)
                lineToRelative(-1.87f, 6.8f)
                lineTo(7.41f, 18f)
                curveToRelative(-1.75f, 0f, -3.24f, -1.31f, -3.47f, -3.04f)
                lineTo(2.4f, 3.43f)
                curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f)
                lineTo(0f, 3f)
                lineTo(0f, 0f)
                lineTo(1.9f, 0f)
                curveToRelative(1.75f, 0f, 3.24f, 1.31f, 3.47f, 3.04f)
                lineToRelative(0.26f, 1.96f)
                horizontalLineToRelative(6.37f)
                curveToRelative(0f, 1.07f, 0.25f, 2.09f, 0.68f, 3f)
                lineTo(6.03f, 8f)
                lineToRelative(0.88f, 6.57f)
                curveToRelative(0.03f, 0.25f, 0.24f, 0.43f, 0.49f, 0.43f)
                horizontalLineToRelative(10.69f)
                lineToRelative(0.82f, -3.0f)
                curveToRelative(0.03f, 0f, 0.06f, 0.0f, 0.09f, 0.0f)
                curveToRelative(1.17f, 0f, 2.27f, -0.29f, 3.24f, -0.8f)
                close()
                moveTo(9f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _OrderHistory = it}
