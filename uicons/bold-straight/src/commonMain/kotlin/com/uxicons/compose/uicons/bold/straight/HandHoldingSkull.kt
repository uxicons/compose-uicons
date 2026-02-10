package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingSkull: ImageVector? = null

val Icons.Bs.HandHoldingSkull: ImageVector
    get() = _HandHoldingSkull ?: UXIcon(name = "HandHoldingSkull") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 3f)
                close()
                moveTo(5f, 5f)
                lineTo(5f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(22.73f, 9.01f)
                curveToRelative(-0.77f, -0.7f, -1.76f, -1.05f, -2.8f, -1.01f)
                curveToRelative(-1.04f, 0.05f, -1.99f, 0.5f, -2.69f, 1.26f)
                lineToRelative(-2.44f, 2.68f)
                curveToRelative(-0.65f, -0.59f, -1.51f, -0.95f, -2.45f, -0.95f)
                lineTo(3.5f, 11f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(14.68f, 24f)
                lineToRelative(8.33f, -9.53f)
                curveToRelative(1.41f, -1.58f, 1.28f, -4.03f, -0.28f, -5.46f)
                close()
                moveTo(20.77f, 12.48f)
                lineToRelative(-7.45f, 8.52f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(12.36f, 14f)
                curveToRelative(0.35f, 0f, 0.64f, 0.29f, 0.64f, 0.64f)
                curveToRelative(0f, 0.32f, -0.24f, 0.59f, -0.55f, 0.64f)
                lineToRelative(-5.16f, 0.74f)
                lineToRelative(0.42f, 2.97f)
                lineToRelative(5.16f, -0.74f)
                curveToRelative(1.62f, -0.23f, 2.88f, -1.53f, 3.09f, -3.12f)
                lineToRelative(3.5f, -3.84f)
                curveToRelative(0.16f, -0.17f, 0.38f, -0.28f, 0.61f, -0.29f)
                curveToRelative(0.23f, -0.01f, 0.46f, 0.07f, 0.64f, 0.23f)
                curveToRelative(0.36f, 0.33f, 0.39f, 0.88f, 0.06f, 1.25f)
                close()
            }
        }.also { _HandHoldingSkull = it}
