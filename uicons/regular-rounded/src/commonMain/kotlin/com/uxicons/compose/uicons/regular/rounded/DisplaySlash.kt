package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplaySlash: ImageVector? = null

val Icons.Rr.DisplaySlash: ImageVector
    get() = _DisplaySlash ?: UXIcon(name = "DisplaySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 3f)
                curveToRelative(-0.19f, 0f, -0.37f, 0.01f, -0.55f, 0.03f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.47f, -3.47f)
                curveToRelative(2.16f, -0.56f, 3.76f, -2.5f, 3.76f, -4.83f)
                close()
                moveTo(22f, 14f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.03f, 0f, -0.05f, 0.01f, -0.07f, 0.01f)
                lineTo(6.41f, 5f)
                horizontalLineToRelative(12.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                close()
                moveTo(16.5f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.42f, 0.05f, -0.84f, 0.16f, -1.25f)
                curveToRelative(0.14f, -0.54f, 0.68f, -0.86f, 1.22f, -0.72f)
                curveToRelative(0.54f, 0.14f, 0.86f, 0.68f, 0.72f, 1.22f)
                curveToRelative(-0.06f, 0.24f, -0.1f, 0.5f, -0.1f, 0.75f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _DisplaySlash = it}
