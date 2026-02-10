package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectGroup: ImageVector? = null

val Icons.Br.ObjectGroup: ImageVector
    get() = _ObjectGroup ?: UXIcon(name = "ObjectGroup") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 18.18f)
            lineTo(22f, 5.82f)
            curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
            lineTo(5.85f, 2f)
            curveTo(5.46f, 0.79f, 4.34f, -0.1f, 3f, -0.1f)
            curveTo(1.34f, -0.1f, 0f, 1.25f, 0f, 2.9f)
            curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
            verticalLineToRelative(12.46f)
            curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
            horizontalLineToRelative(12.37f)
            curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
            close()
            moveTo(18.78f, 19f)
            lineTo(5.22f, 19f)
            curveToRelative(-0.07f, -0.08f, -0.14f, -0.15f, -0.22f, -0.22f)
            lineTo(5f, 5.12f)
            curveToRelative(0.05f, -0.04f, 0.1f, -0.08f, 0.14f, -0.12f)
            horizontalLineToRelative(13.64f)
            curveToRelative(0.07f, 0.08f, 0.14f, 0.15f, 0.22f, 0.22f)
            verticalLineToRelative(13.56f)
            curveToRelative(-0.08f, 0.07f, -0.15f, 0.14f, -0.22f, 0.22f)
            close()
            moveTo(12f, 13f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
            moveTo(18f, 13f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
        }
    }.also { _ObjectGroup = it }
