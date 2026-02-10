package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStraw: ImageVector? = null

val Icons.Br.CupStraw: ImageVector
    get() = _CupStraw ?: UXIcon(name = "CupStraw") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 5f)
            horizontalLineToRelative(-6.95f)
            lineToRelative(0.2f, -1.56f)
            curveToRelative(0.03f, -0.25f, 0.25f, -0.44f, 0.5f, -0.44f)
            horizontalLineToRelative(2.75f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.75f)
            curveToRelative(-1.75f, 0f, -3.24f, 1.31f, -3.47f, 3.04f)
            lineToRelative(-0.26f, 1.96f)
            lineTo(2f, 5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.17f)
            lineToRelative(1.31f, 11.14f)
            curveToRelative(0.33f, 2.77f, 2.68f, 4.86f, 5.46f, 4.86f)
            horizontalLineToRelative(6.11f)
            curveToRelative(2.79f, 0f, 5.13f, -2.09f, 5.46f, -4.86f)
            lineToRelative(1.31f, -11.14f)
            horizontalLineToRelative(0.17f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(17.54f, 18.79f)
            curveToRelative(-0.15f, 1.26f, -1.22f, 2.21f, -2.48f, 2.21f)
            horizontalLineToRelative(-6.11f)
            curveToRelative(-1.27f, 0f, -2.33f, -0.95f, -2.48f, -2.21f)
            lineToRelative(-1.27f, -10.79f)
            horizontalLineToRelative(13.63f)
            lineToRelative(-1.27f, 10.79f)
            close()
        }
    }.also { _CupStraw = it }
