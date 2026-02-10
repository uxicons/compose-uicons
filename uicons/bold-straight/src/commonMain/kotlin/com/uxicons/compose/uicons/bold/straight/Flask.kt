package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flask: ImageVector? = null

val Icons.Bs.Flask: ImageVector
    get() = _Flask ?: UXIcon(name = "Flask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8.8f)
                lineTo(17f, 3f)
                horizontalLineToRelative(2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.8f)
                curveToRelative(-1.83f, 1.57f, -7f, 6.4f, -7f, 10.7f)
                curveToRelative(0f, 2.62f, 1.96f, 4.01f, 3.12f, 4.42f)
                lineToRelative(0.24f, 0.09f)
                horizontalLineToRelative(17.29f)
                lineToRelative(0.24f, -0.09f)
                curveToRelative(1.16f, -0.41f, 3.12f, -1.8f, 3.12f, -4.42f)
                curveToRelative(0f, -4.3f, -5.17f, -9.13f, -7f, -10.7f)
                close()
                moveTo(20.07f, 21f)
                lineTo(3.94f, 21f)
                curveToRelative(-0.34f, -0.18f, -0.94f, -0.63f, -0.94f, -1.5f)
                curveToRelative(0f, -0.74f, 0.31f, -1.6f, 0.81f, -2.5f)
                horizontalLineToRelative(14.02f)
                curveToRelative(-0.66f, -0.94f, -1.55f, -1.99f, -2.56f, -3f)
                lineTo(6.0f, 14f)
                curveToRelative(1.14f, -1.31f, 2.42f, -2.5f, 3.44f, -3.33f)
                lineToRelative(0.56f, -0.45f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7.22f)
                reflectiveCurveToRelative(0.56f, 0.45f, 0.56f, 0.45f)
                curveToRelative(2.49f, 2.01f, 6.44f, 6.19f, 6.44f, 8.83f)
                curveToRelative(0f, 0.87f, -0.59f, 1.32f, -0.94f, 1.5f)
                close()
            }
        }.also { _Flask = it}
