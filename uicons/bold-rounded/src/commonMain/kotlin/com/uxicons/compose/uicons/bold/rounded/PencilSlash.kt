package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilSlash: ImageVector? = null

val Icons.Br.PencilSlash: ImageVector
    get() = _PencilSlash ?: UXIcon(name = "PencilSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.11f, 16.49f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(-3.78f, 3.78f)
            curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
            horizontalLineToRelative(-1.95f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.95f)
            curveToRelative(0f, -1.47f, 0.57f, -2.85f, 1.61f, -3.89f)
            lineToRelative(3.88f, -3.88f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            reflectiveCurveToRelative(0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(-3.5f, 3.5f)
            lineToRelative(1.48f, 1.48f)
            lineToRelative(3.4f, -3.4f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            reflectiveCurveTo(1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(7.64f, 7.64f)
            lineToRelative(6.89f, -6.89f)
            curveToRelative(0.76f, -0.77f, 1.78f, -1.19f, 2.86f, -1.19f)
            reflectiveCurveToRelative(2.1f, 0.42f, 2.86f, 1.19f)
            curveToRelative(1.58f, 1.58f, 1.58f, 4.15f, 0f, 5.72f)
            lineToRelative(-6.89f, 6.89f)
            lineToRelative(7.64f, 7.64f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(19.21f, 3.31f)
            lineToRelative(-1.75f, 1.75f)
            lineToRelative(1.48f, 1.48f)
            lineToRelative(1.75f, -1.75f)
            curveToRelative(0.41f, -0.41f, 0.41f, -1.07f, 0f, -1.48f)
            curveToRelative(-0.4f, -0.4f, -1.08f, -0.4f, -1.48f, 0f)
            close()
            moveTo(12.32f, 10.2f)
            lineToRelative(1.48f, 1.48f)
            lineToRelative(3.02f, -3.02f)
            lineToRelative(-1.48f, -1.48f)
            lineToRelative(-3.02f, 3.02f)
            close()
        }
    }.also { _PencilSlash = it }
