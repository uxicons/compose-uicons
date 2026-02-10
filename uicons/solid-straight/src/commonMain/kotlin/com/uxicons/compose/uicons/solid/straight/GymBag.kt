package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GymBag: ImageVector? = null

val Icons.Ss.GymBag: ImageVector
    get() = _GymBag ?: UXIcon(name = "GymBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 23f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(21f, 9f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(5f, 8f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-14f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                close()
            }
        }.also { _GymBag = it}
