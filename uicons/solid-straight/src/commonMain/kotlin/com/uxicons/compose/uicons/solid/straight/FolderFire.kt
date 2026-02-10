package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderFire: ImageVector? = null

val Icons.Ss.FolderFire: ImageVector
    get() = _FolderFire ?: UXIcon(name = "FolderFire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                verticalLineToRelative(1f)
                lineTo(0f, 6f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -1.73f, 1f, -3.06f, 2.0f, -4.09f)
                curveToRelative(0f, 0f, 0.68f, 2.09f, 1.29f, 2.09f)
                curveToRelative(1.26f, 0f, 0.9f, -3.9f, 2.72f, -6f)
                curveToRelative(1.9f, 1.9f, 6f, 4.53f, 6f, 8f)
                close()
                moveTo(19.41f, 18.59f)
                horizontalLineToRelative(0f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, -2.05f, 0f, -2.83f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -2.54f, 1.46f, -4.34f, 2.56f, -5.48f)
                curveToRelative(0f, 0f, 3.32f, -3.13f, 3.93f, -3.83f)
                lineToRelative(0.6f, -0.69f)
                lineTo(0f, 8f)
                verticalLineToRelative(14f)
                lineTo(11.08f, 22f)
                curveToRelative(-0.68f, -1.18f, -1.08f, -2.54f, -1.08f, -4f)
                close()
                moveTo(19.41f, 8.59f)
                curveToRelative(0.35f, 0.35f, 0.83f, 0.77f, 1.34f, 1.21f)
                curveToRelative(1.04f, 0.9f, 2.25f, 1.96f, 3.25f, 3.2f)
                verticalLineToRelative(-4.99f)
                horizontalLineToRelative(-5.17f)
                lineToRelative(0.59f, 0.59f)
                close()
            }
        }.also { _FolderFire = it}
