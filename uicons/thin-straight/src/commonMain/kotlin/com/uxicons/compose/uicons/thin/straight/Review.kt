package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Review: ImageVector? = null

val Icons.Ts.Review: ImageVector
    get() = _Review ?: UXIcon(name = "Review") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(6.24f, 1f, 9f, 1f)
                close()
                moveTo(4.5f, 14f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(24f, 16f)
                horizontalLineToRelative(-4.06f)
                lineToRelative(-1.1f, -3.83f)
                horizontalLineToRelative(-1.66f)
                lineToRelative(-1.1f, 3.83f)
                horizontalLineToRelative(-4.09f)
                verticalLineToRelative(1.6f)
                lineToRelative(2.86f, 1.65f)
                lineToRelative(-1.32f, 3.62f)
                lineToRelative(1.28f, 0.95f)
                lineToRelative(3.2f, -2.54f)
                lineToRelative(3.19f, 2.56f)
                lineToRelative(1.33f, -0.92f)
                lineToRelative(-1.43f, -3.64f)
                lineToRelative(2.9f, -1.7f)
                verticalLineToRelative(-1.59f)
                close()
                moveTo(19.86f, 18.86f)
                lineToRelative(1.46f, 3.69f)
                lineToRelative(-0.07f, 0.04f)
                lineToRelative(-3.23f, -2.6f)
                lineToRelative(-3.22f, 2.56f)
                lineToRelative(-0.07f, -0.05f)
                lineToRelative(1.36f, -3.71f)
                lineToRelative(-3.09f, -1.78f)
                lineToRelative(3.84f, -0.02f)
                lineToRelative(1.1f, -3.83f)
                horizontalLineToRelative(0.15f)
                lineToRelative(1.1f, 3.83f)
                horizontalLineToRelative(3.82f)
                lineToRelative(-3.14f, 1.86f)
                close()
            }
        }.also { _Review = it}
