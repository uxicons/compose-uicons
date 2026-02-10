package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManScientist: ImageVector? = null

val Icons.Rs.ManScientist: ImageVector
    get() = _ManScientist ?: UXIcon(name = "ManScientist") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(23.54f, 20.8f)
                lineToRelative(-3.54f, -4.25f)
                verticalLineToRelative(-2.55f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.55f)
                lineToRelative(-3.54f, 4.25f)
                curveToRelative(-0.49f, 0.59f, -0.59f, 1.42f, -0.27f, 2.12f)
                curveToRelative(0.31f, 0.67f, 0.94f, 1.08f, 1.65f, 1.08f)
                horizontalLineToRelative(7.31f)
                curveToRelative(0.71f, 0f, 1.34f, -0.41f, 1.65f, -1.08f)
                curveToRelative(0.33f, -0.7f, 0.23f, -1.54f, -0.27f, -2.12f)
                close()
                moveTo(15.06f, 22f)
                lineToRelative(3.44f, -4.13f)
                lineToRelative(3.44f, 4.13f)
                horizontalLineToRelative(-6.88f)
                close()
                moveTo(14f, 15.37f)
                lineToRelative(-4.98f, 5.72f)
                lineToRelative(-4.45f, -5.06f)
                curveToRelative(-1.45f, 0.21f, -2.57f, 1.46f, -2.57f, 2.97f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(0.45f)
                lineToRelative(3.56f, 4.05f)
                lineToRelative(3.53f, -4.05f)
                horizontalLineToRelative(1.46f)
                verticalLineToRelative(1.37f)
                close()
            }
        }.also { _ManScientist = it}
