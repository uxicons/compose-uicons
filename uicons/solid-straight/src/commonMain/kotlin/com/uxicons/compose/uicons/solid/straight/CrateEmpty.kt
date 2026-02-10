package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrateEmpty: ImageVector? = null

val Icons.Ss.CrateEmpty: ImageVector
    get() = _CrateEmpty ?: UXIcon(name = "CrateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _CrateEmpty = it}
