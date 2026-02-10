package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownToSquare: ImageVector? = null

val Icons.Sc.ArrowDownToSquare: ImageVector
    get() = _ArrowDownToSquare ?: UXIcon(name = "ArrowDownToSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 13.5f)
                curveToRelative(0f, 3.89f, -0.89f, 7.71f, -0.93f, 7.87f)
                curveToRelative(-0.08f, 0.34f, -0.34f, 0.62f, -0.67f, 0.72f)
                curveToRelative(-0.12f, 0.04f, -2.91f, 0.91f, -8.4f, 0.91f)
                reflectiveCurveToRelative(-8.29f, -0.87f, -8.4f, -0.91f)
                curveToRelative(-0.34f, -0.11f, -0.59f, -0.38f, -0.67f, -0.72f)
                curveToRelative(-0.04f, -0.16f, -0.93f, -3.98f, -0.93f, -7.87f)
                reflectiveCurveToRelative(0.89f, -7.71f, 0.93f, -7.87f)
                curveToRelative(0.08f, -0.34f, 0.34f, -0.62f, 0.67f, -0.72f)
                curveToRelative(0.11f, -0.04f, 2.57f, -0.8f, 7.4f, -0.9f)
                verticalLineToRelative(10.87f)
                curveToRelative(-1.18f, -1.05f, -2.25f, -2.21f, -3.2f, -3.48f)
                curveToRelative(-0.33f, -0.44f, -0.96f, -0.53f, -1.4f, -0.2f)
                curveToRelative(-0.44f, 0.33f, -0.53f, 0.96f, -0.2f, 1.4f)
                curveToRelative(1.48f, 1.97f, 3.23f, 3.72f, 5.2f, 5.2f)
                curveToRelative(0.36f, 0.27f, 0.84f, 0.27f, 1.2f, 0f)
                curveToRelative(1.97f, -1.48f, 3.72f, -3.23f, 5.2f, -5.2f)
                curveToRelative(0.33f, -0.44f, 0.24f, -1.07f, -0.2f, -1.4f)
                curveToRelative(-0.44f, -0.33f, -1.07f, -0.24f, -1.4f, 0.2f)
                curveToRelative(-0.95f, 1.27f, -2.02f, 2.43f, -3.2f, 3.48f)
                verticalLineToRelative(-10.87f)
                curveToRelative(4.83f, 0.1f, 7.29f, 0.86f, 7.4f, 0.9f)
                curveToRelative(0.34f, 0.11f, 0.59f, 0.38f, 0.67f, 0.72f)
                curveToRelative(0.04f, 0.16f, 0.93f, 3.98f, 0.93f, 7.87f)
                close()
                moveTo(13f, 4.01f)
                verticalLineToRelative(-2.01f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.01f)
                curveToRelative(0.32f, -0.01f, 0.66f, -0.01f, 1f, -0.01f)
                reflectiveCurveToRelative(0.68f, 0.0f, 1f, 0.01f)
                close()
            }
        }.also { _ArrowDownToSquare = it}
