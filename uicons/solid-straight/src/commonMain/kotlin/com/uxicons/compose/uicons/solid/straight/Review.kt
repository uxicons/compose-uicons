package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Review: ImageVector? = null

val Icons.Ss.Review: ImageVector
    get() = _Review ?: UXIcon(name = "Review") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(19.83f, 16f)
                horizontalLineToRelative(4.17f)
                verticalLineToRelative(1f)
                lineToRelative(-3.05f, 2.08f)
                lineToRelative(1.27f, 3.98f)
                lineToRelative(-0.82f, 0.57f)
                lineToRelative(-3.38f, -2.34f)
                lineToRelative(-3.33f, 2.34f)
                lineToRelative(-0.79f, -0.59f)
                lineToRelative(1.18f, -4.02f)
                lineToRelative(-3.08f, -2.02f)
                verticalLineToRelative(-1.01f)
                horizontalLineToRelative(4.2f)
                lineToRelative(1.28f, -4.36f)
                horizontalLineToRelative(1.06f)
                lineToRelative(1.28f, 4.36f)
                horizontalLineToRelative(0f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -1.46f, 0.39f, -2.82f, 1.07f, -4f)
                horizontalLineToRelative(-6.07f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(12.71f)
                curveToRelative(-1.66f, -1.47f, -2.71f, -3.61f, -2.71f, -6f)
                close()
            }
        }.also { _Review = it}
