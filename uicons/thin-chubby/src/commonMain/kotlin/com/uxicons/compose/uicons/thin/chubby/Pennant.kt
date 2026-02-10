package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pennant: ImageVector? = null

val Icons.Tc.Pennant: ImageVector
    get() = _Pennant ?: UXIcon(name = "Pennant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.83f, 11.03f)
                lineToRelative(-0.82f, -0.77f)
                curveToRelative(-3.96f, -3.7f, -8.84f, -6.12f, -14.16f, -7.03f)
                curveToRelative(0.1f, -0.23f, 0.13f, -0.49f, 0.13f, -0.73f)
                curveToRelative(0f, -0.68f, -0.26f, -1.5f, -1.49f, -1.5f)
                reflectiveCurveToRelative(-1.49f, 0.81f, -1.49f, 1.5f)
                curveToRelative(0f, 0.58f, 0.18f, 1.25f, 0.99f, 1.44f)
                lineTo(4.0f, 22.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.81f)
                curveToRelative(5.66f, -0.79f, 10.84f, -3.27f, 15.02f, -7.17f)
                lineToRelative(0.82f, -0.77f)
                curveToRelative(0.1f, -0.1f, 0.16f, -0.23f, 0.16f, -0.36f)
                reflectiveCurveToRelative(-0.06f, -0.27f, -0.16f, -0.36f)
                close()
                moveTo(4.5f, 2f)
                curveToRelative(0.4f, 0f, 0.49f, 0.05f, 0.49f, 0.5f)
                curveToRelative(0f, 0.45f, -0.1f, 0.5f, -0.49f, 0.5f)
                curveToRelative(-0.4f, 0f, -0.49f, -0.05f, -0.49f, -0.5f)
                reflectiveCurveToRelative(0.1f, -0.5f, 0.49f, -0.5f)
                close()
                moveTo(19.33f, 11.79f)
                curveToRelative(-3.99f, 3.73f, -8.94f, 6.1f, -14.33f, 6.88f)
                lineTo(5.0f, 4.11f)
                curveToRelative(5.4f, 0.78f, 10.35f, 3.16f, 14.33f, 6.88f)
                lineToRelative(0.43f, 0.4f)
                lineToRelative(-0.43f, 0.4f)
                close()
            }
        }.also { _Pennant = it}
