package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Piano: ImageVector? = null

val Icons.Ts.Piano: ImageVector
    get() = _Piano ?: UXIcon(name = "Piano") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.72f, 9.91f)
                curveToRelative(-1.38f, 0f, -2.6f, -0.98f, -2.9f, -2.33f)
                lineToRelative(-0.24f, -1.09f)
                curveTo(15.73f, 2.67f, 12.41f, 0f, 8.5f, 0f)
                curveTo(3.81f, 0f, 0f, 3.81f, 0f, 8.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-9.81f)
                curveToRelative(0f, -2.36f, -1.92f, -4.28f, -4.28f, -4.28f)
                close()
                moveTo(1f, 8.5f)
                curveTo(1f, 4.36f, 4.36f, 1f, 8.5f, 1f)
                curveToRelative(3.44f, 0f, 6.36f, 2.35f, 7.1f, 5.7f)
                lineToRelative(0.24f, 1.09f)
                curveToRelative(0.4f, 1.8f, 2.03f, 3.12f, 3.88f, 3.12f)
                curveToRelative(1.81f, 0f, 3.28f, 1.47f, 3.28f, 3.28f)
                verticalLineToRelative(1.81f)
                lineTo(1f, 16f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                lineTo(1f, 23f)
                close()
            }
        }.also { _Piano = it}
