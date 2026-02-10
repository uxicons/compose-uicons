package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderXmarkCircle: ImageVector? = null

val Icons.Bs.FolderXmarkCircle: ImageVector
    get() = _FolderXmarkCircle ?: UXIcon(name = "FolderXmarkCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                verticalLineToRelative(7.22f)
                curveToRelative(-0.81f, -0.93f, -1.84f, -1.66f, -3f, -2.13f)
                verticalLineToRelative(-3.59f)
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
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(19.41f, 18f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.12f, -2.12f)
                close()
            }
        }.also { _FolderXmarkCircle = it}
