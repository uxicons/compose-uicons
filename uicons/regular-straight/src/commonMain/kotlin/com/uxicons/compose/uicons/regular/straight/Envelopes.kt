package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelopes: ImageVector? = null

val Icons.Rs.Envelopes: ImageVector
    get() = _Envelopes ?: UXIcon(name = "Envelopes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 21f)
                lineTo(20f, 21f)
                verticalLineToRelative(2f)
                lineTo(0f, 23f)
                lineTo(0f, 7f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                lineTo(2f, 21f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(15f)
                lineTo(4f, 19f)
                lineTo(4f, 4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6.2f, 3.44f)
                lineToRelative(5.68f, 5.68f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(5.68f, -5.68f)
                curveToRelative(-0.18f, -0.26f, -0.47f, -0.44f, -0.8f, -0.44f)
                lineTo(7f, 3f)
                curveToRelative(-0.34f, 0f, -0.62f, 0.18f, -0.8f, 0.44f)
                close()
                moveTo(22f, 17f)
                lineTo(22f, 6.07f)
                lineToRelative(-4.46f, 4.46f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(6f, 6.07f)
                verticalLineToRelative(10.93f)
                lineTo(22f, 17f)
                close()
            }
        }.also { _Envelopes = it}
