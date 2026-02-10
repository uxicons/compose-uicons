package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookmarkSlash: ImageVector? = null

val Icons.Br.BookmarkSlash: ImageVector
    get() = _BookmarkSlash ?: UXIcon(name = "BookmarkSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 21.44f)
            lineToRelative(-2.56f, -2.56f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            lineTo(7.5f, 1f)
            curveToRelative(-1.18f, 0f, -2.29f, 0.46f, -3.12f, 1.26f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            reflectiveCurveTo(-0.15f, 1.98f, 0.44f, 2.56f)
            lineToRelative(21f, 21f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
            moveTo(7.5f, 4f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(10.38f)
            lineTo(6.5f, 4.38f)
            curveToRelative(0.27f, -0.24f, 0.62f, -0.38f, 1.0f, -0.38f)
            close()
            moveTo(11.61f, 18.51f)
            lineToRelative(-3.18f, 3.51f)
            curveToRelative(-0.62f, 0.66f, -1.45f, 1.01f, -2.3f, 1.01f)
            curveToRelative(-0.39f, 0f, -0.78f, -0.07f, -1.16f, -0.22f)
            curveToRelative(-1.2f, -0.48f, -1.98f, -1.62f, -1.98f, -2.91f)
            verticalLineToRelative(-8.39f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(8.39f)
            curveToRelative(0f, 0.04f, 0f, 0.09f, 0.09f, 0.12f)
            curveToRelative(0.09f, 0.04f, 0.12f, -0.0f, 0.15f, -0.03f)
            lineToRelative(3.16f, -3.49f)
            curveToRelative(0.56f, -0.61f, 1.5f, -0.66f, 2.12f, -0.1f)
            curveToRelative(0.61f, 0.56f, 0.66f, 1.5f, 0.11f, 2.12f)
            close()
        }
    }.also { _BookmarkSlash = it }
