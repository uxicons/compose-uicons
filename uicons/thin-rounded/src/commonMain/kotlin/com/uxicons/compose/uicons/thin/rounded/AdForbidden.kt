package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AdForbidden: ImageVector? = null

val Icons.Tr.AdForbidden: ImageVector
    get() = _AdForbidden ?: UXIcon(name = "AdForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, -2.85f, 1.1f, -5.45f, 2.89f, -7.4f)
                lineToRelative(2.76f, 2.76f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-2.76f, -2.76f)
                curveToRelative(1.96f, -1.79f, 4.55f, -2.89f, 7.4f, -2.89f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 2.85f, -1.1f, 5.45f, -2.89f, 7.4f)
                lineToRelative(-2.28f, -2.28f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(2.28f, 2.28f)
                curveToRelative(-1.96f, 1.79f, -4.55f, 2.89f, -7.4f, 2.89f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(17.5f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16.5f, 13.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(10.59f, 9.19f)
                curveToRelative(-0.12f, -0.67f, -0.59f, -1.19f, -1.35f, -1.19f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.76f, 0f, -1.28f, 0.59f, -1.39f, 1.17f)
                lineToRelative(-1.25f, 6.24f)
                curveToRelative(-0.06f, 0.31f, 0.17f, 0.59f, 0.48f, 0.59f)
                curveToRelative(0.23f, 0f, 0.44f, -0.17f, 0.48f, -0.4f)
                lineToRelative(0.33f, -1.6f)
                horizontalLineToRelative(2.66f)
                lineToRelative(0.33f, 1.61f)
                curveToRelative(0.05f, 0.23f, 0.25f, 0.39f, 0.48f, 0.39f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.31f, 0f, 0.55f, -0.29f, 0.48f, -0.59f)
                curveToRelative(0.01f, -0.08f, -1.27f, -6.21f, -1.27f, -6.21f)
                close()
                moveTo(8.1f, 13f)
                lineToRelative(0.74f, -3.66f)
                curveToRelative(0.02f, -0.11f, 0.14f, -0.34f, 0.4f, -0.34f)
                horizontalLineToRelative(0f)
                curveToRelative(0.1f, 0f, 0.29f, 0f, 0.37f, 0.39f)
                lineToRelative(0.74f, 3.61f)
                horizontalLineToRelative(-2.25f)
                close()
            }
        }.also { _AdForbidden = it}
