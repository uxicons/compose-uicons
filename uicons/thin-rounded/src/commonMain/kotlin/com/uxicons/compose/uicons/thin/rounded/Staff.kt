package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Staff: ImageVector? = null

val Icons.Tr.Staff: ImageVector
    get() = _Staff ?: UXIcon(name = "Staff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.5f, 24f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(12.09f, -12.09f)
                curveToRelative(1.0f, -1.0f, 1.66f, -2.33f, 1.85f, -3.74f)
                lineToRelative(0.51f, -3.84f)
                curveToRelative(0.27f, -1.98f, 1.97f, -3.47f, 3.97f, -3.47f)
                horizontalLineToRelative(1.44f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.44f)
                curveToRelative(-1.5f, 0f, -2.77f, 1.12f, -2.98f, 2.6f)
                lineToRelative(-0.51f, 3.84f)
                curveToRelative(-0.22f, 1.62f, -0.97f, 3.15f, -2.13f, 4.31f)
                lineTo(0.85f, 23.85f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                close()
            }
        }.also { _Staff = it}
