package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToDot: ImageVector? = null

val Icons.Rr.ArrowsToDot: ImageVector
    get() = _ArrowsToDot ?: UXIcon(name = "ArrowsToDot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(7.92f, 10.59f)
                lineTo(5.09f, 7.76f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.84f, 1.83f)
                horizontalLineToRelative(-4.51f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.49f)
                lineToRelative(-1.82f, 1.83f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, -0.0f)
                lineToRelative(2.83f, -2.84f)
                curveToRelative(0.77f, -0.78f, 0.77f, -2.04f, 0f, -2.81f)
                close()
                moveTo(10.6f, 7.92f)
                curveToRelative(0.74f, 0.77f, 2.07f, 0.77f, 2.81f, 0f)
                lineToRelative(2.83f, -2.83f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.83f, 1.84f)
                verticalLineToRelative(-4.51f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.49f)
                lineToRelative(-1.83f, -1.82f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f)
                close()
                moveTo(13.41f, 16.08f)
                curveToRelative(-0.77f, -0.77f, -2.04f, -0.77f, -2.81f, -0.0f)
                lineToRelative(-2.84f, 2.83f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, -0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(1.83f, -1.83f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.5f)
                lineToRelative(1.83f, 1.83f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.83f, -2.83f)
                close()
                moveTo(23f, 11f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(1.83f, -1.83f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.77f, 0.78f, -0.78f, 2.04f, -0.0f, 2.81f)
                lineToRelative(2.83f, 2.84f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-1.83f, -1.83f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowsToDot = it}
