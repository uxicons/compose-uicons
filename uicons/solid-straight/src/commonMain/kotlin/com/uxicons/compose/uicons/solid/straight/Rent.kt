package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rent: ImageVector? = null

val Icons.Ss.Rent: ImageVector
    get() = _Rent ?: UXIcon(name = "Rent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.43f, 6.51f)
                curveToRelative(-0.49f, -3.67f, -3.63f, -6.51f, -7.43f, -6.51f)
                curveToRelative(-3.65f, 0f, -6.7f, 2.62f, -7.36f, 6.09f)
                curveToRelative(-2.35f, 0.41f, -4.14f, 2.45f, -4.14f, 4.91f)
                curveToRelative(0f, 2.05f, 1.23f, 3.81f, 3f, 4.58f)
                verticalLineToRelative(0.43f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(2.0f, 2f)
                lineToRelative(2.0f, -2f)
                verticalLineToRelative(-6.43f)
                curveToRelative(1.77f, -0.77f, 3f, -2.53f, 3f, -4.58f)
                curveToRelative(0f, -2.35f, -1.63f, -4.32f, -3.83f, -4.85f)
                curveToRelative(0.6f, -2.38f, 2.76f, -4.15f, 5.33f, -4.15f)
                curveToRelative(2.75f, 0f, 5.02f, 2.02f, 5.43f, 4.66f)
                lineToRelative(-4.43f, 4.43f)
                verticalLineToRelative(12.91f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-12.91f)
                lineToRelative(-4.57f, -4.57f)
                close()
                moveTo(5.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Rent = it}
