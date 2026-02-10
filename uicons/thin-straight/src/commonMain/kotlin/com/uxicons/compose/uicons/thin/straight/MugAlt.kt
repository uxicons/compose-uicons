package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugAlt: ImageVector? = null

val Icons.Ts.MugAlt: ImageVector
    get() = _MugAlt ?: UXIcon(name = "MugAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 23f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, 2.49f, -2.01f, 5.5f, -4.5f, 5.5f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-1.18f, 7f)
                lineTo(3.08f, 21f)
                lineTo(0.06f, 3.02f)
                curveToRelative(-0.16f, -0.72f, 0.02f, -1.49f, 0.5f, -2.08f)
                curveToRelative(0.48f, -0.59f, 1.19f, -0.94f, 1.95f, -0.94f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.76f, 0f, 1.48f, 0.34f, 1.95f, 0.94f)
                curveToRelative(0.48f, 0.59f, 0.66f, 1.36f, 0.49f, 2.11f)
                lineToRelative(-0.33f, 1.96f)
                curveToRelative(2.79f, 0.03f, 4.39f, 1.3f, 4.39f, 3.5f)
                close()
                moveTo(18.96f, 2.85f)
                curveToRelative(0.1f, -0.47f, -0.0f, -0.93f, -0.29f, -1.29f)
                reflectiveCurveToRelative(-0.71f, -0.56f, -1.17f, -0.56f)
                lineTo(2.5f, 1.0f)
                curveToRelative(-0.46f, 0f, -0.88f, 0.2f, -1.17f, 0.56f)
                curveToRelative(-0.29f, 0.35f, -0.39f, 0.82f, -0.29f, 1.26f)
                lineToRelative(2.89f, 17.18f)
                horizontalLineToRelative(12.15f)
                lineToRelative(2.88f, -17.15f)
                close()
                moveTo(23f, 8.5f)
                curveToRelative(0f, -1.66f, -1.24f, -2.5f, -3.56f, -2.5f)
                lineToRelative(-1.18f, 7f)
                horizontalLineToRelative(1.23f)
                curveToRelative(1.85f, 0f, 3.5f, -2.52f, 3.5f, -4.5f)
                close()
            }
        }.also { _MugAlt = it}
