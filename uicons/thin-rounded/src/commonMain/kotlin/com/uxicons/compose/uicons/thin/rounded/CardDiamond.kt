package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardDiamond: ImageVector? = null

val Icons.Tr.CardDiamond: ImageVector
    get() = _CardDiamond ?: UXIcon(name = "CardDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 0f)
                lineTo(7.5f, 0f)
                curveTo(5.02f, 0f, 3f, 2.02f, 3f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(21f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(20f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(7.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(4f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(12.99f, 7.89f)
                curveToRelative(-0.45f, -0.65f, -1.53f, -0.65f, -1.98f, 0f)
                lineToRelative(-2.21f, 3.16f)
                curveToRelative(-0.4f, 0.57f, -0.4f, 1.33f, 0f, 1.9f)
                lineToRelative(2.21f, 3.16f)
                curveToRelative(0.23f, 0.32f, 0.6f, 0.52f, 0.99f, 0.52f)
                reflectiveCurveToRelative(0.76f, -0.19f, 0.99f, -0.52f)
                lineToRelative(2.21f, -3.16f)
                curveToRelative(0.4f, -0.57f, 0.4f, -1.33f, 0f, -1.9f)
                lineToRelative(-2.21f, -3.16f)
                close()
                moveTo(14.38f, 12.38f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-2.21f, 3.16f, -2.21f, 3.16f)
                curveToRelative(-0.11f, 0.15f, -0.23f, 0.15f, -0.34f, 0f)
                lineToRelative(-2.21f, -3.16f)
                curveToRelative(-0.16f, -0.23f, -0.16f, -0.53f, 0f, -0.75f)
                lineToRelative(2.21f, -3.16f)
                curveToRelative(0.05f, -0.08f, 0.13f, -0.09f, 0.17f, -0.09f)
                reflectiveCurveToRelative(0.12f, 0.01f, 0.17f, 0.09f)
                lineToRelative(2.21f, 3.16f)
                curveToRelative(0.16f, 0.23f, 0.16f, 0.53f, 0f, 0.75f)
                close()
            }
        }.also { _CardDiamond = it}
