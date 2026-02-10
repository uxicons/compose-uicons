package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolleyballPlayer: ImageVector? = null

val Icons.Rr.VolleyballPlayer: ImageVector
    get() = _VolleyballPlayer ?: UXIcon(name = "VolleyballPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.99f, 5.89f)
                curveToRelative(0.06f, 0.55f, -0.33f, 1.04f, -0.88f, 1.1f)
                lineToRelative(-8.11f, 0.9f)
                verticalLineToRelative(10.87f)
                curveToRelative(0f, 0.71f, -0.26f, 1.41f, -0.72f, 1.95f)
                lineToRelative(-2.52f, 2.94f)
                curveToRelative(-0.36f, 0.42f, -0.99f, 0.47f, -1.41f, 0.11f)
                curveToRelative(-0.42f, -0.36f, -0.47f, -0.99f, -0.11f, -1.41f)
                lineToRelative(2.52f, -2.94f)
                curveToRelative(0.15f, -0.18f, 0.24f, -0.41f, 0.24f, -0.65f)
                verticalLineToRelative(-2.76f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(-0.03f, 0.05f, -2.26f, 2.62f, -2.26f, 2.62f)
                curveToRelative(-0.33f, 0.38f, -0.75f, 0.66f, -1.22f, 0.83f)
                lineToRelative(-4.02f, 1.48f)
                curveToRelative(-0.51f, 0.19f, -1.09f, -0.07f, -1.28f, -0.59f)
                curveToRelative(-0.19f, -0.52f, 0.07f, -1.09f, 0.59f, -1.28f)
                lineToRelative(4.02f, -1.48f)
                curveToRelative(0.16f, -0.06f, 0.3f, -0.15f, 0.41f, -0.28f)
                lineToRelative(1.92f, -2.18f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-3.9f, -1.95f)
                curveToRelative(-0.68f, -0.34f, -1.1f, -1.03f, -1.1f, -1.79f)
                verticalLineToRelative(-2.88f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.88f)
                lineToRelative(4.24f, 2.12f)
                horizontalLineToRelative(3.71f)
                lineToRelative(8.95f, -0.99f)
                curveToRelative(0.55f, -0.07f, 1.04f, 0.33f, 1.1f, 0.88f)
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
