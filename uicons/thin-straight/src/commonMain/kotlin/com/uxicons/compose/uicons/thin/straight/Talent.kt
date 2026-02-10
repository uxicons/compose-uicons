package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Talent: ImageVector? = null

val Icons.Ts.Talent: ImageVector
    get() = _Talent ?: UXIcon(name = "Talent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(16f, 19.71f)
                verticalLineToRelative(4.29f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.29f)
                lineToRelative(-5.85f, -5.85f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(5.85f, 5.85f)
                horizontalLineToRelative(6.59f)
                lineToRelative(5.85f, -5.85f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-5.85f, 5.85f)
                close()
                moveTo(7.88f, 10.31f)
                lineToRelative(1.22f, 0.91f)
                lineToRelative(2.91f, -2.31f)
                lineToRelative(2.9f, 2.33f)
                lineToRelative(1.27f, -0.88f)
                lineToRelative(-1.3f, -3.3f)
                lineToRelative(2.62f, -1.54f)
                verticalLineToRelative(-1.52f)
                horizontalLineToRelative(-3.7f)
                lineToRelative(-1.0f, -3.64f)
                horizontalLineToRelative(-1.58f)
                lineToRelative(-1.0f, 3.64f)
                horizontalLineToRelative(-3.72f)
                verticalLineToRelative(1.53f)
                lineToRelative(2.59f, 1.49f)
                lineToRelative(-1.2f, 3.29f)
                close()
                moveTo(7.59f, 5f)
                horizontalLineToRelative(3.4f)
                lineToRelative(1.0f, -3.64f)
                horizontalLineToRelative(0.06f)
                lineToRelative(1.0f, 3.64f)
                horizontalLineToRelative(3.37f)
                lineToRelative(-2.77f, 1.63f)
                lineToRelative(1.32f, 3.36f)
                horizontalLineToRelative(-0.0f)
                reflectiveCurveToRelative(-2.94f, -2.36f, -2.94f, -2.36f)
                lineToRelative(-2.93f, 2.33f)
                lineToRelative(-0.0f, -0.0f)
                lineToRelative(1.24f, -3.38f)
                lineToRelative(-2.73f, -1.57f)
                close()
            }
        }.also { _Talent = it}
