package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cannon: ImageVector? = null

val Icons.Rs.Cannon: ImageVector
    get() = _Cannon ?: UXIcon(name = "Cannon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.14f, 13.39f)
                lineToRelative(5.88f, -5.33f)
                lineToRelative(-4.68f, -6.61f)
                lineToRelative(-10.65f, 5.84f)
                curveTo(7.61f, 3.52f, 4.24f, 1f, 0f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(3.52f, 0f, 6.19f, 2.09f, 6.87f, 5.29f)
                lineToRelative(-4.23f, 2.33f)
                curveTo(1.28f, 11.58f, 0.37f, 13.02f, 0.09f, 14.68f)
                curveToRelative(-0.28f, 1.65f, 0.1f, 3.31f, 1.06f, 4.68f)
                curveToRelative(1.22f, 1.72f, 3.16f, 2.64f, 5.12f, 2.64f)
                curveToRelative(1.25f, 0f, 2.52f, -0.37f, 3.61f, -1.15f)
                lineToRelative(0.15f, -0.14f)
                curveToRelative(1f, 1.38f, 2.62f, 2.29f, 4.46f, 2.29f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0f, -1.64f, -0.72f, -3.1f, -1.86f, -4.11f)
                close()
                moveTo(21.36f, 7.77f)
                lineToRelative(-5.03f, 4.55f)
                curveToRelative(-0.58f, -0.2f, -1.19f, -0.32f, -1.84f, -0.32f)
                curveToRelative(-2.5f, 0f, -4.62f, 1.68f, -5.28f, 3.98f)
                lineToRelative(-3.4f, -4.83f)
                lineToRelative(12.92f, -7.09f)
                lineToRelative(2.63f, 3.71f)
                close()
                moveTo(2.79f, 18.2f)
                curveToRelative(-0.66f, -0.93f, -0.92f, -2.06f, -0.72f, -3.19f)
                curveToRelative(0.19f, -1.11f, 0.79f, -2.08f, 1.7f, -2.73f)
                lineToRelative(0.29f, -0.16f)
                lineToRelative(4.88f, 6.91f)
                lineToRelative(-0.24f, 0.21f)
                curveToRelative(-1.92f, 1.32f, -4.56f, 0.86f, -5.9f, -1.05f)
                close()
                moveTo(14.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(16f, 17.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Cannon = it}
