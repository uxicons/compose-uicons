package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserRoadmap: ImageVector? = null

val Icons.Sr.UserRoadmap: ImageVector
    get() = _UserRoadmap ?: UXIcon(name = "UserRoadmap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(10f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                lineTo(12f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(19f, 10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.75f)
                lineToRelative(3.56f, -1.89f)
                curveToRelative(0.58f, -0.4f, 0.58f, -1.33f, 0f, -1.73f)
                lineToRelative(-2.81f, -1.26f)
                curveToRelative(-0.56f, -0.25f, -1.15f, -0.38f, -1.75f, -0.38f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(18.0f, 9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(3.5f, 19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(3.5f, 20f)
                curveToRelative(-1.68f, 0f, -3.14f, 1.18f, -3.48f, 2.8f)
                curveToRelative(-0.14f, 0.6f, 0.36f, 1.22f, 0.98f, 1.2f)
                lineTo(6f, 24f)
                curveToRelative(0.61f, 0.01f, 1.12f, -0.6f, 0.98f, -1.2f)
                curveToRelative(-0.34f, -1.62f, -1.8f, -2.8f, -3.48f, -2.8f)
                close()
            }
        }.also { _UserRoadmap = it}
