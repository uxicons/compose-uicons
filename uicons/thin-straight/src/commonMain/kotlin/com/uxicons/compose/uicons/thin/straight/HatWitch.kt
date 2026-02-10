package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWitch: ImageVector? = null

val Icons.Ts.HatWitch: ImageVector
    get() = _HatWitch ?: UXIcon(name = "HatWitch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.36f, 23f)
                lineToRelative(-5.52f, -16.18f)
                lineToRelative(0.96f, -1.82f)
                horizontalLineToRelative(6.2f)
                verticalLineToRelative(-0.82f)
                lineTo(18.98f, 0f)
                horizontalLineToRelative(-6.18f)
                curveToRelative(-2.0f, 0f, -3.78f, 1.27f, -4.43f, 3.17f)
                lineTo(1.64f, 23f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.64f)
                close()
                moveTo(10f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(9f, 19f)
                verticalLineToRelative(4f)
                lineTo(2.7f, 23f)
                lineTo(9.32f, 3.49f)
                curveToRelative(0.51f, -1.49f, 1.91f, -2.49f, 3.48f, -2.49f)
                horizontalLineToRelative(5.81f)
                lineToRelative(3.6f, 3f)
                horizontalLineToRelative(-5.01f)
                lineToRelative(-1.45f, 2.73f)
                lineToRelative(5.55f, 16.27f)
                horizontalLineToRelative(-6.3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _HatWitch = it}
