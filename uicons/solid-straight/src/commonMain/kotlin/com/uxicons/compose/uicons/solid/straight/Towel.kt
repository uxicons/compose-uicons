package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Towel: ImageVector? = null

val Icons.Ss.Towel: ImageVector
    get() = _Towel ?: UXIcon(name = "Towel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                close()
                moveTo(15f, 13f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.93f, 0.28f, -1.78f, 0.76f, -2.5f)
                horizontalLineToRelative(-10.76f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
                moveTo(7f, 24f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-15f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Towel = it}
