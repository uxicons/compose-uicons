package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Follow: ImageVector? = null

val Icons.Tr.Follow: ImageVector
    get() = _Follow ?: UXIcon(name = "Follow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(16f, 10f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveTo(23.48f, 8.49f)
                curveToRelative(0.35f, 1.13f, 0.52f, 2.31f, 0.52f, 3.51f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
                curveToRelative(1.25f, 0f, 2.48f, 0.19f, 3.65f, 0.57f)
                curveToRelative(0.26f, 0.08f, 0.41f, 0.36f, 0.32f, 0.63f)
                curveToRelative(-0.09f, 0.26f, -0.37f, 0.41f, -0.63f, 0.32f)
                curveToRelative(-1.08f, -0.34f, -2.2f, -0.52f, -3.35f, -0.52f)
                curveToRelative(-6.06f, 0.0f, -11.0f, 4.94f, -11.0f, 11.0f)
                curveToRelative(0f, 3.87f, 2.02f, 7.28f, 5.05f, 9.24f)
                curveToRelative(0.38f, -2.95f, 2.9f, -5.24f, 5.95f, -5.24f)
                reflectiveCurveToRelative(5.57f, 2.29f, 5.95f, 5.24f)
                curveToRelative(3.04f, -1.96f, 5.05f, -5.37f, 5.05f, -9.24f)
                curveToRelative(0f, -1.1f, -0.16f, -2.18f, -0.48f, -3.22f)
                curveToRelative(-0.08f, -0.26f, 0.07f, -0.54f, 0.33f, -0.62f)
                curveToRelative(0.26f, -0.08f, 0.54f, 0.07f, 0.62f, 0.33f)
                close()
                moveTo(12f, 23f)
                curveToRelative(1.79f, 0f, 3.48f, -0.44f, 4.98f, -1.2f)
                curveToRelative(-0.11f, -2.66f, -2.29f, -4.8f, -4.98f, -4.8f)
                reflectiveCurveToRelative(-4.87f, 2.13f, -4.98f, 4.8f)
                curveToRelative(1.5f, 0.76f, 3.19f, 1.2f, 4.98f, 1.2f)
                close()
            }
        }.also { _Follow = it}
