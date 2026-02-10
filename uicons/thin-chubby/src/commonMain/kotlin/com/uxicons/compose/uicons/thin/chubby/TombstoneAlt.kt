package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TombstoneAlt: ImageVector? = null

val Icons.Tc.TombstoneAlt: ImageVector
    get() = _TombstoneAlt ?: UXIcon(name = "TombstoneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.59f, 22.01f)
                curveToRelative(-0.02f, -0.0f, -0.62f, -0.12f, -1.59f, -0.26f)
                verticalLineToRelative(-11.75f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.69f, -9f, 9f)
                verticalLineToRelative(11.75f)
                curveToRelative(-0.97f, 0.15f, -1.57f, 0.26f, -1.59f, 0.26f)
                curveToRelative(-0.27f, 0.05f, -0.45f, 0.31f, -0.4f, 0.58f)
                curveToRelative(0.05f, 0.27f, 0.31f, 0.45f, 0.58f, 0.4f)
                curveToRelative(0.05f, -0.01f, 5.33f, -0.99f, 10.41f, -0.99f)
                reflectiveCurveToRelative(10.35f, 0.98f, 10.41f, 0.99f)
                curveToRelative(0.27f, 0.05f, 0.53f, -0.12f, 0.58f, -0.4f)
                curveToRelative(0.05f, -0.27f, -0.13f, -0.53f, -0.4f, -0.58f)
                close()
                moveTo(4f, 21.6f)
                verticalLineToRelative(-11.6f)
                curveToRelative(0f, -5.83f, 2.17f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 2.17f, 8f, 8f)
                verticalLineToRelative(11.6f)
                curveToRelative(-2.05f, -0.28f, -5.06f, -0.6f, -8f, -0.6f)
                reflectiveCurveToRelative(-5.95f, 0.32f, -8f, 0.6f)
                close()
            }
        }.also { _TombstoneAlt = it}
