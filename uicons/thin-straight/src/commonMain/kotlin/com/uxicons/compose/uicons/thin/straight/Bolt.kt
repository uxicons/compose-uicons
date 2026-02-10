package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bolt: ImageVector? = null

val Icons.Ts.Bolt: ImageVector
    get() = _Bolt ?: UXIcon(name = "Bolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.76f, 24f)
                horizontalLineToRelative(-3.49f)
                lineToRelative(3.5f, -9f)
                lineTo(5f, 15f)
                curveToRelative(-0.66f, 0f, -1.26f, -0.3f, -1.66f, -0.83f)
                curveToRelative(-0.39f, -0.53f, -0.51f, -1.2f, -0.32f, -1.83f)
                lineTo(8.39f, 0f)
                horizontalLineToRelative(8.88f)
                lineToRelative(-3.5f, 8f)
                horizontalLineToRelative(5.2f)
                curveToRelative(0.76f, 0f, 1.43f, 0.4f, 1.79f, 1.07f)
                reflectiveCurveToRelative(0.32f, 1.45f, -0.1f, 2.08f)
                lineToRelative(-8.9f, 12.85f)
                close()
                moveTo(9.73f, 23f)
                horizontalLineToRelative(1.51f)
                lineToRelative(8.59f, -12.41f)
                curveToRelative(0.21f, -0.31f, 0.23f, -0.71f, 0.04f, -1.05f)
                curveToRelative(-0.18f, -0.34f, -0.52f, -0.54f, -0.91f, -0.54f)
                horizontalLineToRelative(-6.73f)
                lineTo(15.73f, 1f)
                horizontalLineToRelative(-6.69f)
                lineTo(3.96f, 12.69f)
                curveToRelative(-0.08f, 0.27f, -0.02f, 0.61f, 0.18f, 0.89f)
                curveToRelative(0.2f, 0.27f, 0.51f, 0.43f, 0.85f, 0.43f)
                lineTo(13.23f, 14.0f)
                lineToRelative(-3.5f, 9f)
                close()
            }
        }.also { _Bolt = it}
