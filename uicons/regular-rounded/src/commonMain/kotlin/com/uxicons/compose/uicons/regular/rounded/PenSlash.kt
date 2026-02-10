package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSlash: ImageVector? = null

val Icons.Rr.PenSlash: ImageVector
    get() = _PenSlash ?: UXIcon(name = "PenSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.65f, 16.12f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-4.94f, 4.94f)
                curveToRelative(-0.98f, 0.98f, -2.28f, 1.52f, -3.67f, 1.52f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0f, -1.39f, 0.54f, -2.69f, 1.52f, -3.67f)
                lineToRelative(5.05f, -5.05f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-5.05f, 5.05f)
                curveToRelative(-0.6f, 0.6f, -0.94f, 1.4f, -0.94f, 2.26f)
                verticalLineToRelative(1.04f)
                horizontalLineToRelative(1.04f)
                curveToRelative(0.85f, 0f, 1.65f, -0.33f, 2.25f, -0.94f)
                lineToRelative(4.94f, -4.94f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(8.41f, 8.41f)
                lineToRelative(7.62f, -7.62f)
                curveToRelative(1.43f, -1.43f, 3.76f, -1.43f, 5.19f, 0f)
                curveToRelative(1.43f, 1.43f, 1.43f, 3.76f, 0f, 5.19f)
                lineToRelative(-7.62f, 7.62f)
                lineToRelative(8.41f, 8.41f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(16.66f, 4.98f)
                lineToRelative(2.36f, 2.36f)
                lineToRelative(2.49f, -2.49f)
                curveToRelative(0.65f, -0.65f, 0.65f, -1.71f, 0f, -2.36f)
                curveToRelative(-0.65f, -0.65f, -1.71f, -0.65f, -2.36f, 0f)
                lineToRelative(-2.49f, 2.49f)
                close()
                moveTo(11.53f, 10.11f)
                lineToRelative(2.36f, 2.36f)
                lineToRelative(3.72f, -3.72f)
                lineToRelative(-2.36f, -2.36f)
                lineToRelative(-3.72f, 3.72f)
                close()
            }
        }.also { _PenSlash = it}
