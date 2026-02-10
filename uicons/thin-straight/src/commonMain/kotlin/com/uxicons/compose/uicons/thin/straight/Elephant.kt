package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Elephant: ImageVector? = null

val Icons.Ts.Elephant: ImageVector
    get() = _Elephant ?: UXIcon(name = "Elephant") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 17.5f)
                verticalLineToRelative(2.9f)
                curveToRelative(0f, 1.28f, -0.9f, 2.38f, -2.1f, 2.57f)
                curveToRelative(-0.13f, 0.02f, -0.26f, 0.03f, -0.4f, 0.03f)
                curveToRelative(-0.59f, 0f, -1.17f, -0.21f, -1.61f, -0.59f)
                curveToRelative(-0.56f, -0.48f, -0.87f, -1.17f, -0.87f, -1.91f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(0.01f, -5f)
                horizontalLineToRelative(-6.02f)
                lineToRelative(-0.01f, 5f)
                lineTo(0f, 23.0f)
                verticalLineToRelative(-14.5f)
                curveTo(0f, 5.47f, 2.47f, 3f, 5.5f, 3f)
                horizontalLineToRelative(2.77f)
                curveToRelative(1.01f, -1.22f, 2.54f, -2f, 4.24f, -2f)
                curveToRelative(2.35f, 0f, 4.46f, 1.54f, 5.2f, 3.78f)
                curveToRelative(1.43f, 0.91f, 2.31f, 2.49f, 2.31f, 4.17f)
                verticalLineToRelative(11.55f)
                curveToRelative(0f, 0.45f, 0.19f, 0.86f, 0.52f, 1.15f)
                curveToRelative(0.33f, 0.28f, 0.76f, 0.4f, 1.21f, 0.33f)
                curveToRelative(0.71f, -0.11f, 1.25f, -0.79f, 1.25f, -1.58f)
                verticalLineToRelative(-2.9f)
                horizontalLineToRelative(1f)
                close()
                moveTo(19.02f, 17f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0f, -1.46f, -0.74f, -2.74f, -1.99f, -3.46f)
                lineToRelative(-0.17f, -0.1f)
                lineToRelative(-0.06f, -0.19f)
                curveToRelative(-0.56f, -1.92f, -2.32f, -3.25f, -4.3f, -3.25f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                verticalLineToRelative(1f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                curveToRelative(0f, -0.9f, 0.22f, -1.75f, 0.6f, -2.5f)
                horizontalLineToRelative(-2.11f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(3.0f)
                lineToRelative(0.01f, -5f)
                horizontalLineToRelative(8.02f)
                lineToRelative(-0.01f, 5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }.also { _Elephant = it}
