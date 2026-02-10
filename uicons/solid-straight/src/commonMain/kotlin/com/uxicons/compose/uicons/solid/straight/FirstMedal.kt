package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FirstMedal: ImageVector? = null

val Icons.Ss.FirstMedal: ImageVector
    get() = _FirstMedal ?: UXIcon(name = "FirstMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveToRelative(-4.04f, -9f, -9f, -9f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.61f)
                lineToRelative(-0.78f, 0.81f)
                lineToRelative(-1.44f, -1.39f)
                lineToRelative(2.71f, -2.81f)
                horizontalLineToRelative(1.51f)
                verticalLineToRelative(10f)
                close()
                moveTo(13.0f, 4.05f)
                lineTo(15f, 0f)
                horizontalLineToRelative(7.87f)
                lineToRelative(-3.42f, 6.91f)
                curveToRelative(-1.73f, -1.59f, -3.97f, -2.64f, -6.45f, -2.87f)
                close()
                moveTo(4.47f, 6.99f)
                lineTo(1.03f, 0f)
                horizontalLineToRelative(7.97f)
                lineToRelative(2.0f, 4.05f)
                curveToRelative(-2.51f, 0.23f, -4.78f, 1.3f, -6.52f, 2.94f)
                close()
            }
        }.also { _FirstMedal = it}
