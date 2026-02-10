package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderFire: ImageVector? = null

val Icons.Bs.FolderFire: ImageVector
    get() = _FolderFire ?: UXIcon(name = "FolderFire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                curveToRelative(-1.82f, 2.1f, -1.46f, 6f, -2.72f, 6f)
                curveToRelative(-0.61f, 0f, -1.29f, -2.09f, -1.29f, -2.09f)
                curveToRelative(-0.99f, 1.03f, -2.0f, 2.36f, -2.0f, 4.09f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -3.47f, -4.11f, -6.11f, -6f, -8f)
                close()
                moveTo(19.41f, 21.41f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(1.42f, 1.42f)
                horizontalLineToRelative(0f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(7.49f)
                curveToRelative(-0.92f, -1.15f, -2.02f, -2.13f, -3f, -2.98f)
                verticalLineToRelative(-3.01f)
                lineTo(3f, 7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.07f)
                curveToRelative(0.14f, 1.08f, 0.49f, 2.1f, 1.01f, 3f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _FolderFire = it}
