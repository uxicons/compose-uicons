package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardDiamond: ImageVector? = null

val Icons.Br.CardDiamond: ImageVector
    get() = _CardDiamond ?: UXIcon(name = "CardDiamond") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.5f, 0f)
            horizontalLineToRelative(-7f)
            curveTo(5.47f, 0f, 3f, 2.47f, 3f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(18f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(6f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(15f, 11.29f)
            curveToRelative(0.3f, 0.43f, 0.3f, 1.0f, 0f, 1.43f)
            lineToRelative(-2.38f, 3.4f)
            curveToRelative(-0.3f, 0.43f, -0.94f, 0.43f, -1.25f, 0f)
            lineToRelative(-2.38f, -3.4f)
            curveToRelative(-0.3f, -0.43f, -0.3f, -1.0f, 0f, -1.43f)
            lineToRelative(2.38f, -3.4f)
            curveToRelative(0.3f, -0.43f, 0.94f, -0.43f, 1.25f, 0f)
            lineToRelative(2.38f, 3.4f)
            close()
        }
    }.also { _CardDiamond = it }
