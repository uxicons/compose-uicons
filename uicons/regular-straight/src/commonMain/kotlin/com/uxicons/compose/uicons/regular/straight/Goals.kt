package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Goals: ImageVector? = null

val Icons.Rs.Goals: ImageVector
    get() = _Goals ?: UXIcon(name = "Goals") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                lineToRelative(5f, -3f)
                lineToRelative(-5f, -3f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                reflectiveCurveToRelative(-2f, 0f, -2f, 0f)
                verticalLineToRelative(6f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.28f)
                lineToRelative(-3.17f, -1.05f)
                lineToRelative(-1.11f, 3.32f)
                horizontalLineToRelative(-4.72f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.28f)
                lineToRelative(0.69f, -2.06f)
                curveToRelative(-0.83f, -0.59f, -1.25f, -1.64f, -0.99f, -2.66f)
                lineToRelative(0.9f, -3.35f)
                curveToRelative(0.23f, -1.09f, 1.26f, -1.93f, 2.43f, -1.93f)
                horizontalLineToRelative(1.14f)
                reflectiveCurveToRelative(3.81f, 0f, 3.81f, 0f)
                lineToRelative(3.74f, -1.94f)
                verticalLineToRelative(2.25f)
                lineToRelative(-3.26f, 1.69f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(-1.43f, 5.38f)
                lineToRelative(2.7f, 0.89f)
                verticalLineToRelative(3.72f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(9f)
                close()
                moveTo(5.24f, 12.38f)
                lineTo(6.39f, 12.76f)
                lineTo(7.65f, 8f)
                horizontalLineToRelative(-1.35f)
                curveToRelative(-0.23f, 0f, -0.44f, 0.17f, -0.49f, 0.39f)
                lineToRelative(-0.91f, 3.39f)
                curveToRelative(-0.06f, 0.25f, 0.08f, 0.51f, 0.33f, 0.59f)
                close()
            }
        }.also { _Goals = it}
