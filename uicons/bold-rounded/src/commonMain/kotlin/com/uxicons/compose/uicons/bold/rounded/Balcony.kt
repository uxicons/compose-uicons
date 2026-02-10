package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balcony: ImageVector? = null

val Icons.Br.Balcony: ImageVector
    get() = _Balcony ?: UXIcon(name = "Balcony") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 10f)
            horizontalLineToRelative(-1.5f)
            lineTo(19f, 4.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(15f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(8f, 13f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-2.5f)
            lineTo(8f, 13f)
            close()
            moveTo(13.5f, 13f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-2.5f)
            lineTo(13.5f, 13f)
            close()
            moveTo(9.5f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            lineTo(8f, 10f)
            lineTo(8f, 4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(3f, 19.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(21f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            lineTo(19f, 13f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(6f)
            close()
        }
    }.also { _Balcony = it }
