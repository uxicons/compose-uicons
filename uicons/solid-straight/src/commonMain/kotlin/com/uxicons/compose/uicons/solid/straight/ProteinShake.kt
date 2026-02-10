package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProteinShake: ImageVector? = null

val Icons.Ss.ProteinShake: ImageVector
    get() = _ProteinShake ?: UXIcon(name = "ProteinShake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.13f, 6f)
                lineToRelative(0.94f, -2.18f)
                curveToRelative(0.47f, -1.1f, 1.56f, -1.82f, 2.76f, -1.82f)
                horizontalLineToRelative(0.18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.18f)
                curveToRelative(1.2f, 0f, 2.28f, 0.71f, 2.76f, 1.82f)
                lineToRelative(0.94f, 2.18f)
                close()
                moveTo(4.0f, 8f)
                lineTo(4.2f, 11f)
                horizontalLineToRelative(4.8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.67f)
                lineToRelative(0.13f, 2f)
                horizontalLineToRelative(4.53f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.4f)
                lineToRelative(0.13f, 2f)
                horizontalLineToRelative(4.27f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.14f)
                lineToRelative(0.2f, 3f)
                horizontalLineToRelative(13.87f)
                lineToRelative(1.06f, -16f)
                horizontalLineToRelative(-16.0f)
                close()
            }
        }.also { _ProteinShake = it}
