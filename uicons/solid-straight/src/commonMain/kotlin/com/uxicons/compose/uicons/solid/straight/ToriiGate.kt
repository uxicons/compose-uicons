package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToriiGate: ImageVector? = null

val Icons.Ss.ToriiGate: ImageVector
    get() = _ToriiGate ?: UXIcon(name = "ToriiGate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.17f, 2.97f)
                lineToRelative(0.83f, -1.75f)
                lineToRelative(-1.34f, -0.93f)
                lineToRelative(-0.31f, 0.26f)
                curveToRelative(-1.12f, 0.94f, -2.55f, 1.45f, -4.01f, 1.45f)
                lineTo(5.67f, 2.0f)
                curveToRelative(-1.46f, 0f, -2.89f, -0.52f, -4.01f, -1.45f)
                lineToRelative(-0.32f, -0.26f)
                lineToRelative(-1.34f, 0.93f)
                lineToRelative(0.83f, 1.75f)
                curveToRelative(0.66f, 1.53f, 1.78f, 2.72f, 3.17f, 3.4f)
                verticalLineToRelative(2.63f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.63f)
                curveToRelative(1.4f, -0.68f, 2.52f, -1.87f, 3.17f, -3.4f)
                close()
                moveTo(6f, 6.94f)
                curveToRelative(0.26f, 0.03f, 0.52f, 0.06f, 0.79f, 0.06f)
                horizontalLineToRelative(4.21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2.06f)
                close()
                moveTo(18f, 9f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.21f)
                curveToRelative(0.27f, 0f, 0.53f, -0.03f, 0.79f, -0.06f)
                verticalLineToRelative(2.06f)
                close()
            }
        }.also { _ToriiGate = it}
