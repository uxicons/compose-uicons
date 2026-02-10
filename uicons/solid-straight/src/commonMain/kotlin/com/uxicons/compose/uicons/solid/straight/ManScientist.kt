package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManScientist: ImageVector? = null

val Icons.Ss.ManScientist: ImageVector
    get() = _ManScientist ?: UXIcon(name = "ManScientist") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(23.81f, 22.92f)
                curveToRelative(-0.31f, 0.67f, -0.94f, 1.08f, -1.65f, 1.08f)
                horizontalLineToRelative(-7.31f)
                curveToRelative(-0.71f, 0f, -1.34f, -0.41f, -1.65f, -1.08f)
                curveToRelative(-0.33f, -0.7f, -0.23f, -1.54f, 0.27f, -2.12f)
                lineToRelative(3.54f, -4.25f)
                verticalLineToRelative(-2.55f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.55f)
                lineToRelative(3.54f, 4.25f)
                curveToRelative(0.49f, 0.59f, 0.59f, 1.42f, 0.27f, 2.12f)
                close()
                moveTo(11.51f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.61f, 2.01f, -4.73f, 4.56f, -4.96f)
                lineToRelative(4.35f, 4.96f)
                lineToRelative(4.33f, -4.97f)
                curveToRelative(0.26f, 0.01f, 0.51f, 0.03f, 0.76f, 0.08f)
                verticalLineToRelative(2.92f)
                lineToRelative(-2.08f, 2.49f)
                curveToRelative(-0.98f, 1.18f, -1.2f, 2.85f, -0.54f, 4.25f)
                curveToRelative(0.04f, 0.08f, 0.09f, 0.15f, 0.13f, 0.23f)
                close()
            }
        }.also { _ManScientist = it}
