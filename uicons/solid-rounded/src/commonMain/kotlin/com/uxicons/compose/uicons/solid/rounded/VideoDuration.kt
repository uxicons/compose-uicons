package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoDuration: ImageVector? = null

val Icons.Sr.VideoDuration: ImageVector
    get() = _VideoDuration ?: UXIcon(name = "VideoDuration") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(20.21f, 20.21f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.09f)
                lineToRelative(1.21f, 1.21f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                curveToRelative(1.89f, 0f, 3.63f, 0.66f, 5f, 1.76f)
                verticalLineToRelative(-6.76f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5.07f)
                curveToRelative(-0.04f, -0.33f, -0.07f, -0.66f, -0.07f, -1f)
                close()
                moveTo(8f, 11.32f)
                verticalLineToRelative(-4.6f)
                curveToRelative(0f, -0.9f, 0.97f, -1.47f, 1.75f, -1.03f)
                lineToRelative(4.14f, 2.3f)
                curveToRelative(0.81f, 0.45f, 0.81f, 1.61f, 0f, 2.06f)
                lineToRelative(-4.14f, 2.3f)
                curveToRelative(-0.79f, 0.44f, -1.75f, -0.13f, -1.75f, -1.03f)
                close()
            }
        }.also { _VideoDuration = it}
