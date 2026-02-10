package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockBrick: ImageVector? = null

val Icons.Br.BlockBrick: ImageVector
    get() = _BlockBrick ?: UXIcon(name = "BlockBrick") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(9f, 14f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(3f, 14f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4f)
            lineTo(3f, 14f)
            close()
            moveTo(18f, 10f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-4f)
            close()
            moveTo(21f, 5.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-7.5f)
            lineTo(13.5f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(5f)
            lineTo(10.5f, 7f)
            lineTo(3f, 7f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(3f, 18.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(7.5f)
            verticalLineToRelative(4f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(18.5f, 21f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(7.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _BlockBrick = it }
