package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stocking: ImageVector? = null

val Icons.Rr.Stocking: ImageVector
    get() = _Stocking ?: UXIcon(name = "Stocking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 0f)
                horizontalLineToRelative(-1.97f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                horizontalLineToRelative(-10.96f)
                reflectiveCurveToRelative(-0.0f, 0f, -0.01f, 0f)
                reflectiveCurveToRelative(-0.0f, 0f, -0.01f, 0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.87f)
                curveToRelative(0f, 0.85f, -0.54f, 1.61f, -1.34f, 1.89f)
                lineToRelative(-2.92f, 1.02f)
                curveTo(1.19f, 11.89f, -0.8f, 15.69f, 0.31f, 19.25f)
                curveToRelative(0.89f, 2.84f, 3.48f, 4.75f, 6.45f, 4.75f)
                curveToRelative(0.69f, 0f, 1.36f, -0.1f, 2.04f, -0.32f)
                lineToRelative(7.08f, -2.4f)
                curveToRelative(3.66f, -1.24f, 6.12f, -4.66f, 6.12f, -8.53f)
                lineTo(22f, 2.0f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveTo(23.55f, 0f, 23f, 0f)
                close()
                moveTo(20f, 12.76f)
                curveToRelative(0f, 3.0f, -1.91f, 5.67f, -4.76f, 6.63f)
                lineToRelative(-7.06f, 2.39f)
                curveToRelative(-0.46f, 0.14f, -0.94f, 0.22f, -1.42f, 0.22f)
                curveToRelative(-2.09f, 0f, -3.92f, -1.34f, -4.54f, -3.34f)
                curveToRelative(-0.78f, -2.51f, 0.62f, -5.18f, 3.16f, -5.98f)
                lineToRelative(2.95f, -1.03f)
                curveToRelative(1.6f, -0.56f, 2.68f, -2.08f, 2.68f, -3.77f)
                lineTo(11.0f, 2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(10.76f)
                close()
            }
        }.also { _Stocking = it}
