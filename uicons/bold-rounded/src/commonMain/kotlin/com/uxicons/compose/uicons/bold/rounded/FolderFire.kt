package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderFire: ImageVector? = null

val Icons.Br.FolderFire: ImageVector
    get() = _FolderFire ?: UXIcon(name = "FolderFire") {
        path(fill = SolidColor(Color.Black)) {
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
            moveTo(24f, 17.97f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, 3.21f, -2.51f, 5.83f, -5.67f, 6.02f)
            curveToRelative(-2.64f, 0.15f, -4.94f, -1.57f, -5.96f, -4.01f)
            curveToRelative(-0.95f, -2.28f, 0.05f, -4.42f, 1.12f, -5.75f)
            curveToRelative(0.28f, -0.35f, 0.83f, -0.28f, 1.01f, 0.12f)
            curveToRelative(0.25f, 0.57f, 0.17f, 1.5f, 0.71f, 1.5f)
            curveToRelative(1.14f, 0f, 0.88f, -3.27f, 2.15f, -5.42f)
            curveToRelative(0.23f, -0.38f, 0.75f, -0.46f, 1.08f, -0.16f)
            curveToRelative(2.05f, 1.83f, 5.56f, 4.53f, 5.56f, 7.7f)
            close()
            moveTo(19.34f, 18.45f)
            horizontalLineToRelative(0f)
            lineToRelative(-0.89f, -0.89f)
            curveToRelative(-0.25f, -0.25f, -0.65f, -0.25f, -0.9f, 0f)
            lineToRelative(-0.89f, 0.89f)
            curveToRelative(-0.76f, 0.76f, -0.9f, 2.02f, -0.2f, 2.83f)
            curveToRelative(0.81f, 0.95f, 2.27f, 0.95f, 3.08f, 0f)
            curveToRelative(0.7f, -0.82f, 0.57f, -2.07f, -0.2f, -2.83f)
            close()
        }
    }.also { _FolderFire = it }
