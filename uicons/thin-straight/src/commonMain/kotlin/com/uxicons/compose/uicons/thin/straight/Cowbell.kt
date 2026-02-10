package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cowbell: ImageVector? = null

val Icons.Ts.Cowbell: ImageVector
    get() = _Cowbell ?: UXIcon(name = "Cowbell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.97f, 6.88f)
                curveToRelative(-0.3f, -1.67f, -1.75f, -2.88f, -3.45f, -2.88f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(0.31f, -0.42f, 0.5f, -0.94f, 0.5f, -1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.56f, 0.19f, 1.08f, 0.5f, 1.5f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(-1.7f, 0f, -3.15f, 1.21f, -3.45f, 2.88f)
                lineTo(0.69f, 20f)
                horizontalLineToRelative(7.31f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(7.31f)
                lineToRelative(-2.34f, -13.12f)
                close()
                moveTo(8f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(1.88f, 19f)
                lineTo(4.02f, 7.06f)
                curveToRelative(0.21f, -1.19f, 1.25f, -2.06f, 2.46f, -2.06f)
                horizontalLineToRelative(11.05f)
                curveToRelative(1.21f, 0f, 2.25f, 0.87f, 2.46f, 2.06f)
                lineToRelative(2.13f, 11.94f)
                lineTo(1.88f, 19f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _Cowbell = it}
