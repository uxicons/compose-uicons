package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImport: ImageVector? = null

val Icons.Br.FileImport: ImageVector
    get() = _FileImport ?: UXIcon(name = "FileImport") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 8.16f)
            verticalLineToRelative(10.34f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(7.5f, 24f)
            curveToRelative(-2.51f, 0f, -4.7f, -1.7f, -5.33f, -4.13f)
            curveToRelative(-0.21f, -0.8f, 0.28f, -1.62f, 1.08f, -1.83f)
            curveToRelative(0.8f, -0.21f, 1.62f, 0.28f, 1.83f, 1.08f)
            curveToRelative(0.28f, 1.1f, 1.28f, 1.87f, 2.42f, 1.87f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(13f, 3f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveTo(2f, 2.47f, 4.47f, 0f, 7.5f, 0f)
            horizontalLineToRelative(6.34f)
            curveToRelative(1.47f, 0f, 2.85f, 0.57f, 3.89f, 1.61f)
            lineToRelative(2.66f, 2.66f)
            curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
            close()
            moveTo(8f, 17.56f)
            curveToRelative(0f, 0.86f, 1.04f, 1.29f, 1.65f, 0.69f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.38f, -0.38f, 0.38f, -0.99f, 0f, -1.37f)
            lineToRelative(-3.06f, -3.06f)
            curveToRelative(-0.61f, -0.61f, -1.65f, -0.18f, -1.65f, 0.69f)
            verticalLineToRelative(1.56f)
            lineTo(1.5f, 13.0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(1.56f)
            close()
        }
    }.also { _FileImport = it }
