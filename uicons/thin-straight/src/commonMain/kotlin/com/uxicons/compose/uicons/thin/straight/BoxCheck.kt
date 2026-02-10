package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCheck: ImageVector? = null

val Icons.Ts.BoxCheck: ImageVector
    get() = _BoxCheck ?: UXIcon(name = "BoxCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.46f, 14.67f)
                lineToRelative(0.7f, -0.72f)
                lineToRelative(2.98f, 2.9f)
                curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.01f)
                lineToRelative(5.8f, -5.71f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-5.79f, 5.71f)
                curveToRelative(-0.29f, 0.29f, -0.67f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-2.98f, -2.89f)
                close()
                moveTo(24f, 8f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 24f)
                lineTo(1f, 24f)
                lineTo(1f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(22f, 8f)
                lineTo(2f, 8f)
                verticalLineToRelative(15f)
                lineTo(22f, 23f)
                lineTo(22f, 8f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 7f)
                lineTo(23f, 7f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _BoxCheck = it}
