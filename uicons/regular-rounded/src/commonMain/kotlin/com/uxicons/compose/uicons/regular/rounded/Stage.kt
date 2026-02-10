package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stage: ImageVector? = null

val Icons.Rr.Stage: ImageVector
    get() = _Stage ?: UXIcon(name = "Stage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-4.6f)
                lineToRelative(-4.28f, -4.12f)
                curveToRelative(-0.32f, -0.32f, -0.71f, -0.54f, -1.12f, -0.67f)
                lineTo(13f, 6.41f)
                lineToRelative(1.59f, -1.59f)
                curveToRelative(0.28f, 0.11f, 0.59f, 0.18f, 0.91f, 0.18f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.32f, 0.07f, 0.63f, 0.18f, 0.91f)
                lineToRelative(-4.88f, 4.88f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.29f, -1.29f)
                verticalLineToRelative(8.79f)
                curveToRelative(-0.41f, 0.14f, -0.8f, 0.35f, -1.11f, 0.66f)
                lineToRelative(-4.3f, 4.13f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(11.29f, 19.29f)
                curveToRelative(0.38f, -0.38f, 1.02f, -0.39f, 1.43f, 0.01f)
                lineToRelative(2.8f, 2.69f)
                horizontalLineToRelative(-7.04f)
                lineToRelative(2.81f, -2.71f)
                close()
            }
        }.also { _Stage = it}
