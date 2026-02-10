package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Jug: ImageVector? = null

val Icons.Rs.Jug: ImageVector
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
                curveToRelative(-0.84f, 0.56f, -1.34f, 1.49f, -1.34f, 2.5f)
                verticalLineToRelative(10.93f)
                lineTo(21f, 24f)
                lineTo(21f, 13.07f)
                curveToRelative(0f, -1f, -0.5f, -1.94f, -1.34f, -2.5f)
                close()
                moveTo(16.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.6f, -0.36f, 1.14f, -0.89f, 1.37f)
                lineToRelative(-2.11f, -1.41f)
                curveToRelative(0.02f, -0.81f, 0.68f, -1.47f, 1.5f, -1.47f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                lineTo(5f, 13f)
                curveToRelative(0.02f, -0.31f, 0.18f, -0.59f, 0.44f, -0.76f)
                lineToRelative(5.55f, -3.7f)
                lineTo(10.99f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.54f)
                lineToRelative(5.55f, 3.7f)
                curveToRelative(0.28f, 0.19f, 0.45f, 0.5f, 0.45f, 0.83f)
                verticalLineToRelative(8.93f)
                close()
            }
        }.also { _Jug = it}
