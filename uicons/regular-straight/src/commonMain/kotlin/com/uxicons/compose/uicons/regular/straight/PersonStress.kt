package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonStress: ImageVector? = null

val Icons.Rs.PersonStress: ImageVector
    get() = _PersonStress ?: UXIcon(name = "PersonStress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.32f)
                lineToRelative(-4.19f, 1.68f)
                horizontalLineToRelative(-7.62f)
                lineToRelative(-4.19f, -1.68f)
                verticalLineToRelative(-6.32f)
                lineTo(2f, 9f)
                verticalLineToRelative(7.68f)
                lineToRelative(5f, 2f)
                verticalLineToRelative(5.32f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.32f)
                lineToRelative(5f, -2f)
                verticalLineToRelative(-7.68f)
                close()
                moveTo(5.96f, 6.79f)
                lineToRelative(1.64f, -1.64f)
                lineToRelative(1.9f, 2.85f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(-0.87f, -5.97f)
                curveToRelative(-0.11f, -0.53f, -0.77f, -0.73f, -1.15f, -0.35f)
                lineToRelative(-1.63f, 1.63f)
                lineTo(5f, 0f)
                lineTo(2.71f, 2.29f)
                lineToRelative(2.15f, 4.33f)
                curveToRelative(0.22f, 0.41f, 0.77f, 0.49f, 1.1f, 0.16f)
                close()
                moveTo(16.45f, 5.15f)
                lineToRelative(1.64f, 1.64f)
                curveToRelative(0.33f, 0.33f, 0.88f, 0.25f, 1.1f, -0.16f)
                lineToRelative(2.15f, -4.33f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-1.36f, 2.8f)
                lineToRelative(-1.63f, -1.63f)
                curveToRelative(-0.38f, -0.38f, -1.04f, -0.19f, -1.15f, 0.35f)
                lineToRelative(-0.87f, 5.97f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(1.9f, -2.85f)
                close()
            }
        }.also { _PersonStress = it}
