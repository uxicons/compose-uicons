package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GymBag: ImageVector? = null

val Icons.Ts.GymBag: ImageVector
    get() = _GymBag ?: UXIcon(name = "GymBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 9f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(6f, 8f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(18f, 10f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-12f)
                close()
                moveTo(1f, 11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(23f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10f, 15f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _GymBag = it}
