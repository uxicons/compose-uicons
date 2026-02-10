package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelopes: ImageVector? = null

val Icons.Ss.Envelopes: ImageVector
    get() = _Envelopes ?: UXIcon(name = "Envelopes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 21f)
                verticalLineToRelative(2f)
                lineTo(0f, 23f)
                lineTo(0f, 7f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                lineTo(2f, 21f)
                lineTo(20f, 21f)
                close()
                moveTo(11.88f, 9.12f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(7.11f, -7.11f)
                curveToRelative(-0.55f, -0.62f, -1.34f, -1.01f, -2.23f, -1.01f)
                lineTo(7f, 1f)
                curveToRelative(-0.89f, 0f, -1.68f, 0.4f, -2.23f, 1.01f)
                lineToRelative(7.11f, 7.11f)
                close()
                moveTo(17.54f, 10.53f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(4f, 4.07f)
                verticalLineToRelative(14.93f)
                lineTo(24f, 19f)
                lineTo(24f, 4.07f)
                lineToRelative(-6.46f, 6.46f)
                close()
            }
        }.also { _Envelopes = it}
