package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AdForbidden: ImageVector? = null

val Icons.Br.AdForbidden: ImageVector
    get() = _AdForbidden ?: UXIcon(name = "AdForbidden") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(3f, 12f)
            curveToRelative(0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
            lineToRelative(0.77f, 0.77f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(-0.77f, -0.77f)
            curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
            curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
            curveToRelative(0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
            lineToRelative(-0.54f, -0.54f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(0.54f, 0.54f)
            curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            close()
            moveTo(9.11f, 8.0f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.76f, 0f, -1.28f, 0.59f, -1.39f, 1.17f)
            lineToRelative(-1.2f, 5.98f)
            curveToRelative(-0.09f, 0.44f, 0.25f, 0.86f, 0.7f, 0.86f)
            curveToRelative(0.34f, 0f, 0.64f, -0.25f, 0.7f, -0.58f)
            lineToRelative(0.17f, -0.89f)
            horizontalLineToRelative(2.01f)
            lineToRelative(0.16f, 0.88f)
            curveToRelative(0.06f, 0.34f, 0.36f, 0.59f, 0.7f, 0.59f)
            horizontalLineToRelative(0.01f)
            curveToRelative(0.45f, 0f, 0.79f, -0.42f, 0.7f, -0.86f)
            lineToRelative(-1.22f, -5.95f)
            curveToRelative(-0.12f, -0.67f, -0.59f, -1.19f, -1.35f, -1.19f)
            close()
            moveTo(8.46f, 13f)
            lineToRelative(0.62f, -3.29f)
            lineToRelative(0.64f, 3.29f)
            horizontalLineToRelative(-1.26f)
            close()
            moveTo(17.6f, 13f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            horizontalLineToRelative(-0.6f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(0.6f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            close()
            moveTo(16f, 13f)
            curveToRelative(0f, 0.77f, -0.63f, 1.4f, -1.4f, 1.4f)
            verticalLineToRelative(-4.8f)
            curveToRelative(0.77f, 0f, 1.4f, 0.63f, 1.4f, 1.4f)
            verticalLineToRelative(2f)
            close()
        }
    }.also { _AdForbidden = it }
