package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderXmarkCircle: ImageVector? = null

val Icons.Br.FolderXmarkCircle: ImageVector
    get() = _FolderXmarkCircle ?: UXIcon(name = "FolderXmarkCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 12f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            close()
            moveTo(20.71f, 19.29f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
            curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
            reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
            lineToRelative(-1.29f, -1.29f)
            lineToRelative(-1.29f, 1.29f)
            curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
            reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
            lineToRelative(1.29f, -1.29f)
            lineToRelative(-1.29f, -1.29f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
            reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
            lineToRelative(1.29f, 1.29f)
            lineToRelative(1.29f, -1.29f)
            curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
            reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
            lineToRelative(-1.29f, 1.29f)
            lineToRelative(1.29f, 1.29f)
            close()
            moveTo(24f, 7.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
            lineTo(3f, 7f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(2.53f)
            curveToRelative(0.54f, 0f, 1.08f, 0.13f, 1.56f, 0.37f)
            lineToRelative(3.16f, 1.58f)
            curveToRelative(0.07f, 0.03f, 0.15f, 0.05f, 0.22f, 0.05f)
            horizontalLineToRelative(5.53f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
        }
    }.also { _FolderXmarkCircle = it }
