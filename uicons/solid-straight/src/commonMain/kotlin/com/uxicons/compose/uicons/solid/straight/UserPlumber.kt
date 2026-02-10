package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPlumber: ImageVector? = null

val Icons.Ss.UserPlumber: ImageVector
    get() = _UserPlumber ?: UXIcon(name = "UserPlumber") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 11f)
                verticalLineToRelative(3.08f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3.08f)
                curveToRelative(-1.76f, 0.77f, -3f, 2.53f, -3f, 4.58f)
                reflectiveCurveToRelative(1.24f, 3.81f, 3f, 4.58f)
                verticalLineToRelative(3.84f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3.84f)
                curveToRelative(1.76f, -0.77f, 3f, -2.53f, 3f, -4.58f)
                reflectiveCurveToRelative(-1.24f, -3.81f, -3f, -4.58f)
                close()
                moveTo(2f, 8.98f)
                horizontalLineToRelative(12f)
                curveToRelative(0.01f, 3.29f, -2.69f, 6.0f, -6f, 6f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.71f, -6f, -6f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(7.03f)
                curveToRelative(0.13f, 2.15f, 1.23f, 4.1f, 2.97f, 5.32f)
                close()
                moveTo(15f, 6.98f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.02f)
                curveToRelative(0.24f, -2.63f, 2.34f, -4.74f, 4.98f, -4.98f)
                verticalLineToRelative(3.98f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.98f)
                curveToRelative(2.63f, 0.24f, 4.74f, 2.34f, 4.98f, 4.98f)
                horizontalLineToRelative(1.02f)
                close()
            }
        }.also { _UserPlumber = it}
