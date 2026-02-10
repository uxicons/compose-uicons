package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonArrowDownToLine: ImageVector? = null

val Icons.Br.PersonArrowDownToLine: ImageVector
    get() = _PersonArrowDownToLine ?: UXIcon(name = "PersonArrowDownToLine") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-4.76f)
            curveToRelative(-1.21f, -0.81f, -2f, -2.18f, -2f, -3.74f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(2f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.56f, -0.8f, 2.93f, -2f, 3.74f)
            verticalLineToRelative(4.76f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(3f, 12.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            close()
            moveTo(5f, 21f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(4f)
            close()
            moveTo(17.59f, 18.78f)
            curveToRelative(0.46f, 0.51f, 1.26f, 0.51f, 1.71f, 0f)
            lineToRelative(2.89f, -3.15f)
            curveToRelative(0.57f, -0.62f, 0.13f, -1.62f, -0.71f, -1.62f)
            horizontalLineToRelative(-1.43f)
            lineTo(20.04f, 3.54f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            lineTo(17.04f, 14f)
            horizontalLineToRelative(-1.63f)
            curveToRelative(-0.84f, 0f, -1.28f, 1.0f, -0.71f, 1.62f)
            lineToRelative(2.89f, 3.15f)
            close()
        }
    }.also { _PersonArrowDownToLine = it }
