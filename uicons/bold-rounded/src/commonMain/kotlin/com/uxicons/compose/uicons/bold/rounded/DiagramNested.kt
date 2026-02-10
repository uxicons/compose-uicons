package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramNested: ImageVector? = null

val Icons.Br.DiagramNested: ImageVector
    get() = _DiagramNested ?: UXIcon(name = "DiagramNested") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 13f)
            horizontalLineToRelative(-2f)
            curveToRelative(-2.31f, 0f, -4.2f, 1.76f, -4.45f, 4f)
            horizontalLineToRelative(-3.55f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-3.55f)
            curveToRelative(2.24f, -0.25f, 4f, -2.14f, 4f, -4.45f)
            verticalLineToRelative(-2f)
            curveTo(11f, 2.02f, 8.98f, 0f, 6.5f, 0f)
            horizontalLineToRelative(-2f)
            curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.31f, 1.76f, 4.2f, 4f, 4.45f)
            verticalLineToRelative(3.55f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(3.55f)
            curveToRelative(0.25f, 2.24f, 2.14f, 4f, 4.45f, 4f)
            horizontalLineToRelative(2f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(3f, 6.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(21f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            close()
        }
    }.also { _DiagramNested = it }
