package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashRestore: ImageVector? = null

val Icons.Br.TrashRestore: ImageVector
    get() = _TrashRestore ?: UXIcon(name = "TrashRestore") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.44f, 3f)
            horizontalLineToRelative(-4.76f)
            curveToRelative(-0.62f, -1.75f, -2.29f, -3f, -4.24f, -3f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.96f, 0f, -3.62f, 1.25f, -4.24f, 3f)
            lineTo(1.44f, 3f)
            curveTo(0.61f, 3f, -0.06f, 3.67f, -0.06f, 4.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.62f)
            lineToRelative(1.08f, 12.96f)
            curveToRelative(0.24f, 2.83f, 2.64f, 5.04f, 5.48f, 5.04f)
            horizontalLineToRelative(6.64f)
            curveToRelative(2.84f, 0f, 5.25f, -2.21f, 5.48f, -5.04f)
            lineToRelative(1.08f, -12.96f)
            horizontalLineToRelative(0.62f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(17.75f, 18.71f)
            curveToRelative(-0.11f, 1.29f, -1.2f, 2.29f, -2.49f, 2.29f)
            horizontalLineToRelative(-6.64f)
            curveToRelative(-1.29f, 0f, -2.38f, -1.01f, -2.49f, -2.29f)
            lineToRelative(-1.06f, -12.71f)
            horizontalLineToRelative(13.74f)
            lineToRelative(-1.06f, 12.71f)
            close()
            moveTo(15.75f, 12.35f)
            curveToRelative(0.61f, 0.61f, 0.18f, 1.65f, -0.69f, 1.65f)
            horizontalLineToRelative(-1.56f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(-1.56f)
            curveToRelative(-0.86f, 0f, -1.29f, -1.04f, -0.69f, -1.65f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.38f, -0.38f, 0.99f, -0.38f, 1.37f, 0f)
            lineToRelative(3.06f, 3.06f)
            close()
        }
    }.also { _TrashRestore = it }
