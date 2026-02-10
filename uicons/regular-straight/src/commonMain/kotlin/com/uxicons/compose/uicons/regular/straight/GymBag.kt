package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GymBag: ImageVector? = null

val Icons.Rs.GymBag: ImageVector
    get() = _GymBag ?: UXIcon(name = "GymBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7f, 8f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(17f, 11f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-10f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(22f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(10f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _GymBag = it}
