package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sink: ImageVector? = null

val Icons.Br.Sink: ImageVector
    get() = _Sink ?: UXIcon(name = "Sink") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.5f, 13f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-3.5f)
            lineTo(13.5f, 4.75f)
            curveToRelative(0f, -0.96f, 0.79f, -1.75f, 1.75f, -1.75f)
            curveToRelative(0.87f, 0f, 1.75f, 0.46f, 1.75f, 1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -2.56f, -2.04f, -4.5f, -4.75f, -4.5f)
            curveToRelative(-2.62f, 0f, -4.75f, 2.13f, -4.75f, 4.75f)
            verticalLineToRelative(8.25f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
            horizontalLineToRelative(9f)
            curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(16.5f, 21f)
            lineTo(7.5f, 21f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(17f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            close()
        }
    }.also { _Sink = it }
