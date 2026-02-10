package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderMusic: ImageVector? = null

val Icons.Bs.FolderMusic: ImageVector
    get() = _FolderMusic ?: UXIcon(name = "FolderMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                verticalLineToRelative(5.29f)
                curveToRelative(-0.88f, -0.59f, -1.94f, -0.87f, -3f, -0.75f)
                verticalLineToRelative(-3.04f)
                lineTo(3f, 7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.76f)
                curveToRelative(-0.48f, 0.72f, -0.76f, 1.57f, -0.76f, 2.5f)
                curveToRelative(0f, 0.17f, 0.03f, 0.33f, 0.05f, 0.5f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.15f, 12.03f)
                lineToRelative(-5f, 0.71f)
                curveToRelative(-1.22f, 0.17f, -2.15f, 1.24f, -2.15f, 2.48f)
                verticalLineToRelative(3.84f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-5.85f)
                lineToRelative(4f, -0.57f)
                verticalLineToRelative(2.97f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.0f, 0f, -0.0f, 0f, -0.0f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0f, -0.72f, -0.31f, -1.41f, -0.86f, -1.89f)
                curveToRelative(-0.55f, -0.48f, -1.27f, -0.69f, -1.99f, -0.59f)
                close()
            }
        }.also { _FolderMusic = it}
