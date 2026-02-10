package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderOpen: ImageVector? = null

val Icons.Rs.FolderOpen: ImageVector
    get() = _FolderOpen ?: UXIcon(name = "FolderOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.48f, 23f)
                lineTo(0f, 23f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(3.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(7.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.02f)
                lineToRelative(-3.55f, 13f)
                close()
                moveTo(4.37f, 21f)
                horizontalLineToRelative(14.58f)
                lineToRelative(2.46f, -9f)
                lineTo(7.22f, 12f)
                lineToRelative(-2.85f, 9f)
                close()
                moveTo(2.0f, 21f)
                horizontalLineToRelative(0.27f)
                lineToRelative(3.48f, -11f)
                horizontalLineToRelative(13.25f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8.24f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-2.76f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(17f)
                close()
            }
        }.also { _FolderOpen = it}
