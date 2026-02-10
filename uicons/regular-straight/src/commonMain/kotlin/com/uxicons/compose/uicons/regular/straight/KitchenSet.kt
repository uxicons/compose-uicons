package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KitchenSet: ImageVector? = null

val Icons.Rs.KitchenSet: ImageVector
    get() = _KitchenSet ?: UXIcon(name = "KitchenSet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 21.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(0f, 21f)
                lineTo(10f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
                moveTo(0f, 17f)
                lineTo(10f, 17f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(3f, 20f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
                moveTo(6.5f, 13f)
                curveToRelative(3.24f, 0f, 5.93f, -2.39f, 6.42f, -5.5f)
                horizontalLineToRelative(8.09f)
                verticalLineToRelative(-2f)
                lineTo(12.91f, 5.5f)
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
