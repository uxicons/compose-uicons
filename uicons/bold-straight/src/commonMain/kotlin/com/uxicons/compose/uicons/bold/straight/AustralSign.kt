package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AustralSign: ImageVector? = null

val Icons.Bs.AustralSign: ImageVector
    get() = _AustralSign ?: UXIcon(name = "AustralSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5.63f)
                lineTo(15.13f, 1.94f)
                curveToRelative(-0.6f, -1.19f, -1.8f, -1.94f, -3.13f, -1.94f)
                reflectiveCurveToRelative(-2.54f, 0.75f, -3.17f, 2.03f)
                lineToRelative(-3.2f, 7.97f)
                lineTo(0f, 10f)
                verticalLineToRelative(3f)
                lineTo(4.42f, 13f)
                lineToRelative(-0.8f, 2f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                lineTo(2.41f, 18f)
                lineTo(0f, 24f)
                lineTo(3.25f, 24f)
                lineToRelative(2.4f, -6f)
                horizontalLineToRelative(12.7f)
                lineToRelative(2.41f, 6f)
                horizontalLineToRelative(3.24f)
                lineToRelative(-2.41f, -6f)
                horizontalLineToRelative(2.41f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.62f)
                lineToRelative(-0.8f, -2f)
                horizontalLineToRelative(4.42f)
                close()
                moveTo(11.56f, 3.28f)
                curveToRelative(0.09f, -0.18f, 0.25f, -0.28f, 0.45f, -0.28f)
                reflectiveCurveToRelative(0.36f, 0.11f, 0.4f, 0.17f)
                lineToRelative(2.74f, 6.83f)
                horizontalLineToRelative(-6.28f)
                lineToRelative(2.7f, -6.72f)
                close()
                moveTo(17.16f, 15f)
                lineTo(6.86f, 15f)
                lineToRelative(0.8f, -2f)
                horizontalLineToRelative(8.69f)
                lineToRelative(0.8f, 2f)
                close()
            }
        }.also { _AustralSign = it}
