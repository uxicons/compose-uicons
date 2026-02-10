package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tickets: ImageVector? = null

val Icons.Sr.Tickets: ImageVector
    get() = _Tickets ?: UXIcon(name = "Tickets") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 24f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(3.87f, 0f, 7f, -3.13f, 7f, -7f)
                lineTo(21f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 4.97f, -4.03f, 9f, -9f, 9f)
                close()
                moveTo(14f, 0f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-0.46f, 0f, -0.83f, 0.37f, -0.83f, 0.83f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 1.49f, -1.0f, 2.87f, -2.46f, 3.12f)
                curveToRelative(-1.89f, 0.33f, -3.54f, -1.12f, -3.54f, -2.95f)
                curveToRelative(0f, 0f, 0f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveTo(3.24f, 0f, 1f, 2.24f, 1f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(0.17f)
                curveToRelative(0.46f, 0f, 0.83f, -0.37f, 0.83f, -0.83f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.49f, 1.0f, -2.87f, 2.46f, -3.12f)
                curveToRelative(1.89f, -0.33f, 3.54f, 1.12f, 3.54f, 2.95f)
                curveToRelative(0f, 0f, 0f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(19f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _Tickets = it}
