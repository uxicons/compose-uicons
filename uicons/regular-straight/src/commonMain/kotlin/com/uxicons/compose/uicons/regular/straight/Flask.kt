package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flask: ImageVector? = null

val Icons.Rs.Flask: ImageVector
    get() = _Flask ?: UXIcon(name = "Flask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 9.04f)
                lineTo(17f, 2f)
                horizontalLineToRelative(2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.04f)
                curveToRelative(-1.5f, 1.31f, -7f, 6.43f, -7f, 10.82f)
                curveToRelative(0f, 3.04f, 2.93f, 4.1f, 3.04f, 4.14f)
                horizontalLineToRelative(17.91f)
                curveToRelative(0.12f, -0.04f, 3.04f, -1.11f, 3.04f, -4.14f)
                curveToRelative(0f, -4.39f, -5.5f, -9.51f, -7f, -10.82f)
                close()
                moveTo(20.59f, 22f)
                lineTo(3.42f, 22f)
                curveToRelative(-0.4f, -0.19f, -1.42f, -0.8f, -1.42f, -2.14f)
                curveToRelative(0f, -0.9f, 0.35f, -1.9f, 0.89f, -2.91f)
                horizontalLineToRelative(15.77f)
                curveToRelative(-0.43f, -0.66f, -0.96f, -1.34f, -1.52f, -2f)
                lineTo(4.19f, 14.95f)
                curveToRelative(1.51f, -2.02f, 3.43f, -3.83f, 4.45f, -4.68f)
                lineToRelative(0.36f, -0.3f)
                lineTo(9f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7.97f)
                lineToRelative(0.36f, 0.3f)
                curveToRelative(1.85f, 1.53f, 6.64f, 6.23f, 6.64f, 9.59f)
                curveToRelative(0f, 1.35f, -1.02f, 1.96f, -1.42f, 2.14f)
                close()
            }
        }.also { _Flask = it}
