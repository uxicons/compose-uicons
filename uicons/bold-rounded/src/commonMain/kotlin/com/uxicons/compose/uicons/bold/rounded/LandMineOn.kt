package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandMineOn: ImageVector? = null

val Icons.Br.LandMineOn: ImageVector
    get() = _LandMineOn ?: UXIcon(name = "LandMineOn") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineToRelative(-0.2f)
            lineToRelative(-0.45f, -3.14f)
            curveToRelative(-0.31f, -2.2f, -2.23f, -3.86f, -4.46f, -3.86f)
            horizontalLineToRelative(-0.4f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-0.4f)
            curveToRelative(-2.23f, 0f, -4.14f, 1.66f, -4.46f, 3.86f)
            lineToRelative(-0.45f, 3.14f)
            horizontalLineToRelative(-0.2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(22.5f, 24f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(5.12f, 18.29f)
            curveToRelative(0.1f, -0.73f, 0.74f, -1.29f, 1.48f, -1.29f)
            horizontalLineToRelative(10.8f)
            curveToRelative(0.74f, 0f, 1.38f, 0.55f, 1.48f, 1.29f)
            lineToRelative(0.39f, 2.71f)
            lineTo(4.73f, 21f)
            lineToRelative(0.39f, -2.71f)
            close()
            moveTo(10.5f, 5.5f)
            lineTo(10.5f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            lineTo(13.5f, 5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(17.44f, 8.56f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(3f, -3f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            close()
            moveTo(1.44f, 5.56f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(3f, 3f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(1.44f, 5.56f)
            close()
        }
    }.also { _LandMineOn = it }
