package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Jug: ImageVector? = null

val Icons.Ts.Jug: ImageVector
    get() = _Jug ?: UXIcon(name = "Jug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.89f, 10.99f)
                lineToRelative(-0.66f, -0.44f)
                curveToRelative(1.07f, -0.61f, 1.78f, -1.76f, 1.78f, -3.05f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.4f, -2.5f, 1.05f)
                lineTo(15.01f, 1f)
                horizontalLineToRelative(1f)
                lineTo(16.01f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 1f)
                horizontalLineToRelative(1f)
                lineTo(9f, 7.73f)
                lineToRelative(-4.89f, 3.26f)
                curveToRelative(-0.7f, 0.46f, -1.11f, 1.24f, -1.11f, 2.08f)
                verticalLineToRelative(10.93f)
                lineTo(21f, 24f)
                lineTo(21f, 13.07f)
                curveToRelative(0f, -0.84f, -0.42f, -1.62f, -1.11f, -2.08f)
                close()
                moveTo(17.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.1f, -0.73f, 2.07f, -1.76f, 2.39f)
                lineToRelative(-3.24f, -2.16f)
                verticalLineToRelative(-0.23f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                lineTo(4f, 15f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                lineTo(4f, 14f)
                verticalLineToRelative(-0.93f)
                curveToRelative(0f, -0.5f, 0.25f, -0.97f, 0.67f, -1.25f)
                lineToRelative(5.33f, -3.55f)
                lineTo(10f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7.27f)
                lineToRelative(5.33f, 3.55f)
                curveToRelative(0.42f, 0.28f, 0.67f, 0.75f, 0.67f, 1.25f)
                verticalLineToRelative(9.93f)
                close()
            }
        }.also { _Jug = it}
