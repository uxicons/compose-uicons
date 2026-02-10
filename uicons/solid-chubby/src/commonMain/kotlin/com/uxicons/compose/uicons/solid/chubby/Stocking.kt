package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stocking: ImageVector? = null

val Icons.Sc.Stocking: ImageVector
    get() = _Stocking ?: UXIcon(name = "Stocking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 7f)
                curveToRelative(-5.0f, 0f, -7.21f, -0.68f, -7.3f, -0.71f)
                curveToRelative(-0.41f, -0.13f, -0.7f, -0.52f, -0.7f, -0.95f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -0.44f, 0.28f, -0.82f, 0.7f, -0.95f)
                curveToRelative(0.09f, -0.03f, 2.31f, -0.71f, 7.3f, -0.71f)
                reflectiveCurveToRelative(7.21f, 0.68f, 7.3f, 0.71f)
                curveToRelative(0.41f, 0.13f, 0.7f, 0.52f, 0.7f, 0.95f)
                verticalLineToRelative(2.67f)
                curveToRelative(0f, 0.44f, -0.28f, 0.82f, -0.7f, 0.95f)
                curveToRelative(-0.09f, 0.03f, -2.31f, 0.71f, -7.3f, 0.71f)
                close()
                moveTo(15f, 9f)
                curveToRelative(-2.74f, 0f, -4.71f, -0.2f, -6f, -0.4f)
                verticalLineToRelative(1.15f)
                lineToRelative(-4.31f, 1.4f)
                curveToRelative(-3.31f, 0.86f, -3.69f, 3.72f, -3.69f, 5.79f)
                curveToRelative(0f, 4.2f, 1.87f, 6.07f, 6.07f, 6.07f)
                curveToRelative(1.03f, 0f, 1.9f, -0.12f, 2.65f, -0.35f)
                lineToRelative(8.04f, -2.43f)
                curveToRelative(2.91f, -1.0f, 3.24f, -3.71f, 3.24f, -5.65f)
                verticalLineToRelative(-5.97f)
                curveToRelative(-1.29f, 0.2f, -3.26f, 0.4f, -6f, 0.4f)
                close()
            }
        }.also { _Stocking = it}
