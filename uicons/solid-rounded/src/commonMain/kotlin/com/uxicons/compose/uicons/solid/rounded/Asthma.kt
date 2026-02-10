package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Asthma: ImageVector? = null

val Icons.Sr.Asthma: ImageVector
    get() = _Asthma ?: UXIcon(name = "Asthma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 13f)
                curveToRelative(0f, 0.97f, -0.7f, 2f, -2f, 2f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-0.22f, 1.66f)
                curveToRelative(-0.33f, 2.49f, -2.45f, 4.34f, -4.96f, 4.34f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-21.95f)
                curveToRelative(0f, -0.5f, 0.37f, -0.94f, 0.86f, -0.99f)
                curveToRelative(3.89f, -0.4f, 7.58f, 1.22f, 9.94f, 4.36f)
                curveToRelative(1.27f, 1.57f, 4.2f, 7.16f, 4.2f, 8.58f)
                close()
                moveTo(23.72f, 12f)
                lineTo(23.97f, 10.8f)
                curveToRelative(0.19f, -0.91f, -0.51f, -1.8f, -1.44f, -1.8f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-2f, 0f, -2.11f, 1.5f, -2.11f, 1.5f)
                lineToRelative(-0.31f, 1.5f)
                horizontalLineToRelative(6.14f)
                close()
                moveTo(17.16f, 14f)
                lineTo(16.34f, 18f)
                horizontalLineToRelative(-0.34f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2.96f)
                curveToRelative(1.42f, 0f, 2.64f, -0.99f, 2.94f, -2.38f)
                lineToRelative(1.4f, -6.62f)
                horizontalLineToRelative(-6.13f)
                close()
            }
        }.also { _Asthma = it}
