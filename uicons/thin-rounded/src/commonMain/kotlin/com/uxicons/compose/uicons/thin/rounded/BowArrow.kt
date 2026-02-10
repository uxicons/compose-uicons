package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowArrow: ImageVector? = null

val Icons.Tr.BowArrow: ImageVector
    get() = _BowArrow ?: UXIcon(name = "BowArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.23f, 0f, 0.45f, 0.05f, 0.65f, 0.15f)
                lineToRelative(-4.45f, 4.45f)
                curveTo(13.22f, 1.44f, 6.38f, 0.82f, 1.24f, 4.16f)
                curveTo(0.55f, 4.61f, 0.1f, 5.34f, 0.02f, 6.16f)
                curveToRelative(-0.09f, 0.84f, 0.2f, 1.66f, 0.79f, 2.25f)
                lineToRelative(7.04f, 7.04f)
                lineToRelative(-2.55f, 2.55f)
                lineTo(0.5f, 18.0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.79f)
                lineToRelative(-3.15f, 3.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(3.15f, -3.15f)
                verticalLineToRelative(3.79f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.79f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(7.04f, 7.04f)
                curveToRelative(0.52f, 0.52f, 1.22f, 0.81f, 1.96f, 0.81f)
                curveToRelative(0.1f, 0f, 0.2f, -0.01f, 0.29f, -0.02f)
                curveToRelative(0.83f, -0.09f, 1.56f, -0.53f, 2.0f, -1.22f)
                curveToRelative(3.34f, -5.15f, 2.72f, -11.99f, -1.43f, -16.46f)
                lineTo(22.85f, 1.85f)
                curveToRelative(0.09f, 0.2f, 0.15f, 0.41f, 0.15f, 0.65f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1.52f, 7.71f)
                curveToRelative(-0.38f, -0.38f, -0.56f, -0.9f, -0.51f, -1.44f)
                curveToRelative(0.06f, -0.52f, 0.34f, -0.99f, 0.77f, -1.27f)
                curveToRelative(2.06f, -1.33f, 4.4f, -1.99f, 6.74f, -1.99f)
                curveToRelative(3.07f, 0f, 6.12f, 1.12f, 8.47f, 3.29f)
                lineTo(8.55f, 14.74f)
                lineTo(1.52f, 7.71f)
                close()
                moveTo(19.0f, 22.22f)
                curveToRelative(-0.28f, 0.44f, -0.75f, 0.72f, -1.27f, 0.77f)
                curveToRelative(-0.54f, 0.06f, -1.06f, -0.13f, -1.44f, -0.51f)
                lineToRelative(-7.04f, -7.04f)
                lineTo(17.7f, 7.01f)
                curveToRelative(3.82f, 4.14f, 4.39f, 10.46f, 1.3f, 15.21f)
                close()
            }
        }.also { _BowArrow = it}
