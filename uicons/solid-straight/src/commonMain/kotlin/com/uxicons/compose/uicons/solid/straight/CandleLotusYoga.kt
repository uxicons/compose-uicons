package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleLotusYoga: ImageVector? = null

val Icons.Ss.CandleLotusYoga: ImageVector
    get() = _CandleLotusYoga ?: UXIcon(name = "CandleLotusYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 4f)
                curveToRelative(0f, -1.1f, 2f, -4f, 2f, -4f)
                curveToRelative(0f, 0f, 2f, 2.9f, 2f, 4f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(15f, 16.86f)
                curveToRelative(0.91f, -1.21f, 2.09f, -2.18f, 3.49f, -2.84f)
                curveToRelative(-0.54f, -1.81f, -1.48f, -3.5f, -2.78f, -4.81f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-1.3f, 1.3f, -2.25f, 3.0f, -2.78f, 4.81f)
                curveToRelative(1.4f, 0.67f, 2.58f, 1.63f, 3.49f, 2.84f)
                close()
                moveTo(23.1f, 15f)
                curveToRelative(-4.77f, 0f, -8.1f, 3.33f, -8.1f, 8.1f)
                curveToRelative(0f, -4.77f, -3.33f, -8.1f, -8.1f, -8.1f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(0.9f)
                curveToRelative(0f, 5.0f, 3.1f, 8.1f, 8.1f, 8.1f)
                horizontalLineToRelative(1.8f)
                curveToRelative(5.0f, 0f, 8.1f, -3.1f, 8.1f, -8.1f)
                verticalLineToRelative(-0.9f)
                horizontalLineToRelative(-0.9f)
                close()
                moveTo(4f, 15.9f)
                verticalLineToRelative(-2.9f)
                horizontalLineToRelative(2.9f)
                curveToRelative(0.96f, 0f, 1.87f, 0.11f, 2.73f, 0.33f)
                curveToRelative(0.44f, -1.43f, 1.1f, -2.74f, 1.91f, -3.9f)
                curveToRelative(0.01f, 0.01f, 0.01f, 0.03f, 0f, 0f)
                curveToRelative(-0.01f, -0.02f, -0.01f, -0.01f, -0.0f, -0.0f)
                curveToRelative(-0.54f, -0.77f, -1.53f, -1.42f, -2.54f, -1.42f)
                lineTo(3f, 8.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(7.62f)
                curveToRelative(-2.29f, -1.75f, -3.62f, -4.56f, -3.62f, -8.1f)
                close()
            }
        }.also { _CandleLotusYoga = it}
