package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Review: ImageVector? = null

val Icons.Rs.Review: ImageVector
    get() = _Review ?: UXIcon(name = "Review") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(24f, 17f)
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
                horizontalLineToRelative(4.17f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Review = it}
