package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stage: ImageVector? = null

val Icons.Br.Stage: ImageVector
    get() = _Stage ?: UXIcon(name = "Stage") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 21f)
            horizontalLineToRelative(-3.88f)
            lineToRelative(-5.12f, -5.12f)
            lineTo(13.5f, 7.62f)
            lineToRelative(1.73f, -1.73f)
            curveToRelative(0.25f, 0.07f, 0.5f, 0.11f, 0.77f, 0.11f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
            curveToRelative(0f, 0.27f, 0.05f, 0.52f, 0.11f, 0.77f)
            lineToRelative(-4.67f, 4.67f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            curveToRelative(0.36f, 0f, 0.71f, -0.14f, 1f, -0.4f)
            verticalLineToRelative(5.28f)
            lineToRelative(-5.12f, 5.12f)
            lineTo(1.5f, 21.0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(12f, 18.62f)
            lineToRelative(2.38f, 2.38f)
            horizontalLineToRelative(-4.76f)
            lineToRelative(2.38f, -2.38f)
            close()
        }
    }.also { _Stage = it }
