package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FonduePot: ImageVector? = null

val Icons.Sr.FonduePot: ImageVector
    get() = _FonduePot ?: UXIcon(name = "FonduePot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 8f)
                horizontalLineToRelative(-3.87f)
                lineToRelative(3.23f, -5.49f)
                curveToRelative(0.28f, -0.48f, 0.12f, -1.09f, -0.35f, -1.37f)
                curveToRelative(-0.48f, -0.28f, -1.09f, -0.12f, -1.37f, 0.35f)
                lineToRelative(-3.82f, 6.51f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(1.8f, -6.74f)
                curveToRelative(0.14f, -0.53f, -0.17f, -1.08f, -0.71f, -1.22f)
                curveToRelative(-0.53f, -0.14f, -1.08f, 0.17f, -1.23f, 0.71f)
                lineToRelative(-1.94f, 7.26f)
                horizontalLineToRelative(-4.91f)
                lineTo(3.36f, 1.49f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.36f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.36f, 1.37f)
                lineToRelative(3.23f, 5.49f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 3.46f, 1.77f, 6.52f, 4.45f, 8.31f)
                curveToRelative(-1.44f, 0.61f, -2.45f, 2.03f, -2.45f, 3.69f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.66f, -1.01f, -3.08f, -2.45f, -3.69f)
                curveToRelative(2.68f, -1.8f, 4.45f, -4.85f, 4.45f, -8.31f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _FonduePot = it}
