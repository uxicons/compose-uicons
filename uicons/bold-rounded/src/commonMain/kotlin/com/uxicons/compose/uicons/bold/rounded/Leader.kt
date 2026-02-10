package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leader: ImageVector? = null

val Icons.Br.Leader: ImageVector
    get() = _Leader ?: UXIcon(name = "Leader") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(22f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(3.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(-12.38f)
            lineTo(1.58f, 3.69f)
            curveToRelative(-0.66f, -0.51f, -0.78f, -1.45f, -0.27f, -2.1f)
            curveToRelative(0.51f, -0.66f, 1.45f, -0.78f, 2.1f, -0.27f)
            lineToRelative(6.09f, 4.69f)
            horizontalLineToRelative(3.49f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.47f, -0.81f, 2.75f, -2f, 3.44f)
            verticalLineToRelative(4.56f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(13f, 9f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            close()
            moveTo(11f, 21f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(4f)
            close()
        }
    }.also { _Leader = it }
