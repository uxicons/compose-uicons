package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareLeft1: ImageVector? = null

val Icons.Tr.CaretSquareLeft1: ImageVector
    get() = _CaretSquareLeft1 ?: UXIcon(name = "CaretSquareLeft1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
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
                lineToRelative(-5.15f, -5.09f)
                curveToRelative(-0.08f, -0.08f, -0.12f, -0.18f, -0.12f, -0.29f)
                reflectiveCurveToRelative(0.04f, -0.21f, 0.12f, -0.29f)
                lineToRelative(5.15f, -5.09f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.12f, 0.29f, -0.12f)
                curveToRelative(0.08f, 0f, 0.15f, 0.02f, 0.17f, 0.04f)
                curveToRelative(0.08f, 0.03f, 0.26f, 0.13f, 0.26f, 0.38f)
                verticalLineToRelative(10.18f)
                close()
            }
        }.also { _CaretSquareLeft1 = it}
