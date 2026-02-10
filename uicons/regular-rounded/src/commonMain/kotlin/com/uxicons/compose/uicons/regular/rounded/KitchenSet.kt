package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KitchenSet: ImageVector? = null

val Icons.Rr.KitchenSet: ImageVector
    get() = _KitchenSet ?: UXIcon(name = "KitchenSet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                close()
                moveTo(9.9f, 18.32f)
                curveToRelative(-0.51f, 0.99f, -1.58f, 1.68f, -2.81f, 1.68f)
                lineTo(2.91f, 20f)
                curveToRelative(-1.23f, 0f, -2.3f, -0.68f, -2.81f, -1.68f)
                curveToRelative(-0.31f, -0.61f, 0.15f, -1.32f, 0.86f, -1.32f)
                lineTo(9.04f, 17f)
                curveToRelative(0.71f, 0f, 1.17f, 0.71f, 0.86f, 1.32f)
                close()
                moveTo(9.9f, 22.32f)
                curveToRelative(-0.51f, 0.99f, -1.58f, 1.68f, -2.81f, 1.68f)
                lineTo(2.91f, 24f)
                curveToRelative(-1.23f, 0f, -2.3f, -0.68f, -2.81f, -1.68f)
                curveToRelative(-0.31f, -0.61f, 0.15f, -1.32f, 0.86f, -1.32f)
                lineTo(9.04f, 21f)
                curveToRelative(0.71f, 0f, 1.17f, 0.71f, 0.86f, 1.32f)
                close()
                moveTo(6.5f, 13f)
                curveToRelative(3.24f, 0f, 5.93f, -2.39f, 6.42f, -5.5f)
                horizontalLineToRelative(7.08f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7.08f)
                curveToRelative(-0.48f, -3.11f, -3.17f, -5.5f, -6.42f, -5.5f)
                curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                close()
                moveTo(6.5f, 2f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveTo(2f, 8.98f, 2f, 6.5f)
                reflectiveCurveTo(4.02f, 2f, 6.5f, 2f)
                close()
            }
        }.also { _KitchenSet = it}
