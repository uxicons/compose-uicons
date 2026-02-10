package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AviFile: ImageVector? = null

val Icons.Ss.AviFile: ImageVector
    get() = _AviFile ?: UXIcon(name = "AviFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(7.61f, 13.6f)
                curveToRelative(-0.09f, 0f, -0.15f, 0.15f, -0.19f, 0.35f)
                lineToRelative(-0.67f, 3.04f)
                horizontalLineToRelative(1.69f)
                lineToRelative(-0.64f, -3.04f)
                curveToRelative(-0.05f, -0.23f, -0.09f, -0.35f, -0.18f, -0.35f)
                close()
                moveTo(15f, 7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-17f)
                close()
                moveTo(9.07f, 20f)
                lineTo(8.77f, 18.6f)
                horizontalLineToRelative(-2.38f)
                lineToRelative(-0.31f, 1.4f)
                horizontalLineToRelative(-1.58f)
                lineToRelative(1.36f, -6.42f)
                curveToRelative(0.17f, -0.86f, 0.87f, -1.58f, 1.74f, -1.58f)
                curveToRelative(0.89f, 0.01f, 1.56f, 0.69f, 1.75f, 1.63f)
                lineToRelative(1.34f, 6.37f)
                horizontalLineToRelative(-1.63f)
                close()
                moveTo(15.21f, 18.54f)
                curveToRelative(-0.12f, 0.67f, -0.62f, 1.46f, -1.55f, 1.46f)
                reflectiveCurveToRelative(-1.44f, -0.84f, -1.55f, -1.42f)
                lineToRelative(-1.21f, -6.58f)
                reflectiveCurveToRelative(1.63f, 0f, 1.63f, 0f)
                verticalLineToRelative(0.01f)
                reflectiveCurveToRelative(1.13f, 6.14f, 1.13f, 6.14f)
                lineToRelative(1.11f, -6.11f)
                lineToRelative(-0.01f, -0.03f)
                horizontalLineToRelative(1.64f)
                reflectiveCurveToRelative(-1.19f, 6.54f, -1.19f, 6.54f)
                close()
                moveTo(19.5f, 20f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                close()
            }
        }.also { _AviFile = it}
