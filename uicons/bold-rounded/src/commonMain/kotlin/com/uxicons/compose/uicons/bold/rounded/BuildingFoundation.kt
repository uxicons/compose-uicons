package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingFoundation: ImageVector? = null

val Icons.Br.BuildingFoundation: ImageVector
    get() = _BuildingFoundation ?: UXIcon(name = "BuildingFoundation") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.9f)
            lineToRelative(-4.5f, -2.7f)
            verticalLineToRelative(-0.2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.2f)
            lineToRelative(-4.5f, 2.7f)
            verticalLineToRelative(-2.75f)
            curveToRelative(0f, -0.98f, -0.67f, -1.65f, -1.5f, -1.65f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(14.81f)
            curveToRelative(0f, 1.91f, 0.97f, 3.66f, 2.59f, 4.67f)
            lineToRelative(3.5f, 2.18f)
            curveToRelative(0.9f, 0.56f, 1.9f, 0.84f, 2.91f, 0.84f)
            reflectiveCurveToRelative(2.01f, -0.28f, 2.91f, -0.84f)
            lineToRelative(3.5f, -2.18f)
            curveToRelative(1.62f, -1.01f, 2.59f, -2.76f, 2.59f, -4.67f)
            verticalLineToRelative(-14.81f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(6f, 9.07f)
            lineTo(9.22f, 11f)
            lineTo(6f, 12.93f)
            close()
            moveTo(10.5f, 17.85f)
            lineTo(6.1f, 15.21f)
            lineTo(10.5f, 12.57f)
            verticalLineToRelative(5.29f)
            close()
            moveTo(10.5f, 9.43f)
            lineTo(6f, 6.73f)
            lineTo(10.5f, 4.03f)
            close()
            moveTo(13.5f, 17.85f)
            verticalLineToRelative(-5.29f)
            lineToRelative(4.4f, 2.64f)
            close()
            moveTo(18f, 12.93f)
            lineTo(14.78f, 11f)
            lineTo(18f, 9.07f)
            close()
            moveTo(18f, 6.73f)
            lineTo(13.5f, 9.43f)
            verticalLineToRelative(-5.4f)
            lineToRelative(4.5f, 2.7f)
            close()
        }
    }.also { _BuildingFoundation = it }
