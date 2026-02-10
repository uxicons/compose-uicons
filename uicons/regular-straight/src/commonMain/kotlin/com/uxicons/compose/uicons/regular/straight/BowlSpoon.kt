package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlSpoon: ImageVector? = null

val Icons.Rs.BowlSpoon: ImageVector
    get() = _BowlSpoon ?: UXIcon(name = "BowlSpoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.41f, 3f)
                curveToRelative(-0.47f, -1.72f, -2.14f, -3f, -4.12f, -3f)
                curveTo(4.13f, 0f, 0f, 1.56f, 0f, 4f)
                reflectiveCurveToRelative(4.13f, 4f, 6.29f, 4f)
                curveToRelative(1.98f, 0f, 3.64f, -1.28f, 4.12f, -3f)
                horizontalLineToRelative(13.63f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-13.63f)
                close()
                moveTo(6.29f, 6f)
                curveToRelative(-1.73f, 0f, -4.29f, -1.31f, -4.29f, -2f)
                reflectiveCurveToRelative(2.57f, -2f, 4.29f, -2f)
                curveToRelative(1.24f, 0f, 2.25f, 0.9f, 2.25f, 2f)
                reflectiveCurveToRelative(-1.01f, 2f, -2.25f, 2f)
                close()
                moveTo(20.99f, 11.02f)
                lineTo(3.01f, 11.02f)
                curveToRelative(-0.87f, 0f, -1.69f, 0.39f, -2.27f, 1.06f)
                curveToRelative(-0.59f, 0.7f, -0.85f, 1.62f, -0.7f, 2.53f)
                curveToRelative(0.81f, 5.0f, 4.74f, 7.91f, 7.73f, 9.39f)
                horizontalLineToRelative(8.47f)
                curveToRelative(2.98f, -1.47f, 6.92f, -4.38f, 7.72f, -9.39f)
                curveToRelative(0.15f, -0.91f, -0.11f, -1.83f, -0.7f, -2.53f)
                curveToRelative(-0.57f, -0.67f, -1.4f, -1.06f, -2.27f, -1.06f)
                close()
                moveTo(21.98f, 14.29f)
                curveToRelative(-0.65f, 4.05f, -3.7f, 6.42f, -6.22f, 7.71f)
                horizontalLineToRelative(-7.53f)
                curveToRelative(-2.52f, -1.29f, -5.57f, -3.65f, -6.22f, -7.71f)
                curveToRelative(-0.05f, -0.33f, 0.04f, -0.67f, 0.25f, -0.92f)
                curveToRelative(0.11f, -0.13f, 0.36f, -0.35f, 0.74f, -0.35f)
                horizontalLineToRelative(17.98f)
                curveToRelative(0.38f, 0f, 0.63f, 0.22f, 0.74f, 0.35f)
                curveToRelative(0.21f, 0.25f, 0.31f, 0.58f, 0.25f, 0.92f)
                close()
            }
        }.also { _BowlSpoon = it}
