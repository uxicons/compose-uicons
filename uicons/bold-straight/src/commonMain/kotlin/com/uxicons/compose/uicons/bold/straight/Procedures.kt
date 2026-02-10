package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Procedures: ImageVector? = null

val Icons.Bs.Procedures: ImageVector
    get() = _Procedures ?: UXIcon(name = "Procedures") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 11.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18.28f, 3f)
                lineToRelative(-1.19f, 1.48f)
                lineTo(14.07f, 0.05f)
                lineToRelative(-2.3f, 2.95f)
                horizontalLineToRelative(-5.77f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7.23f)
                lineToRelative(0.68f, -0.87f)
                lineToRelative(3.0f, 4.39f)
                lineToRelative(2.81f, -3.52f)
                horizontalLineToRelative(4.28f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5.72f)
                close()
                moveTo(20.68f, 8.01f)
                lineToRelative(-2.4f, 3.0f)
                horizontalLineToRelative(2.22f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.99f)
                lineToRelative(-2.05f, -3.0f)
                curveToRelative(-1.9f, 0.03f, -3.44f, 1.59f, -3.44f, 3.5f)
                verticalLineToRelative(3.5f)
                lineTo(3f, 15f)
                lineTo(3f, 4f)
                lineTo(0f, 4f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -1.87f, -1.47f, -3.4f, -3.32f, -3.5f)
                close()
            }
        }.also { _Procedures = it}
