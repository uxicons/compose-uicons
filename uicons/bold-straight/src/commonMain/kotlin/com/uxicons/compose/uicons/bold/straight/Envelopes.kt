package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelopes: ImageVector? = null

val Icons.Bs.Envelopes: ImageVector
    get() = _Envelopes ?: UXIcon(name = "Envelopes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 1f)
                lineTo(8.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(12.5f)
                lineTo(24f, 17f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 4f)
                reflectiveCurveToRelative(0.04f, 0f, 0.05f, 0f)
                lineToRelative(-4.26f, 4.26f)
                curveToRelative(-0.94f, 0.95f, -2.59f, 0.95f, -3.54f, 0f)
                lineToRelative(-4.27f, -4.27f)
                reflectiveCurveToRelative(0f, 0f, 0.01f, 0f)
                horizontalLineToRelative(12f)
                close()
                moveTo(8f, 14f)
                lineTo(8f, 7.76f)
                lineToRelative(2.63f, 2.63f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(6.2f)
                lineTo(8f, 14f)
                close()
                moveTo(3f, 19f)
                lineTo(19f, 19f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                lineTo(0f, 9.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                verticalLineToRelative(12.95f)
                close()
            }
        }.also { _Envelopes = it}
