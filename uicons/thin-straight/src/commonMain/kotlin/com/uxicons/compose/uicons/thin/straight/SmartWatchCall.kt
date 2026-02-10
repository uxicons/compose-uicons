package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartWatchCall: ImageVector? = null

val Icons.Ts.SmartWatchCall: ImageVector
    get() = _SmartWatchCall ?: UXIcon(name = "SmartWatchCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 3.05f)
                verticalLineToRelative(-3.05f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3f)
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
                verticalLineToRelative(-3.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(19f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(15.51f, 5.79f)
                lineTo(12.31f, 8.99f)
                lineTo(14.06f, 10.73f)
                curveToRelative(-0.71f, 1.58f, -1.8f, 2.67f, -3.33f, 3.33f)
                lineToRelative(-1.75f, -1.75f)
                lineToRelative(-3.19f, 3.19f)
                lineToRelative(1.62f, 1.62f)
                curveToRelative(0.56f, 0.56f, 1.33f, 0.88f, 2.15f, 0.88f)
                curveToRelative(3.71f, 0f, 8.44f, -4.73f, 8.44f, -8.44f)
                curveToRelative(0f, -0.82f, -0.31f, -1.58f, -0.88f, -2.15f)
                close()
                moveTo(9.56f, 17f)
                curveToRelative(-0.55f, 0f, -1.06f, -0.21f, -1.44f, -0.58f)
                lineToRelative(-0.91f, -0.91f)
                lineToRelative(1.78f, -1.78f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(2.26f, -0.77f, 3.91f, -2.42f, 4.75f, -4.74f)
                lineToRelative(-1.51f, -1.51f)
                lineToRelative(1.78f, -1.78f)
                lineToRelative(0.91f, 0.91f)
                curveToRelative(0.38f, 0.38f, 0.58f, 0.89f, 0.58f, 1.44f)
                curveToRelative(0f, 3.2f, -4.24f, 7.44f, -7.44f, 7.44f)
                close()
            }
        }.also { _SmartWatchCall = it}
