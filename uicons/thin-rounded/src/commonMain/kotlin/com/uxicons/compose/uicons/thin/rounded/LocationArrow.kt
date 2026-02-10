package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationArrow: ImageVector? = null

val Icons.Tr.LocationArrow: ImageVector
    get() = _LocationArrow ?: UXIcon(name = "LocationArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 1.03f)
                curveToRelative(-0.99f, -0.99f, -2.41f, -1.3f, -3.74f, -0.79f)
                lineTo(2.15f, 7.79f)
                curveTo(0.42f, 8.44f, -0.11f, 10.05f, 0.13f, 11.37f)
                curveToRelative(0.24f, 1.31f, 1.31f, 2.63f, 3.16f, 2.63f)
                horizontalLineToRelative(6.71f)
                lineToRelative(-0.07f, 6.79f)
                curveToRelative(0f, 1.85f, 1.32f, 2.92f, 2.63f, 3.16f)
                curveToRelative(0.2f, 0.04f, 0.4f, 0.06f, 0.6f, 0.06f)
                curveToRelative(1.17f, 0f, 2.42f, -0.6f, 2.97f, -2.05f)
                lineToRelative(7.64f, -17.2f)
                curveToRelative(0.49f, -1.3f, 0.19f, -2.73f, -0.8f, -3.71f)
                close()
                moveTo(22.84f, 4.37f)
                lineToRelative(-7.64f, 17.2f)
                curveToRelative(-0.48f, 1.27f, -1.63f, 1.55f, -2.46f, 1.39f)
                curveToRelative(-0.84f, -0.15f, -1.81f, -0.81f, -1.81f, -2.17f)
                lineToRelative(0.07f, -7.29f)
                curveToRelative(0f, -0.13f, -0.05f, -0.26f, -0.14f, -0.36f)
                reflectiveCurveToRelative(-0.22f, -0.15f, -0.35f, -0.15f)
                lineTo(3.29f, 13.0f)
                curveToRelative(-1.36f, 0f, -2.02f, -0.98f, -2.17f, -1.81f)
                curveToRelative(-0.15f, -0.84f, 0.12f, -1.98f, 1.42f, -2.47f)
                lineTo(19.6f, 1.17f)
                curveToRelative(0.29f, -0.11f, 0.6f, -0.16f, 0.9f, -0.16f)
                curveToRelative(0.65f, 0f, 1.28f, 0.26f, 1.76f, 0.74f)
                curveToRelative(0.7f, 0.7f, 0.92f, 1.72f, 0.58f, 2.63f)
                close()
            }
        }.also { _LocationArrow = it}
