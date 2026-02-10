package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCheck: ImageVector? = null

val Icons.Br.TrashCheck: ImageVector
    get() = _TrashCheck ?: UXIcon(name = "TrashCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.64f, 11.03f)
            curveToRelative(0.57f, 0.6f, 0.54f, 1.55f, -0.06f, 2.12f)
            lineToRelative(-3.05f, 2.87f)
            curveToRelative(-0.66f, 0.65f, -1.54f, 0.98f, -2.42f, 0.98f)
            reflectiveCurveToRelative(-1.78f, -0.33f, -2.46f, -0.99f)
            lineToRelative(-1.17f, -1.02f)
            curveToRelative(-0.62f, -0.55f, -0.68f, -1.5f, -0.14f, -2.12f)
            curveToRelative(0.55f, -0.62f, 1.49f, -0.68f, 2.12f, -0.14f)
            lineToRelative(1.23f, 1.08f)
            curveToRelative(0.25f, 0.24f, 0.56f, 0.24f, 0.76f, 0.05f)
            lineToRelative(3.07f, -2.89f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.54f, 2.12f, 0.06f)
            close()
            moveTo(24.06f, 4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.62f)
            lineToRelative(-1.08f, 12.96f)
            curveToRelative(-0.24f, 2.83f, -2.64f, 5.04f, -5.48f, 5.04f)
            horizontalLineToRelative(-6.64f)
            curveToRelative(-2.84f, 0f, -5.25f, -2.21f, -5.48f, -5.04f)
            lineToRelative(-1.08f, -12.96f)
            horizontalLineToRelative(-0.62f)
            curveTo(0.73f, 6f, 0.06f, 5.33f, 0.06f, 4.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.76f)
            curveToRelative(0.62f, -1.75f, 2.29f, -3f, 4.24f, -3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.96f, 0f, 3.62f, 1.25f, 4.24f, 3f)
            horizontalLineToRelative(4.76f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(18.93f, 6f)
            lineTo(5.19f, 6f)
            lineToRelative(1.06f, 12.71f)
            curveToRelative(0.11f, 1.29f, 1.2f, 2.29f, 2.49f, 2.29f)
            horizontalLineToRelative(6.64f)
            curveToRelative(1.29f, 0f, 2.38f, -1.01f, 2.49f, -2.29f)
            lineToRelative(1.06f, -12.71f)
            close()
        }
    }.also { _TrashCheck = it }
