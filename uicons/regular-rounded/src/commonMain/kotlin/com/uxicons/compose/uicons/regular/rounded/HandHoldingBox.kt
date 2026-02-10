package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingBox: ImageVector? = null

val Icons.Rr.HandHoldingBox: ImageVector
    get() = _HandHoldingBox ?: UXIcon(name = "HandHoldingBox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(15f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
                moveTo(5f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(5f, 3f)
                close()
                moveTo(7f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(23.02f, 8.79f)
                curveToRelative(-0.59f, -0.54f, -1.36f, -0.82f, -2.17f, -0.78f)
                curveToRelative(-0.8f, 0.04f, -1.54f, 0.39f, -2.09f, 0.98f)
                lineToRelative(-3.22f, 3.53f)
                curveToRelative(-0.55f, -0.91f, -1.55f, -1.52f, -2.69f, -1.52f)
                lineTo(4f, 11.0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4.96f)
                curveToRelative(2.85f, 0f, 5.57f, -1.22f, 7.47f, -3.35f)
                lineToRelative(6.8f, -7.64f)
                curveToRelative(1.09f, -1.23f, 0.99f, -3.12f, -0.22f, -4.23f)
                close()
                moveTo(21.74f, 11.68f)
                lineToRelative(-6.8f, 7.64f)
                curveToRelative(-1.52f, 1.7f, -3.69f, 2.68f, -5.97f, 2.68f)
                lineTo(4f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineTo(12.86f, 13f)
                curveToRelative(0.63f, 0f, 1.14f, 0.51f, 1.14f, 1.14f)
                curveToRelative(0f, 0.56f, -0.42f, 1.05f, -0.98f, 1.13f)
                lineToRelative(-5.16f, 0.74f)
                curveToRelative(-0.55f, 0.08f, -0.93f, 0.58f, -0.85f, 1.13f)
                curveToRelative(0.08f, 0.55f, 0.58f, 0.93f, 1.13f, 0.85f)
                lineToRelative(5.16f, -0.74f)
                curveToRelative(1.18f, -0.17f, 2.13f, -0.99f, 2.52f, -2.06f)
                lineToRelative(4.43f, -4.86f)
                curveToRelative(0.18f, -0.2f, 0.43f, -0.32f, 0.7f, -0.33f)
                curveToRelative(0.27f, -0.02f, 0.53f, 0.08f, 0.73f, 0.26f)
                curveToRelative(0.41f, 0.37f, 0.44f, 1.01f, 0.07f, 1.42f)
                close()
            }
        }.also { _HandHoldingBox = it}
