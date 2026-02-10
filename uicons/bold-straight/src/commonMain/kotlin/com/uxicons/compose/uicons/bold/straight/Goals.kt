package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Goals: ImageVector? = null

val Icons.Bs.Goals: ImageVector
    get() = _Goals ?: UXIcon(name = "Goals") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.17f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                lineToRelative(5f, -3f)
                lineToRelative(-5f, -3f)
                reflectiveCurveToRelative(-3f, 0f, -3f, 0f)
                verticalLineToRelative(6f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.07f)
                lineToRelative(-3.99f, -1.34f)
                lineToRelative(0.95f, -3.58f)
                horizontalLineToRelative(2.96f)
                lineToRelative(2.08f, -1.08f)
                verticalLineToRelative(-3.38f)
                lineToRelative(-2.81f, 1.46f)
                horizontalLineToRelative(-2.19f)
                reflectiveCurveToRelative(-2.19f, 0f, -2.19f, 0f)
                curveToRelative(-1.4f, 0f, -2.64f, 1.0f, -2.91f, 2.28f)
                lineToRelative(-0.8f, 2.85f)
                curveToRelative(-0.26f, 1.0f, 0.03f, 2.01f, 0.67f, 2.74f)
                lineToRelative(-0.8f, 2.14f)
                horizontalLineToRelative(-2.96f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.04f)
                lineToRelative(1.42f, -3.79f)
                lineToRelative(2.54f, 0.87f)
                verticalLineToRelative(1.93f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _Goals = it}
