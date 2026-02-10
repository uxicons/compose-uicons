package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderXmark: ImageVector? = null

val Icons.Br.FolderXmark: ImageVector
    get() = _FolderXmark ?: UXIcon(name = "FolderXmark") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 3f)
            horizontalLineToRelative(-5.53f)
            curveToRelative(-0.08f, 0f, -0.15f, -0.02f, -0.22f, -0.05f)
            lineToRelative(-3.16f, -1.58f)
            curveToRelative(-0.48f, -0.24f, -1.02f, -0.37f, -1.56f, -0.37f)
            horizontalLineToRelative(-2.53f)
            curveTo(2.47f, 1f, 0f, 3.47f, 0f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 8.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 17.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 20f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 8f)
            lineTo(20.95f, 8f)
            curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(15.56f, 12.56f)
            lineToRelative(-1.44f, 1.44f)
            lineToRelative(1.44f, 1.44f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-1.44f, -1.44f)
            lineToRelative(-1.44f, 1.44f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(1.44f, -1.44f)
            lineToRelative(-1.44f, -1.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            lineToRelative(1.44f, 1.44f)
            lineToRelative(1.44f, -1.44f)
            curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
            close()
        }
    }.also { _FolderXmark = it }
