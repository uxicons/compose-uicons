package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WheelchairMove: ImageVector? = null

val Icons.Rs.WheelchairMove: ImageVector
    get() = _WheelchairMove ?: UXIcon(name = "WheelchairMove") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.79f, 17.89f)
                lineToRelative(-2.9f, 5.57f)
                lineToRelative(-1.77f, -0.92f)
                lineToRelative(2.89f, -5.55f)
                horizontalLineToRelative(-3.07f)
                curveToRelative(-0.49f, 3.95f, -3.86f, 7.01f, -7.94f, 7.01f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -3.28f, 1.99f, -6.1f, 4.83f, -7.33f)
                lineToRelative(-2.25f, 4.8f)
                curveToRelative(-0.36f, 0.77f, -0.57f, 1.63f, -0.57f, 2.53f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(2.97f, 0f, 5.44f, -2.17f, 5.92f, -5f)
                horizontalLineToRelative(-2.18f)
                curveToRelative(-0.94f, 0f, -1.81f, -0.47f, -2.32f, -1.27f)
                reflectiveCurveToRelative(-0.57f, -1.78f, -0.18f, -2.63f)
                lineToRelative(2.83f, -6.1f)
                horizontalLineToRelative(-2f)
                lineToRelative(-2.18f, 4.44f)
                lineToRelative(-1.79f, -0.88f)
                lineToRelative(2.73f, -5.56f)
                horizontalLineToRelative(6.3f)
                curveToRelative(0.97f, 0f, 1.87f, 0.49f, 2.39f, 1.31f)
                curveToRelative(0.52f, 0.82f, 0.59f, 1.84f, 0.18f, 2.72f)
                lineToRelative(-2.76f, 5.97f)
                horizontalLineToRelative(4.06f)
                curveToRelative(0.7f, 0f, 1.33f, 0.35f, 1.7f, 0.95f)
                reflectiveCurveToRelative(0.4f, 1.32f, 0.09f, 1.95f)
                close()
                moveTo(13.74f, 15f)
                horizontalLineToRelative(1f)
                lineToRelative(3.15f, -6.81f)
                curveToRelative(0.17f, -0.38f, 0.02f, -0.69f, -0.05f, -0.8f)
                reflectiveCurveToRelative(-0.29f, -0.39f, -0.71f, -0.39f)
                horizontalLineToRelative(-0.84f)
                lineToRelative(-3.22f, 6.94f)
                curveToRelative(-0.16f, 0.33f, -0.02f, 0.61f, 0.05f, 0.72f)
                curveToRelative(0.07f, 0.1f, 0.26f, 0.35f, 0.63f, 0.35f)
                close()
            }
        }.also { _WheelchairMove = it}
