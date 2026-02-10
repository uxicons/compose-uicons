package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cannon: ImageVector? = null

val Icons.Ts.Cannon: ImageVector
    get() = _Cannon ?: UXIcon(name = "Cannon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.48f, 13.69f)
                lineToRelative(6.48f, -5.87f)
                lineToRelative(-4.35f, -6.15f)
                lineToRelative(-11.28f, 6.19f)
                curveTo(7.44f, 3.84f, 4.05f, 1f, 0f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(3.67f, 0f, 6.71f, 2.66f, 7.4f, 6.37f)
                lineToRelative(-4.85f, 2.66f)
                curveToRelative(-2.72f, 1.92f, -3.36f, 5.7f, -1.44f, 8.42f)
                curveToRelative(1.17f, 1.65f, 3.02f, 2.54f, 4.92f, 2.54f)
                curveToRelative(1.22f, 0f, 2.46f, -0.37f, 3.54f, -1.14f)
                lineToRelative(0.88f, -0.8f)
                curveToRelative(0.79f, 1.73f, 2.52f, 2.94f, 4.55f, 2.94f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -1.85f, -1.02f, -3.45f, -2.52f, -4.31f)
                close()
                moveTo(22.63f, 7.68f)
                lineToRelative(-6.15f, 5.57f)
                curveToRelative(-0.47f, -0.15f, -0.96f, -0.25f, -1.48f, -0.25f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.16f, 0.03f, 0.31f, 0.05f, 0.46f)
                lineToRelative(-5.29f, -7.5f)
                lineToRelative(14.55f, -7.98f)
                lineToRelative(3.33f, 4.7f)
                close()
                moveTo(1.93f, 18.87f)
                curveToRelative(-1.6f, -2.27f, -1.07f, -5.42f, 1.15f, -6.99f)
                lineToRelative(0.8f, -0.44f)
                lineToRelative(5.69f, 8.07f)
                lineToRelative(-0.61f, 0.56f)
                curveToRelative(-2.27f, 1.61f, -5.42f, 1.07f, -7.02f, -1.2f)
                close()
                moveTo(15f, 22f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(15f, 16f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(15f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Cannon = it}
