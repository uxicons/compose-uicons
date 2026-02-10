package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchSmart: ImageVector? = null

val Icons.Ts.WatchSmart: ImageVector
    get() = _WatchSmart ?: UXIcon(name = "WatchSmart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 3.05f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                lineTo(7f, 3f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(3.05f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.04f)
                curveToRelative(1.1f, -0.21f, 1.83f, -1.1f, 1.83f, -2.31f)
                lineToRelative(0.17f, -13.15f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(18.83f, 18.64f)
                curveToRelative(0f, 0.84f, -0.51f, 1.36f, -1.33f, 1.36f)
                lineTo(6.5f, 20.0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(5f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.49f)
                lineToRelative(-0.17f, 13.15f)
                close()
                moveTo(12.5f, 11.79f)
                lineToRelative(2.85f, 2.85f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.15f, -3.15f)
                verticalLineToRelative(-5.21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.79f)
                close()
            }
        }.also { _WatchSmart = it}
