package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheeseAlt: ImageVector? = null

val Icons.Sr.CheeseAlt: ImageVector
    get() = _CheeseAlt ?: UXIcon(name = "CheeseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.51f)
                curveToRelative(0f, -0.51f, -0.07f, -1.02f, -0.2f, -1.51f)
                lineTo(2.67f, 10f)
                curveToRelative(-0.78f, 0f, -1.46f, 0.45f, -1.79f, 1.13f)
                curveTo(0.44f, 12.37f, 0f, 14.07f, 0f, 16f)
                curveToRelative(0f, 2.3f, 0.62f, 4.28f, 1.14f, 5.54f)
                curveToRelative(0.62f, 1.49f, 2.07f, 2.46f, 3.69f, 2.46f)
                horizontalLineToRelative(13.96f)
                curveToRelative(2.96f, 0f, 5.2f, -2.24f, 5.2f, -5f)
                verticalLineToRelative(-7.49f)
                close()
                moveTo(22.85f, 8f)
                lineTo(2.67f, 8f)
                curveToRelative(-0.18f, 0f, -0.36f, 0.02f, -0.53f, 0.04f)
                curveToRelative(1f, -1.98f, 2.81f, -4.77f, 5.9f, -7.08f)
                curveToRelative(1.66f, -1.24f, 3.95f, -1.28f, 5.71f, -0.11f)
                lineToRelative(4.2f, 3.13f)
                lineToRelative(3.64f, 2.72f)
                curveToRelative(0.49f, 0.37f, 0.91f, 0.81f, 1.26f, 1.3f)
                close()
            }
        }.also { _CheeseAlt = it}
