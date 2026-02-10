package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrateEmpty: ImageVector? = null

val Icons.Bs.CrateEmpty: ImageVector
    get() = _CrateEmpty ?: UXIcon(name = "CrateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 11f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-9.5f)
                lineTo(0f, 11f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                lineTo(3f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(6.5f)
                close()
            }
        }.also { _CrateEmpty = it}
