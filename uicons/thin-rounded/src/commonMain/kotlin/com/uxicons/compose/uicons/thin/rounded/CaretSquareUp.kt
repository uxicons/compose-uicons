package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareUp: ImageVector? = null

val Icons.Tr.CaretSquareUp: ImageVector
    get() = _CaretSquareUp ?: UXIcon(name = "CaretSquareUp") {
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
                moveTo(13f, 7.42f)
                curveToRelative(-0.53f, -0.54f, -1.47f, -0.54f, -2.0f, 0f)
                lineToRelative(-5.09f, 5.15f)
                curveToRelative(-0.41f, 0.41f, -0.52f, 1.02f, -0.3f, 1.56f)
                curveToRelative(0.23f, 0.54f, 0.72f, 0.87f, 1.3f, 0.87f)
                horizontalLineToRelative(10.17f)
                curveToRelative(0.58f, 0f, 1.07f, -0.33f, 1.3f, -0.87f)
                curveToRelative(0.22f, -0.54f, 0.11f, -1.15f, -0.3f, -1.56f)
                lineToRelative(-5.09f, -5.15f)
                close()
                moveTo(17.46f, 13.74f)
                curveToRelative(-0.03f, 0.08f, -0.13f, 0.26f, -0.38f, 0.26f)
                lineTo(6.91f, 14.0f)
                curveToRelative(-0.24f, 0f, -0.35f, -0.18f, -0.38f, -0.26f)
                curveToRelative(-0.03f, -0.06f, -0.1f, -0.28f, 0.09f, -0.47f)
                lineToRelative(5.09f, -5.15f)
                curveToRelative(0.08f, -0.08f, 0.18f, -0.12f, 0.29f, -0.12f)
                reflectiveCurveToRelative(0.21f, 0.04f, 0.29f, 0.12f)
                lineToRelative(5.09f, 5.15f)
                curveToRelative(0.18f, 0.19f, 0.11f, 0.41f, 0.09f, 0.47f)
                close()
            }
        }.also { _CaretSquareUp = it}
