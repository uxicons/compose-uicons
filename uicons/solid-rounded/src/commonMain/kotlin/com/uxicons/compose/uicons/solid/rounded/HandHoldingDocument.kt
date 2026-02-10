package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingDocument: ImageVector? = null

val Icons.Sr.HandHoldingDocument: ImageVector
    get() = _HandHoldingDocument ?: UXIcon(name = "HandHoldingDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 0.1f)
                curveToRelative(0.52f, 0.13f, 1.01f, 0.39f, 1.39f, 0.78f)
                lineToRelative(1.73f, 1.73f)
                curveToRelative(0.39f, 0.39f, 0.65f, 0.87f, 0.78f, 1.39f)
                horizontalLineToRelative(-3.9f)
                lineTo(11.0f, 0.1f)
                close()
                moveTo(23.15f, 8.68f)
                curveToRelative(-1.01f, -0.96f, -2.76f, -0.88f, -3.67f, 0.16f)
                lineToRelative(-3.54f, 3.74f)
                curveToRelative(0.03f, 0.21f, 0.07f, 0.42f, 0.07f, 0.64f)
                curveToRelative(0f, 2.08f, -1.55f, 3.88f, -3.62f, 4.17f)
                lineToRelative(-4.25f, 0.6f)
                curveToRelative(-0.55f, 0.08f, -1.05f, -0.3f, -1.13f, -0.85f)
                curveToRelative(-0.08f, -0.55f, 0.3f, -1.05f, 0.85f, -1.13f)
                lineToRelative(4.16f, -0.58f)
                curveToRelative(0.94f, -0.13f, 1.75f, -0.81f, 1.94f, -1.73f)
                curveToRelative(0.3f, -1.43f, -0.79f, -2.69f, -2.16f, -2.69f)
                lineTo(4.0f, 11f)
                curveTo(1.79f, 11f, 0.0f, 12.79f, 0.0f, 15f)
                verticalLineToRelative(5f)
                curveTo(0.0f, 22.21f, 1.79f, 24f, 4.0f, 24f)
                horizontalLineToRelative(4.26f)
                curveToRelative(2.81f, 0f, 5.48f, -1.18f, 7.37f, -3.25f)
                lineToRelative(7.7f, -8.41f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
                moveTo(4.0f, 9f)
                horizontalLineToRelative(7.79f)
                curveToRelative(1.25f, 0f, 2.41f, 0.55f, 3.21f, 1.5f)
                lineTo(15f, 6f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(9f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(6.35f)
                curveToRelative(0.63f, -0.22f, 1.3f, -0.35f, 2.0f, -0.35f)
                close()
            }
        }.also { _HandHoldingDocument = it}
