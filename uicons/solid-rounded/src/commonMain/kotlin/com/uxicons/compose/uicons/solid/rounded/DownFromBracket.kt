package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownFromBracket: ImageVector? = null

val Icons.Sr.DownFromBracket: ImageVector
    get() = _DownFromBracket ?: UXIcon(name = "DownFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(14.82f, 22.86f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.02f, -0.02f)
                lineToRelative(6.33f, -6.72f)
                curveToRelative(0.87f, -0.87f, 1.12f, -2.11f, 0.65f, -3.25f)
                curveToRelative(-0.47f, -1.13f, -1.52f, -1.84f, -2.75f, -1.85f)
                horizontalLineToRelative(-2.07f)
                lineToRelative(-0.02f, -2.03f)
                curveToRelative(0f, -2.19f, -1.78f, -3.97f, -3.97f, -3.97f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-2.19f, 0f, -3.97f, 1.78f, -3.97f, 3.98f)
                lineToRelative(0.01f, 2.0f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-1.23f, 0.0f, -2.28f, 0.71f, -2.75f, 1.85f)
                curveToRelative(-0.47f, 1.13f, -0.22f, 2.38f, 0.63f, 3.22f)
                lineToRelative(6.33f, 6.8f)
                curveToRelative(0.78f, 0.77f, 1.79f, 1.16f, 2.81f, 1.16f)
                reflectiveCurveToRelative(2.03f, -0.39f, 2.81f, -1.16f)
                close()
                moveTo(14.11f, 22.16f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _DownFromBracket = it}
