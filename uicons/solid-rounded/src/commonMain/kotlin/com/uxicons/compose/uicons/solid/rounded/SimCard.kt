package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCard: ImageVector? = null

val Icons.Sr.SimCard: ImageVector
    get() = _SimCard ?: UXIcon(name = "SimCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.46f, 4.12f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.94f, -0.94f, -2.21f, -1.46f, -3.54f, -1.46f)
                horizontalLineToRelative(-5.34f)
                curveTo(5.16f, 0f, 2.92f, 2.24f, 2.92f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(20.92f, 7.66f)
                curveToRelative(0f, -1.33f, -0.53f, -2.6f, -1.46f, -3.54f)
                close()
                moveTo(10f, 12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                close()
                moveTo(12f, 20f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
                moveTo(14f, 20f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                close()
                moveTo(12f, 15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _SimCard = it}
