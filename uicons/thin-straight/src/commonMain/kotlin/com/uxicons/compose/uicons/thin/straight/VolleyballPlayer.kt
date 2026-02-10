package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolleyballPlayer: ImageVector? = null

val Icons.Ts.VolleyballPlayer: ImageVector
    get() = _VolleyballPlayer ?: UXIcon(name = "VolleyballPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(11.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.37f, 5.97f)
                lineTo(23.27f, 4.98f)
                lineTo(13.5f, 6f)
                horizontalLineToRelative(-3.98f)
                lineToRelative(-4.52f, -1.84f)
                verticalLineToRelative(-4.16f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.84f)
                lineToRelative(5f, 2.03f)
                verticalLineToRelative(7.5f)
                lineToRelative(-2.35f, 4.08f)
                lineToRelative(-5.35f, 2.12f)
                lineToRelative(0.37f, 0.93f)
                lineToRelative(5.67f, -2.24f)
                lineToRelative(2.44f, -4.25f)
                horizontalLineToRelative(3.21f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.87f, 4.36f)
                lineToRelative(0.75f, 0.66f)
                lineToRelative(4.13f, -4.64f)
                verticalLineToRelative(-12.41f)
                lineToRelative(9.37f, -0.98f)
                close()
                moveTo(10f, 14f)
                verticalLineToRelative(-7f)
                lineToRelative(3f, -0.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(21f, 4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(21f, 1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _VolleyballPlayer = it}
