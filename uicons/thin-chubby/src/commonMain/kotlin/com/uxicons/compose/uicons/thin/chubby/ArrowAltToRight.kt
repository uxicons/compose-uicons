package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToRight: ImageVector? = null

val Icons.Tc.ArrowAltToRight: ImageVector
    get() = _ArrowAltToRight ?: UXIcon(name = "ArrowAltToRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4.5f)
                verticalLineToRelative(6.24f)
                curveToRelative(-1.18f, -1.14f, -3.43f, -2.93f, -6.51f, -3.7f)
                curveToRelative(-0.22f, -0.06f, -0.45f, 0.05f, -0.56f, 0.25f)
                curveToRelative(-0.05f, 0.09f, -1.09f, 2.05f, -1.23f, 4.21f)
                lineTo(1.5f, 11.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(13.7f, 12.5f)
                curveToRelative(0.17f, 2.17f, 1.28f, 4.13f, 1.33f, 4.22f)
                curveToRelative(0.11f, 0.19f, 0.34f, 0.29f, 0.55f, 0.24f)
                curveToRelative(3.04f, -0.73f, 5.26f, -2.54f, 6.42f, -3.67f)
                verticalLineToRelative(6.21f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                close()
                moveTo(14.68f, 11.99f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0f, -1.58f, 0.64f, -3.17f, 0.96f, -3.85f)
                curveToRelative(3.23f, 0.92f, 5.4f, 3.02f, 6.2f, 3.89f)
                curveToRelative(-0.73f, 0.81f, -2.93f, 3.0f, -6.11f, 3.88f)
                curveToRelative(-0.34f, -0.68f, -1.04f, -2.29f, -1.04f, -3.9f)
                close()
            }
        }.also { _ArrowAltToRight = it}
