package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SdCards: ImageVector? = null

val Icons.Br.SdCards: ImageVector
    get() = _SdCards ?: UXIcon(name = "SdCards") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 0f)
            horizontalLineToRelative(-4.76f)
            curveToRelative(-1.2f, 0f, -2.33f, 0.47f, -3.18f, 1.32f)
            lineToRelative(-2.24f, 2.24f)
            curveToRelative(-0.84f, 0.84f, -1.32f, 2.0f, -1.32f, 3.18f)
            verticalLineToRelative(7.76f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            lineTo(22f, 4.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(19f, 14.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-7.76f)
            curveToRelative(0f, -0.4f, 0.16f, -0.78f, 0.44f, -1.06f)
            lineToRelative(2.24f, -2.24f)
            curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
            horizontalLineToRelative(4.76f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(10f)
            close()
            moveTo(16f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-5.25f, 0f, -9.5f, -4.25f, -9.5f, -9.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(17f, 6f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            close()
            moveTo(14f, 6f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            close()
        }
    }.also { _SdCards = it }
