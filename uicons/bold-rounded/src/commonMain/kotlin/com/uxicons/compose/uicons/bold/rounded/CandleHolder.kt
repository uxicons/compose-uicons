package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleHolder: ImageVector? = null

val Icons.Br.CandleHolder: ImageVector
    get() = _CandleHolder ?: UXIcon(name = "CandleHolder") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5.59f, 3.59f)
            curveToRelative(0f, -0.66f, 0.59f, -1.84f, 1.19f, -2.88f)
            curveToRelative(0.55f, -0.95f, 1.91f, -0.95f, 2.45f, 0f)
            curveToRelative(0.6f, 1.03f, 1.19f, 2.22f, 1.19f, 2.88f)
            curveToRelative(0f, 1.33f, -1.08f, 2.41f, -2.41f, 2.41f)
            reflectiveCurveToRelative(-2.41f, -1.08f, -2.41f, -2.41f)
            close()
            moveTo(24f, 19.5f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            lineTo(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(3f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            verticalLineToRelative(9.5f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-0.37f, 0f, -0.72f, 0.14f, -1f, 0.38f)
            curveToRelative(-0.62f, 0.55f, -1.57f, 0.5f, -2.12f, -0.12f)
            curveToRelative(-0.55f, -0.62f, -0.5f, -1.56f, 0.12f, -2.12f)
            curveToRelative(0.83f, -0.74f, 1.89f, -1.15f, 3f, -1.15f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            close()
            moveTo(5f, 21f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(9.5f)
            close()
        }
    }.also { _CandleHolder = it }
