package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerAd: ImageVector? = null

val Icons.Sr.ComputerAd: ImageVector
    get() = _ComputerAd ?: UXIcon(name = "ComputerAd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.3f, 9.4f)
                horizontalLineToRelative(-0.7f)
                verticalLineToRelative(-4.8f)
                horizontalLineToRelative(0.7f)
                curveToRelative(0.39f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                close()
                moveTo(9.72f, 8f)
                lineTo(9.08f, 4.71f)
                lineTo(8.45f, 8f)
                close()
                moveTo(0.1f, 15f)
                curveToRelative(0.47f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                close()
                moveTo(-0f, 13f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(7f)
                close()
                moveTo(13f, 10.2f)
                curveToRelative(0f, 0.44f, 0.36f, 0.8f, 0.8f, 0.8f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.27f, 0f, 2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.44f, 0f, -0.8f, 0.36f, -0.8f, 0.8f)
                close()
                moveTo(6.51f, 10.14f)
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
                curveToRelative(-0.76f, 0f, -1.28f, 0.59f, -1.39f, 1.17f)
                lineToRelative(-1.2f, 5.98f)
                close()
            }
        }.also { _ComputerAd = it}
