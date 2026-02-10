package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notes: ImageVector? = null

val Icons.Br.Notes: ImageVector
    get() = _Notes ?: UXIcon(name = "Notes") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 0f)
            horizontalLineToRelative(-10f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 2.52f, 2.06f, 4.5f, 4.69f, 4.5f)
            horizontalLineToRelative(7.57f)
            curveToRelative(1.19f, 0f, 2.34f, -0.48f, 3.18f, -1.32f)
            lineToRelative(2.24f, -2.24f)
            curveToRelative(0.84f, -0.84f, 1.32f, -2.0f, 1.32f, -3.18f)
            verticalLineToRelative(-7.76f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(8f, 14.5f)
            lineTo(8f, 4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(10f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(6.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-6.31f)
            curveToRelative(-0.98f, 0f, -1.69f, -0.63f, -1.69f, -1.5f)
            close()
            moveTo(17f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6.0f)
            curveTo(4.33f, 24f, 0.07f, 19.8f, 0f, 14.63f)
            verticalLineToRelative(-6.11f)
            curveToRelative(-0.01f, -0.83f, 0.65f, -1.51f, 1.48f, -1.52f)
            curveToRelative(0.87f, 0.02f, 1.51f, 0.67f, 1.52f, 1.5f)
            verticalLineToRelative(6.09f)
            curveToRelative(0.05f, 3.54f, 2.96f, 6.41f, 6.5f, 6.41f)
            horizontalLineToRelative(6.0f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _Notes = it }
