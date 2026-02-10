package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromTop: ImageVector? = null

val Icons.Tc.ArrowAltFromTop: ImageVector
    get() = _ArrowAltFromTop ?: UXIcon(name = "ArrowAltFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 2.0f)
                horizontalLineToRelative(7f)
                lineTo(11.5f, 13.7f)
                curveToRelative(-2.17f, 0.17f, -4.13f, 1.28f, -4.22f, 1.33f)
                curveToRelative(-0.19f, 0.11f, -0.29f, 0.34f, -0.24f, 0.55f)
                curveToRelative(1.08f, 4.5f, 4.5f, 7.21f, 4.65f, 7.31f)
                curveToRelative(0.36f, 0.24f, 0.65f, -0.03f, 0.65f, -0.03f)
                curveToRelative(0.59f, -0.49f, 3.57f, -3.15f, 4.62f, -7.38f)
                curveToRelative(0.06f, -0.22f, -0.05f, -0.45f, -0.25f, -0.56f)
                curveToRelative(-0.09f, -0.05f, -2.05f, -1.09f, -4.21f, -1.23f)
                lineTo(12.5f, 2.0f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 1.0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(12.0f, 21.84f)
                curveToRelative(-0.81f, -0.73f, -3.0f, -2.93f, -3.88f, -6.11f)
                curveToRelative(0.68f, -0.34f, 2.29f, -1.04f, 3.9f, -1.04f)
                curveToRelative(1.59f, -0.03f, 3.19f, 0.64f, 3.88f, 0.96f)
                curveToRelative(-0.92f, 3.23f, -3.02f, 5.4f, -3.89f, 6.2f)
                close()
            }
        }.also { _ArrowAltFromTop = it}
