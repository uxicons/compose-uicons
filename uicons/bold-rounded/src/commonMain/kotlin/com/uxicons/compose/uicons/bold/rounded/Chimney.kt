package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chimney: ImageVector? = null

val Icons.Br.Chimney: ImageVector
    get() = _Chimney ?: UXIcon(name = "Chimney") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 0f)
            lineTo(4.5f, 0f)
            curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.76f, 1.31f, 3.22f, 3f, 3.46f)
            verticalLineToRelative(9.54f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(9f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-9.54f)
            curveToRelative(1.69f, -0.24f, 3f, -1.7f, 3f, -3.46f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(3f, 4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            lineTo(3.5f, 7f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(18f, 14f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(4f)
            close()
            moveTo(6f, 14f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(6f, 19.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(16.5f, 21f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _Chimney = it }
