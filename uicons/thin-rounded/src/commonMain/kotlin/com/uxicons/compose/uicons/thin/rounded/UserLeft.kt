package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLeft: ImageVector? = null

val Icons.Tr.UserLeft: ImageVector
    get() = _UserLeft ?: UXIcon(name = "UserLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.97f, 23.47f)
                curveToRelative(0.02f, 0.28f, -0.19f, 0.51f, -0.47f, 0.53f)
                curveToRelative(-0.27f, 0.02f, -0.52f, -0.19f, -0.53f, -0.47f)
                curveToRelative(-0.24f, -3.66f, -3.31f, -6.53f, -6.98f, -6.53f)
                reflectiveCurveToRelative(-6.75f, 2.87f, -6.99f, 6.53f)
                curveToRelative(-0.02f, 0.28f, -0.26f, 0.48f, -0.53f, 0.47f)
                curveToRelative(-0.28f, -0.02f, -0.48f, -0.26f, -0.47f, -0.53f)
                curveToRelative(0.28f, -4.19f, 3.78f, -7.47f, 7.98f, -7.47f)
                reflectiveCurveToRelative(7.71f, 3.28f, 7.98f, 7.47f)
                close()
                moveTo(2.98f, 9f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(3.98f, 9f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(23.5f, 4f)
                horizontalLineToRelative(-8.29f)
                curveToRelative(0.02f, -0.02f, 3.16f, -3.18f, 3.16f, -3.18f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-3.11f, 3.12f)
                curveToRelative(-0.33f, 0.33f, -0.51f, 0.77f, -0.51f, 1.24f)
                reflectiveCurveToRelative(0.18f, 0.91f, 0.51f, 1.24f)
                lineToRelative(3.11f, 3.12f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-3.11f, -3.11f)
                horizontalLineToRelative(8.24f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _UserLeft = it}
