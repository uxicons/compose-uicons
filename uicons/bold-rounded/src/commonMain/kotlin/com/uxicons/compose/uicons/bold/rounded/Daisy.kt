package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Daisy: ImageVector? = null

val Icons.Br.Daisy: ImageVector
    get() = _Daisy ?: UXIcon(name = "Daisy") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.01f, 9.25f)
            lineToRelative(-4.46f, 0.87f)
            lineToRelative(3.77f, -2.54f)
            curveToRelative(1.23f, -1.04f, 1.31f, -2.92f, 0.17f, -4.06f)
            curveToRelative(-1.14f, -1.14f, -3.02f, -1.06f, -4.06f, 0.17f)
            lineToRelative(-2.55f, 3.82f)
            lineToRelative(0.88f, -4.52f)
            curveToRelative(0.13f, -1.61f, -1.14f, -2.99f, -2.75f, -2.99f)
            reflectiveCurveToRelative(-2.88f, 1.38f, -2.75f, 2.99f)
            lineToRelative(0.9f, 4.51f)
            lineToRelative(-2.57f, -3.82f)
            curveToRelative(-1.04f, -1.23f, -2.92f, -1.31f, -4.06f, -0.17f)
            horizontalLineToRelative(0f)
            curveToRelative(-1.14f, 1.14f, -1.06f, 3.02f, 0.17f, 4.06f)
            lineToRelative(3.82f, 2.55f)
            lineToRelative(-4.52f, -0.88f)
            curveToRelative(-1.61f, -0.13f, -2.99f, 1.14f, -2.99f, 2.75f)
            lineTo(0f, 12f)
            curveToRelative(0f, 1.61f, 1.38f, 2.88f, 2.99f, 2.75f)
            lineToRelative(4.57f, -0.91f)
            lineToRelative(-3.87f, 2.58f)
            curveToRelative(-1.23f, 1.04f, -1.31f, 2.92f, -0.17f, 4.06f)
            horizontalLineToRelative(0f)
            curveToRelative(1.14f, 1.14f, 3.02f, 1.06f, 4.06f, -0.17f)
            lineToRelative(2.57f, -3.82f)
            lineToRelative(-0.9f, 4.51f)
            curveToRelative(-0.13f, 1.61f, 1.14f, 2.99f, 2.75f, 2.99f)
            reflectiveCurveToRelative(2.88f, -1.38f, 2.75f, -2.99f)
            lineToRelative(-0.88f, -4.52f)
            lineToRelative(2.55f, 3.82f)
            curveToRelative(1.04f, 1.23f, 2.92f, 1.31f, 4.06f, 0.17f)
            curveToRelative(1.14f, -1.14f, 1.06f, -3.02f, -0.17f, -4.06f)
            lineToRelative(-3.82f, -2.57f)
            lineToRelative(4.51f, 0.9f)
            curveToRelative(1.61f, 0.13f, 2.99f, -1.14f, 2.99f, -2.75f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, -1.61f, -1.38f, -2.88f, -2.99f, -2.75f)
            close()
            moveTo(12f, 14.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _Daisy = it }
