package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Patient: ImageVector? = null

val Icons.Rs.Patient: ImageVector
    get() = _Patient ?: UXIcon(name = "Patient") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(24f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.46f)
                lineToRelative(-2.66f, 3.99f)
                lineToRelative(-3f, -6f)
                lineToRelative(-1.34f, 2.01f)
                horizontalLineToRelative(-3.54f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.46f)
                lineToRelative(2.66f, -3.99f)
                lineToRelative(3f, 6f)
                lineToRelative(1.34f, -2.01f)
                close()
                moveTo(12.39f, 16f)
                horizontalLineToRelative(-7.39f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                curveToRelative(0.23f, 0f, 0.46f, 0.04f, 0.68f, 0.07f)
                lineToRelative(-1.29f, 1.93f)
                close()
            }
        }.also { _Patient = it}
