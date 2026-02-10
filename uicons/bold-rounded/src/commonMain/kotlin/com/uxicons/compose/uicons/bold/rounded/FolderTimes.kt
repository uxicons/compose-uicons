package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTimes: ImageVector? = null

val Icons.Br.FolderTimes: ImageVector
    get() = _FolderTimes ?: UXIcon(name = "FolderTimes") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 8.5f)
            verticalLineToRelative(9.54f)
            curveToRelative(0f, 1.96f, -1.05f, 3.78f, -2.75f, 4.76f)
            curveToRelative(-0.7f, 0.41f, -1.63f, 0.18f, -2.05f, -0.55f)
            curveToRelative(-0.41f, -0.72f, -0.17f, -1.64f, 0.55f, -2.05f)
            curveToRelative(0.77f, -0.45f, 1.25f, -1.28f, 1.25f, -2.17f)
            lineTo(21f, 8.5f)
            curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
            lineTo(3f, 8f)
            verticalLineToRelative(10.04f)
            curveToRelative(0f, 0.89f, 0.48f, 1.72f, 1.25f, 2.17f)
            curveToRelative(0.72f, 0.41f, 0.96f, 1.33f, 0.55f, 2.05f)
            curveToRelative(-0.42f, 0.72f, -1.33f, 0.96f, -2.05f, 0.55f)
            curveToRelative(-1.7f, -0.98f, -2.75f, -2.81f, -2.75f, -4.76f)
            lineTo(-0f, 6.5f)
            curveTo(0f, 3.47f, 2.47f, 1f, 5.5f, 1f)
            horizontalLineToRelative(2.53f)
            curveToRelative(0.54f, 0f, 1.08f, 0.13f, 1.56f, 0.37f)
            lineToRelative(3.16f, 1.58f)
            curveToRelative(0.07f, 0.03f, 0.15f, 0.05f, 0.22f, 0.05f)
            horizontalLineToRelative(5.53f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(18f, 17f)
            curveToRelative(-0.24f, 7.93f, -11.76f, 7.93f, -12f, 0f)
            curveToRelative(0.24f, -7.93f, 11.76f, -7.93f, 12f, 0f)
            close()
            moveTo(14.56f, 17.44f)
            lineToRelative(-1.06f, -1.06f)
            verticalLineToRelative(-1.88f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            verticalLineToRelative(2.29f)
            curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
            lineToRelative(1.35f, 1.35f)
            curveToRelative(1.39f, 1.38f, 3.5f, -0.73f, 2.12f, -2.12f)
            close()
        }
    }.also { _FolderTimes = it }
