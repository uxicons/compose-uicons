package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyHole: ImageVector? = null

val Icons.Ts.KeyHole: ImageVector
    get() = _KeyHole ?: UXIcon(name = "KeyHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(5f, 3.14f, 5f, 7f)
                curveToRelative(0f, 2.11f, 0.98f, 4.13f, 2.62f, 5.46f)
                lineToRelative(-2.5f, 11.54f)
                horizontalLineToRelative(13.75f)
                lineToRelative(-2.5f, -11.54f)
                curveToRelative(1.65f, -1.32f, 2.62f, -3.34f, 2.62f, -5.46f)
                close()
                moveTo(17.64f, 23f)
                lineTo(6.36f, 23f)
                lineToRelative(2.37f, -10.96f)
                curveToRelative(-1.69f, -1.12f, -2.75f, -3.02f, -2.74f, -5.04f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0.01f, 2.02f, -1.05f, 3.92f, -2.74f, 5.04f)
                lineToRelative(2.37f, 10.96f)
                close()
            }
        }.also { _KeyHole = it}
