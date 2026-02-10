package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SofaSize: ImageVector? = null

val Icons.Br.SofaSize: ImageVector
    get() = _SofaSize ?: UXIcon(name = "SofaSize") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 13.05f)
            verticalLineToRelative(-0.55f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(7.5f, 7f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(0.55f)
            curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.56f, 0.8f, 2.93f, 2f, 3.74f)
            verticalLineToRelative(1.26f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.26f)
            curveToRelative(1.21f, -0.81f, 2f, -2.18f, 2f, -3.74f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
            close()
            moveTo(5f, 12.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(4.5f)
            lineTo(5f, 17f)
            verticalLineToRelative(-4.5f)
            close()
            moveTo(0.23f, 4.05f)
            curveToRelative(-0.3f, -0.3f, -0.3f, -0.79f, 0f, -1.1f)
            lineTo(2.68f, 0.5f)
            curveToRelative(0.49f, -0.49f, 1.32f, -0.14f, 1.32f, 0.55f)
            verticalLineToRelative(0.95f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(-0.95f)
            curveToRelative(0f, -0.69f, 0.83f, -1.04f, 1.32f, -0.55f)
            lineToRelative(2.45f, 2.45f)
            curveToRelative(0.3f, 0.3f, 0.3f, 0.79f, 0f, 1.1f)
            lineToRelative(-2.45f, 2.45f)
            curveToRelative(-0.49f, 0.49f, -1.32f, 0.14f, -1.32f, -0.55f)
            verticalLineToRelative(-0.95f)
            lineTo(4f, 5.0f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 0.69f, -0.83f, 1.04f, -1.32f, 0.55f)
            lineTo(0.23f, 4.05f)
            close()
        }
    }.also { _SofaSize = it }
