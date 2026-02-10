package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lift: ImageVector? = null

val Icons.Ts.Lift: ImageVector
    get() = _Lift ?: UXIcon(name = "Lift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 17.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(20f, 15.59f)
                lineTo(18.41f, 14f)
                horizontalLineToRelative(3.18f)
                close()
                moveTo(24.0f, 11f)
                lineTo(20f, 7.0f)
                lineTo(16.0f, 11f)
                close()
                moveTo(21.59f, 10f)
                horizontalLineToRelative(-3.18f)
                lineToRelative(1.59f, -1.59f)
                close()
                moveTo(18.99f, 18.82f)
                lineTo(17.99f, 17.82f)
                lineTo(18f, 23f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-22f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineToRelative(-0.01f, 3.66f)
                lineToRelative(1f, -1f)
                lineToRelative(0.01f, -2.66f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(19f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _Lift = it}
