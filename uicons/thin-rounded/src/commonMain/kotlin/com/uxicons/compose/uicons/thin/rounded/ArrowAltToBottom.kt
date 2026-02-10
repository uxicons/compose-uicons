package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToBottom: ImageVector? = null

val Icons.Tr.ArrowAltToBottom: ImageVector
    get() = _ArrowAltToBottom ?: UXIcon(name = "ArrowAltToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.27f, 18.2f)
                curveToRelative(0.37f, -0.37f, 0.47f, -0.93f, 0.27f, -1.41f)
                curveToRelative(-0.2f, -0.49f, -0.66f, -0.79f, -1.18f, -0.79f)
                horizontalLineToRelative(-3.86f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-3.86f)
                curveToRelative(-0.52f, 0f, -0.98f, 0.3f, -1.18f, 0.79f)
                curveToRelative(-0.2f, 0.48f, -0.1f, 1.04f, 0.27f, 1.41f)
                lineToRelative(4.36f, 4.42f)
                curveToRelative(0.24f, 0.25f, 0.56f, 0.38f, 0.91f, 0.38f)
                reflectiveCurveToRelative(0.67f, -0.14f, 0.91f, -0.38f)
                lineToRelative(4.36f, -4.42f)
                close()
                moveTo(11.8f, 21.92f)
                lineToRelative(-4.36f, -4.42f)
                curveToRelative(-0.12f, -0.13f, -0.08f, -0.27f, -0.06f, -0.32f)
                curveToRelative(0.02f, -0.05f, 0.09f, -0.17f, 0.26f, -0.17f)
                horizontalLineToRelative(8.72f)
                curveToRelative(0.17f, 0f, 0.23f, 0.12f, 0.26f, 0.17f)
                curveToRelative(0.02f, 0.06f, 0.06f, 0.2f, -0.06f, 0.32f)
                lineToRelative(-4.36f, 4.42f)
                curveToRelative(-0.1f, 0.11f, -0.29f, 0.11f, -0.39f, 0f)
                close()
                moveTo(21f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _ArrowAltToBottom = it}
