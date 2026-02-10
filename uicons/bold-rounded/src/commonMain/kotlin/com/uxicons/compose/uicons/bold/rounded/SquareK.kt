package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareK: ImageVector? = null

val Icons.Br.SquareK: ImageVector
    get() = _SquareK ?: UXIcon(name = "SquareK") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(17.75f, 16.67f)
            curveToRelative(0.46f, 0.69f, 0.27f, 1.62f, -0.42f, 2.08f)
            curveToRelative(-0.26f, 0.17f, -0.55f, 0.25f, -0.83f, 0.25f)
            curveToRelative(-0.48f, 0f, -0.96f, -0.23f, -1.25f, -0.67f)
            lineToRelative(-3.56f, -5.33f)
            horizontalLineToRelative(-2.7f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(6f, 6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(2.78f)
            lineToRelative(3.55f, -4.44f)
            curveToRelative(0.52f, -0.65f, 1.46f, -0.75f, 2.11f, -0.23f)
            curveToRelative(0.65f, 0.52f, 0.75f, 1.46f, 0.23f, 2.11f)
            lineToRelative(-3.31f, 4.14f)
            lineToRelative(3.39f, 5.09f)
            close()
        }
    }.also { _SquareK = it }
