package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Jug: ImageVector? = null

val Icons.Ss.Jug: ImageVector
    get() = _Jug ?: UXIcon(name = "Jug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.66f, 10.57f)
                lineToRelative(-0.78f, -0.52f)
                curveToRelative(0.69f, -0.65f, 1.11f, -1.56f, 1.11f, -2.56f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.54f, 0f, -1.05f, 0.12f, -1.5f, 0.34f)
                lineTo(14.99f, 2f)
                horizontalLineToRelative(1f)
                lineTo(15.99f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 2f)
                horizontalLineToRelative(1f)
                lineTo(9f, 7.46f)
                lineToRelative(-4.66f, 3.11f)
                curveToRelative(-0.82f, 0.54f, -1.31f, 1.45f, -1.33f, 2.43f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(3f, 15f)
                verticalLineToRelative(9f)
                lineTo(21f, 24f)
                lineTo(21f, 13.07f)
                curveToRelative(0f, -1f, -0.5f, -1.94f, -1.34f, -2.5f)
                close()
                moveTo(17.11f, 8.87f)
                lineToRelative(-2.11f, -1.41f)
                curveToRelative(0.02f, -0.81f, 0.68f, -1.47f, 1.5f, -1.47f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.6f, -0.36f, 1.14f, -0.89f, 1.37f)
                close()
            }
        }.also { _Jug = it}
