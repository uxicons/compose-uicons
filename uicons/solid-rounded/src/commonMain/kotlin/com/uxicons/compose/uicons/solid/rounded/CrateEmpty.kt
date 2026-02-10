package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrateEmpty: ImageVector? = null

val Icons.Sr.CrateEmpty: ImageVector
    get() = _CrateEmpty ?: UXIcon(name = "CrateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 24.0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(0f, 19.0f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                close()
                moveTo(24f, 17.0f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 12.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                close()
            }
        }.also { _CrateEmpty = it}
