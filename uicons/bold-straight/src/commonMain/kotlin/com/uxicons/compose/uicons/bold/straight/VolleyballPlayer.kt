package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolleyballPlayer: ImageVector? = null

val Icons.Bs.VolleyballPlayer: ImageVector
    get() = _VolleyballPlayer ?: UXIcon(name = "VolleyballPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(23.36f, 5.01f)
                lineTo(12.93f, 6f)
                horizontalLineToRelative(-3.08f)
                lineToRelative(-3.85f, -1.93f)
                verticalLineToRelative(-4.07f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5.93f)
                lineToRelative(5f, 2.5f)
                verticalLineToRelative(5.59f)
                lineToRelative(-1.95f, 2.73f)
                lineToRelative(-5.06f, 1.84f)
                lineToRelative(1.02f, 2.82f)
                lineToRelative(5.94f, -2.16f)
                lineToRelative(3.05f, -4.27f)
                verticalLineToRelative(2.95f)
                lineToRelative(-3.62f, 4.07f)
                lineToRelative(2.24f, 1.99f)
                lineToRelative(4.38f, -4.93f)
                verticalLineToRelative(-10.16f)
                lineToRelative(9.64f, -0.92f)
                lineToRelative(-0.28f, -2.99f)
                close()
                moveTo(22f, 4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
            }
        }.also { _VolleyballPlayer = it}
