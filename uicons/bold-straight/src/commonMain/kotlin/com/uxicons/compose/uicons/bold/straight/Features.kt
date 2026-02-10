package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Features: ImageVector? = null

val Icons.Bs.Features: ImageVector
    get() = _Features ?: UXIcon(name = "Features") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.92f)
                lineToRelative(-3.3f, 1.91f)
                lineToRelative(1.33f, 4.03f)
                lineToRelative(-0.75f, 0.52f)
                lineToRelative(-3.26f, -2.52f)
                lineToRelative(-3.27f, 2.53f)
                lineToRelative(-0.72f, -0.54f)
                lineToRelative(1.3f, -4.08f)
                lineToRelative(-3.32f, -1.85f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(4.35f)
                lineToRelative(1.18f, -4.5f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.18f, 4.5f)
                horizontalLineToRelative(4.33f)
                verticalLineToRelative(0.92f)
                close()
                moveTo(5f, 6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                close()
                moveTo(19f, 14.93f)
                curveToRelative(-0.33f, 0.04f, -0.66f, 0.07f, -1f, 0.07f)
                curveToRelative(-0.69f, 0f, -1.36f, -0.1f, -2f, -0.26f)
                verticalLineToRelative(3.26f)
                lineTo(5f, 18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.58f)
                curveToRelative(0.73f, -1.25f, 1.78f, -2.3f, 3.05f, -3f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(14.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.07f)
                close()
            }
        }.also { _Features = it}
