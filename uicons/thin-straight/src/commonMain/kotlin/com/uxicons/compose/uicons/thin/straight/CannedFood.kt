package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CannedFood: ImageVector? = null

val Icons.Ts.CannedFood: ImageVector
    get() = _CannedFood ?: UXIcon(name = "CannedFood") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6.05f)
                curveToRelative(0.65f, -0.64f, 1.05f, -1.52f, 1.05f, -2.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(15.5f, 1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(0f, 6f)
                verticalLineToRelative(1f)
                lineTo(1f, 7f)
                lineTo(1f, 23f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                lineTo(24f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 7f)
                horizontalLineToRelative(1f)
                close()
                moveTo(22f, 23f)
                lineTo(2f, 23f)
                verticalLineToRelative(-3f)
                lineTo(20f, 20f)
                verticalLineToRelative(-1f)
                lineTo(2f, 19f)
                lineTo(2f, 11f)
                lineTo(20f, 11f)
                verticalLineToRelative(-1f)
                lineTo(2f, 10f)
                verticalLineToRelative(-3f)
                lineTo(22f, 7f)
                lineTo(22f, 23f)
                close()
            }
        }.also { _CannedFood = it}
