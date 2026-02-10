package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TravelerCamera: ImageVector? = null

val Icons.Rs.TravelerCamera: ImageVector
    get() = _TravelerCamera ?: UXIcon(name = "TravelerCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(14.5f, 18f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-0.5f, -1f)
                horizontalLineToRelative(-3f)
                lineToRelative(-0.5f, 1f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                reflectiveCurveToRelative(8.0f, 0f, 8.0f, 0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12f, 22.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.78f, 4f)
                lineTo(17.35f, 2.27f)
                curveToRelative(-0.33f, -1.34f, -1.53f, -2.27f, -2.91f, -2.27f)
                horizontalLineToRelative(-4.88f)
                curveToRelative(-1.38f, 0f, -2.58f, 0.94f, -2.91f, 2.27f)
                lineToRelative(-0.43f, 1.73f)
                horizontalLineToRelative(-2.22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.22f)
                close()
                moveTo(8.59f, 2.76f)
                curveToRelative(0.11f, -0.45f, 0.51f, -0.76f, 0.97f, -0.76f)
                horizontalLineToRelative(4.88f)
                curveToRelative(0.46f, 0f, 0.86f, 0.31f, 0.97f, 0.76f)
                lineToRelative(0.31f, 1.24f)
                horizontalLineToRelative(-7.44f)
                lineToRelative(0.31f, -1.24f)
                close()
                moveTo(12.0f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _TravelerCamera = it}
