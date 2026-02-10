package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrateEmpty: ImageVector? = null

val Icons.Ts.CrateEmpty: ImageVector
    get() = _CrateEmpty ?: UXIcon(name = "CrateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 11f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-10.5f)
                lineTo(0f, 11f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(19.5f)
                verticalLineToRelative(-1f)
                lineTo(1f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(19.5f)
                verticalLineToRelative(-1f)
                lineTo(1f, 15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(9.5f)
                close()
            }
        }.also { _CrateEmpty = it}
