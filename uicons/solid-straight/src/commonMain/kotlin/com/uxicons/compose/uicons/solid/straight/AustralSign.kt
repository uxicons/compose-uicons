package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AustralSign: ImageVector? = null

val Icons.Ss.AustralSign: ImageVector
    get() = _AustralSign ?: UXIcon(name = "AustralSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5.55f)
                lineTo(14.69f, 1.66f)
                curveToRelative(-0.51f, -1.02f, -1.54f, -1.66f, -2.68f, -1.66f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.15f, 0f, -2.17f, 0.64f, -2.71f, 1.72f)
                lineToRelative(-3.87f, 9.28f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(4.58f, 13f)
                lineToRelative(-0.83f, 2f)
                lineTo(0f, 15f)
                verticalLineToRelative(2f)
                lineTo(2.92f, 17f)
                lineTo(0f, 24f)
                lineTo(2.16f, 24f)
                lineToRelative(2.92f, -7f)
                horizontalLineToRelative(13.64f)
                lineToRelative(2.82f, 7f)
                horizontalLineToRelative(2.16f)
                lineToRelative(-2.82f, -7f)
                horizontalLineToRelative(3.13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.93f)
                lineToRelative(-0.81f, -2f)
                horizontalLineToRelative(4.74f)
                close()
                moveTo(11.11f, 2.55f)
                curveToRelative(0.17f, -0.35f, 0.51f, -0.55f, 0.89f, -0.55f)
                horizontalLineToRelative(0f)
                curveToRelative(0.39f, 0f, 0.72f, 0.21f, 0.86f, 0.48f)
                lineToRelative(3.43f, 8.52f)
                lineTo(7.58f, 11f)
                lineTo(11.11f, 2.55f)
                close()
                moveTo(17.91f, 15f)
                lineTo(5.92f, 15f)
                lineToRelative(0.83f, -2f)
                horizontalLineToRelative(10.35f)
                lineToRelative(0.81f, 2f)
                close()
            }
        }.also { _AustralSign = it}
