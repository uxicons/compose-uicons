package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SessionTimeout: ImageVector? = null

val Icons.Ss.SessionTimeout: ImageVector
    get() = _SessionTimeout ?: UXIcon(name = "SessionTimeout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 0f)
                curveToRelative(-6.08f, 0f, -11f, 4.92f, -11f, 11f)
                curveToRelative(0f, 5.38f, 3.86f, 9.85f, 8.96f, 10.8f)
                lineToRelative(6.89f, -11.8f)
                horizontalLineToRelative(2.3f)
                lineToRelative(3.02f, 5.18f)
                curveToRelative(0.53f, -1.29f, 0.83f, -2.7f, 0.83f, -4.18f)
                curveToRelative(0f, -6.08f, -4.92f, -11f, -11f, -11f)
                close()
                moveTo(12f, 12f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 12f)
                lineTo(10f, 24f)
                horizontalLineToRelative(14f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _SessionTimeout = it}
