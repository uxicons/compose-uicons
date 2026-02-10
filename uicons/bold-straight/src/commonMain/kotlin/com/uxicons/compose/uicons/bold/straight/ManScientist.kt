package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManScientist: ImageVector? = null

val Icons.Bs.ManScientist: ImageVector
    get() = _ManScientist ?: UXIcon(name = "ManScientist") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.45f, 20.14f)
                lineToRelative(-3.45f, -4.13f)
                verticalLineToRelative(-3.01f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.01f)
                lineToRelative(-3.45f, 4.13f)
                curveToRelative(-0.59f, 0.7f, -0.71f, 1.7f, -0.32f, 2.54f)
                curveToRelative(0.38f, 0.81f, 1.16f, 1.31f, 2.03f, 1.31f)
                horizontalLineToRelative(7.48f)
                curveToRelative(0.87f, 0f, 1.65f, -0.5f, 2.03f, -1.31f)
                curveToRelative(0.39f, -0.84f, 0.27f, -1.84f, -0.32f, -2.54f)
                close()
                moveTo(15.74f, 21f)
                lineToRelative(2.26f, -2.7f)
                lineToRelative(2.26f, 2.7f)
                horizontalLineToRelative(-4.52f)
                close()
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(14f, 15.29f)
                lineToRelative(-5f, 5.71f)
                lineToRelative(-3.5f, -4f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(1.64f)
                lineToRelative(2.36f, 2.69f)
                lineToRelative(2.36f, -2.69f)
                horizontalLineToRelative(2.64f)
                verticalLineToRelative(1.28f)
                close()
            }
        }.also { _ManScientist = it}
