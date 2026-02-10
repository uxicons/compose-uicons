package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareSquare: ImageVector? = null

val Icons.Tr.ShareSquare: ImageVector
    get() = _ShareSquare ?: UXIcon(name = "ShareSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 11.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(12.5f, 23f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(23.27f, 5.74f)
                lineTo(17.86f, 0.15f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                lineToRelative(5.42f, 5.59f)
                curveToRelative(0.17f, 0.17f, 0.28f, 0.37f, 0.35f, 0.59f)
                curveToRelative(-0.04f, -0.01f, -0.09f, -0.03f, -0.14f, -0.03f)
                lineTo(12.5f, 7f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(10.27f)
                reflectiveCurveToRelative(0.09f, -0.01f, 0.14f, -0.03f)
                curveToRelative(-0.07f, 0.22f, -0.18f, 0.42f, -0.35f, 0.59f)
                lineToRelative(-5.41f, 5.58f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.14f, 0.35f, 0.14f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.36f, -0.15f)
                lineToRelative(5.41f, -5.58f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.53f)
                close()
            }
        }.also { _ShareSquare = it}
