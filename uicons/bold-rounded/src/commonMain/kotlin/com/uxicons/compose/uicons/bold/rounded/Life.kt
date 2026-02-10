package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Br.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7f, 2.75f)
            curveToRelative(0f, -1.52f, 1.12f, -2.75f, 2.5f, -2.75f)
            reflectiveCurveToRelative(2.5f, 1.23f, 2.5f, 2.75f)
            curveToRelative(0f, -1.52f, 1.12f, -2.75f, 2.5f, -2.75f)
            reflectiveCurveToRelative(2.5f, 1.23f, 2.5f, 2.75f)
            curveToRelative(0f, 2.05f, -2.57f, 4.68f, -4.03f, 5.88f)
            curveToRelative(-0.59f, 0.49f, -1.43f, 0.49f, -2.02f, 0f)
            curveToRelative(-1.46f, -1.2f, -3.95f, -3.84f, -3.95f, -5.88f)
            close()
            moveTo(12f, 11f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(22.6f, 11.48f)
            curveToRelative(-0.56f, -0.61f, -1.51f, -0.65f, -2.12f, -0.08f)
            lineToRelative(-6.07f, 5.6f)
            horizontalLineToRelative(-4.83f)
            lineToRelative(-6.07f, -5.6f)
            curveToRelative(-0.61f, -0.56f, -1.56f, -0.53f, -2.12f, 0.08f)
            curveToRelative(-0.56f, 0.61f, -0.52f, 1.56f, 0.09f, 2.12f)
            lineToRelative(6.5f, 6f)
            curveToRelative(0.01f, 0.01f, 0.01f, 0.01f, 0.02f, 0.01f)
            verticalLineToRelative(2.89f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.89f)
            curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.02f, -0.01f)
            lineToRelative(6.5f, -6f)
            curveToRelative(0.61f, -0.56f, 0.65f, -1.51f, 0.09f, -2.12f)
            close()
        }
    }.also { _Life = it }
