package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToBottom: ImageVector? = null

val Icons.Tc.ArrowAltToBottom: ImageVector
    get() = _ArrowAltToBottom ?: UXIcon(name = "ArrowAltToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 22f)
                horizontalLineToRelative(-6.24f)
                curveToRelative(1.14f, -1.18f, 2.93f, -3.43f, 3.7f, -6.51f)
                curveToRelative(0.06f, -0.22f, -0.05f, -0.45f, -0.25f, -0.56f)
                curveToRelative(-0.09f, -0.05f, -2.05f, -1.09f, -4.21f, -1.23f)
                lineTo(12.5f, 1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(11.5f, 13.7f)
                curveToRelative(-2.17f, 0.17f, -4.13f, 1.28f, -4.22f, 1.33f)
                curveToRelative(-0.19f, 0.11f, -0.29f, 0.34f, -0.24f, 0.55f)
                curveToRelative(0.73f, 3.04f, 2.54f, 5.26f, 3.67f, 6.42f)
                lineTo(4.5f, 22f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(12.01f, 14.68f)
                horizontalLineToRelative(0.02f)
                curveToRelative(1.58f, 0f, 3.17f, 0.64f, 3.85f, 0.96f)
                curveToRelative(-0.92f, 3.23f, -3.02f, 5.4f, -3.89f, 6.2f)
                curveToRelative(-0.81f, -0.73f, -3.0f, -2.93f, -3.88f, -6.11f)
                curveToRelative(0.68f, -0.34f, 2.29f, -1.04f, 3.9f, -1.04f)
                close()
            }
        }.also { _ArrowAltToBottom = it}
