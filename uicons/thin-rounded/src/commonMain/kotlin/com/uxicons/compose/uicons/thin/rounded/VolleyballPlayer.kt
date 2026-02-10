package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolleyballPlayer: ImageVector? = null

val Icons.Tr.VolleyballPlayer: ImageVector
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
                moveTo(22.45f, 5.0f)
                lineTo(13.5f, 6f)
                horizontalLineToRelative(-3.98f)
                lineToRelative(-4.21f, -1.71f)
                curveToRelative(-0.19f, -0.08f, -0.31f, -0.26f, -0.31f, -0.46f)
                verticalLineToRelative(-3.33f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.33f)
                curveToRelative(0f, 0.61f, 0.37f, 1.16f, 0.94f, 1.39f)
                lineToRelative(4.06f, 1.65f)
                verticalLineToRelative(7.5f)
                lineToRelative(-2.08f, 3.62f)
                curveToRelative(-0.17f, 0.29f, -0.43f, 0.52f, -0.75f, 0.65f)
                lineToRelative(-4.86f, 1.92f)
                curveToRelative(-0.26f, 0.1f, -0.38f, 0.39f, -0.28f, 0.65f)
                curveToRelative(0.1f, 0.26f, 0.4f, 0.38f, 0.65f, 0.28f)
                lineToRelative(4.86f, -1.92f)
                curveToRelative(0.52f, -0.21f, 0.97f, -0.59f, 1.25f, -1.08f)
                lineToRelative(2.01f, -3.49f)
                horizontalLineToRelative(3.21f)
                verticalLineToRelative(3.38f)
                curveToRelative(0f, 0.38f, -0.14f, 0.74f, -0.4f, 1.02f)
                lineToRelative(-3.47f, 3.76f)
                curveToRelative(-0.19f, 0.2f, -0.17f, 0.52f, 0.03f, 0.71f)
                curveToRelative(0.2f, 0.19f, 0.52f, 0.17f, 0.71f, -0.03f)
                lineToRelative(3.47f, -3.76f)
                curveToRelative(0.43f, -0.46f, 0.66f, -1.06f, 0.66f, -1.7f)
                verticalLineToRelative(-11.44f)
                lineToRelative(8.55f, -0.95f)
                curveToRelative(0.27f, -0.03f, 0.47f, -0.28f, 0.44f, -0.55f)
                reflectiveCurveToRelative(-0.28f, -0.47f, -0.55f, -0.44f)
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
