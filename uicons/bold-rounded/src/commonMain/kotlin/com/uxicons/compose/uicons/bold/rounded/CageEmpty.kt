package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CageEmpty: ImageVector? = null

val Icons.Br.CageEmpty: ImageVector
    get() = _CageEmpty ?: UXIcon(name = "CageEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.5f, 21f)
            horizontalLineToRelative(-0.5f)
            lineTo(21f, 11f)
            curveToRelative(0f, -4.5f, -3.32f, -8.22f, -7.63f, -8.88f)
            curveToRelative(0.09f, -0.19f, 0.14f, -0.4f, 0.14f, -0.61f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.22f, 0.05f, 0.43f, 0.14f, 0.61f)
            curveTo(6.32f, 2.78f, 3f, 6.5f, 3f, 11f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(21.5f, 24f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(12.98f, 10f)
            horizontalLineToRelative(-1.95f)
            curveToRelative(0.11f, -2.33f, 0.59f, -3.94f, 0.98f, -4.68f)
            curveToRelative(0.39f, 0.73f, 0.87f, 2.35f, 0.98f, 4.68f)
            close()
            moveTo(13f, 13f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-2f)
            lineTo(11f, 13f)
            horizontalLineToRelative(2f)
            close()
            moveTo(16f, 13f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-2f)
            lineTo(16f, 13f)
            close()
            moveTo(17.91f, 10f)
            horizontalLineToRelative(-1.93f)
            curveToRelative(-0.05f, -1.33f, -0.22f, -2.69f, -0.52f, -3.9f)
            curveToRelative(1.28f, 0.9f, 2.19f, 2.29f, 2.46f, 3.9f)
            close()
            moveTo(8.55f, 6.1f)
            curveToRelative(-0.3f, 1.21f, -0.47f, 2.56f, -0.52f, 3.9f)
            horizontalLineToRelative(-1.93f)
            curveToRelative(0.27f, -1.6f, 1.18f, -2.99f, 2.46f, -3.9f)
            close()
            moveTo(6f, 13f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-2f)
            lineTo(6f, 13f)
            close()
        }
    }.also { _CageEmpty = it }
