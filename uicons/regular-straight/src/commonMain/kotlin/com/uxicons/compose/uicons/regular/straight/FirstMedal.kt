package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FirstMedal: ImageVector? = null

val Icons.Rs.FirstMedal: ImageVector
    get() = _FirstMedal ?: UXIcon(name = "FirstMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 10f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.61f)
                lineToRelative(-0.78f, 0.81f)
                lineToRelative(-1.44f, -1.39f)
                lineToRelative(2.71f, -2.81f)
                horizontalLineToRelative(1.51f)
                close()
                moveTo(19.22f, 9.63f)
                curveToRelative(1.12f, 1.5f, 1.78f, 3.36f, 1.78f, 5.37f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                curveToRelative(0f, -2.01f, 0.66f, -3.87f, 1.78f, -5.37f)
                lineTo(0.03f, 0f)
                horizontalLineToRelative(9.1f)
                lineToRelative(2.87f, 5.83f)
                lineTo(14.89f, 0f)
                horizontalLineToRelative(9.09f)
                lineToRelative(-4.76f, 9.63f)
                close()
                moveTo(14.04f, 6.23f)
                curveToRelative(1.39f, 0.32f, 2.65f, 0.97f, 3.71f, 1.85f)
                lineToRelative(3.01f, -6.08f)
                horizontalLineToRelative(-4.63f)
                lineToRelative(-2.1f, 4.23f)
                close()
                moveTo(3.25f, 2f)
                lineToRelative(3.0f, 6.08f)
                curveToRelative(1.06f, -0.89f, 2.33f, -1.53f, 3.73f, -1.85f)
                lineToRelative(-2.09f, -4.23f)
                lineTo(3.25f, 2f)
                close()
                moveTo(19f, 15f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                close()
            }
        }.also { _FirstMedal = it}
