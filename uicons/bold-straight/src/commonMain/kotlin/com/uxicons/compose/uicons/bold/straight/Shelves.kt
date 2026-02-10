package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shelves: ImageVector? = null

val Icons.Bs.Shelves: ImageVector
    get() = _Shelves ?: UXIcon(name = "Shelves") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                lineTo(3f, 7f)
                lineTo(3f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(17f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                lineTo(17f, 3f)
                close()
                moveTo(3f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(3f, 19f)
                verticalLineToRelative(-4f)
                close()
                moveTo(14f, 19f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(17f, 19f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1.06f, 0.16f, -1.5f, 0.42f)
                curveToRelative(-0.44f, -0.26f, -0.95f, -0.42f, -1.5f, -0.42f)
                lineTo(3f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Shelves = it}
