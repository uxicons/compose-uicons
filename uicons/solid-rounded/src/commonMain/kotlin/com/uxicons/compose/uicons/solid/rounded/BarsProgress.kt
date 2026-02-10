package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsProgress: ImageVector? = null

val Icons.Sr.BarsProgress: ImageVector
    get() = _BarsProgress ?: UXIcon(name = "BarsProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 11f)
                lineTo(20f, 11f)
                curveToRelative(5.28f, -0.14f, 5.27f, -7.86f, 0f, -8f)
                lineTo(4f, 3f)
                curveToRelative(-5.28f, 0.14f, -5.27f, 7.86f, 0f, 8f)
                close()
                moveTo(22f, 7f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                lineTo(16f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(20f, 13f)
                lineTo(4f, 13f)
                curveToRelative(-5.28f, 0.14f, -5.27f, 7.86f, 0f, 8f)
                lineTo(20f, 21f)
                curveToRelative(5.28f, -0.14f, 5.27f, -7.86f, 0f, -8f)
                close()
                moveTo(20f, 19f)
                lineTo(10f, 19f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                curveToRelative(2.63f, 0.05f, 2.63f, 3.95f, 0f, 4f)
                close()
            }
        }.also { _BarsProgress = it}
