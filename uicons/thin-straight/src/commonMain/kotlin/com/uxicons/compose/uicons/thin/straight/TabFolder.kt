package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabFolder: ImageVector? = null

val Icons.Ts.TabFolder: ImageVector
    get() = _TabFolder ?: UXIcon(name = "TabFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 4f)
                horizontalLineToRelative(-1.15f)
                lineToRelative(-0.99f, -1.89f)
                curveToRelative(-0.34f, -0.68f, -1.03f, -1.11f, -1.79f, -1.11f)
                horizontalLineToRelative(-2.53f)
                lineToRelative(0.5f, 1f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.38f, 0f, 0.72f, 0.21f, 0.89f, 0.55f)
                lineToRelative(0.76f, 1.45f)
                horizontalLineToRelative(-4.87f)
                lineToRelative(-0.99f, -1.89f)
                curveToRelative(-0.34f, -0.68f, -1.03f, -1.11f, -1.79f, -1.11f)
                horizontalLineToRelative(-2.53f)
                lineToRelative(0.5f, 1f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.38f, 0f, 0.72f, 0.21f, 0.89f, 0.55f)
                lineToRelative(0.76f, 1.45f)
                horizontalLineToRelative(-4.92f)
                lineToRelative(-1.5f, -3f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.69f)
                lineToRelative(1.5f, 3f)
                horizontalLineToRelative(13.81f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 8f)
                lineTo(1f, 3.5f)
                close()
                moveTo(1f, 22f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(13f)
                lineTo(1f, 22f)
                close()
            }
        }.also { _TabFolder = it}
