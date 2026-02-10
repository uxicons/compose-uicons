package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCommit: ImageVector? = null

val Icons.Ss.CodeCommit: ImageVector
    get() = _CodeCommit ?: UXIcon(name = "CodeCommit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                horizontalLineToRelative(-5.08f)
                curveToRelative(-0.49f, -3.39f, -3.4f, -6f, -6.92f, -6f)
                reflectiveCurveToRelative(-6.43f, 2.61f, -6.92f, 6f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(5.08f)
                curveToRelative(0.49f, 3.39f, 3.4f, 6f, 6.92f, 6f)
                reflectiveCurveToRelative(6.43f, -2.61f, 6.92f, -6f)
                horizontalLineToRelative(5.08f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _CodeCommit = it}
