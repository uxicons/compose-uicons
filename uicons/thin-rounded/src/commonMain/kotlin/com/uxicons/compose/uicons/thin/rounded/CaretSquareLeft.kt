package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareLeft: ImageVector? = null

val Icons.Tr.CaretSquareLeft: ImageVector
    get() = _CaretSquareLeft ?: UXIcon(name = "CaretSquareLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.13f, 5.61f)
                curveToRelative(-0.53f, -0.22f, -1.15f, -0.1f, -1.56f, 0.3f)
                lineToRelative(-5.15f, 5.09f)
                curveToRelative(-0.27f, 0.27f, -0.42f, 0.62f, -0.42f, 1f)
                reflectiveCurveToRelative(0.15f, 0.73f, 0.42f, 1f)
                lineToRelative(5.15f, 5.09f)
                curveToRelative(0.27f, 0.27f, 0.63f, 0.41f, 1.0f, 0.41f)
                curveToRelative(0.19f, 0f, 0.38f, -0.04f, 0.56f, -0.11f)
                curveToRelative(0.54f, -0.22f, 0.87f, -0.72f, 0.87f, -1.3f)
                lineTo(15f, 6.91f)
                curveToRelative(0f, -0.58f, -0.33f, -1.08f, -0.87f, -1.3f)
                close()
                moveTo(14f, 17.09f)
                curveToRelative(0f, 0.24f, -0.18f, 0.34f, -0.26f, 0.38f)
                curveToRelative(-0.06f, 0.03f, -0.28f, 0.1f, -0.47f, -0.09f)
                lineToRelative(-5.16f, -5.09f)
                curveToRelative(-0.08f, -0.08f, -0.12f, -0.18f, -0.12f, -0.29f)
                reflectiveCurveToRelative(0.04f, -0.21f, 0.12f, -0.29f)
                lineToRelative(5.16f, -5.09f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.12f, 0.29f, -0.12f)
                curveToRelative(0.08f, 0f, 0.15f, 0.02f, 0.17f, 0.04f)
                curveToRelative(0.08f, 0.03f, 0.26f, 0.13f, 0.26f, 0.38f)
                verticalLineToRelative(10.18f)
                close()
            }
        }.also { _CaretSquareLeft = it}
