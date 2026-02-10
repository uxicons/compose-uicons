package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupeeSign: ImageVector? = null

val Icons.Tr.RupeeSign: ImageVector
    get() = _RupeeSign ?: UXIcon(name = "RupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7.5f)
                curveTo(15f, 3.36f, 11.64f, 0f, 7.5f, 0f)
                horizontalLineToRelative(-3f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                lineTo(0f, 23.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(1f, 15f)
                lineTo(7.5f, 15f)
                curveToRelative(0.23f, 0f, 0.46f, -0.01f, 0.69f, -0.03f)
                lineToRelative(4.88f, 8.78f)
                curveToRelative(0.09f, 0.16f, 0.26f, 0.26f, 0.44f, 0.26f)
                curveToRelative(0.08f, 0f, 0.17f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.24f, -0.14f, 0.33f, -0.44f, 0.19f, -0.68f)
                lineToRelative(-4.7f, -8.46f)
                curveToRelative(3.3f, -0.79f, 5.76f, -3.76f, 5.76f, -7.3f)
                close()
                moveTo(7.5f, 14f)
                lineTo(1f, 14f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(24f, 21.37f)
                curveToRelative(0f, 1.45f, -1.18f, 2.63f, -2.63f, 2.63f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(-0.98f, 0f, -1.89f, -0.53f, -2.38f, -1.38f)
                curveToRelative(-0.14f, -0.24f, -0.06f, -0.55f, 0.18f, -0.68f)
                curveToRelative(0.24f, -0.14f, 0.54f, -0.06f, 0.68f, 0.18f)
                curveToRelative(0.31f, 0.54f, 0.89f, 0.88f, 1.52f, 0.88f)
                horizontalLineToRelative(2.8f)
                curveToRelative(0.9f, 0f, 1.63f, -0.73f, 1.63f, -1.63f)
                curveToRelative(0f, -0.8f, -0.57f, -1.48f, -1.37f, -1.6f)
                lineToRelative(-3.42f, -0.55f)
                curveToRelative(-1.28f, -0.2f, -2.21f, -1.29f, -2.21f, -2.59f)
                curveToRelative(0f, -1.45f, 1.18f, -2.63f, 2.63f, -2.63f)
                horizontalLineToRelative(2.8f)
                curveToRelative(0.98f, 0f, 1.89f, 0.53f, 2.38f, 1.38f)
                curveToRelative(0.14f, 0.24f, 0.06f, 0.55f, -0.18f, 0.68f)
                curveToRelative(-0.24f, 0.14f, -0.54f, 0.06f, -0.68f, -0.18f)
                curveToRelative(-0.31f, -0.54f, -0.89f, -0.88f, -1.52f, -0.88f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(-0.9f, 0f, -1.63f, 0.73f, -1.63f, 1.63f)
                curveToRelative(0f, 0.8f, 0.57f, 1.48f, 1.37f, 1.6f)
                lineToRelative(3.42f, 0.55f)
                curveToRelative(1.28f, 0.2f, 2.21f, 1.29f, 2.21f, 2.59f)
                close()
            }
        }.also { _RupeeSign = it}
