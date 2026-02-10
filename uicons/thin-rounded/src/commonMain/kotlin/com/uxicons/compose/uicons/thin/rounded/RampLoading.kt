package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Tr.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 24f)
                lineTo(4.5f, 24f)
                curveToRelative(-0.86f, 0f, -1.66f, -0.44f, -2.12f, -1.17f)
                curveToRelative(-0.46f, -0.73f, -0.51f, -1.64f, -0.14f, -2.42f)
                lineToRelative(3.1f, -6.43f)
                curveToRelative(0.58f, -1.2f, 1.82f, -1.98f, 3.15f, -1.98f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.33f, 0f, 2.57f, 0.78f, 3.15f, 1.98f)
                lineToRelative(3.1f, 6.43f)
                curveToRelative(0.38f, 0.78f, 0.33f, 1.68f, -0.13f, 2.42f)
                curveToRelative(-0.46f, 0.73f, -1.25f, 1.17f, -2.12f, 1.17f)
                close()
                moveTo(8.5f, 13f)
                curveToRelative(-0.95f, 0f, -1.84f, 0.56f, -2.25f, 1.42f)
                lineToRelative(-3.1f, 6.43f)
                curveToRelative(-0.23f, 0.47f, -0.19f, 1.01f, 0.08f, 1.45f)
                curveToRelative(0.28f, 0.44f, 0.75f, 0.7f, 1.27f, 0.7f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.52f, 0f, 0.99f, -0.26f, 1.27f, -0.7f)
                curveToRelative(0.28f, -0.44f, 0.31f, -0.98f, 0.08f, -1.45f)
                lineToRelative(-3.1f, -6.43f)
                curveToRelative(-0.41f, -0.86f, -1.3f, -1.42f, -2.25f, -1.42f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(22f, 14.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(6.5f, 0f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                lineTo(2f, 14.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(3f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(21f, 14.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _RampLoading = it}
