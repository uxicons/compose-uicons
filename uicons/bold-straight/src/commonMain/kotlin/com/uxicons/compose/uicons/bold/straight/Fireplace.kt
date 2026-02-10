package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fireplace: ImageVector? = null

val Icons.Bs.Fireplace: ImageVector
    get() = _Fireplace ?: UXIcon(name = "Fireplace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.01f, 17.51f)
                curveToRelative(0.56f, 0.56f, 0.56f, 1.46f, 0f, 2.02f)
                curveToRelative(-0.56f, 0.56f, -1.46f, 0.56f, -2.02f, 0f)
                curveToRelative(-0.56f, -0.56f, -0.56f, -1.46f, 0f, -2.02f)
                lineToRelative(1.01f, -1.01f)
                lineToRelative(1.01f, 1.01f)
                horizontalLineToRelative(0f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                lineTo(1f, 4f)
                lineTo(0.05f, 2.11f)
                curveTo(-0.22f, 1.04f, 0.59f, 0f, 1.7f, 0f)
                horizontalLineToRelative(20.59f)
                curveToRelative(1.11f, 0f, 1.92f, 1.04f, 1.65f, 2.11f)
                lineToRelative(-0.95f, 1.89f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(1f)
                close()
                moveTo(16f, 17f)
                curveToRelative(0f, -2.32f, -2.74f, -3.73f, -4f, -4.99f)
                curveToRelative(-1.21f, 1.4f, -0.19f, 3.99f, -2f, 3.99f)
                curveToRelative(-0.85f, 0f, -0.67f, -1.73f, -0.67f, -1.73f)
                curveToRelative(-0.66f, 0.69f, -1.33f, 1.57f, -1.33f, 2.73f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(20f, 4f)
                lineTo(4f, 4f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11f)
                reflectiveCurveToRelative(2.69f, -2f, 6f, -2f)
                reflectiveCurveToRelative(6f, 2f, 6f, 2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                lineTo(20f, 4f)
                close()
            }
        }.also { _Fireplace = it}
