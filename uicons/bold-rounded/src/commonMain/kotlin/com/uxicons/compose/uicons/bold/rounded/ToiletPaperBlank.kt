package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Br.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 0f)
            lineTo(7.5f, 0f)
            curveTo(4.42f, 0f, 2f, 3.51f, 2f, 8f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.46f, -0.44f, 0.63f, -0.66f, 0.78f)
            curveToRelative(-0.83f, 0.59f, -1.34f, 1.54f, -1.34f, 2.56f)
            curveToRelative(0f, 1.74f, 1.42f, 3.15f, 3.15f, 3.15f)
            lineTo(13.5f, 24.0f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(1f)
            curveToRelative(2.21f, 0f, 4f, -3.58f, 4f, -8f)
            reflectiveCurveTo(22.21f, 0f, 20f, 0f)
            close()
            moveTo(16f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(3.15f, 21f)
            curveToRelative(-0.09f, 0f, -0.15f, -0.07f, -0.15f, -0.15f)
            curveToRelative(0f, -0.07f, 0.09f, -0.13f, 0.17f, -0.17f)
            curveToRelative(1.47f, -0.59f, 1.97f, -2.08f, 1.83f, -3.28f)
            lineTo(5f, 8f)
            curveToRelative(0f, -2.86f, 1.32f, -5f, 2.5f, -5f)
            horizontalLineToRelative(9.38f)
            curveToRelative(-0.55f, 1.37f, -0.88f, 3.11f, -0.88f, 5f)
            verticalLineToRelative(10.5f)
            close()
            moveTo(20f, 11.5f)
            curveToRelative(-0.55f, 0f, -1f, -1.57f, -1f, -3.5f)
            reflectiveCurveToRelative(0.45f, -3.5f, 1f, -3.5f)
            reflectiveCurveToRelative(1f, 1.57f, 1f, 3.5f)
            reflectiveCurveToRelative(-0.45f, 3.5f, -1f, 3.5f)
            close()
        }
    }.also { _ToiletPaperBlank = it }
