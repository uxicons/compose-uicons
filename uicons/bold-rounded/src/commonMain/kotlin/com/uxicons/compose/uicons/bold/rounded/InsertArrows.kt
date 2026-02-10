package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertArrows: ImageVector? = null

val Icons.Br.InsertArrows: ImageVector
    get() = _InsertArrows ?: UXIcon(name = "InsertArrows") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 13.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(5.11f, 7.79f)
            curveToRelative(0.57f, 0.64f, 0.89f, 1.47f, 0.89f, 2.33f)
            verticalLineToRelative(4.88f)
            horizontalLineToRelative(-1.22f)
            curveToRelative(-0.78f, 0f, -1.17f, 0.94f, -0.62f, 1.49f)
            lineToRelative(2.76f, 2.76f)
            curveToRelative(0.34f, 0.34f, 0.89f, 0.34f, 1.23f, 0f)
            lineToRelative(2.76f, -2.76f)
            curveToRelative(0.55f, -0.55f, 0.16f, -1.49f, -0.62f, -1.49f)
            horizontalLineToRelative(-1.29f)
            verticalLineToRelative(-4.88f)
            curveToRelative(0f, -1.6f, -0.59f, -3.14f, -1.65f, -4.33f)
            lineTo(2.62f, 0.5f)
            curveTo(2.07f, -0.12f, 1.12f, -0.17f, 0.5f, 0.38f)
            curveTo(-0.12f, 0.93f, -0.17f, 1.88f, 0.38f, 2.5f)
            lineToRelative(4.73f, 5.29f)
            close()
            moveTo(15.92f, 19.25f)
            curveToRelative(0.34f, 0.34f, 0.89f, 0.34f, 1.23f, 0f)
            lineToRelative(2.76f, -2.76f)
            curveToRelative(0.55f, -0.55f, 0.16f, -1.49f, -0.62f, -1.49f)
            horizontalLineToRelative(-1.29f)
            verticalLineToRelative(-4.88f)
            curveToRelative(0f, -0.86f, 0.32f, -1.69f, 0.89f, -2.33f)
            lineToRelative(4.73f, -5.29f)
            curveToRelative(0.55f, -0.62f, 0.5f, -1.57f, -0.12f, -2.12f)
            curveToRelative(-0.62f, -0.55f, -1.57f, -0.5f, -2.12f, 0.12f)
            lineToRelative(-4.73f, 5.29f)
            curveToRelative(-1.06f, 1.19f, -1.65f, 2.73f, -1.65f, 4.33f)
            verticalLineToRelative(4.88f)
            horizontalLineToRelative(-1.22f)
            curveToRelative(-0.78f, 0f, -1.17f, 0.94f, -0.62f, 1.49f)
            lineToRelative(2.76f, 2.76f)
            close()
        }
    }.also { _InsertArrows = it }
