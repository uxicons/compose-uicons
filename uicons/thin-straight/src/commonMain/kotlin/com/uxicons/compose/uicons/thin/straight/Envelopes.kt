package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelopes: ImageVector? = null

val Icons.Ts.Envelopes: ImageVector
    get() = _Envelopes ?: UXIcon(name = "Envelopes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(5.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                lineTo(24f, 20f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.5f, 3f)
                lineTo(21.5f, 3f)
                curveToRelative(0.69f, 0f, 1.28f, 0.47f, 1.45f, 1.12f)
                lineToRelative(-6.86f, 6.86f)
                curveToRelative(-1.32f, 1.32f, -3.63f, 1.32f, -4.95f, 0f)
                lineTo(4.11f, 3.94f)
                curveToRelative(0.22f, -0.55f, 0.76f, -0.94f, 1.39f, -0.94f)
                close()
                moveTo(4f, 19f)
                lineTo(4f, 5.25f)
                lineToRelative(6.44f, 6.43f)
                curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
                reflectiveCurveToRelative(2.33f, -0.47f, 3.18f, -1.32f)
                lineToRelative(6.2f, -6.2f)
                verticalLineToRelative(13.52f)
                lineTo(4f, 19f)
                close()
                moveTo(1f, 22f)
                lineTo(19f, 22f)
                verticalLineToRelative(1f)
                lineTo(0f, 23f)
                lineTo(0f, 7.5f)
                curveToRelative(0f, -0.82f, 0.39f, -1.54f, 1f, -2f)
                lineTo(1f, 22f)
                close()
            }
        }.also { _Envelopes = it}
