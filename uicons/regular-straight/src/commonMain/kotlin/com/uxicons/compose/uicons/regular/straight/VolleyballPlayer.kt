package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolleyballPlayer: ImageVector? = null

val Icons.Rs.VolleyballPlayer: ImageVector
    get() = _VolleyballPlayer ?: UXIcon(name = "VolleyballPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.92f, 6.97f)
                lineTo(14f, 7.9f)
                verticalLineToRelative(11.33f)
                lineToRelative(-4.25f, 4.78f)
                lineToRelative(-1.5f, -1.33f)
                lineToRelative(3.75f, -4.22f)
                verticalLineToRelative(-2.47f)
                horizontalLineToRelative(-2.11f)
                lineToRelative(-2.81f, 3.2f)
                lineToRelative(-5.74f, 2.09f)
                lineToRelative(-0.68f, -1.88f)
                lineToRelative(5.26f, -1.91f)
                lineToRelative(2.08f, -2.37f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-5.0f, -2.5f)
                verticalLineToRelative(-5.12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.88f)
                lineToRelative(4.24f, 2.12f)
                horizontalLineToRelative(3.71f)
                lineToRelative(9.77f, -1.02f)
                lineToRelative(0.21f, 1.99f)
                close()
                moveTo(12f, 14f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                close()
                moveTo(21f, 4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
            }
        }.also { _VolleyballPlayer = it}
