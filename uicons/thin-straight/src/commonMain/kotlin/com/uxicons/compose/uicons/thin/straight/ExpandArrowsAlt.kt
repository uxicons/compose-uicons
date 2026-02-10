package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrowsAlt: ImageVector? = null

val Icons.Ts.ExpandArrowsAlt: ImageVector
    get() = _ExpandArrowsAlt ?: UXIcon(name = "ExpandArrowsAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4.71f)
                lineToRelative(4f, 4f)
                lineTo(24f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.21f)
                lineToRelative(4f, 4f)
                lineToRelative(-7.29f, 7.29f)
                lineTo(4.71f, 4f)
                lineTo(8.71f, 0f)
                lineTo(1.5f, 0f)
                curveTo(0.67f, 0f, 0f, 0.67f, 0f, 1.5f)
                verticalLineToRelative(7.21f)
                lineTo(4f, 4.71f)
                lineToRelative(7.29f, 7.29f)
                lineToRelative(-7.29f, 7.29f)
                lineTo(0f, 15.29f)
                verticalLineToRelative(7.21f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.21f)
                lineToRelative(-4f, -4f)
                lineToRelative(7.29f, -7.29f)
                lineToRelative(7.29f, 7.29f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(7.21f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.21f)
                lineToRelative(-4f, 4f)
                lineToRelative(-7.29f, -7.29f)
                lineToRelative(7.29f, -7.29f)
                close()
                moveTo(22.5f, 1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineTo(23f, 6.29f)
                lineTo(17.71f, 1f)
                horizontalLineToRelative(4.79f)
                close()
                moveTo(1f, 1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(6.29f, 1f)
                lineTo(1f, 6.29f)
                lineTo(1f, 1.5f)
                close()
                moveTo(1.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-4.79f)
                lineToRelative(5.29f, 5.29f)
                lineTo(1.5f, 23f)
                close()
                moveTo(23f, 22.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4.79f)
                lineToRelative(5.29f, -5.29f)
                verticalLineToRelative(4.79f)
                close()
            }
        }.also { _ExpandArrowsAlt = it}
