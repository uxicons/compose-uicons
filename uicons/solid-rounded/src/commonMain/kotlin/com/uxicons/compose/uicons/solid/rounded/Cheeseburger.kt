package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheeseburger: ImageVector? = null

val Icons.Sr.Cheeseburger: ImageVector
    get() = _Cheeseburger ?: UXIcon(name = "Cheeseburger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.57f, 11.33f)
                curveToRelative(-0.38f, -0.43f, -0.56f, -1.0f, -0.5f, -1.57f)
                curveTo(1.7f, 4.2f, 6.39f, 0f, 12.0f, 0f)
                reflectiveCurveToRelative(10.32f, 4.2f, 10.93f, 9.77f)
                curveToRelative(0.06f, 0.57f, -0.12f, 1.14f, -0.5f, 1.56f)
                curveToRelative(-0.38f, 0.42f, -0.92f, 0.67f, -1.49f, 0.67f)
                lineTo(3.07f, 12f)
                curveToRelative(-0.57f, 0f, -1.11f, -0.24f, -1.49f, -0.67f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.53f, 0.53f, 1.38f, 0.53f, 1.91f, 0f)
                lineToRelative(2.54f, -2.54f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-19.0f, 0f, -19.0f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(-1.96f, 1.96f)
                curveToRelative(-0.65f, 0.65f, -1.51f, 0.98f, -2.37f, 0.98f)
                reflectiveCurveToRelative(-1.72f, -0.33f, -2.37f, -0.98f)
                lineToRelative(-1.96f, -1.96f)
                lineTo(3.0f, 18f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(14f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _Cheeseburger = it}
