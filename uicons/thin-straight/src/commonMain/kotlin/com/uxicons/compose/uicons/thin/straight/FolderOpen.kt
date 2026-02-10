package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderOpen: ImageVector? = null

val Icons.Ts.FolderOpen: ImageVector
    get() = _FolderOpen ?: UXIcon(name = "FolderOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 11f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-8.38f)
                lineTo(6.12f, 1f)
                horizontalLineToRelative(-3.62f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(19.86f)
                lineToRelative(4.1f, -12f)
                horizontalLineToRelative(-2.96f)
                close()
                moveTo(1f, 22f)
                lineTo(1f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.38f)
                reflectiveCurveToRelative(4f, 2f, 4f, 2f)
                horizontalLineToRelative(8.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                lineTo(5.62f, 11f)
                reflectiveCurveToRelative(-3.48f, 11f, -3.48f, 11f)
                horizontalLineToRelative(-1.13f)
                close()
                moveTo(19.14f, 22f)
                lineTo(3.18f, 22f)
                lineToRelative(3.17f, -10f)
                horizontalLineToRelative(16.21f)
                reflectiveCurveToRelative(-3.41f, 10f, -3.41f, 10f)
                close()
            }
        }.also { _FolderOpen = it}
