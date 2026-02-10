package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromLeft: ImageVector? = null

val Icons.Tc.ArrowAltFromLeft: ImageVector
    get() = _ArrowAltFromLeft ?: UXIcon(name = "ArrowAltFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.0f, 19.5f)
                verticalLineToRelative(-7f)
                lineTo(13.7f, 12.5f)
                curveToRelative(0.17f, 2.17f, 1.28f, 4.13f, 1.33f, 4.22f)
                curveToRelative(0.11f, 0.19f, 0.34f, 0.29f, 0.55f, 0.24f)
                curveToRelative(4.5f, -1.08f, 7.21f, -4.5f, 7.31f, -4.65f)
                curveToRelative(0.24f, -0.36f, -0.03f, -0.65f, -0.03f, -0.65f)
                curveToRelative(-0.49f, -0.59f, -3.15f, -3.57f, -7.38f, -4.62f)
                curveToRelative(-0.22f, -0.06f, -0.45f, 0.05f, -0.56f, 0.25f)
                curveToRelative(-0.05f, 0.09f, -1.09f, 2.05f, -1.23f, 4.21f)
                lineTo(2.0f, 11.5f)
                lineTo(2.0f, 4.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
                moveTo(21.84f, 12.0f)
                curveToRelative(-0.73f, 0.81f, -2.93f, 3.0f, -6.11f, 3.88f)
                curveToRelative(-0.34f, -0.68f, -1.04f, -2.29f, -1.04f, -3.9f)
                curveToRelative(-0.03f, -1.59f, 0.64f, -3.19f, 0.96f, -3.88f)
                curveToRelative(3.23f, 0.92f, 5.4f, 3.02f, 6.2f, 3.89f)
                close()
            }
        }.also { _ArrowAltFromLeft = it}
