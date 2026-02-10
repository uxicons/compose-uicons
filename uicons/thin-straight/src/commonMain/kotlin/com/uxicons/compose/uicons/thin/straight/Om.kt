package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Om: ImageVector? = null

val Icons.Ts.Om: ImageVector
    get() = _Om ?: UXIcon(name = "Om") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(19f, 7f)
                curveToRelative(-2.06f, 0f, -2.88f, 1.4f, -3.61f, 2.64f)
                curveToRelative(-0.46f, 0.79f, -0.9f, 1.54f, -1.62f, 1.92f)
                curveToRelative(-0.85f, 0.45f, -1.79f, 0.45f, -3.47f, 0.44f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.03f, -0.82f, 1.71f, -2.08f, 1.71f, -3.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-2.38f, 0f, -4.82f, 2.33f, -4.92f, 2.43f)
                lineToRelative(0.69f, 0.72f)
                curveToRelative(0.02f, -0.02f, 2.25f, -2.15f, 4.22f, -2.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-3.13f, 0f, -5.74f, -3.34f, -6f, -6.5f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 3.31f, 2.69f, 5.91f, 6f, 5.91f)
                horizontalLineToRelative(1f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -2.09f, -1.07f, -3.92f, -2.69f, -5f)
                curveToRelative(1.79f, 0.02f, 2.86f, 0.0f, 3.92f, -0.56f)
                curveToRelative(0.97f, -0.51f, 1.5f, -1.42f, 2.02f, -2.3f)
                curveToRelative(0.68f, -1.15f, 1.26f, -2.15f, 2.75f, -2.15f)
                curveToRelative(2.24f, 0f, 4f, 2.85f, 4f, 6.5f)
                curveToRelative(0f, 4.07f, -2.03f, 6.5f, -4f, 6.5f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-0.0f, 0f, -0.01f, 0f)
                curveToRelative(-3.0f, 0f, -4.0f, -3.5f, -4.0f, -5f)
                curveToRelative(0f, 2f, 0.5f, 6f, 4.0f, 6f)
                curveToRelative(0.0f, 0f, 0.0f, 0f, 0.01f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(2.46f, 0f, 5f, -2.81f, 5f, -7.5f)
                curveToRelative(0f, -4.28f, -2.15f, -7.5f, -5f, -7.5f)
                close()
                moveTo(14.5f, 5f)
                curveToRelative(1.29f, 0f, 2.53f, -0.63f, 3.41f, -1.2f)
                lineToRelative(-0.72f, -0.9f)
                curveToRelative(-0.61f, 0.49f, -1.74f, 1.1f, -3.19f, 1.1f)
                curveToRelative(-0.49f, 0f, -2.5f, 0f, -3.5f, -1f)
                curveToRelative(1f, 1f, 1.5f, 2f, 4f, 2f)
                close()
            }
        }.also { _Om = it}
