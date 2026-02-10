package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserQuestion: ImageVector? = null

val Icons.Sr.UserQuestion: ImageVector
    get() = _UserQuestion ?: UXIcon(name = "UserQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 14f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(4.68f, 16.14f)
                curveTo(1.89f, 16.74f, 0f, 19.36f, 0f, 22.21f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.99f, 0.8f, 1.79f, 1.79f, 1.79f)
                lineTo(10.21f, 24f)
                curveToRelative(1.08f, 0.01f, 1.89f, -0.94f, 1.79f, -2f)
                curveToRelative(0f, -3.74f, -3.44f, -6.69f, -7.32f, -5.86f)
                close()
                moveTo(21.0f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                lineToRelative(0.0f, 8.77f)
                curveToRelative(0f, 0.64f, 0.52f, 1.09f, 1.09f, 1.09f)
                curveToRelative(0.2f, 0f, 0.4f, -0.05f, 0.58f, -0.17f)
                lineToRelative(2.45f, -1.69f)
                horizontalLineToRelative(4.87f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(24f, 3f)
                curveTo(24f, 1.34f, 22.66f, 0f, 21.0f, 0f)
                close()
                moveTo(18f, 10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(19.5f, 6.6f)
                curveToRelative(-0.51f, 0.27f, -1.12f, 0.37f, -1.5f, 0.4f)
                curveToRelative(-0.49f, 0f, -0.92f, -0.36f, -0.99f, -0.86f)
                curveToRelative(-0.08f, -0.55f, 0.3f, -1.05f, 0.85f, -1.13f)
                curveToRelative(0.24f, -0.03f, 0.56f, -0.11f, 0.65f, -0.15f)
                curveToRelative(0.29f, -0.17f, 0.48f, -0.5f, 0.48f, -0.86f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.07f, -0.57f, 2.06f, -1.5f, 2.6f)
                close()
            }
        }.also { _UserQuestion = it}
