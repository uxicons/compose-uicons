package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupTogo: ImageVector? = null

val Icons.Br.CupTogo: ImageVector
    get() = _CupTogo ?: UXIcon(name = "CupTogo") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 5f)
            horizontalLineToRelative(-0.27f)
            lineToRelative(-0.28f, -1.38f)
            curveToRelative(-0.42f, -2.1f, -2.27f, -3.62f, -4.41f, -3.62f)
            lineTo(6.96f, 0f)
            curveToRelative(-2.14f, 0f, -3.99f, 1.52f, -4.41f, 3.62f)
            lineToRelative(-0.28f, 1.38f)
            horizontalLineToRelative(-0.77f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.67f)
            lineToRelative(1.32f, 11.14f)
            curveToRelative(0.33f, 2.77f, 2.67f, 4.86f, 5.46f, 4.86f)
            horizontalLineToRelative(6.11f)
            curveToRelative(2.79f, 0f, 5.14f, -2.09f, 5.46f, -4.86f)
            lineToRelative(1.31f, -11.14f)
            horizontalLineToRelative(0.17f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(6.96f, 3f)
            horizontalLineToRelative(10.08f)
            curveToRelative(0.71f, 0f, 1.33f, 0.51f, 1.47f, 1.21f)
            lineToRelative(0.16f, 0.79f)
            lineTo(5.33f, 5f)
            lineToRelative(0.16f, -0.79f)
            curveToRelative(0.14f, -0.7f, 0.76f, -1.21f, 1.47f, -1.21f)
            close()
            moveTo(18.81f, 8f)
            lineToRelative(-0.35f, 3f)
            lineTo(5.54f, 11f)
            lineToRelative(-0.35f, -3f)
            horizontalLineToRelative(13.62f)
            close()
            moveTo(15.05f, 21f)
            horizontalLineToRelative(-6.11f)
            curveToRelative(-1.27f, 0f, -2.33f, -0.95f, -2.48f, -2.21f)
            lineToRelative(-0.09f, -0.79f)
            horizontalLineToRelative(11.26f)
            lineToRelative(-0.09f, 0.79f)
            curveToRelative(-0.15f, 1.26f, -1.22f, 2.21f, -2.48f, 2.21f)
            close()
        }
    }.also { _CupTogo = it }
