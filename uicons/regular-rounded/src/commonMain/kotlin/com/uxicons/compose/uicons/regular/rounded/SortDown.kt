package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortDown: ImageVector? = null

val Icons.Rr.SortDown: ImageVector
    get() = _SortDown ?: UXIcon(name = "SortDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveToRelative(-0.76f, 0f, -1.48f, -0.32f, -1.99f, -0.89f)
                lineTo(3.58f, 10.59f)
                curveToRelative(-0.6f, -0.66f, -0.75f, -1.54f, -0.4f, -2.32f)
                reflectiveCurveToRelative(1.09f, -1.27f, 1.94f, -1.27f)
                horizontalLineToRelative(13.75f)
                curveToRelative(0.85f, 0f, 1.6f, 0.49f, 1.94f, 1.27f)
                reflectiveCurveToRelative(0.2f, 1.66f, -0.38f, 2.29f)
                lineToRelative(-6.49f, 6.59f)
                curveToRelative(-0.47f, 0.53f, -1.2f, 0.85f, -1.95f, 0.85f)
                close()
                moveTo(5.13f, 9f)
                curveToRelative(-0.03f, 0f, -0.08f, 0f, -0.11f, 0.07f)
                curveToRelative(-0.03f, 0.07f, 0.0f, 0.12f, 0.02f, 0.14f)
                lineToRelative(6.44f, 6.53f)
                curveToRelative(0.2f, 0.23f, 0.42f, 0.26f, 0.53f, 0.26f)
                reflectiveCurveToRelative(0.32f, -0.03f, 0.5f, -0.22f)
                lineToRelative(6.49f, -6.6f)
                reflectiveCurveToRelative(0.06f, 0.03f, -0.0f, -0.11f)
                curveToRelative(-0.03f, -0.07f, -0.09f, -0.07f, -0.11f, -0.07f)
                horizontalLineTo(5.13f)
                close()
            }
        }.also { _SortDown = it}
