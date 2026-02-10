package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Patient: ImageVector? = null

val Icons.Ss.Patient: ImageVector
    get() = _Patient ?: UXIcon(name = "Patient") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(21.54f, 20f)
                horizontalLineToRelative(2.46f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.54f)
                lineToRelative(-1.34f, 2.01f)
                lineToRelative(-3f, -6f)
                lineToRelative(-2.66f, 3.99f)
                horizontalLineToRelative(-2.46f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.54f)
                lineToRelative(1.34f, -2.01f)
                lineToRelative(3f, 6.01f)
                close()
                moveTo(15.65f, 22f)
                horizontalLineToRelative(-6.65f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3.39f)
                lineToRelative(1.29f, -1.93f)
                curveToRelative(-0.23f, -0.03f, -0.45f, -0.07f, -0.68f, -0.07f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(16.65f)
                close()
            }
        }.also { _Patient = it}
